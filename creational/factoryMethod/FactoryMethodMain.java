/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.factoryMethod;

/**
 *
 * @author George Volochaev
 */
public class FactoryMethodMain {
     public static void main(String[] args) {
        Creator creator1 = new ConcreteCreator1();
        System.out.println(creator1.someOperation());

        Creator creator2 = new ConcreteCreator2();
        System.out.println(creator2.someOperation());
    }
}



