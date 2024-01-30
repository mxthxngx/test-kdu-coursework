package com.example.jdbc.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.security.Timestamp;
import java.sql.Time;
import java.util.Date;
import java.util.UUID;
@Data
@RequiredArgsConstructor
public class Shift {
    private UUID id;
    private UUID shiftTypeId;
    private String name;
    private Date dateStart;
    private Date dateEnd;
    private Time timeStart;
    private Time timeEnd;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String timeZone;
    private UUID tenantId;
}