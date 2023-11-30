package menu.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import menu.domain.Coach;

public class CoachRepository {
    private final AtomicLong sequence = new AtomicLong(0L);

    private final Map<Long, Coach> coachStorage = new HashMap<>();


    public void saveCoach(Coach coach) {
        coachStorage.put(sequence.addAndGet(1), coach);
    }

}
