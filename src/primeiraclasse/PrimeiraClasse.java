package primeiraclasse;
import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.nome = "Calcario";
		produto.quantidade = 15;
		produto.estoque = true;
		
		verificaEstoque(produto);
		
		

	}
	
	static void verificaEstoque (Produto produto) {
		
		if (produto.quantidade < 10) {
			produto.estoque = false;
			System.out.println("Comprar mais deste produto");
		}else {
			produto.estoque = true;
			System.out.println("Tem estoque!!!");
		}
	}
}
