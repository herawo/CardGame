/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudecarte;

import java.util.Collections;
import java.util.LinkedList;
/**
 *
 * @author UTILISATEUR
 */
public class Packet {
    private LinkedList<Card> stack = new LinkedList<>();
    
    public Packet(LinkedList<Value> lv,LinkedList<Shape> ls){
        ls.stream().forEach((Shape l) -> {
            lv.stream().forEach((v) -> {
                stack.add(new Card(v, l));
            });
        });
    }
    
    public Packet( LinkedList<Card> s){
        this.stack = s;
    }
    
    @Override
    public String toString(){
        String str = "";
        for (Card c : stack){
            str = str + c.toString() + "\n";
        }
        return str;
    }
    
    public LinkedList<Card> getPile(){
        return this.stack;
    }
    
    public void randomize(){
        Collections.shuffle(stack);
    }
    
    public LinkedList<LinkedList<Card>> split(int n){
        LinkedList<LinkedList<Card>> listOfStacks = new LinkedList<>();
        for(int i = 0; i <= n ; i++){
            listOfStacks.add(new LinkedList<Card>());
        }
        while(!stack.isEmpty()){
            for(LinkedList<Card> ls : listOfStacks){
                if(stack.isEmpty()){
                    break;
                }
                ls.add(stack.pop());
            }
        }
        return listOfStacks;
    }
}
