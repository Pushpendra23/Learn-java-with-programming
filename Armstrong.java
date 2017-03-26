//program to find armstrong number
import java.util.Scanner;
class Armstrong
{

  public static void main(String args[])
  {
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter three digit number to be Manipulated");
 
 int a,sum=0,actual;
  a=sc.nextInt();
  actual=a;
  
  System.out.println("you entered :"+a);
 
 //l=a.length;
  
  for(int i=0;i<3;i++)
  {
    sum=sum+(a%10)*(a%10)*(a%10) ;
	a=(int)a/10;
  }
  if(sum==actual){
  System.out.println("Yes the number is armstrong");
  }else{
  System.out.println("NO the number is not armstrong");}
  
  }
}