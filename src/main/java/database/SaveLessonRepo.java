package database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SaveLessonRepo extends CrudRepository<SaveLessonData, Long> {
    Iterable<SaveLessonData> findByGroupLessonData(Optional<GroupLessonData> groupLessonData);
}
