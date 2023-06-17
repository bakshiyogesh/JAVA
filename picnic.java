import java.util.Scanner;

class Picnic{
    public static void main(String[] args) {
        System.out.print("Enter number of days in month in kunal go to picnic:");
        Scanner scan=new Scanner(System.in);
        int no_days= scan.nextInt();
        int count_even=0;
        int i=0;
        for (i=0;i<no_days;i++)
        {
            if(i%2==0){
                count_even++;
            }
        }
        System.out.println("No. of days kunal can goto picnic in even days:"+count_even);
    }
}