package com.beyondcoding.springproperties.configurationproperties;

import com.beyondcoding.springproperties.configurationproperties.model.Sauna;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("facilities")
public class FacilitiesService {

    // Needs setter to inject value
    private Sauna sauna;

    public Sauna getSauna() {
        return sauna;
    }

    public void setSauna(Sauna sauna) {
        this.sauna = sauna;
    }
}
