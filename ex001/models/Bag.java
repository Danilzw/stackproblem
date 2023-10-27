package ex001.models;

import java.util.ArrayList;
import java.util.Collection;

import ex001.presenter.Model;

public class Bag implements Model{
    private Collection<Toys>toys;

    public Bag()
    {
        toys = new ArrayList<>();
    }

    public void addToBag(Toys toy)
    {
        toys.add(toy);
    }

    public void bagInfo()
    {
        for(Toys item:toys)
        {
            System.out.println(item);
        }
    }
}
