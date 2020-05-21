package database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Optional;

@Repository
public interface SaveLessonRepo extends CrudRepository<SaveLessonData, Long> {
    Iterable<SaveLessonData> findByGroupLessonData(Optional<GroupLessonData> groupLessonData);

    //Iterable<SaveLessonData> delete(Optional<SaveLessonData> saveLessonData1);
    //Iterable<GroupLessonData> findAllByDate(Date date);
//    Iterable<SaveLessonData> deleteAllById(SaveLessonData saveLessonData);
//    Iterable<SaveLessonData> findByClientData(Optional<SaveLessonData> clientData);
//
//    void delete(Optional<SaveLessonData> saveLessonData1);
}
