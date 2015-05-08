package gq.rxdy.human.innards;

import gq.rxdy.human.matter.Matter;
import gq.rxdy.human.parts.Brain;
import gq.rxdy.human.utility.Muscle;
import gq.rxdy.human.utility.Organ;

/**
 * Created by Haze on 5/7/2015.
 */
public class Esophagus extends Muscle<Matter> {


    private Organ stomach;

    public Esophagus(){
        super("Esophagus");
        stomach = Brain.getOrgan();
    }

    @Override
    public void onContract() {

    }

    @Override
    public void onRelax() {

    }
}
