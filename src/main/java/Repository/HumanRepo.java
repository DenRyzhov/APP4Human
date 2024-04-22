package Repository;

import Entity.Human;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepo extends JpaRepository<Human, Integer> {
}

