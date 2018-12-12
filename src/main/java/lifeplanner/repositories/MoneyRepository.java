package lifeplanner.repositories;

import lifeplanner.domain.MoneyEvent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyRepository extends CrudRepository<MoneyEvent, Long> {
}
