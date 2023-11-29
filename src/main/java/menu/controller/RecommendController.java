package menu.controller;


import java.util.List;
import menu.service.InputService;

public class RecommendController {
    private final InputService inputService = new InputService();

    public void run() {
        inputService.getCoaches();
        List<String> food = inputService.getNotEatFoods();
        for(String name : food){
            System.out.println(name);
        }
    }
}
