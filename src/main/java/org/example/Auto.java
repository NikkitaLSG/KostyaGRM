package org.example;

public class Auto {
    private String Model = "Silvia";
    private String Name ="Nissan Silvia";
    private int Age = 1998;
    private int Price = 700000;

    public String _getModel(){
        return Model;
    }
    public void _setModel(String _changeModel){
        Model = _changeModel;
    }
    public String _getName(){
        return Name;
    }
    public  void _setName(String _changeName){
        Name = _changeName;
    }
    public int _getAge(){
        return Age;
    }
    public void  _setAge(Integer _changeAge){
        Age = _changeAge;
    }
    public int _getPrice(){
        return Price;
    }
    public void _setPrice(Integer _changePrice){
        Price = _changePrice;
    }

    @Override
    public String toString() {
        return  "Auto " + '\'' +
                "Model= " + Model + '\'' +
                "Name= " + Name + '\'' +
                "Age= " + Age + '\'' +
                "Price= " + Price ;

    }
}
