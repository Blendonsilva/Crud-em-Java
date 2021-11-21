package agenda.main;


import java.util.Date;

import agenda.dao.ContatoDAO;
import agenda.model.Contato;

public class Main {
	
	public static void main (String[] args) {
		ContatoDAO contatoDao = new ContatoDAO();

		Contato contato = new Contato();
		contato.setNome("Blendon fantoni");
		contato.setIdade(24);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		
		//Atualizar o Contato
		Contato c1 = new Contato();
		c1.setNome("Blendon silva");
		c1.setIdade(34);
		c1.setDataCadastro(new Date());
		c1.setId(1);
		
		//contatoDao.update(c1);
		
		//Deletar o contato pelo seu numero de ID
		contatoDao.deleteById(1);
		
		//Visualizaçao dos registros do banco de dados TODOS
		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: "+c.getNome());
			
			
		}
		
	}
}
