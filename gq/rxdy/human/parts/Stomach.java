package gq.rxdy.human.parts;

import gq.rxdy.human.matter.Matter;
import gq.rxdy.human.matter.liquids.Acid;
import gq.rxdy.human.matter.liquids.Liquid;
import gq.rxdy.human.matter.solids.Solid;
import gq.rxdy.human.utility.Gland;
import gq.rxdy.human.utility.Muscle;
import gq.rxdy.human.utility.Organ;
import gq.rxdy.human.utility.Vein;

/**
 * Created by Haze on 5/7/2015.
 */
public class Stomach extends Organ<Solid> {

    private int acidCount;

    @Override
    public void onMatterEnter(Vein fromVein) {
        if(fromVein.getMatterBeingPassedThrough() instanceof Solid){
            if(acidCount<3){
                glandList.get(0).create();
            } else {
                //TODO: DIGEST
            }
        } else if(fromVein.getMatterBeingPassedThrough() instanceof Liquid){

        }
    }

    @Override
    public void onContract() {
        // TODO: VOMITING
    }

    @Override
    public void onRelax() {

    }

    public Stomach(){
        super("Stomach", "Digests Food");
        acidCount = 0;
        /* ACID GLAND */
        this.glandList.add(new Gland(this, Brain.getMatterFromRegistry(Acid.class)) {
            @Override
            public void create() {
                ((Stomach) getParentOrgan()).acidCount += 3;
            }
        });
    }

}
