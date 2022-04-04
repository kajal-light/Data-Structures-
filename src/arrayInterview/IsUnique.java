package arrayInterview;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class IsUnique {
    public static void main(String[] args) {
        int[] arr = {1,3,2, 3, 4, 8, 7};
        IsUnique str = new IsUnique();
    // boolean v= str.findIsUnique(arr);
      //  System.out.println(v);

       int[] x=duplicate(arr);
       System.out.println(Arrays.toString(x));
//duplicateBySet(arr);
duplicatedByHash(arr);
    }

//    private boolean findIsUnique(int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//
//                    return false;
//
//                }
//            }
//
//
//        }   return true;
//    }

//efficient method
//
public static  int[] duplicate(int[] a){
  Arrays.sort(a);
int previous=a[0];

int[] tem=new int[a.length];
tem[0]=previous;
for (int i=1;i<a.length;i++){
//
   if(previous!=a[i]){

    tem[i]=a[i];
   }
//
  previous=a[i];
//
}
  return tem;
}
////
//////creating set
//    public static void duplicateBySet(int[] s){
//      Set<Integer> tt=new HashSet<>();
//      for(int no:s){
//
//if(tt.add(no)==false)
//{
//    System.out.println(no);
//      }
//
//    }
//
//}
//solve by using hasmap
public static void duplicatedByHash(int[] s){

    Map<Integer,Integer> ss=new HashMap<>();

for(int a:s){
    Integer count=ss.get(a);
if(ss.get(a)==null){

    ss.put(a,1);

}
 else{
  count=count+1;
  ss.put(a,count)   ;
}
    }


for(Map.Entry<Integer,Integer> a:ss.entrySet()){

    if (a.getValue()>=2){


        System.out.println(a.getKey());
    }
}

}
}