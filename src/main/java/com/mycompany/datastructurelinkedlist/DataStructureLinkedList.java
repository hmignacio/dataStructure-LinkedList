/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datastructurelinkedlist;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


class LinkedListOperations{
        LinkedList<Integer> list = new LinkedList<>();
        

        void add(int value) {
            list.add(value);
        }
        

        void delete(int value) {
            list.remove(Integer.valueOf(value)); // removes first occurrence
        }
        
        void sort() {
            Collections.sort(list);
        }
        
        void edit(int oldValue, int newValue) {
            int index = list.indexOf(oldValue);
            if (index == -1) {
                System.out.println("Value not found.");
                return;
            }
            list.set(index, newValue);
        } 
        
        boolean search(int value) {
            return list.contains(value);
        }
        
 
        void merge(LinkedList<Integer> otherList) {
            list.addAll(otherList);
            System.out.println("\n Merged Successfully");
        }

        HashMap<Integer, Integer> toHashMap() {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (Integer val : list) {
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
            return map;
        }
        
        void display() {
            System.out.println("\nLinked List: " + list);
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
                    System.out.println("[3] Delete an element to the Linked List \n");
                    System.out.println("[4] Sort the Linked List \n");
                    System.out.println("[5] Edit a certain node from the Linked List \n");
                    System.out.println("[6] Search a certain node from the Linked List \n");
                    System.out.println("[7] Merge another Linked List \n");
                    System.out.println("[8] Transform the Linked list into a Hash \n");
                    System.out.println("[9] Exit");

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
                        System.out.print("Enter a number to delete: ");
                        listOperations.delete(scanner.nextInt());
                    }
                    if(option.equals("4")){
                        listOperations.sort();
                    }
                    if(option.equals("5")){
                        System.out.print("Enter a number to edit: ");
                        Integer valueToFind = scanner.nextInt();
                        System.out.print("Enter the new value: ");
                        Integer newValue = scanner.nextInt();
                        listOperations.edit(valueToFind, newValue);
                    }
                    if(option.equals("6")){
                        System.out.print("Enter a number to search: ");
                        System.out.println("Value found? " + listOperations.search(scanner.nextInt()));
                    }
                    if(option.equals("7")){
                        LinkedList<Integer> anotherList = new LinkedList<>();
                        anotherList.add(40);
                        anotherList.add(50);
                        listOperations.merge(anotherList);
                    }
                    if(option.equals("8")){
                        HashMap<Integer, Integer> freqMap = listOperations.toHashMap();
                        System.out.println("HashMap: " + freqMap);
                    }
                    if(option.equals("9")){
                        cont = false;
                    }

                }

        }
        
    }

    

