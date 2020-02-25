package com.environment.models;

/**
 * Created by Xinyu Zhu on 2/24/2020, 4:40 PM
 * com.environment.models in HumanSocietySimulator
 */
public abstract class ResourceContainer {
    private Resource subject;
    private double amount;
    private double generateSpeed;
    private double limit;

    // according to what kind of resource it is
    // and the remaining amount of the resource
    // people who want to dig out 10 resource may
    // get 9 only, synchronized method
    public abstract double digOutResource(double request);
}
