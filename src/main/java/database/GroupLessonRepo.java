package database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface GroupLessonRepo extends CrudRepository<GroupLessonData, Long> {
}
