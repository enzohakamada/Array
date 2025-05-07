package Aula14;
import java.util.Scanner;
public class Vetores5Nomes {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	
	System.out.println("Digite aqui o 1º nome: ");
	String nome1 = ler.nextLine();
	System.out.println("Digite aqui o 2º nome: ");
	String nome2 = ler.nextLine();
	System.out.println("Digite aqui o 3º nome: ");
	String nome3 = ler.nextLine();
	System.out.println("Digite aqui o 4º nome: ");
	String nome4 = ler.nextLine();
	System.out.println("Digite aqui o 5º nome: ");
	String nome5 = ler.nextLine();
	
	String a[] = {nome1, nome2, nome3, nome4, nome5};
	
	System.out.println("Os nomes digitados foram: "+ a[0] + ", " + a[1] + ", " + a[2] + ", "+ a[3] + " e "+ a[4] + ".");
	ler.close();
}
}
