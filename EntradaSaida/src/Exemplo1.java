import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Exemplo1 {
	public static void main (String[] args) throws IOException{
		
		Scanner entrada = new Scanner(new FileInputStream(FileDescriptor.in));

		PrintWriter saida = new PrintWriter(new FileOutputStream(FileDescriptor.out));
		
		saida.println("Digite seu nome: ");
		saida.flush();
		String nome = entrada.nextLine();
		saida.println("prazer em conhec�-lo, " + nome + "!");
		
		entrada.close();
		saida.close();
	}
}
