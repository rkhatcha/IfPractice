/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifpractice;

import java.util.Scanner;

/**
 *
 * @author rkhatchadourian
 */
public class CharacterPractice {
    public static void main(String[] args) {
        //Get a character from the user.
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter a character: ");
        
        char aCharacterVariable = scanner.next().charAt(0);
        
        System.out.println("You entered: " + aCharacterVariable);
        
        if (aCharacterVariable > 'Z')
            System.out.println(aCharacterVariable + " is greater than Z.");
        else //aCharacterVariable <= 'Z'
            System.out.println(aCharacterVariable + " is not greater than Z.");
        
        
    }
}
