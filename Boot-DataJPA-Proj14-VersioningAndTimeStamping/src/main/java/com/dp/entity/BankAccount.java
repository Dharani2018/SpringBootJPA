package com.dp.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "BANK_ACCOUNT_INFO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class BankAccount {
	@NonNull
	@Column(name = "ACCT_HOLDER_NAME", length = 25)
	private String acctHolderName;
	
	@Id
	@Column(name = "ACCT_NAME", length = 12)
	@SequenceGenerator(name = "gen1", initialValue = 1000000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Long acctNum;
	
	@NonNull
	@Column(name = "ACCT_BALANCE", length = 15)
	private Long balance;
	
	@Version
	@Column(name="NO_OF_CHANGES")
	private Integer changesDone;
	
	@CreationTimestamp
	@Column(name="CREATED_ON")
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	@Column(name = "LAST_UPDATE")
	private LocalDateTime updatedDate;

}
