/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author teena
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("A palindrome is a word, phrase, number, or "
                + "other sequence of characters which reads the same backward or forward.(Wikipedia)");
        System.out.println("Enter a word to see if it is a palindrome");
        
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine(); 
        String B = ""; 
        for(int x = A.length()-1; x >=0; x--){
            B += A.charAt(x); 
        }
        System.out.println(A.compareTo(B)==0?"Yes, it is a Palindrome":"No, it is not a Palindrome");
    }
    
}
