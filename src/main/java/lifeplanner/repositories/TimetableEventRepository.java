package lifeplanner.repositories;

import lifeplanner.domain.TimetableEvent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimetableEventRepository extends CrudRepository<TimetableEvent, Long> {
}
