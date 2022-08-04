package com.core.foliomanagement.impl.coreconfiguration;

import com.core.foliomanagement.dto.coreconfiguration.ConfigurationDto;
import com.core.foliomanagement.dto.util.ResponseDto;
import com.core.foliomanagement.entity.coreconfiguration.ConfigurationData;
import com.core.foliomanagement.repository.coreconfiguration.CoreConfigurationRepository;
import com.core.foliomanagement.service.coreconfiguration.ICoreConfigurationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Optional;

@Service
public class CoreConfigurationService implements ICoreConfigurationService {

    private final CoreConfigurationRepository configurationRepository;

    public CoreConfigurationService(CoreConfigurationRepository configurationRepository) {
        this.configurationRepository = configurationRepository;
    }


    @Override
    public ResponseEntity<ResponseDto> validateConfig(ConfigurationDto configurationDto) {
        try {
            /**
             * code here
             *
             *
             */

            //if (!validatorConfiguration(configurationDto)) {
                saveConfiguration(configurationDto);
                return new ResponseEntity<ResponseDto>(new ResponseDto(HttpStatus.OK.toString()), HttpStatus.OK);
            //} else return new ResponseEntity<ResponseDto>(new ResponseDto(HttpStatus.FORBIDDEN.toString() + " La configuración ya existe") , HttpStatus.FORBIDDEN);

        } catch (Exception e) {
            System.out.println("Se genero un error: "+  e.getMessage());
            return new ResponseEntity<ResponseDto>(new ResponseDto(HttpStatus.NOT_FOUND.toString() + " Error: " +  e.getMessage()), HttpStatus.NOT_FOUND);
        }
    }

    private void saveConfiguration (ConfigurationDto configurationDto) {
        Calendar dateNow = Calendar.getInstance();
        ConfigurationData configuration = new ConfigurationData();
        configuration.setConfigurationId(configurationDto.getConfigurationId());
        configuration.setName(configurationDto.getName());
        configuration.setStatusConfig(configurationDto.getStatusConfig());
        configuration.setDateRegistration(dateNow.getTime());
        configurationRepository.save(configuration);
    }

    private boolean validatorConfiguration (ConfigurationDto configurationDto) {
        Optional<ConfigurationData> configurationValidator = configurationRepository.findByConfigurationId(configurationDto.getConfigurationId());
        if (configurationValidator != null) {
            return true;
        }
        return false;
    }

}
