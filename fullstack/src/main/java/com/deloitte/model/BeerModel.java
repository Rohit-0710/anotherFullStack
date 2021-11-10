package com.deloitte.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerModel {

	@Id
	private String id;
	private Integer verison;
	private Date createdDate;
	private Date updatedDate;
	private String beerName;

	// @JsonDeserialize(using = BeerModelStyle.class)
	//@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private String beerStyle;
	private Long upc;
	private BigDecimal price;
	private Integer quantityOnHand;

	public void setBeerStyle(String beerStyle) {
		this.beerStyle = BeerStyleEnum.BearStyleContains(beerStyle);
	}

}
