/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author labrpl
 */
public class Sample {
    public static void main(String[] args) {
        String username = null;
        String password = null;

        username = JOptionPane.showInputDialog("Masukkan Username Anda : ");
        password = JOptionPane.showInputDialog("Masukkan Password Anda : ");
       
        JOptionPane.showMessageDialog(null, "Username Anda : "+username+'\n'+
                                            "Password Anda : "+password);
    }
}
