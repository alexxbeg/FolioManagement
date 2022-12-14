package com.core.foliomanagement.dto.coreconfiguration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@Builder(toBuilder = true)
@NoArgsConstructor
@Data
public class ConfigurationDto implements Serializable {
    private Long configurationId;
	private String nameConfiguration;
    private String statusConfig;
    private Long configurationTypeId;

}
