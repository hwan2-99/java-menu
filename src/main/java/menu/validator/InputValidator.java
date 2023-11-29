package menu.validator;

import java.util.List;
import menu.constant.DomainCondition;

public class InputValidator {
    public void coachNameValidator(List<String> coachName){
        coachNamesDigitValidator(coachName);
    }
    private void coachNamesDigitValidator(List<String> coachName) {
        for(String coach : coachName){
            if(DomainCondition.isIncorrectNameDigit(coach)){
                throw new IllegalArgumentException();
            }
        }
    }
}
