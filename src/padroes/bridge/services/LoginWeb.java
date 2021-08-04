package padroes.bridge.services;

import padroes.bridge.dao.LoginDao;
import padroes.bridge.model.Login;

public class LoginWeb extends LoginSrv{

	public LoginWeb(LoginDao loginDao) {
		super(loginDao);
	}

	@Override
	public void logar(Login login) {
		System.out.println("Logando via Web");
		loginDao.logar(login);
	}
}
