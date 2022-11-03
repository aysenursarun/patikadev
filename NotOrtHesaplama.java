package patikaDev;

import java.util.Scanner;

public class NotOrtHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Fizik notunuz: ");
		double fizik = scan.nextDouble();
		
		System.out.print("Matematik notunuz: ");
		double mat = scan.nextDouble();
		
		System.out.print("Kimya notunuz: ");
		double kimya = scan.nextDouble();
		
		System.out.print("Türkçe notunuz: ");
		double turkce = scan.nextDouble();
		
		System.out.print("Tarih notunuz: ");
		double tarih = scan.nextDouble();
		
		System.out.print("Müzik notunuz: ");
		double muzik = scan.nextDouble();
		
		System.out.print("Not ortalaması: " + (fizik + mat + kimya + turkce + tarih + muzik)/6 );
		double ort = scan.nextDouble();
		
		String kosul = (ort >= 60) ? "Sınıfı geçti." : "Sınıfta kaldı.";
		System.out.println(kosul);
	}

}
