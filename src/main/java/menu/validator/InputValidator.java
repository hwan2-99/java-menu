package menu.validator;

import java.util.Arrays;
import java.util.List;
import menu.constant.DomainCondition;
import menu.constant.ErrorMessage;

public class InputValidator {
    public List<String> coachNameValidator(String inputValue){
        List<String> coachName = coachCountValidator(inputValue);
        coachNamesDigitValidator(coachName);
        return coachName;
    }
    private void coachNamesDigitValidator(List<String> coachName) {
        for(String coach : coachName){
            if(DomainCondition.isIncorrectNameDigit(coach)){
                throw new IllegalArgumentException(ErrorMessage.COACH_NAME_DIGIT_ERROR.getMessage());
            }
        }
    }
    private List<String> coachCountValidator(String inputValue){
        List<String> coachNames = Arrays.asList(inputValue.split(","));
        if (DomainCondition.isIncorrectCoachCount(coachNames)){
            throw new IllegalArgumentException(ErrorMessage.COACH_COUNT_ERROR.getMessage());
        }
        return coachNames;
    }
}
