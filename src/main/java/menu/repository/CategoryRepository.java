package menu.repository;

import java.util.HashMap;
import java.util.Map;
import menu.domain.Category;

public class CategoryRepository {
    private static final int MAX_COUNT = 3;
    private final Map<Category, Integer> categoryStorage = new HashMap<>();

    public boolean isSaveCategory(Category category) {
        int selectCount = categoryStorage.getOrDefault(category, 0);
        int newCount = selectCount + 1;
        if (newCount >= MAX_COUNT) {
            return false;
        }
        categoryStorage.put(category, newCount);
        return true;
    }
}
