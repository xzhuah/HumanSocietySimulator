package com.models;

import java.util.HashMap;

/**
 * Created by Xinyu Zhu on 2/23/2020, 11:49 PM
 * com.models in HumanSocietySimulator
 *
 * The network is consist of Human and Link
 */
public class Network {
    HashMap<String, Human> allPeople;

    public Network() {
        allPeople = new HashMap<String, Human>();
    }

    public void addPeople(Human human) {
        if (!allPeople.containsKey(human.getIdentifier()))
            allPeople.put(human.getIdentifier(), human);
    }

    public void run() {

    }

    @Override
    public String toString() {
        return "Network{" +
                "allPeople=" + allPeople +
                '}';
    }
}
