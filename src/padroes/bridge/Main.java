package padroes.bridge;

import padroes.bridge.dao.LoginDaoImpl;
import padroes.bridge.dao.LoginWebDaoImpl;
import padroes.bridge.model.Login;
import padroes.bridge.services.LoginRest;
import padroes.bridge.services.LoginSrv;
import padroes.bridge.services.LoginWeb;

public class Main {

	public static void main(String[] args) {
		
		Login login = new Login("Nome", "Senha");
		LoginSrv loginSrv;
		
		loginSrv = new LoginRest(new LoginDaoImpl());
		loginSrv.logar(login);
		
		loginSrv = new LoginWeb(new LoginWebDaoImpl());
		loginSrv.logar(login);
	}
}
