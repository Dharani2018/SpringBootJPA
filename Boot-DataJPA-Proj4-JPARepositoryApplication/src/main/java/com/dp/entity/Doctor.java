package com.dp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Doctor_jpa")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
	
	@Column(name="DOC_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer docId;
	@Column(name = "DOC_NAME")
	private String docName;
	@Column(name = "DOC_SPECIALIZATION")
	private String specialization;
	@Column(name="DOC_SALARY")
	private Double salary;
	
	

}
