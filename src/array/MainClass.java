package array;

public class MainClass {

    public static void main(String[] args) {
        InsertionArray str=new InsertionArray(5);

        str.insert(0,3);
        str.insert(1,4);
        str.insert(2,0);
       // str.insert(1,5);


//accessing the elemt
     //  int first= str.acces(2);
     //   System.out.println("the element is "+ first);


        //trans
        str.transversal();

        //serach

        str.serach(5);

        //delete

       // str.deleteElemte(2);

    }




}
