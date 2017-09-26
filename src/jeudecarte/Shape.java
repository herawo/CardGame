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
public class Shape extends Color{
    
    private ShapeEnum shape;

    public Shape(ColorEnum c, ShapeEnum s) {
        super(c);
        this.shape = s;    
    }
    
    public boolean compare(Shape s){
        if(this.shape == s.shape && this.getColor() == s.getColor()){
            return true;
        }
        return false;
    }
    
    public String toString(){
        return this.shape.toString();
    }
}
