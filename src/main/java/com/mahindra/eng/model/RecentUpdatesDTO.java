package com.mahindra.eng.model;


import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class RecentUpdatesDTO {

    private long id;
    private String RecordType;
    private String SubType;
    private long RecordId;
    private java.util.Date Date;
    private String Details;
    private String Url;
}
