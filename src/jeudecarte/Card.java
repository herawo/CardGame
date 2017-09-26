/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudecarte;

/**
 *
 * @author UTILISATEUR
 */
public class Card {
    
    private Shape shape;
    private Value value;
    
    public Card(Value v, Shape s){
        this.shape = s;
        this.value = v;
    }
    
    public String toString(){
        return "[Value = " + value + "; Shape = " + shape + " ]"; 
    }
}
