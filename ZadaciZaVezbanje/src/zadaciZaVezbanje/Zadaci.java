package zadaciZaVezbanje;
import java.util.Scanner;

public class Zadaci {

	public static void main(String[] args) {
	
		/*
		 	
		 --ZADATAK 1-----------------------------------------------------------
		
		 int suma = 0;
		
		 Scanner broj1 = new Scanner(System.in);
		 System.out.println("Unesi prvi broj:");
		 int a = broj1.nextInt();
		 int atemp = a;
		 
		 Scanner broj2 = new Scanner(System.in);
		 System.out.println("Unesi drugi broj:");
		 int b = broj2.nextInt();
		 
		 while(a<b) {
			 
			if(a%3 == 0) {
				
				suma = suma + a;
			}
			
			a++;
		 }
	
			 System.out.println("Suma svih brojeva deljivih sa 3 izmedju " +atemp +" i " +b +" je: " +suma);
			 
			 
		--ZADATAK 2-----------------------------------------------------------	 
			 
			 		 int suma = 0;
		
		 Scanner broj1 = new Scanner(System.in);
		 System.out.println("Unesi prvi broj:");
		 int a = broj1.nextInt();
		 int atemp = a;
		 
		 Scanner broj2 = new Scanner(System.in);
		 System.out.println("Unesi drugi broj:");
		 int b = broj2.nextInt();
		 
		 Scanner operator = new Scanner(System.in);
		 System.out.println("Unesi operator:");
		 char op = operator.next().charAt(0);
		 
		 int mn = 0;
		 while(a<b) {
			 
			if(a%3 == 0) {
				
					switch(op) {
					
					case '+':
						suma = suma + a;
						break;
						
					case '-':
						suma = suma - a; //znam da nije dobro ali nemam ideju kako bih uradio ovaj slucaj
						break;
						
					case '*':
						suma = suma + a;
						mn = suma * a;
						break;
						
					case '/':
						suma = a / a; //isti slucaj kao sa oduzimanjem
						break;
						
					}
			}
			a++;
		}
		 			switch(op) {
		 			
		 			case '+':
		 				System.out.println("Suma svih brojeva deljivih sa 3 izmedju " +atemp +" i " +b +" je: " +suma);
		 				break;
		 			
		 			case '-':
		 				System.out.println("Razlika svih brojeva deljivih sa 3 izmedju " +atemp +" i " +b +" je: " +suma);
		 				break;
		 				
		 			case '*':
		 				System.out.println("Proizvod svih brojeva deljivih sa 3 izmedju " +atemp +" i " +b +" je: " +mn);
		 				break;
		 				
		 			case '/':
		 				System.out.println("Kolicnik svih brojeva deljivih sa 3 izmedju " +atemp +" i " +b +" je: " +suma);
		 				break;
		 }
		 
		
		 --ZADATAK 3---------------------------------------------------------

		int a = 1;
		while(a<=10) {
			
			Scanner broj = new Scanner(System.in);
			System.out.println("Unesi broj: ");
			int i = broj.nextInt();
			
			if(i == 33) {
				continue;
			}
			if(i == 7) {
				break;
			}
			if(i%2 != 0) {
				int b = i*i;
				System.out.println("Kvadrat broja " +i +" je:" +b);
			}
			a++;
			
			
		--ZADATAK 4-----------------------------------------------------------
		
			int faktorijel = 1;
		 
		 Scanner broj = new Scanner(System.in);
		 System.out.println("Unesi broj za koji program treba da izracuna faktorijel:");
		 int br = broj.nextInt();
		 
		  for(int i = 1; i <= br; i++){  
			
		      faktorijel = faktorijel*i; 
		  }
		  
		  System.out.println("Faktorijel broja" +br +"je: " +faktorijel);
		  
			
		--ZADATAK 5-----------------------------------------------------------
		
		Scanner br = new Scanner(System.in);
		System.out.println("Unesi 5 brojeva:");
		int broj = 1;
		int brnep = 0;
		
		while(broj<=5) {
			
			int i = br.nextInt();
			broj++;
			
		if(i%2 != 0) {
			brnep++;
			}
		}
		System.out.println("Neparnih brojeva u nizu je :" +brnep);
		
			
		--ZADATAK 6-----------------------------------------------------------
		
		int zbir = 0;
		int br = 0;
		
		while(br != 13) {
			Scanner broj = new Scanner(System.in);
			System.out.println("Unesi broj:");
			int i = broj.nextInt();
			
			br = i;
			zbir = zbir + i;
			
			if(br == 13) {
				break;
			}
			
			System.out.println("Zbir je: " +zbir);
		}
		
		}*/
		

	}

}
