/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datastructurelinkedlist;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

class LinkedListOperations{
        LinkedList<Integer> list = new LinkedList<>();
        
        // Add element
        void add(int value) {
            list.add(value);
        }
        
        void display() {
            System.out.println(list);
        }
        
    }
public class DataStructureLinkedList {
    
    
    public static void main(String[] args) {

                LinkedListOperations listOperations = new LinkedListOperations();
                boolean cont = true;

                while(cont){
                    System.out.println("\nWelcome! Choose from the options below: \n");
                    System.out.println("[1] PRINT Linked List \n");
                    System.out.println("[2] Add an element to the Linked List \n");
                    System.out.println("[3] Exit");

                    Scanner scanner = new Scanner(System.in);
                    String option;

                    System.out.print("\nOption: ");
                    option = scanner.nextLine();

                    if(option.equals("1")){
                        listOperations.display();
                    }
                    if(option.equals("2")){
                        System.out.print("Enter a number to add: ");
                        listOperations.add(scanner.nextInt());
                    }
                    if(option.equals("3")){
                        cont = false;
                    }

                }

        }
        
    }

    

