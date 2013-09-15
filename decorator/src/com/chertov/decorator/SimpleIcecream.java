package com.chertov.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: Dmitriy Chertov
 * Date: 15.09.13
 * Time: 16:30
 * To change this template use File | Settings | File Templates.
 */
public class SimpleIcecream implements Icecream {

    @Override
    public String makeIcecream() {
        return "Base Icecream";
    }
}
