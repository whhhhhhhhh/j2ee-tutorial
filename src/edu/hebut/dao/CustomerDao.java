package edu.hebut.dao;

import edu.hebut.model.Customer;
import edu.hebut.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

    private Connection connection;

    public List<Customer> selectAllCustomer() {
        connection = DbUtil.getConnection();
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement pst = connection.prepareStatement("select * from t_customer");
            ResultSet rs = pst.executeQuery();

            while (rs.next()){
                Customer customer = new Customer();
                customer.setId(rs.getString(1));
                customer.setName(rs.getString(2));
                customer.setGender(rs.getString(3));
                customer.setPhone(rs.getString(4));
                customer.setEmail(rs.getString(5));
                customer.setDescription(rs.getString(6));
                customerList.add(customer);
            }
            DbUtil.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

}
