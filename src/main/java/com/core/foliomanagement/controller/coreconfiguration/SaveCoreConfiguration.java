package com.core.foliomanagement.controller.coreconfiguration;

import com.core.foliomanagement.dto.coreconfiguration.ConfigurationDto;
import com.core.foliomanagement.dto.util.ResponseDto;
import com.core.foliomanagement.service.coreconfiguration.ICoreConfigurationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;

@Produces("Application/Json")
@RequiredArgsConstructor
@RestController
public class SaveCoreConfiguration {

    @Autowired
    private ICoreConfigurationService configurationService;

    @PostMapping(path = "/save-configuration")
    public ResponseEntity<ResponseDto> validateConfiguration(@RequestBody ConfigurationDto configurationDto) {
        return configurationService.validateConfig(configurationDto);
    }
}
