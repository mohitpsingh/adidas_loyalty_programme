package adidas_loyalty_usa.repository;

import adidas_loyalty_usa.common.generic.GenericRepository;
import adidas_loyalty_usa.entity.ExecutionScheduler;
import org.springframework.stereotype.Repository;

@Repository("schedulerRepository")
public interface SchedulerRepository extends GenericRepository<ExecutionScheduler, String> {
}
