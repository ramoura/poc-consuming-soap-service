package org.poc.renatomoura.soapclientjava.controller;


import org.poc.renatomoura.soapclientjava.CountryClient;
import org.poc.renatomoura.wsdl.Country;
import org.poc.renatomoura.wsdl.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryAPI {

    @Autowired
    private CountryClient quoteClient;

    @GetMapping("/currency/{country}")
    public String getCurrency(@PathVariable String country) {
        GetCountryResponse response = quoteClient.getCountry(country);
        System.err.println(response.getCountry().getCurrency());
        return response.getCountry().getCurrency().value();
    }

    @GetMapping("/{country}")
    public Country getCountry(@PathVariable String country) {
        GetCountryResponse response = quoteClient.getCountry(country);
        return response.getCountry();
    }

}
