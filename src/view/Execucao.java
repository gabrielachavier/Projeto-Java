package view;

import model.Pessoa;

public class Execucao {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Gabriela Chavier");
		pessoa.setEndereco("Rua Roberto Said");
		pessoa.setBairro("Jardim N�lia");
		pessoa.setCep(8142185);
		pessoa.setCidade("S�o Paulo");
		pessoa.setEstado("S�o Paulo");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getBairro());
		System.out.println( "0"+pessoa.getCep());
		System.out.println(pessoa.getCidade());
		System.out.println(pessoa.getEstado());
	}
}

	

