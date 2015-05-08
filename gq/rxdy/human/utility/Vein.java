package gq.rxdy.human.utility;

import gq.rxdy.human.matter.Matter;

/**
 * Created by Haze on 5/7/2015.
 */
public class Vein<M extends Matter> {

    private Organ<?> lead, from;

    private M matter;

    public Vein(Organ<?> lead, Organ<?> from) {
        this.lead = lead;
        this.from = from;
    }

    public Organ<?> getLead() {
        return lead;
    }

    public Organ<?> getFrom() {
        return from;
    }

    public M getMatterBeingPassedThrough(){ return matter; }

}
