/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dreamoval.opensource.driller.nlp;

/**
 *
 * @author rayklutz
 */
public class QueryTranslator {
    //variable declaration
    String words;
    //method to provide the number of some items in a table in a database
    public void numberof(String words){
        this.words = words;
        System.out.println(" Number " + words);
      }
    //method to provide the name of some items in a table in a database
    public void nameof(String words){
          this.words = words;
        System.out.println(" Name " + words);
      
    }
        //method to insert data into rows in a table in a database
    public void insert(String words){
          this.words = words;
        System.out.println(" Insert " +words);
      
    }
    //method to update or change data in a table in a database
    public void update(String words){
          this.words = words;
        System.out.println(" Update " +words);
      
    }
    //method to delete a row from a table in a database
    public void delete(String words){
          this.words = words;
        System.out.println(" Delete " +words);
      
    }
    //method to create a table in a database
    public void create(String words){
          this.words = words;
        System.out.println(" Create " +words);
      
    }
    //method to delete a table from a database
    public void drop(String words){
          this.words = words;
        System.out.println(" Drop " +words);
      
    }
}
