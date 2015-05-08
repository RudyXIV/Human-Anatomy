package gq.rxdy.human.utility;

import gq.rxdy.human.matter.Matter;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Haze on 5/7/2015.
 */
public abstract class Organ<M extends Matter> {

    private String name, function;
    public List<Gland> glandList;

    public Organ(String name) {
        this(name, "A function has not been defined.");
    }

    public Organ(String function, String name) {
        this.function = function;
        this.name = name;
        this.glandList = new CopyOnWriteArrayList<>();
    }

    public void acceptMatterFrom(Muscle m) {}

    public abstract void onMatterEnter(Vein fromVein);

    public abstract void onContract();

    public abstract void onRelax();

    public void push(Vein targetVein, Matter selectedMatter){}

}
