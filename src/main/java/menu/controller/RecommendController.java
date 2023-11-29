package menu.controller;

import java.util.List;
import menu.view.InputView;

public class RecommendController {
    private InputView inputView = new InputView();
    public void run(){
        List<String> coaches = inputView.getCoachNames();
        for (String coach : coaches) {
            System.out.println(coach);
        }
    }
}
