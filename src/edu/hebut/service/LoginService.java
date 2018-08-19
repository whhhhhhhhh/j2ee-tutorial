package edu.hebut.service;

import edu.hebut.dao.LoginDao;

public class LoginService {

    LoginDao loginDao = new LoginDao();

    public boolean dologin(String username, String password) {
        return loginDao.queryUser(username, password) == 1;
    }

}
