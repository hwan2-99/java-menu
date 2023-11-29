package menu.view;

import java.util.Arrays;
import java.util.List;
import camp.nextstep.edu.missionutils.*;
import menu.validator.InputValidator;

public class InputView {
    private final InputValidator inputValidator = new InputValidator();
    public List<String> getCoachNames(){
        String inputValue = Console.readLine();
        inputValidator.coachNameValidator(Arrays.asList(inputValue.split(",")));
        return Arrays.asList(inputValue.split(","));
    }
}
