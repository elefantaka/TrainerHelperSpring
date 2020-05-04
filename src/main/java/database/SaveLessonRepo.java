package database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveLessonRepo extends CrudRepository<SaveLessonData, Long> {
}
