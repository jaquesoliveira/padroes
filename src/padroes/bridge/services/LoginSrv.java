package padroes.bridge.services;

import padroes.bridge.dao.LoginDao;
import padroes.bridge.model.Login;

public abstract class LoginSrv {
	LoginDao loginDao;

	public LoginSrv(LoginDao loginDao) {
		super();
		this.loginDao = loginDao;
	}
	
	public abstract void logar(Login login);
}