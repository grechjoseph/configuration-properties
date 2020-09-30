package com.jg.configurationproperties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "my-properties")
public class MyProperties {

    /**
     * The first property.
     */
    private String propertyOne;

    /**
     * The second property.
     */
    private String propertyTwo;

}
