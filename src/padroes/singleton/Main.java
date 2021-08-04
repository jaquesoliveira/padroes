package padroes.singleton;

public class Main {

	static ConnectionPool connectionPool;
	
	public static void main(String[] args) {
		
		Connection conn1 = pegarConexao();
		Connection conn2 = pegarConexao();
		Connection conn3 = pegarConexao();

		liberarConexao(conn2); 
		Connection conn4 = pegarConexao();
		Connection conn5= pegarConexao();
	}
	
	public static Connection pegarConexao() {		
		connectionPool =  ConnectionPool.getInstance();
		return connectionPool.getConnection();
	}
	
	public static void liberarConexao(Connection conn) {
		connectionPool.leaveConnection(conn);
	}
}
