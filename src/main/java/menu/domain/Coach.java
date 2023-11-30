package menu.domain;

import java.util.List;

public class Coach {
    private final String name;
    private final List<String> notEatFoods;

    public Coach(String name, List<String> notEatFoods) {
        this.name = name;
        this.notEatFoods = notEatFoods;
    }
}
