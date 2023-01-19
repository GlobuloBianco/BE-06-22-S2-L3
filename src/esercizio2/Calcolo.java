package esercizio2;

import java.util.ArrayList;
import java.util.Random;

public class Calcolo {
	 public static ArrayList<Integer> listaNum = new ArrayList<Integer>();
     Random r = new Random();
     static int num = 3000; //lunghezza array
	 
	 public void avvio() {
		 //creare qty di lunghezza array con numeri randomici da 0 a 100
	     for (int i = 0; i < num; i++) {
	         listaNum.add(r.nextInt(101));
	     }
	     System.out.println(listaNum);
	     
	     //Somma tot dei numeri
	     int totale = 0;
	     for (int i = 0; i < num; i++) {
	         totale += listaNum.get(i);
	     } 
	     System.out.println("Somma totale dei numeri è di: " + totale);
	 }
	 
	 public static void contaParte(String tn) {
		 int arrayDiviso = 1000;
	        int qtyDiviso = 3;
	       
	 }
}
