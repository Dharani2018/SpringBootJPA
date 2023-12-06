package com.dp.service;

import com.dp.entity.JobSeeker;

public interface IJobSeekerService {
	
	public String saveJobSeeker(JobSeeker js);
	public JobSeeker findByJobId(Integer id) throws Exception;

}
