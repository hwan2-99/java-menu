package menu.domain;

import java.util.List;

public class Menu {
    private final Category category;
    private final List<String> menuNames;

    public Menu(Category category, List<String> menuNames) {
        this.category = category;
        this.menuNames = menuNames;
    }
}
