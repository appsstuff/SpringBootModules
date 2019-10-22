package appsstuff.presisence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerosonDao extends JpaRepository<Person,Integer>{
}
