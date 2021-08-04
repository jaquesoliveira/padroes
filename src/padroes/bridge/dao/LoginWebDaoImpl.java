package padroes.bridge.dao;

import padroes.bridge.model.Login;

public class LoginWebDaoImpl implements LoginDao {

	@Override
	public void logar(Login login) {
		System.out.println("Login realizado via web");
	}
}