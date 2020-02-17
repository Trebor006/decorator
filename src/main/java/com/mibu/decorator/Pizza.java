package com.mibu.decorator;

abstract class Pizza {

  String description = "Unkknown Pizza";

  public String getDescription() {
    return description;
  }

  public abstract int getCost();

  public String getDescriptionAndCost() {
    return getDescription() + " Cost : " + getCost();
  }
}
