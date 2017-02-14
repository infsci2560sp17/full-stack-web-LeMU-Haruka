package edu.infsci2560.repositories;
import edu.infsci2560.models.Kancolle;
import org.springframework.data.repository.PagingAndSortingRepository;



public interface KancolleRepository extends PagingAndSortingRepository<Kancolle, Long> {}