package Aluno;

public class AlgoritimoAvancado {

	public static void main(String[] args) {

		ListaAluno lista = new ListaAluno();

		Aluno aluno = new Aluno();
		aluno.nome = "João";
		lista.adicionar(aluno);

		aluno = new Aluno();
		aluno.nome = "Maria";
		lista.adicionar(aluno);

		aluno = new Aluno();
		aluno.nome = "Alexandre";
		lista.adicionar(aluno);

		aluno = new Aluno();
		aluno.nome = "Normandes";
		lista.adicionar(aluno);

		aluno = new Aluno();
		aluno.nome = "Thiago";
		lista.adicionar(aluno);

		for (int i = 0; i < lista.tamanho(); i++) {
			Aluno a = lista.obter(i);
			System.out.println("Aluno: " + a.nome);
		}
	}

}
