package menu.view;

import java.util.List;
import camp.nextstep.edu.missionutils.*;
import menu.validator.InputValidator;

public class InputView {
    private final InputValidator inputValidator = new InputValidator();

    public List<String> getCoachNames() {
        String inputValue = Console.readLine();
        return inputValidator.coachNameValidator(inputValue);
    }

    public List<String> getNotEatFoods(){
        String inputValue = Console.readLine();
        return inputValidator.notEatFoodsValidator(inputValue);
    }
}
