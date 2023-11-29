package menu.controller;


import menu.service.InputService;

public class RecommendController {
    private final InputService inputService = new InputService();

    public void run() {
        inputService.getCoaches();
    }
}
