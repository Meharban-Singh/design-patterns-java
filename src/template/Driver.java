package template;

import template.BeverageMaker.Coffee;
import template.BeverageMaker.Tea;

/*
 * Template Design patter
 * =======================
 *
 * Use when you need to have a template for a set of objects/classes...
 *
 * Example:
 * In the package BeverageMaker, the class Beverage is a template for the sub classes.
 * This enables the beverages to have a specific set of methods, and forces anyone new to
 * the project to use the same names even if they are unaware about the class Beverage.
 *
 * Uses inheritance, and follow 'Open Closed principle'
 */

public class Driver {
    public static void main(String[] args) {
        new Tea().make();

        System.out.println();

        new Coffee().make();
    }
}
