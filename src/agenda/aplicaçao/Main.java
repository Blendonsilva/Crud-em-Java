package agenda.aplicaçao;

import java.util.Date;

import agenda.model.Contato;

public class Main {
	
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Maria Gabriela");
		contato.setIdade(22);
		contato.setDataCadastro(new Date());
	}
}
