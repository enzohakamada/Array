package Aula14;
import java.util.Scanner;
public class VetorAeB {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
    int a[]= new int [5];
    int b[]= new int [5];
    
    for(int i=0; i<5; i++) {
    	System.out.println("Valores em A");
    	System.out.println(" ");
    	System.out.println("A" + "[" +i + "]: ");
    a[i]=ler.nextInt();
    }
    System.out.println(" ");
    System.out.println("Os valores de A são: ");
    for(int i=0; i<5; i++) {
    	System.out.println(a[i]);
    }
    System.out.println(" ");
    for(int i=0; i<5; i++) {
    	System.out.println("Valores em B");
    	System.out.println(" ");
        System.out.println("B" + "[" +i + "]: ");
        b[i]=ler.nextInt();
        }
    System.out.println(" ");
    System.out.println("Os valores de B são: ");
    for(int i=0; i<5; i++) {
    		System.out.println(b[i]);
        }
    System.out.println(" ");         //(a[0]+b[0]) + (a[1]+b[1]) + (a[2]+b[2]) + (a[3]+b[3]) + (a[4]+b[4])
        
        int c[]= new int [5];
       
        System.out.println("Os valores de C são: ");
        
        for(int y=0; y<5; y++) {
        	
        c[y]=a[y]+b[y];
        System.out.println(c[y]);
        }
        System.out.println(" ");
        System.out.println("O valor final de C é: ");
        System.out.println((a[0]+b[0]) + (a[1]+b[1]) + (a[2]+b[2]) + (a[3]+b[3]) + (a[4]+b[4]));
}
}
