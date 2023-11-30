package menu.constant;

public enum InputMessage {
    START_RECOMMEND("점심 메뉴 추천을 시작합니다."),
    GET_COACHES("코치의 이름을 입력해 주세요. (, 로 구분)"),
    GET_NOT_EAT("%s(이)가 못 먹는 메뉴를 입력해 주세요.");
    private String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
