/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class Methods {

    public Boolean checkName(String name) {
        Pattern pattern = Pattern.compile("^[a-zA-Z\\s-]+$");
        Matcher matchername = pattern.matcher(name);
        return matchername.matches();
    }
    
    public boolean masuk(String username) {
        if (username.equals("admin") ) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean cekan(String addresso) {
        if (addresso.equals("Tangerang")) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean alamatPrint(String address){
        if (address.length() < 5) {
            return false;
        } else{
           return true;
        }
    }
 
}