package com.agustinvon.JibberJabber.security;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Validated
@Component
@ConfigurationProperties(prefix = "jwt.auth.converter")
public class JwtAuthConverterProperties {
    private String resourceId;
    private String principalAttribute;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getPrincipalAttribute() {
        return principalAttribute;
    }

    public void setPrincipalAttribute(String principalAttribute) {
        this.principalAttribute = principalAttribute;
    }
}
