import java.util.Scanner;

class MaxMin{
    static int max(int num1,int num2,int num3){
     int max=num1;
     if(num2>max){
         max=num2;
//         return num2;
     } if (num3>max) {
         max=num3;
//         return num3;
     }
     return max;
    };
    static int min(int num1,int num2,int num3){
        int minimum=num1;
        if(minimum>num2){
            minimum=num2;
//         return num2;
        } if (minimum>num3) {
            minimum=num3;
//         return num3;
        }
        return minimum;
    };
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter numbers for comparison:");
        int one= scan.nextInt();
        int two= scan.nextInt();
        int three= scan.nextInt();
        int result_max=max(one,two,three);
        System.out.println("result of max method:"+result_max);
        int minimum=min(one,two,three);
        System.out.println("result of min method:"+minimum);
    }
}