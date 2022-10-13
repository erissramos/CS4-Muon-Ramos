/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05_muon_ramos;
import java.util.ArrayList;
/**
 *
 * @author MUON
 */
public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    double earnings = 0;
    ArrayList itemList = new ArrayList();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void addItem (Item i) {
      
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    for(Item i: itemList) {
        if(index <= itemList.size()){
            System.out.printf("There are only %d items in the store.", itemList.size());
        }
        double earnings = 0;
        earnings = earnings + i.get(index);
        System.out.printf("Sale: ", earnings);
    }
    
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
   for(Item i: itemList) {
       boolean found = false;
       if(i.getName().equals(name)){
           //add to earnings
           found = true;
           break;           
       } 
    if(!found) {
       System.out.println("Sorry. No such item in the store exists.");
    }   
    double earnings = 0;
    earnings = earnings + i.get(index);
    System.out.printf("Sale: ", earnings);
   }
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    //boolean value
    for(Item e: itemList) {
        boolean found = false;
        if (found = itemList.contains(i)) {
            i.getCost();
            found = true;
            break;
        }
    if(!found) {
        System.out.println("Sorry. The store does not sell this item");
    }
    double earnings = 0;
    earnings = earnings + i.get(index);
    System.out.printf("Sale: ", earnings);
    }
    // get Item i from itemList and add its cost to earnings
   // print statement indicating the sale
  }
 
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    for(Item i: itemList){
        if(i.getType().equals("food")) {
            System.out.println(i);
        }            
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    for(Item i: itemList) {
        if(i.getCost() <= 500) {
            System.out.println(i);
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    for(Item i: itemList) {
        if(i.getCost() >= 1000) {
            System.out.print(i);
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for(Store i: storeList) {
        System.out.printf("The store: , had the total earnings: ")
    }
  }
}
