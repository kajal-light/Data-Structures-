package programingPathshala.arrays;

public class Vowels {

    public static void main(String[] args) {

    String arr="abciiidef";
char[] s=arr.toCharArray();
int n=arr.length();
int k=3;int count=0;int maxVowels=0;
for(int i=0;i<=k-1;i++){

if(getVowels(s[i])){
count++;

}}
maxVowels=count;

for(int j=k;j<n;j++){

  //System.out.println(count);
if(getVowels(s[j])){
count++;
}
    if(getVowels(s[j-k])){
        count--;
    }
maxVowels=Math.max(maxVowels,count);
}

        System.out.println(maxVowels);


}
    private static boolean getVowels(char c) {

        return c=='a' || c=='i' ||c=='o' ||c=='u' || c=='u';

    }
}