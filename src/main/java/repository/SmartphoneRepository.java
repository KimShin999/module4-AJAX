package repository;

import model.Smartphone;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface SmartphoneRepository  extends PagingAndSortingRepository<Smartphone, Integer> {
}
