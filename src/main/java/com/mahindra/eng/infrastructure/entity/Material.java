package com.mahindra.eng.infrastructure.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="eng_material")
public class Material implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private String description;
        private String materialPath;
        private String mediaType;
        private String externalUrl;
        private String thumbnail;
        private String moduleType;
        private int companyId;
        private String createdBy;
        @CreatedDate
        private Date createdDate;
        private String updatedBy;
        @LastModifiedDate
        private Date updatedDate;
        private String status;

}
