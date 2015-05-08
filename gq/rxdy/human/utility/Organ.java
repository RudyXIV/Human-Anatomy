package gq.rxdy.human.utility;

import gq.rxdy.human.matter.Matter;

/**
 * Created by Haze on 5/7/2015.
 */
public abstract class Organ<M extends Matter> {

    private String name, function;

    public Organ(String name) {
        this.name = name;
        this.function = "A function has not been defined.";
    }

    public Organ(String function, String name) {
        this.function = function;
        this.name = name;
    }

    public abstract void acceptMatterFrom(Muscle m);

    public abstract void onMatterEnter(Vein fromVein);

    public abstract void onContract();

    public abstract void onRelax();

    public void push(Vein targetVein, Matter selectedMatter){}

}
