package ex001.models;

import ex001.presenter.Model;

public class Toys implements Model {
    
    private String name;
    private int id;
    private double price;
    private static int counter;

    {
        id = ++counter;
    }

    public Toys()
    {

    }
    
    public Toys(double price,String name)
    {
        if(this.price < 200)
        {
            this.price = 200;
        }
        else{
            this.price = price;
        }
        this.name = name;        
    }

    public void addToBag(Toys toy)
    {

    }
    public void bagInfo()
    {
        
    }

    public String toString()
    {
        return String.format("id:%d,Name:%s,Price:%f",id,name,price);
    }

}
