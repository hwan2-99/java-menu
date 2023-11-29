package menu.view;

import java.util.Arrays;
import java.util.List;
import camp.nextstep.edu.missionutils.*;
import menu.validator.InputValidator;

public class InputView {
    private final InputValidator inputValidator = new InputValidator();

    public List<String> getCoachNames() {
        while (true) {
            try {
                String inputValue = Console.readLine();
                inputValidator.coachNameValidator(inputValue);
                return inputValidator.coachNameValidator(inputValue);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
