package com.core.foliomanagement.repository.coreconfiguration;

import com.core.foliomanagement.entity.coreconfiguration.ConfigurationData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoreConfigurationRepository extends JpaRepository<ConfigurationData, Long> {

    Optional<ConfigurationData> findByConfigurationId(Long aLong);
}
