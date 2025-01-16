package com.example;

class Button {
    int id;
    String name;
    boolean state;

    public Button(int id, String name) {
        this.id = id;
        this.name = name;
        this.state = false;
    }

    public void action() {
        this.state = !this.state;
        System.out.println("Button " + id + " state: " + state);
    }

    public boolean getState() {
        return this.state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}

class Knob {
    int id;
    String name;
    double value = 0;
    double[] range = { 0, 100 };

    public Knob(int id, String name) {
        this.id = id;
        this.name = name;
        this.value = 0;
    }

    public void action() {
        System.out.println("Knob " + id + " value: " + value);
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double[] getRange() {
        return this.range;
    }

    public void setRange(double min, double max) {
        this.range[0] = min;
        this.range[1] = max;
    }
}
