package adidas_loyalty_usa.controller;

import adidas_loyalty_usa.service.SchedulerTriggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scheduler")
public class SchedulerController {
    @Autowired
    private SchedulerTriggerService triggerService;

    @PostMapping("/trigger")
    public String triggerSchedulerManually() {
        triggerService.schedulerTrigger();
        return "Trigger Initiated";
    }

}
