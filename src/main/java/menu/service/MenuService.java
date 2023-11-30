package menu.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import menu.domain.Category;
import menu.domain.Menu;
import menu.repository.MenuRepository;

public class MenuService {
    private final MenuRepository menuRepository = new MenuRepository();

    public void saveMenuInfo(Category category, List<String> menuNames) {
        menuRepository.save(category, menuNames);
    }
    public String getRecommendMenu(Category findCategory) {
        List<String> menus = menuRepository.findMenuByCategory(findCategory);
        return Randoms.shuffle(menus).get(0);
    }
}
