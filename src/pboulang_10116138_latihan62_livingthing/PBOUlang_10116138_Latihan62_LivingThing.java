/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan62_livingthing;

/**
 *
 * @author Aradnu
 */
public class PBOUlang_10116138_Latihan62_LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human human = new Human();
        human.setNama("Afif Raditya Nugraha");

        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }

}
