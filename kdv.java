package patikaDev;

import java.util.Scanner;

public class kdv {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Tutarı girin: ");
		double tutar = scan.nextDouble();
		
	   if(tutar<=1000 && tutar>=0) {
		   System.out.println("kdvsiz fiyat: " + (1000 - (1000*0.18)));
		   System.out.println("kdv tutarı: " + (tutar - (1000 - (1000*0.18))));
	   }
	   
	   if(tutar>1000) {
		   System.out.println("kdvsiz fiyat: " + (1000 - (1000*0.08)));
		   System.out.println("kdv tutarı: " + (tutar - (1000 - (1000*0.08))));
	   }

	}

}
