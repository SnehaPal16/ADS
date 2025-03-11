package March11;

import java.util.*;

class test110325{
    public static String findLongestWord(String str){
        StringTokenizer st = new StringTokenizer(str);
        int maxLen = 0;
        String maxWord = "";
        while(st.hasMoreTokens()){
            String word = st.nextToken();
            int len = word.length();
            if(len > maxLen){
                maxLen = len;
                maxWord = word;
            }
        }
        return maxWord;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : " );
        String str = sc.nextLine();

        String ans = findLongestWord(str);

        System.out.print("longest Word in a String "+str+" is : "+ans);
    }
}