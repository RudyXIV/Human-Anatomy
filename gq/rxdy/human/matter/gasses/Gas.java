package gq.rxdy.human.matter.gasses;

import gq.rxdy.human.matter.Matter;

/**
 * Created by Haze on 5/7/2015.
 */
public class Gas extends Matter {


    private String name;
    private float capacity, minimum, current;

    public Gas(String name) {
        super(name);
    }

    public Gas(float current, String name, float capacity, float minimum) {
        super(current,name,capacity,minimum);
    }


}
