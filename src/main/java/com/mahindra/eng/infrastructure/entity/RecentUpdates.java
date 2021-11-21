package com.mahindra.eng.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Builder
@AllArgsConstructor
@Entity
@Data
@Table(name = "eng_recent_updates")
public class RecentUpdates implements Serializable {

    public RecentUpdates()
    {}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String RecordType;
    private String SubType;
    private long RecordId;
    @CreatedDate
    private Date Date;
    private String Details;
    private String Url;

}
