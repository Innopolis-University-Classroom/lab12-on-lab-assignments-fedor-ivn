// your solution here
//fix all the errors including package errors
package ru.innopolis.problem2;


abstract class Handler {
    Handler next;
    
    Handler setNext(Handler next) {
        this.next = next;
        return this.next;
    }

    abstract public void handle();
}


class Commander extends Handler {

    Commander(Handler next) {
        super(next);
    }

    @Override
    public void handle() {
        System.out.println("Recieved. Delegate it to Officier");
        next.handle();
    }
}

class Officier extends Handler {

    Officier(Handler next) {
        super(next);
    }

    @Override
    public void handle() {
        System.out.println("Recieved. Delegate it to Soldier");
        next.handle();
    }
}

class Soldier extends Handler {

    Soldier(Handler next) {
        super(next);
    }

    @Override
    public void handle() {
        System.out.println("Recieved. Performing...");
    }
}


class Main {
    public static void main(String[] args) {
        Commander commander = new Commander();
        Officier officier = new Officier();
        Soldier soldier = new Soldier();

        commander.setNext(officier).setNext(soldier);
    }
}
