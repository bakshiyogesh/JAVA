import java.util.Scanner;

class  Isosceles{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter height of traiangle:");
        int height=input.nextInt();
        System.out.println("Enter base of triangle:");
        int base=input.nextInt();
        int area_isosceles=0;
            area_isosceles=(1*base*height)/2;
        System.out.println("Enter area of issosceles triangle:" +area_isosceles);
    }
}