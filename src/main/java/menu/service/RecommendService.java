package menu.service;

import menu.domain.Category;

public class RecommendService {
    private final MenuService menuService = new MenuService();
    private final CategoryService categoryService = new CategoryService();

    public void recommend() {
        Category findCategory = categoryService.getRecommendCategory();
        while (!categoryService.isSaveCategoryInfo(findCategory)) {
            findCategory = categoryService.getRecommendCategory();
        }
        String recommendMenu = menuService.getRecommendMenu(findCategory);
    }
}
