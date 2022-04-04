package array;

public class TwoDarray {
    public static void main(String[] args) {


        TwoArray str=new TwoArray(2,3);
        str.inser(0,0,2);
        str.inser(1,0,3);
        str.inser(0,1,7);

       // str.inser(2,0,4);

//access

        int d=str.access(1,0);
        System.out.println(d);
        System.out.println("arrar");
         str.trans();

         str.search(3);
    }
}
