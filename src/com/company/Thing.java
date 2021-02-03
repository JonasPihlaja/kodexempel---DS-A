package com.company;

import java.util.ArrayList;

public class Thing {

    private String name;

    private Thing next;

    private ArrayList<Thing> relations;

    Thing(String name) {
        //Graph: initilalisera relations
        relations = new ArrayList<>();
        this.name = name;
    }

    public Thing getNext() {
        return next;
    }

    public void setNext(Thing next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }
    //Graph setter
    public void addRelation(Thing thing) {
        relations.add(thing);
    }
    //Graph getter
    public ArrayList<Thing>getRelations() {
        return relations;
    }
}