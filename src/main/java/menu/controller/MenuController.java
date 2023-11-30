package menu.controller;

import java.util.List;
import menu.domain.Category;
import menu.service.MenuService;
import menu.util.ResourcesReader;

public class MenuController {
    private final MenuService menuService = new MenuService();
    private final ResourcesReader resourcesReader = new ResourcesReader();
    public void run(){
        for (Category category : Category.values()) {
            List<String> menuNames = Category.getCategoryWithMenus(category, resourcesReader);
            menuService.saveMenuInfo(category, menuNames);
        }
    }
}
