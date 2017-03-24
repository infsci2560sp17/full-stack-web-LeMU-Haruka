package edu.infsci2560.repositories;
import edu.infsci2560.models.enemy;
import org.springframework.data.repository.PagingAndSortingRepository;



public interface enemyRepository extends PagingAndSortingRepository<enemy, Long> {}