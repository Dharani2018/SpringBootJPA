package com.dp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dp.entity.JobSeeker;
import com.dp.repository.IJobSeekerRepository;
@Service("jsService")
public class JobSeekerServiceImpl implements IJobSeekerService {
	@Autowired
	private IJobSeekerRepository repo;

	@Override
	public String saveJobSeeker(JobSeeker js) {
		JobSeeker jb = repo.save(js);
		return jb.getJobid()+" record has saved.";
	}

	@Override
	public JobSeeker findByJobId(Integer id) throws Exception{
		JobSeeker jb=repo.findById(id).orElseThrow(()-> new IllegalArgumentException("job seeker with given id is not found"));
		return jb;
	}

}
