package array;

import java.util.Scanner;

public class TemperatureDay {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("how many days");
        int numDays=str.nextInt();
        int[] temp=new int[numDays];
        int sum=0;
        for (int i=0;i<numDays;i++){
            System.out.println("day" + i + "high temp");
           temp[i]=str.nextInt();
           sum+= temp[i];

        }
        double avg=sum/numDays;
        int above=0;

        for (int i=0;i< temp.length;i++){

          if(temp[i]>avg);

            above++;
        }

        System.out.println(avg);
        System.out.println(above);


    }


}
