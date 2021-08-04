 package padroes.singleton;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private static ConnectionPool singleton = new ConnectionPool();
	private final static int POOL_SIZE = 2;
	private List<Connection> connectionsPool;
	
	public static ConnectionPool getInstance() {
		return singleton;
	}
	
	private ConnectionPool() {
		System.out.println("Criando Pool de conexões...");		
		connectionsPool = new ArrayList<Connection>();
		
		for(int i=0; i < POOL_SIZE; i++) {
			connectionsPool.add(new Connection());			
		}
	}
	
	public Connection getConnection() {
		Connection avaiable = null;
		for(Connection conn: connectionsPool) {
			if(!conn.isInUse()) {
				avaiable = conn;
				break;
			}
		}
		if(avaiable == null) {
			System.out.println("Sem conexões disponíveis");
			return null;
		}else {
			System.out.println("conexão criada...");
		}
		avaiable.setInUse(true);
		return avaiable;
	}
	
	public void leaveConnection(Connection conn) {
		System.out.println("Liberando conexão...");
		conn.setInUse(false);
	}
}
