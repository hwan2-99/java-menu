package menu.service;

import java.util.List;
import menu.constant.InputMessage;
import menu.view.InputView;
import menu.view.OutputView;

public class InputService {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public List<String> getCoaches() {
        outputView.printMessage(InputMessage.GET_COACHES.getMessage());
        while (true) {
            try {
                return inputView.getCoachNames();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public List<String> getNotEatFoods() {
        while (true){
            try{
                return inputView.getNotEatFoods();
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

}
