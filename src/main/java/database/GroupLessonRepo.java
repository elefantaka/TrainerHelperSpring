package database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupLessonRepo extends CrudRepository<GroupLessonData, Long> {
}
