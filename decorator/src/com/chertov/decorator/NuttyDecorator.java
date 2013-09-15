package com.chertov.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: Deman
 * Date: 15.09.13
 * Time: 16:38
 */
public class NuttyDecorator extends IcecreamDecorator {

    public NuttyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addNutts();
    }

    private String addNutts() {
        return " + cruncy nuts";
    }
}
