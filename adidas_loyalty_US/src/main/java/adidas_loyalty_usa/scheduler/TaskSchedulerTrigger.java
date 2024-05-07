package adidas_loyalty_usa.scheduler;

import adidas_loyalty_usa.service.SchedulerTriggerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("taskSchedulerTrigger")
public class TaskSchedulerTrigger {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskSchedulerTrigger.class);
    @Autowired
    private SchedulerTriggerService triggerService;

    @Scheduled(cron = "* 50 * * * *")
    public void customerScheduler() {
        LOGGER.info("**********Scheduler is Started**********");
        try {
            triggerService.schedulerTrigger();
        } catch (Exception e) {
            LOGGER.error("Scheduler Failed");
        }
    }
}
