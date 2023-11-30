package menu.controller;


import java.util.List;
import menu.service.InputService;

public class RecommendController {
    private final MenuController menuController = new MenuController();
    public RecommendController() {
        menuController.run();
    }

    private final InputService inputService = new InputService();

    public void run() {
        inputService.getCoaches();
        inputService.getNotEatFoods();

    }
}
