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
public class Color {
    private ColorEnum color;
        
    public Color(ColorEnum c){
        this.color = c;
    }
    
    public ColorEnum getColor(){
        return this.color;
    }
    
    public boolean compare(Color c){
        if(this.color == c.color){
            return true;
        }
        return false;
    }
}
