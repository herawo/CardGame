/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudecarte;

import java.util.LinkedList;

/**
 *
 * @author UTILISATEUR
 */
public class Player {
    private Packet deck;
    private String name;
    
    public Player(String n){
        this.name = n;
    }
    
    public void setDeck(LinkedList<Card> d){
        this.deck = new Packet(d);
    }
    
    public Packet getDeck(){
        return this.deck;
    }
}
