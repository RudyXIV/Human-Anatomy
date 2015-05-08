package gq.rxdy.human.matter.liquids;

import gq.rxdy.human.matter.Matter;

/**
 * Created by Haze on 5/7/2015.
 */
public abstract class Liquid extends Matter {

    private String name;
    private float capacity, minimum, current;

    public Liquid(String name) {
        super(name);
    }

    public Liquid(float current, String name, float capacity, float minimum) {
        super(current,name,capacity,minimum);
    }



}
