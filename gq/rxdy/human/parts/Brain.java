package gq.rxdy.human.parts;

import gq.rxdy.human.innards.Esophagus;
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

    public Brain(){
        this.organs = new CopyOnWriteArrayList<>();
        this.muscles = new CopyOnWriteArrayList<>();
        addOrgans();
        addMuscles();
    }

    public void addOrgans(){

    }

    public void addMuscles(){
        this.muscles.add(new Esophagus());
    }

    public List<Organ<?>> organs;
    public List<Muscle<?>> muscles;
}
