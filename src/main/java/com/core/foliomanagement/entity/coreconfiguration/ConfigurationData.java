package com.core.foliomanagement.entity.coreconfiguration;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Table(name = "tbl_configuration")
@Data
@Entity
@NoArgsConstructor
@Builder(toBuilder = true)
@AllArgsConstructor
public class ConfigurationData {

    @Id
    @Column(name = "CONFIGURATION_ID")
    private Long configurationId;

    @Column(name = "NAME", nullable = false, length = 100)
    private String nameConfiguration;

    @Column(name = "STATUS", nullable = false, length = 3)
    private String statusConfig;

    @Column(name = "CONFIGURATION_TYPE_ID", nullable = false)
    private Long configurationTypeId;

}
