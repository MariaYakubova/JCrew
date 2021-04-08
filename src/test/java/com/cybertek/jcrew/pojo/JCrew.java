package com.cybertek.jcrew.pojo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)

public class JCrew {
    private String productName;
    private String productCode;
    private String brand;

}
