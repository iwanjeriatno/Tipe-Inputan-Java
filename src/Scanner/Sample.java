/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;

import java.util.Scanner;

/**
 *
 * @author labrpl
 */
public class Sample {

    public static void main(String[] args) {
        String username = null;
        int password = 0;

        System.out.print("Masukkan Username Anda : ");
        Scanner input1 = new Scanner(System.in);
        username = input1.next();
        
        System.out.print("Masukkan Password Anda : ");
        Scanner input2 = new Scanner(System.in);
        password = input2.nextInt();
    }
}
