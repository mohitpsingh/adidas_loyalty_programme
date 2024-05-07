package adidas_loyalty_usa.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "executionScheduler")
public class ExecutionScheduler {
    @Id
    private String schedulerId;
    private Date schedulerStartTime;
    private Date schedulerEndTime;
    private String status;
    private Date createdAt;
    private Date modifiedAt;

    public ExecutionScheduler() {
    }

    public String getSchedulerId() {
        return schedulerId;
    }

    public void setSchedulerId(String schedulerId) {
        this.schedulerId = schedulerId;
    }

    public Date getSchedulerStartTime() {
        return schedulerStartTime;
    }

    public void setSchedulerStartTime(Date schedulerStartTime) {
        this.schedulerStartTime = schedulerStartTime;
    }

    public Date getSchedulerEndTime() {
        return schedulerEndTime;
    }

    public void setSchedulerEndTime(Date schedulerEndTime) {
        this.schedulerEndTime = schedulerEndTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
