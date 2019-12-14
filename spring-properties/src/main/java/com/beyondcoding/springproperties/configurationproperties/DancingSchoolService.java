package com.beyondcoding.springproperties.configurationproperties;

import com.beyondcoding.springproperties.configurationproperties.model.Ballerina;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("dancing-school")
public class DancingSchoolService {

    // Needs setter to inject value
    private List<Ballerina> ballerinas;

    public List<Ballerina> getBallerinas() {
        return ballerinas;
    }

    public void setBallerinas(List<Ballerina> ballerinas) {
        this.ballerinas = ballerinas;
    }
}
