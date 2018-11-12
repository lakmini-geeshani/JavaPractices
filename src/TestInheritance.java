/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Geeshani
 */

class TestInheritance {
    
  public static void main(String args[]){  
      Dog a=new Dog(); //single inheritance
      a.eat();
      a.bark();
    
      BabyDog d=new BabyDog();  //multilevel inheritance
      d.weep();  
      d.bark();  
      d.eat(); 

Cat c=new Cat(); //Hierarchical inheritance
c.meow();
c.eat();

 }   
}
