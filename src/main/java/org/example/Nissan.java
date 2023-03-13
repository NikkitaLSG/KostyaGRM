package org.example;

public class Nissan {
    String _model = "Silvia";
    String _name ="Nissan Silvia";
    int _age = 1998;
    int _price = 700000;

    @Override
    public String toString() {
        return "Nissan{" +
                "_model='" + _model + '\'' +
                ", _name='" + _name + '\'' +
                ", _age=" + _age +
                ", _price=" + _price +
                '}';

    }
}
