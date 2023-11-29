package menu.service;

import java.util.List;
import menu.domain.Category;
import menu.domain.Menu;
import menu.repository.MenuRepository;

public class MenuService {
    private final MenuRepository menuRepository = new MenuRepository();

    public void saveMenuInfo(Category category, List<String> menuNames) {
        Menu menu = new Menu(category, menuNames);
        menuRepository.save(menu);
    }
}
