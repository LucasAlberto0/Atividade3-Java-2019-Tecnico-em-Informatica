//Elaborar uma classe Java para exibir dez números aleatórios.
package exemplorandom2;
import java.util.Random;

public class Exemplorandom2 {
	public static void main(String[] args){
		Random rnd = new Random();
		int x,num;
		for (x=1; x<=6; x++)
		{
			//num = rnd.next(60);Nesse exemplo gerará números de 0 até 59
			num = rnd.next(60)+1;//Nesse exemplo gerará números de 0 até 60
			//System.out.print deixar o resultado do ladinho do outro 
			System.out.println(num);
		}
		System.out.println("\n\nFim de Programa");//"\n" serve para pular mais linhas.  
	}
}