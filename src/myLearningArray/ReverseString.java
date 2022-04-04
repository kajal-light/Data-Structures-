package myLearningArray;

public class ReverseString {
    public static void main(String[] args) {


        String str = "kate";

    String ans=    reverse(str);

        System.out.println(ans);

    }
 public static String reverse(String s) {

       char[] ch =s.toCharArray();

       for (int i=0;i<s.length();i++){
          char t=ch[s.length()-1] ;
           ch[s.length()-1]=ch[i];
           ch[i]=t;

       }
return new String(ch);



 }


}
