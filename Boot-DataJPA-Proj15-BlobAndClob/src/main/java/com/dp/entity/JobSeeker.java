package com.dp.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="JOB_SEEKER")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class JobSeeker implements Serializable{
	@Id
	@Column(name = "JOB_ID", length = 10)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer jobid;
	@NonNull
	@Column(name = "JOB_SEEKER_NAME", length = 25)
	private String name;
	@NonNull
	@Column(name = "JOB_SEEKER_QUALIFICATION", length = 20)
	private String qualifiation;
	@NonNull
	@Column(name ="JOB_SEEKER_IMAGE")
	@Lob
	private byte[] image;
	@Column(name="JOB_SEEKER_RESUME")
	@Lob
	@NonNull
	private char[] resume;
	@Column(name="IS_INDIAN")
	@NonNull
	private Boolean indian;
	

}
