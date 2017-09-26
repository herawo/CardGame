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
public enum ShapeEnum {
    PIQUE("PIQUE"),
    TREFLE("TREFLE"),
    COEUR("COEUR"),
    CARREAU("CARREAU");
    
    private final String name;
    
    private ShapeEnum(String n){
        this.name = n;
    }
    
    public String toString(){
        return this.name;
    }
}
