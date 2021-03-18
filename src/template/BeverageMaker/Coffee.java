package template.BeverageMaker;

import template.BeverageMaker.Beverage;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Brewing Coffee");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding condiments to Coffee");
    }
}
