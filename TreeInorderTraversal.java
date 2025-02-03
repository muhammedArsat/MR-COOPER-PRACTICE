class Tree{

    class TreeNode{
        int val;
        int height = 1;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
            this.height = 1;
        }
    }

    TreeNode root;
public void insert(int val){
root = insert(root,val);
}


public TreeNode insert(TreeNode root, int val){

if(root == null){
    TreeNode newNode = new TreeNode(val);
    return newNode;
}


if(val < root.val){
    root.left = insert(root.left,val);
}
else if(val > root.val){
    root.right = insert(root.right,val);
}else{
    return root;
}


root.height = findHeight(root);
int balance = getBalance(root);

if(balance > 1 && val < root.left.val){
    return rightRotate(root);
}

else if(balance < -1 && val > root.right.val){

return leftRotate(root);
}

else if(balance > 1 && val > root.left.val){
    root.left = leftRotate(root.left);
    return rightRotate(root);

}
else if(balance < -1 && val < root.right.val){
    root.right = rightRotate(root.right);
    return leftRotate(root);


}


    return root;
}

private TreeNode leftRotate(TreeNode root){

    TreeNode y = root.right;
    TreeNode t1 = y.left;
    y.left = root;
    root.right = t1;

    root.height = Math.max(findHeight(root.left), findHeight(root.right))+1;
    y.height = Math.max(findHeight(y.left), findHeight(y.right))+1;

    return y;
}


private TreeNode rightRotate(TreeNode root){
    TreeNode y = root.left;
    TreeNode t1 = y.right;
    y.right = root;
    root.left = t1;

    root.height = Math.max(findHeight(root.left), findHeight(root.right))+1;
    y.height = Math.max(findHeight(root.left), findHeight(root.right))+1;
    return y;
}

int findHeight(TreeNode root){
    if(root == null) return 0;

    return root.height;
}

private int getBalance(TreeNode root){
    return findHeight(root.left) - findHeight(root.right);
}

public void inOrderTraversal()
{
    inOrderTraversal(root);
}

 void inOrderTraversal(TreeNode root){
        if(root == null)return;
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
}

}



public class TreeInorderTraversal {
public static void main(String[] args) {
Tree tree = new Tree();
tree.insert(1);
tree.insert(3);
tree.insert(2);
tree.inOrderTraversal();

}
}
