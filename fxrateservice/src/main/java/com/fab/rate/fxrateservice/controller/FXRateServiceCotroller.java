package com.fab.rate.fxrateservice.controller;


import com.fab.rate.fxrateservice.model.BaseCurrency;
import com.fab.rate.fxrateservice.model.FXRate;
import com.fab.rate.fxrateservice.model.FxRateResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/fxrateservice")
public class FXRateServiceCotroller {

    @Autowired
    RestTemplate restTemplate;
    String exchangeURL = "https://v3.exchangerate-api.com/bulk/1dcab672cb2391d23048c27e";

    @GetMapping("/country/{country}")
    public FxRateResponse getFXRateByCountry(@PathVariable("country") String country){

        String url = "http://localhost:8301/fxratedb/country/{country}";
        
        System.out.println("url:::::::::::::    "+url);
        
        String currency;
        
        currency = restTemplate.getForObject(url, String.class, country);
        
        System.out.println("url:::::::::::::    "+currency);
        
        
        ResponseEntity<FxRateResponse> response = null ;
        
        
		try {
			response 
			= restTemplate.exchange(new URI(exchangeURL+"/"+currency.replaceAll("'", "")), 
					HttpMethod.GET, null, FxRateResponse.class);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    	
    	
        return response.getBody();
    	
        
        //return null;
    	
    }

    @GetMapping("/country/all")
    public FXRate getFXRateByCountry(){
    	
    	return new FXRate();

    }
}
