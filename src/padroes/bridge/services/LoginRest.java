package padroes.bridge.services;

import padroes.bridge.dao.LoginDao;
import padroes.bridge.model.Login;

public class LoginRest extends LoginSrv{

	public LoginRest(LoginDao loginDao) {
		super(loginDao);
	}

	@Override
	public void logar(Login login) {
		System.out.println("Logando via rest");
		loginDao.logar(login);
	}
}
