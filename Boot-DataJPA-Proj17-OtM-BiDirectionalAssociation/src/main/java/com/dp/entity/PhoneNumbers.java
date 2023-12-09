package com.dp.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PHONE_NUMBERS")
@RequiredArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class PhoneNumbers implements Serializable{
	
	@Id
	@SequenceGenerator(name = "P_N_GEN", initialValue = 10000, allocationSize = 1)
	@GeneratedValue(generator = "P_N_GEN", strategy = GenerationType.SEQUENCE)
	private Integer regNo;
	@NonNull
	@Column(name = "PHONE_NUM", length = 11)
	private Long mobileNo;
	@NonNull
	@Column(name = "PROVIDER", length = 10)
	private String provider;
	@NonNull
	@Column(name = "NUMBER_TYPE", length = 15)
	private String numType;
	
	@ManyToOne(targetEntity = Person.class,cascade = CascadeType.ALL)
	private Person persons;

	
	@Override
	public String toString() {
		return "PhoneNumbers [regNo=" + regNo + ", mobileNo=" + mobileNo + ", provider=" + provider + ", numType="
				+ numType + "]";
	}
	
	
	
	
	
	

}
