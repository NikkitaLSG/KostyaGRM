package org.example;

public class Toyota {
    String _model = "GT";
    String _name ="Toyota";
    int _age = 2018;
    int _price = 1980000;

    @Override
    public String toString() {
        return "Toyota{" +
                "_model='" + _model + '\'' +
                ", _name='" + _name + '\'' +
                ", _age=" + _age +
                ", _price=" + _price +
                '}';
    }
}
