package gq.rxdy.human.parts;

import gq.rxdy.human.innards.Esophagus;
import gq.rxdy.human.matter.Matter;
import gq.rxdy.human.matter.liquids.Acid;
import gq.rxdy.human.utility.Muscle;
import gq.rxdy.human.utility.Organ;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Central command center lmao.
 * Created by Haze on 5/7/2015.
 */
public class Brain {

    /*
    Remember:
        Veins are to be defined in their super class.
        Organs and Muscles are to be added here.

     */

    public Brain() {
        matterRegistery = new CopyOnWriteArrayList<>();
        organs = new CopyOnWriteArrayList<>();
        muscles = new CopyOnWriteArrayList<>();

        registerMatter():
        addOrgans();
        addMuscles();
    }

    public void registerMatter(){
        matterRegistery.add(new Acid());
    }

    public static <O extends Organ<?>> O getOrgan(Class<O> oClaass) {
        for (Organ<?> org : organs) {
            if (oClaass.isInstance(org)) {
                return oClaass.cast(org);
            }
        }
        return null;
    }

    public static <M extends Matter> M getMatterFromRegistry(Class<M> mClass){
        for(Matter m : matterRegistery){
            if(mClass.isInstance(m)){
                return mClass.cast(m);
            }
        }
        return null;
    }

    public void addOrgans() {

    }

    public void addMuscles() {
        muscles.add(new Esophagus());
    }

    protected static List<Organ<?>> organs;
    protected static List<Muscle<?>> muscles;
    protected static List<Matter> matterRegistery;
}