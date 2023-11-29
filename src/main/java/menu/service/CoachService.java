package menu.service;

import java.util.List;
import menu.domain.Coach;
import menu.repository.CoachRepository;

public class CoachService {
    private final CoachRepository coachRepository = new CoachRepository();

    public void getCoachInfo(String coachName, List<String> notEatFoods) {
        Coach coach = new Coach(coachName, notEatFoods);
        coachRepository.saveCoach(coach);
    }
}
