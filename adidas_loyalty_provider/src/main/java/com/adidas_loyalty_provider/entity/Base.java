package com.adidas_loyalty_provider.entity;

import java.io.Serializable;
import java.util.Date;

public class Base implements Serializable {
    private Date createdAt;
    private Date modifiedAt;

    public Base() {
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
