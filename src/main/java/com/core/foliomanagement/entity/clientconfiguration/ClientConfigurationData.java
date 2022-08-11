package com.core.foliomanagement.entity.clientconfiguration;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Table(name = "tbl_client_configuration")
@Data
@Entity
@NoArgsConstructor
@Builder(toBuilder = true)
@AllArgsConstructor
public class ClientConfigurationData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CONFIGURATION_ID")
    private Long configurationId;

    @Column(name = "COUNTRY_ID", nullable = false, length = 10)
    private String IdCountry;

    @Column(name = "CLIENT_TAX_ID", nullable = false, length = 30)
    private String taxId;

    @Column(name = "CLIENT_ID", nullable = false, length = 30)
    private String idClient;

    @Column(name = "DATE_REGISTRATION")
    private Date dateRegistration;

    @Column(name = "DATE_MODIFICATION", nullable = false)
    private Date dateModification;

    @Column(name = "LOGIN", nullable = false, length = 30)
    private String userLogin;

    @Column(name = "STATUS", nullable = false, length = 3)
    private String status;

}