package menu.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import menu.domain.Category;

public class MenuRepository {
    private Map<Category, List<String>> menuStorage = new HashMap<>();

    public void save(Category category, List<String> menuNames) {
        menuStorage.put(category, menuNames);
    }
}
