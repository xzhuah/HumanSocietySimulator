package com.models;

/**
 * Created by Xinyu Zhu on 2/23/2020, 11:49 PM
 * com.models in HumanSocietySimulator
 *
 * The link is used for human to transmit information and object to each other
 *
 */
public class Link {

    private Human target;
    private Human source;
    private boolean activate;




    public Link(Human source, Human target) {
        this.source = source;
        this.target = target;
        this.activate = true;
    }

    public Human getTarget() {
        return target;
    }

    public Human getSource() {
        return source;
    }

    public boolean isActivate() {
        return activate;
    }

    public boolean dump(int amount) {
        if (activate) {
            synchronized (source) {
                if (source.getResourceAmount() >= amount) {
                    synchronized (target) {
                        target.setResourceAmount(target.getResourceAmount() + amount);
                    }
                    source.setResourceAmount(source.getResourceAmount() - amount);
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }

    }

    public void deActivate() {
        this.activate = false;
    }

    @Override
    public String toString() {
        return "Link{" +
                "target=" + target.getIdentifier() +
                ", source=" + source.getIdentifier() +
                ", activate=" + activate +
                '}';
    }
}
