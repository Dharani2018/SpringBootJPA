package com.dp.runner;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dp.entity.JobSeeker;
import com.dp.service.IJobSeekerService;
@Component("runner")
public class JobSeekerRunner implements CommandLineRunner {
	@Autowired
	private IJobSeekerService service;

	@Override
	public void run(String... args) throws Exception {
		/*try {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name of the job seeker :");
		String name = sc.next();
		System.out.println("enter qualification :");
		String qualif = sc.next();
		System.out.println("enter path of the image:: ");
		String imagePath = sc.next();
		System.out.println("enter path of the resume:: ");
		String resumePath = sc.next();
		System.out.println("enter job seeker indian or not (true/false) :");
		Boolean indian = sc.hasNext();
		
		InputStream fis = new FileInputStream(imagePath);
		byte[] image = new byte[fis.available()];
		image=fis.readAllBytes();
		
		File file= new File(resumePath);
		FileReader reader =  new FileReader(file);
		char[] resume = new char[(int) file.length()];
		reader.read(resume);
		
		System.out.println(service.saveJobSeeker(new JobSeeker(name,qualif,image,resume,indian)));
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		try {
			JobSeeker jb=service.findByJobId(1);
			OutputStream os = new FileOutputStream("photo.gfif");
			os.write(jb.getImage());
			os.flush();
			
			Writer wr = new FileWriter("resume.txt");
			wr.write(jb.getResume());
			wr.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
