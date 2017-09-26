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
public class Value {
    private String label;
    private int value;
    
    public Value(String l, int v){
        this.label = l;
        this.value = v;      
    }
    
    public String toString(){
        return this.label;
    }
}
