package database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface GroupLessonRepo extends CrudRepository<GroupLessonData, Long> {
    Iterable<GroupLessonData> findAllByDate(Date date);
}
