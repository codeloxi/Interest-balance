/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intrest_and_balance;

/**
 *
 * @author jacob
 */

import java.util.Scanner;

public class Intrest_and_balance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
      int answer = 0;
        
        
       System.out.println("This program will take your intrest rate and your inital balance and will outout your final balance.");
        
       do{
       
        final_intrest();
        answer++;
        
       }while (answer <= 2);
       
    }
    
    public static float set_intrest_rate(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the intrest rate: ");
        
        float rate = scanner.nextFloat();
        
        return rate;
        
    }
    
    public static float set_initial_balance(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please Enter the starting balance");
        
        float balance = scanner.nextFloat();
        
        
        return balance;
    }
    
    public static void final_intrest(){
        
        float rate1 = set_intrest_rate();
        
        float balance1 = set_initial_balance();
        
        balance1 = balance1 + (rate1 * balance1 / 100);
        
        System.out.print("Youre intrest rate is: ");
        System.out.print(rate1);
        System.out.println("%");
        
        System.out.print("Your total balance is:");
        System.out.print("$ ");
        System.out.print(balance1);
        System.out.println(" ");
        
    }
    
    public static void final_balance(){
        
       
        float balance1 = set_initial_balance();
        
        float intrest = 1;
        
        balance1 = balance1 * (intrest / 100);
        
        
    }
}
