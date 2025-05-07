package Aula14;
import java.util.Scanner;
public class VetorTeste1 {
public static void main(String[] args) {
	int a[] = new int [5];
	Scanner ler = new Scanner (System.in);
	//ENTRADA
	for (int i = 0; i < 5; i++){
		System.out.println("Informe um valor " + i + "..:");
		a[i] = ler.nextInt ();
	}
	//SAÍDA
	for (int i = 0; i < 5; i++) {
		System.out.println(a[i]);
	}
	ler.close();
}
}
