package ru.itmo.mpi.hospital.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@JmixEntity
@Entity
@Setter
@Getter
public class Healer extends User {

    @Column(name = "work_start_date")
    private Date workStartDate;

    @Column(name = "social_status")
    private String socialStatus;

    @Column(name = "healer_power")
    private Integer healerPower;

    public SocialStatus getSocialStatus() {
        return socialStatus == null ? null : SocialStatus.fromId(socialStatus);
    }

    public void setSocialStatus(SocialStatus socialStatus) {
        this.socialStatus = socialStatus == null ? null : socialStatus.getId();
    }
}