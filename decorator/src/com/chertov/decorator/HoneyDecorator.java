package com.chertov.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: Dmitriy Chertov
 * Date: 15.09.13
 * Time: 16:41
 */
public class HoneyDecorator extends IcecreamDecorator {

    public HoneyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addHoney();
    }

    private String addHoney() {
        return " + honey";
    }
}
