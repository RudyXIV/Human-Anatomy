package gq.rxdy.human.matter.solids;

import gq.rxdy.human.matter.Matter;

/**
 * Created by Haze on 5/7/2015.
 */
public class Solid extends Matter {



    private String name;
    private float capacity, minimum, current;

    public Solid(String name) {
        super(name);
    }

    public Solid(float current, String name, float capacity, float minimum) {
        super(current,name,capacity,minimum);
    }


}
