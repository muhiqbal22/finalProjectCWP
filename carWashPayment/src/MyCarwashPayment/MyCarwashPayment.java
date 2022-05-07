/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyCarwashPayment;


import connection.DBConnection;
import frame.loginFrame1;

/**
 *
 * @author miqba
 */
public class MyCarwashPayment {

    public static void main(String[] args) {
        loginFrame1 loginframe = new loginFrame1();
        DBConnection con = new DBConnection();
        System.out.println(con.open());
        loginframe.setLocationRelativeTo(null);
        loginframe.setVisible(true);

       
    }

}
