package com.mibu.decorator;

class Barbeque extends CustomPizzaDecorator {
  private Pizza pizza;

  public Barbeque(Pizza pizza) {
    this.pizza = pizza;
  }

  public String getDescription() {
    return pizza.getDescription() + ", Barbeque ";
  }

  public int getCost() {
    return 90 + pizza.getCost();
  }
}
