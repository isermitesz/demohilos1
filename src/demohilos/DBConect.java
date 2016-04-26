/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohilos;

import java.sql.Connection;

/**
 *
 * @author iserm
 */
public class DBConect {
    
    static String bd = "detodobr";
    static String login = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost/"+bd;
    
    Connection conn = null;
    
}
