package menu.view;

import java.util.Arrays;
import java.util.List;
import camp.nextstep.edu.missionutils.*;

public class InputView {
    public List<String> getCoachNames(){
        String inputValue = Console.readLine();
        return Arrays.asList(inputValue.split(","));
    }
}
