import java.util.Scanner;//accepts Alphanumeric values
public class LargestNum {
     public static void main(String args[]){
         int a, b, c, largest, temp;
         Scanner sc=new Scanner(System.in);//sc-object of class Scanner
         System.out.println("Enter the first number:");
         a=sc.nextInt();
         System.out.println("Enter the second number:");
         b=sc.nextInt();
         System.out.println("Enter the third number:");
         c=sc.nextInt();
         //comparing a and b and storing the largest number in temp variable
         temp=a>b?a:b;
         //comparing temp variable with c and storing the result in the variable largest
         largest=c>temp?c:temp;
         //largest=4>3?4:3--largest is temp=4
         System.out.println("The largest number is:"+largest);
     }
}
