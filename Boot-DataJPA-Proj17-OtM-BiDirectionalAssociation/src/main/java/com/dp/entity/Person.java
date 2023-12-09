package com.dp.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PERSON_INFO")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Person implements Serializable{
	@Id
	@SequenceGenerator(name = "PER_GEN", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "PER_GEN", strategy = GenerationType.SEQUENCE)
	private Integer pid;
	@NonNull
	@Column(name = "PER_NAME", length = 25)
	private String perName;
	@NonNull
	@Column(name = "PER_ADDRS", length = 20)
	private String perAddrs;
	
	@OneToMany(targetEntity = PhoneNumbers.class, cascade = CascadeType.ALL, mappedBy = "persons",fetch = FetchType.EAGER)
	private Set<PhoneNumbers> contactDetails;

	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", perName=" + perName + ", perAddrs=" + perAddrs + "]";
	}
	
	
	
	
	
}
