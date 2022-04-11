// your solution here
//fix all the errors including package errors
package ru.innopolis.problem1;

import java.lang.reflect.Array;
import java.util.ArrayList;


class Chest {
    private List<String> items = new ArrayList<String>();

    Chest(ArrayList<String> items) {
        this.items = items;
    }

    class ChestIterator {
        private Chest chest;
        private int currentPosition = 0;
    
        ChestIterator(Chest chest) {
            this.chest = chest;
        }

        public boolean hasNext() {
            return currentPosition < items.size();
        }

        public Profile getNext() {
            if (!hasNext()) {
                return null;
            }

            item = chest.items[currentPosition];
            currentPosition++;
            return item;
        }

        public void reset() {
            this.currentPosition = 0;
        }
    }

    ChestIterator getIterator() {
        return new ChestIterator(this);
    }

}

class Main {
    public static void main(String[] args) {
        String[] a = {"coin", "ring"};
        Chest chest = new Chest(a);
        Chest.ChestIterator iter = chest.getIterator();
        for (item = iter.getNext(); iter.hasNext(); item = iter.getNext()) {
            System.out.println(item);
        }     
    }
}
