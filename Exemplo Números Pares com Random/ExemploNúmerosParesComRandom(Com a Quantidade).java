// Elaborar uma classe Java para criar um vetor (array) unidimensional que armazene 50 números gerados aleatoriamente, depois mostrar somente os números pares desse vetor. Ao final, mostrar a quantidade de números Pares para o usuário.
ackage exemplorandom2;
import java.util.Random;
public class VetorNumerosParesAleatórios {
	
	public static void main(String[] args){
		Random rnd = new Random();//No rnd você pode trocar por qualquer nome.
		int[] num = new int[50];//Quando é um vetor devemos declarar a váriavel com [] primeiro.
		int i,qtde=0;//Criamos essa Variavel "qtde" para armazenar o toatl de números pares no final.
		System.out.println("Press. <ENTER> para criar o Vetor, aguarde...\n\n");
		for (i=0;i<=49;i++)
		{
			num[i] = rnd.nextInt(100)+1;//Gerando números aleatórios de 1 até 100
			System.out.print(num[i]+"  ");
		}
		System.out.println("\n\nNúmeros Pares do Vetor");
		for(i=0; i<=99); i++)
		{
			if(num[i] % 2 == 0)//Se Trocarmos o 0 pelo 1 teremos só números ímpares. Porque todo número dividido por 2 e dar resultado 1 é ímpar.
			{
				System.out.println(num[1]+" ");
				qtde++;//Váriavel para armazenar todos os números do nosso Vetor.
			}
		}
	System.out.println("\n\nTotal de Números Pares Armazenados no Vetor num: "+qtde"\n\n");
	}
}