package adidas_loyalty_usa.service;

import adidas_loyalty_usa.entity.ExecutionScheduler;
import adidas_loyalty_usa.repository.SchedulerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("schedulerDataService")
public class SchedulerDataService {
    @Autowired
    private SchedulerRepository schedulerRepository;

    public String saveExecutionScheduler(ExecutionScheduler executionScheduler) {
        ExecutionScheduler newExecutionScheduler = schedulerRepository.save(executionScheduler);
        return newExecutionScheduler.getSchedulerId();
    }

    public String updateExecutionScheduler(ExecutionScheduler executionScheduler) {
        ExecutionScheduler updatedScheduler = schedulerRepository.save(executionScheduler);
        return updatedScheduler.getSchedulerId();
    }

    public ExecutionScheduler getSchedulerById(String schedulerId) {
        Optional<ExecutionScheduler> scheduler = schedulerRepository.findById(schedulerId);
        return scheduler.orElseGet(scheduler::get);
    }
}
