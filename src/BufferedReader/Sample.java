/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author labrpl
 */
public class Sample {
    public static void main(String[] args) throws IOException {
        String username = null;
        int password = 0;
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan Username Anda : ");
        username = input.readLine();
        
        System.out.print("Masukkan Password Anda : ");
        password = input.read();
        
        System.out.println("Username Anda : "+username+'\n'+
                           "Password Anda : "+password);
    }
}
