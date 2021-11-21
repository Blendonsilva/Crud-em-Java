package agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	//Nome do Usuario
	private static final String USERNAME = "root";
	
	//Senha do Banco
	private static final String PASSWORD = "";

	//Caminho do Banco de dados, Nome do banco de dados
	private static String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	//Connexao com o mysql
	public static Connection createConnectionToMySQL() throws Exception {
		//Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
		
	}
	
	public static void main(String[] args) throws Exception {
		
		//Recuperar uma conexao com o banco de dados
		Connection con = createConnectionToMySQL();
		
		//Testar se a conexao e nula
		if(con!=null) {
			System.out.println("Conxão obetida com sucesso!");
			con.close();
		}
	}
	
}
