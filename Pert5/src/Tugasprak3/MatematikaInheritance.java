package Tugasprak3;

public class MatematikaInheritance {
	 public static void main(String[] args) {
	  
	        Matematika2 matematika = new Matematika2();
	        System.out.println("Pertambahan: 20 + 10 = " + matematika.pertambahan(20, 10));
	        System.out.println("Pengurangan: 10 - 5 = " + matematika.pengurangan(10, 5));
	        System.out.println("Perkalian: 10 * 3 = " + matematika.perkalian(10, 3));
	        System.out.println("Pembagian: 21 / 2 = " + matematika.pembagian(21, 2));
	        
	     
	        System.out.println("Modulus: 21 % 2 = " + matematika.modulus(21, 2));
	    }
}