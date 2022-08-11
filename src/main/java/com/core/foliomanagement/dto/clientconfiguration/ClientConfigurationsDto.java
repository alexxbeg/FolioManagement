package com.core.foliomanagement.dto.clientconfiguration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@Builder(toBuilder = true)
@NoArgsConstructor
@Data
public class ClientConfigurationsDto implements Serializable {

    private Long configurationId;
    private String IdCountry;
    private String taxId;
    private String idClient;
    private Date dateRegistration;
    private Date dateModification;
    private String userLogin;
    private String status;
}
