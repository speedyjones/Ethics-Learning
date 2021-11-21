package com.mahindra.eng.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class EthicsHelplineDTO {
    private long id;
    private String Url;
    private long TollFreeNumber;
    private String email;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private String status;
}
