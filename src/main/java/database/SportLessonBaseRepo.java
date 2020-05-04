package database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface SportLessonBaseRepo<T extends SportLessonData> extends CrudRepository<T, Long> {
}

@Transactional
interface SportLessonRepo extends SportLessonBaseRepo<SportLessonData>{
}

@Transactional
interface GroupLessonRepo extends SportLessonBaseRepo<GroupLessonData>{

}

@Transactional
interface IndividualLessonRepo extends SportLessonBaseRepo<IndividaulLessonData>{

}

