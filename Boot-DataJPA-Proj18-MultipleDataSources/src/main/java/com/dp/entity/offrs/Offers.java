package com.dp.entity.offrs;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="AZ_OFFERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Offers {
	
	@Id
	@SequenceGenerator(name="gen1", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer pid;
	@NonNull
	@Column(name = "PROD_NAME", length = 20)
	private String prodName;
	@NonNull
	@Column(name = "OFF_PERCENTAGE")
	private Integer offPercentage;
	@NonNull
	@Column(name="PROD_PRICE")
	private Float prodPrice;
	

}
