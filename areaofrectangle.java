import java.util.Scanner;

class Cone{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter height of cone:");
        double height=scan.nextDouble();
        System.out.print("Enter radius of cone:");
        double radius=scan.nextDouble();
        double volume=cone(height,radius);
        System.out.println("volume of cone:"+volume);
    }
    public static double cone( double height,double radius){
        double pie=3.14285714286;
        return (pie*(radius*radius)*height)/3;
    }

}
