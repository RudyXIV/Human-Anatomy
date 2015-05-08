package gq.rxdy.human.utility;

import gq.rxdy.human.matter.Matter;

/**
 * a band of tissue
 * Created by Haze on 5/7/2015.
 */
public abstract class Muscle<M extends Matter> {

    private String name;

    private M matter;

    public String getName() {
        return this.name;
    }

    public M getMatter() {
        return matter;
    }

    public Muscle(String name){
        this.name = name;
    }

    public abstract void onContract();

    public abstract void onRelax();

}
