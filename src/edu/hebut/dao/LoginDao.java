package edu.hebut.dao;

import edu.hebut.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

    private Connection connection;

    public int queryUser(String username, String password) {
        connection = DbUtil.getConnection();
        int count = 0;
        try {
            PreparedStatement pst = connection.prepareStatement("select count(*) from t_user where username = ? and password = ?");
            pst.setString(1,username);
            pst.setString(2,password);
            ResultSet rs = pst.executeQuery();

            if(rs.next()) {
                count = rs.getInt(1);
            }

            DbUtil.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;

    }
}
