package com.dp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dp.entity.JobSeeker;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {

}
