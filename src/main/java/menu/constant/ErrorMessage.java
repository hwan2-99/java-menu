package menu.constant;

public enum ErrorMessage {
    ERROR("[ERROR]"),
    COACH_COUNT_ERROR(ERROR.message + "코치는 최소 2명 이상 입력해야 합니다."),
    COACH_NAME_DIGIT_ERROR(ERROR.message + "코치의 이름은 최소 2글자, 최대 4글자 입니다.");
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
