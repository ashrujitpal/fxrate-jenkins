package com.fab.rate.fxratedb.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigInteger;
import java.sql.Timestamp;


@Entity
@Table(name= "fxrate")
public class FXRates {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	private BigInteger timestamp;
	private String baseCurrency;
	private String rate;
	private String buyRate;
	private String sellRate;
	private String spread;
	
	public FXRates() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getBuyRate() {
		return buyRate;
	}

	public void setBuyRate(String buyRate) {
		this.buyRate = buyRate;
	}

	public String getSellRate() {
		return sellRate;
	}

	public void setSellRate(String sellRate) {
		this.sellRate = sellRate;
	}

	public String getSpread() {
		return spread;
	}

	public void setSpread(String spread) {
		this.spread = spread;
	}

	public BigInteger getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(BigInteger timestamp) {
		this.timestamp = timestamp;
	}

	
}
