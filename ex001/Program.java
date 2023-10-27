package ex001;


import ex001.models.Toys;
import ex001.presenter.Model;
import ex001.presenter.Presenter;
import ex001.presenter.View;
import ex001.view.Stock;


public class Program {
    public static void main(String[] args) {
        Model model1 = new Toys();
        View view1 = new Stock();
        Toys toys = new Toys(200,"Машинка");
        
        Presenter presenter = new Presenter(model1, view1);
        presenter.addToBag(toys);
        
    }

    
    
}
