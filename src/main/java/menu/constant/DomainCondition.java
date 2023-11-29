package menu.constant;

import java.util.List;

public enum DomainCondition {
    MIN_COACH_COUNT(2),
    MAX_COACH_COUNT(5),
    MIN_COACH_NAME_DIGIT(2),
    MAX_COACH_NAME_DIGIT(4);

    public static boolean isIncorrectNameDigit(String coachName) {
        return coachName.length() < MIN_COACH_NAME_DIGIT.number || coachName.length() > MAX_COACH_NAME_DIGIT.number;
    }
    public static boolean isIncorrectCoachCount(List<String> coachName){
        return coachName.size() < MIN_COACH_COUNT.number || coachName.size() > MAX_COACH_COUNT.number;
    }

    private final int number;

    public int getNumber() {
        return number;
    }

    DomainCondition(int number) {
        this.number = number;
    }
}
