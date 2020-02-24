package com.models;

import java.util.HashMap;

/**
 * Created by Xinyu Zhu on 2/23/2020, 11:49 PM
 * com.models in HumanSocietySimulator
 *
 * Human is the basic unit
 */
public class Human {
    private String identifier;
    private int resourceAmount;
    private HashMap<String, Link> association;
    private Network home;

    public Human(String identifier) {
        this.identifier = identifier;
        association = new HashMap<String, Link>();
        resourceAmount = 10;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getResourceAmount() {
        return resourceAmount;
    }

    public void setResourceAmount(int resourceAmount) {
        this.resourceAmount = resourceAmount;
    }

    public void meet(Human other) {
        if (!association.containsKey(other.getIdentifier()))
            association.put(other.getIdentifier(), new Link(this, other));
    }

    public void die() {
        for (String key : association.keySet()) {
            association.get(key).deActivate();
        }
        association.clear();
        association = null;
    }

    public void teach(Human human) {
        this.meet(human);
        human.meet(this);

        for (String key : association.keySet()) {
            human.meet(association.get(key).getTarget());
            association.get(key).deActivate();
        }
    }

    public Human born() {
        Human childern = new Human(this.getIdentifier() + "_child" + System.currentTimeMillis());
        this.meet(childern);
        childern.meet(this);
        return childern;
    }

    public void action() {
        if (resourceAmount > 100) {
            Human child = born();
            home.addPeople(child);
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "identifier='" + identifier + '\'' +
                ", resourceAmount=" + resourceAmount +
                ", association=" + association +
                '}';
    }
}
