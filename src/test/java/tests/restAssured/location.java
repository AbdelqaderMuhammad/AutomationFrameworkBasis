package tests.restAssured;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"postCode", "country", "countryAbbreviation"})
public class location {

    private String postCode;
    private String country;
    private String countryAbbreviation;


    public location() {

        this.postCode = "1050";
        this.country = "Lativa";
        this.countryAbbreviation = "LV";
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryAbbreviation() {
        return countryAbbreviation;
    }

    public void setCountryAbbreviation(String countryAbbreviation) {
        this.countryAbbreviation = countryAbbreviation;
    }
}

