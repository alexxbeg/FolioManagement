package com.core.foliomanagement.entity.coreconfiguration;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Table(name = "Tbl_CoreConfigurations")
@Data
@Entity
@NoArgsConstructor
@Builder(toBuilder = true)
@AllArgsConstructor
public class ConfigurationData {

    @Id
    @Column(name = "CONFIGURATION_ID")
    private Long configurationId;

    @Column(name = "NAME_CONFIGURATION", nullable = false, length = 60)
    private String name;

    @Column(name = "STATUS_CONFIG", nullable = false, length = 3)
    private String statusConfig;

    @Column(name = "DATE_REGISTRATION", nullable = false)
    private Date dateRegistration;

}
