package com.chertov.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: Deman
 * Date: 15.09.13
 * Time: 16:33
 * To change this template use File | Settings | File Templates.
 */
public abstract class IcecreamDecorator implements Icecream {

    protected Icecream specialIcecream;

    protected IcecreamDecorator(Icecream specialIcecream) {
        this.specialIcecream = specialIcecream;
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream();
    }
}
