import java.util.Scanner;

public class UalanFormulu {

	public static void main(String[] args) {
		
		int cevre, a, b, c ;
		double u, alan, islem ;
		
		Scanner giris = new Scanner (System.in);
		
		System.out.print("1. kenarı giriniz: ");
		a=giris.nextInt();
		System.out.print("2. kenarı giriniz: ");
		b= giris.nextInt();
		System.out.print("3. kenarı giriniz :");
		c = giris.nextInt();
		 cevre = a + b + c;
		 u = cevre/2;
		 
		  islem = u*(u - a)*(u - b)*(u - c);
		 
		
		 alan =  Math.sqrt(islem);
		 
		 
		 System.out.println("Kenarları " + a + "," + b + "," + c + " olan üçgenin alanı: " + alan);
		 
				 
		 
		 
				
		

	}

}
