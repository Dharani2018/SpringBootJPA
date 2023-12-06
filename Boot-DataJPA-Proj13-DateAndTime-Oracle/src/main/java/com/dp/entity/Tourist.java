package com.dp.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Tourist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tno;
	@Nonnull
	@Column(length = 30)
	private String name;
	@Nonnull
	@Column(length = 30)
	private String destination;
	@Column
	@Nonnull
	private LocalDateTime dob;
	@Column
	@Nonnull
	private LocalDate travelDate;
	@Column
	@Nonnull
	private LocalTime travelTime;
	
	

}
