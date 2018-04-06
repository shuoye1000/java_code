import java.util.Scanner;
public class Test{

 public static void main(String[] args){

 Scanner input = new Scanner(System.in);

 double x1=0,x2=0;

 double a=input.nextDouble();

 double b=input.nextDouble();

 double c=input.nextDouble();

if (Math.pow(b,2)-4*a*c==0){

   x1=x2=(-b)/(2*a);
   System.out.println(x1 + " " + x2);
}
else if(Math.pow(b,2)-4*a*c<0){

  System.out.println("error");
}
 else {

   x1=((-b)+Math.pow((Math.pow(b,2)-4*a*c),0.5))/2*a;

   x2=((-b)-Math.pow((Math.pow(b,2)-4*a*c),0.5))/2*a;


   System.out.println(x1+" "+x2);
  }
 }

}
