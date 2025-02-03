import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String reversedWord = "";
        String recursivelyReversedString = recursiveString(word,0);
        System.out.println(recursivelyReversedString);

        for(int i = word.length()-1; i >= 0;i--){
            reversedWord += word.charAt(i);
        }

        System.out.println(reversedWord);
        sc.close();

    }


    public static String recursiveString(String word, int index){
        if(index == word.length()) {
            return "";
        }
        return  recursiveString(word,index+1) + word.charAt(index);

    }
}
