/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nawatsomnuek
 */
public class CustomerLogin {

    private String custEmail;
    private String custPassword;

    public CustomerLogin() {
    }

    public CustomerLogin(String custEmail, String custPassword) {
        this.custEmail = custEmail;
        this.custPassword = custPassword;
    }

    private CustomerLogin(ResultSet rs) throws SQLException {
        this.custEmail = rs.getString("custEmail");
        this.custPassword = rs.getString("custPassword");
    }

    private static final String LOGIN_BY_EMAIL = "SELECT * FROM customers WHERE custEmail = ?";

    public static List<CustomerLogin> loginByEmail(String param) {
        List<CustomerLogin> customers = null;
        CustomerLogin c = null;

        Connection conn = ConnectionBuilder.connect();
        try {
            PreparedStatement pstm = conn.prepareStatement(LOGIN_BY_EMAIL);
            pstm.setString(1, param);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                c = new CustomerLogin(rs);
                if (customers == null) {
                    customers = new ArrayList();
                }
                customers.add(c);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return customers;
    }
//        public String checkEmailAndPassword(String email,String Pass){
//        Connection conn = ConnectionBuilder.connect();
//        final String SQL_INSERT_CHECK = "SELECT custEmail, custPassword FROM customers WHERE ?,?";
//        String custId ="" ;
//        try {
//            PreparedStatement pstm = conn.prepareStatement(SQL_INSERT_CHECK);
//            pstm.setString(1, "custEmail");
//            pstm.setString(2, "custPassword");
//            ResultSet rs = pstm.executeQuery();
//            while(rs.next()){
//                if (this.getCustEmail().equals(rs.getString("custEmail")) && this.getCustPassword().equals(rs.getString("custPassword"))) {
//                    custId = "";
//                } else {
//                    custId = "";
//                }
//            }
//        } catch (SQLException ex) {
//            System.out.println( "checkEmail: " + ex);
//        }
//        return custId;
//    }

//    public  List checkEmail(){
//        Connection conn = ConnectionBuilder.connect();
//        final String SQL_INSERT_CHECK = "SELECT * FROM customers WHERE custEmail = ?";
//        List email = null;
//        try {
//            PreparedStatement pstm = conn.prepareStatement(SQL_INSERT_CHECK);
//            pstm.setString(1, "custEmail");
//            ResultSet rs = pstm.executeQuery();
//            while(rs.next()){
//                String rss = rs.getString("custEmail");
//                if (email == null) {
//                    email = new ArrayList();
//                }
//                email.add(rss);
//            }
//        } catch (SQLException ex) {
//            System.out.println( "checkEmail: " + ex);
//        }
//        return email;
//    }
//    public List checkPassword(){
//        Connection conn = ConnectionBuilder.connect();
//        final String SQL_INSERT_CHECK = "SELECT * FROM customers WHERE custEmail = " + getCustEmail();
//        List password = null;
//        try {
//            Statement st = conn.createStatement();
//            ResultSet a = st.executeQuery(SQL_INSERT_CHECK);
//            if (password == null) {
//                password = new ArrayList();
//            }
//            password.add(a);
//        } catch (SQLException ex) {
//            System.out.println( "checkPassword: " + ex);
//        }
//        return password;
//    }
    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustPassword() {
        return custPassword;
    }

    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }
}
