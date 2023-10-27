package ex001.presenter;

import ex001.models.Toys;



public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model,View view)
    {
        this.model = model;
        this.view = view;
    }

    public void addToBag(Toys toy)
    {
        model.addToBag(toy);
        model.bagInfo();
        view.infoOfAddedBag();
        
    }
}
