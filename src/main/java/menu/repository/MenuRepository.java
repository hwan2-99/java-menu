package menu.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import menu.domain.Menu;

public class MenuRepository {
    private final AtomicLong sequence = new AtomicLong(0L);

    private final Map<Long, Menu> menuStorage = new HashMap<>();


    public void save(Menu menu) {
        menuStorage.put(sequence.addAndGet(1), menu);
    }
}
