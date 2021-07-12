import java.util.*;
public class Pizza
{
	public static void main(String args[])
	{        
                int n,t,i,x;
		float p=0.125f,c,b;
                Scanner sc=new Scanner(System.in);
                System.out.println("WELCOME TO PIZZARIO!!!");
                System.out.println("ENTER NUMBER OF PIZZAS:");
                n=sc.nextInt();
                System.out.println("CHOOSE TOPPINGS:\n1.PEPPERONI\n2.MUSHROOMS\n3.ONIONS\n4.SAUSAGE\n5.BACON\n6.EXTRA CHEESE\n7.BLACK OLIVES\n8.GREEN PEPPERS\n9.FRESH BASIL");
                System.out.println("ENTER NUMBER OF TOPPINGS(15 RS. FOR EACH TOPPING):");
                t=sc.nextInt();
                for(i=1;i<=t;i++)
                {
                  
                  System.out.println("ENTER CHOICE:");
                  x=sc.nextInt();
                  
                }
                c=((120*n)+(15*t*n));
                b=c+(c*p);
                System.out.println("---------------------------------------");
                System.out.println("*********RECEIPT*********");
                System.out.println("---------------------------------------");
                System.out.println("NUMBER OF PIZZAS ORDERED:"+n+"\nTOTAL=120*"+n+"\t\t\t"+(120*n)+"\nTOPPINGS:"+t+"\nTOTAL=15*"+t+"*"+n+"\t\t\t"+(15*t*n)+"\nSUB TOTAL=\t\t\t"+c+"\nGST:12.5%\t\t\t"+(c*p)+"\n---------------------------------------\nAMOUNT TO BE PAYED:\t\t"+b+"\n---------------------------------------\n**********THANKS FOR YOUR VISIT**********\n          HAVE A NICE DAY  !!!!  ");
                
                
	}
}

