package com.example.carddeck;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class AbstractDeck implements Deck {

    protected List<Card> cards;         //make sure it's java.util list

    public List<Card> getDeck() {       //getter

        return this.cards;
    }

    @Override
    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(this.cards, new Random(seed));
        //Anonymous instantiation: Instantiating without referencing

    }

}
