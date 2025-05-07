package Aula14;
import java.util.Scanner;
public class VetorSoma {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	double val;
	double a[] = new double [5];
	for(int i = 0; i<5; i++) {
		System.out.println("Digite aqui um valor " +i + "..: ");
		a[i] = ler.nextDouble();
	}
	for(int i = 0; i<5; i++) {
		System.out.println(a[i]);
	}
	double soma = (a[0] + a[1] + a[2] + a[3] + a[4]);
	if (soma == 30) {
		System.out.println("A soma equivale à " +soma + ".");
	}
	else if (soma > 30) {
		System.out.println("A soma dos números equivale à " +soma + ".");
	}
	else {
		System.out.println("A soma dos números é menor que 30.");
	}
	ler.close();
}
}
