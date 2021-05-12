package com.fab.rate.fxrateservice.model;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class FxRateResponse {

	private String result;
	private String base_code;
	private Map<String,String> conversion_rates;
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getBase_code() {
		return base_code;
	}
	public void setBase_code(String base_code) {
		this.base_code = base_code;
	}
	public Map<String, String> getConversion_rates() {
		return conversion_rates;
	}
	public void setConversion_rates(Map<String, String> conversion_rates) {
		this.conversion_rates = conversion_rates;
	}
	
}
