/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dreamoval.opensource.driller;

 /*
 * @author malike_st
 */
import com.dreamoval.opensource.driller.nlp.DrillerTokenizer;
import com.dreamoval.opensource.driller.nlp.QueryTranslator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DrillerMain {
    // main function of driller main
    
   public static void main(String[] args) {
      
        // decalaration of variables
       String input;
        int option;
        //Library to allow input from the user
       Scanner sc = new Scanner(System.in);
       // Asking the user what he or she wants to do
        System.out.println("What do you want to do");
        // putting the tasks that can be done by the user in a list
        List<String> options = new ArrayList<String>();
       options.add("1. Find Number of");
       options.add("2. Find Name of");
       options.add("3. Delete");
       options.add("4. Insert");
       options.add("5. Update");
       options.add("6. Create");
       options.add("7. Drop");
       //displaying the options that are available for the user to select
       System.out.println(options);
       //Asking the user to select out of the displayed options what he or she wants to do
       System.out.println("Enter the number corresponding to the desired activity: ");
       // accepting the number corresponding to the task from the user
       option = sc.nextInt();
       // asking the user to enter the search
       System.out.println(" Enter search here: ");
       // accepting input from the user
       input = sc.next();
       
       //creating an object from the QuerlyTranslator class
       QueryTranslator querytranslator = new QueryTranslator();
       DrillerTokenizer  drill = new DrillerTokenizer ();
      //checking for the number the user selected and apply the respective task
       //for (String item : options){
           if (option == 1){
            //querytranslator.numberof(input);
               drill.getwords(input);
        }
       if(option == 2){
           querytranslator.nameof(input);
        }
       if(option == 3){
           querytranslator.delete(input);
        }
       if(option == 4){
           querytranslator.insert(input);
        }
       if(option == 5){
            querytranslator.update(input);
        }
       if(option == 6){
             querytranslator.create(input);
        }
       if(option == 7){
              querytranslator.drop(input);
        }

                                }
                                            }
                    
    

