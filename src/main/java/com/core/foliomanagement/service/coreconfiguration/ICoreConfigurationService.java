package com.core.foliomanagement.service.coreconfiguration;

import com.core.foliomanagement.dto.coreconfiguration.ConfigurationDto;
import com.core.foliomanagement.dto.util.ResponseDto;
import org.springframework.http.ResponseEntity;

public interface ICoreConfigurationService {

    public ResponseEntity<ResponseDto> validateConfig (ConfigurationDto configurationDto);
}
