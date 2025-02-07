package project.foodexpressv2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditableEntity {

    @Column(name = "is_active",nullable = false)
    protected Boolean isActive;

    @CreatedBy
    @Column(name = "created_by",length = 200,nullable = false)
    protected String createdBy;

    @CreatedDate
    @Column(name = "created_on",nullable = false)
    protected LocalDateTime createdOn;

    @LastModifiedBy
    @Column(name = "updated_by",length = 200)
    protected String updatedBy;

    @LastModifiedDate
    @Column(name = "updated_on")
    protected LocalDateTime updatedOn;


    @Override
    public String toString() {
        return "AuditableEntity{" +
                "isActive=" + isActive +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
