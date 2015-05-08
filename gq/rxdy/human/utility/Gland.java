package gq.rxdy.human.utility;

import gq.rxdy.human.matter.Matter;

/**
 * Created by Haze on 5/7/2015.
 */
public abstract class Gland {

    public Organ parentOrgan;

    public Matter product;

    public Gland(Organ parentOrgan, Matter product) {
        this.parentOrgan = parentOrgan;
        this.product = product;
    }

    public Organ getParentOrgan() {
        return parentOrgan;
    }

    public void setParentOrgan(Organ parentOrgan) {
        this.parentOrgan = parentOrgan;
    }

    public Matter getProduct() {
        return product;
    }

    public void setProduct(Matter product) {
        this.product = product;
    }

    public abstract void create();



}
