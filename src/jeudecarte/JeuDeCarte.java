/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudecarte;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author UTILISATEUR
 */
public class JeuDeCarte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Shape trefle = new Shape(ColorEnum.NOIRE, ShapeEnum.TREFLE);
        Shape pique = new Shape(ColorEnum.NOIRE, ShapeEnum.PIQUE);
        Shape coeur = new Shape(ColorEnum.ROUGE, ShapeEnum.COEUR);
        Shape carreau = new Shape(ColorEnum.ROUGE, ShapeEnum.CARREAU);
        LinkedList shapes = new LinkedList<>();
        shapes = multipleAdd(trefle,pique,coeur, carreau);
        shapes = (LinkedList<Shape>) shapes;
        Value one = new Value("one", 1);
        Value two = new Value("two", 2);
        Value three = new Value("three", 3);
        Value four = new Value("four", 4);
        Value five = new Value("five", 5);
        Value six = new Value("six", 6);
        Value seven = new Value("seven", 7);
        Value height = new Value("height", 8);
        Value nine = new Value("nine", 9);
        Value ten = new Value("ten", 10);
        Value valet = new Value("valet", 11);
        Value queen = new Value("queen", 12);
        Value king = new Value("king", 13);
        Value as = new Value("as", 14);
        LinkedList values = new LinkedList<>();
        values = multipleAdd(one, two, three, four, five, six, seven, height,
                 nine, ten, valet, queen, king, as);
        values = (LinkedList<Value>) values;
        Packet jeu = new Packet(values, shapes);
        jeu.randomize();
        Player p1 = new Player("Alexis");
        Player p2 = new Player("Nope");
        LinkedList<LinkedList<Card>> listOfStacks = jeu.split(2);
        p1.setDeck( listOfStacks.get(0));
        p2.setDeck( listOfStacks.get(1));
        System.out.println(p1.getDeck());
        System.out.println(p2.getDeck());
    }
    
    public static LinkedList<Object> multipleAdd(Object... obj){
        LinkedList<Object> ll= new LinkedList<>();
        ll.addAll(Arrays.asList(obj));
        return ll;
    }
}