package com.dp.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dp.entity.Person;
import com.dp.entity.PhoneNumbers;
import com.dp.repository.IPersonRepository;
import com.dp.repository.IPhoneNumberRepository;
@Service("service")
public class OtoMServiceImpl implements IOtoMService {
	
	@Autowired
	private IPersonRepository personRepo;
	@Autowired
	private IPhoneNumberRepository pnRepo;

	@Override
	public String saveParent() {
		
		PhoneNumbers ph1 = new PhoneNumbers(9949175026l, "Jio", "Residance");
		PhoneNumbers ph2 = new PhoneNumbers(9059027394l, "Airtel", "Office");
		
		Person per = new Person("Lingaiah Parimella", "Nalgonda");
		
		ph1.setPersons(per);
		ph2.setPersons(per);
		
		per.setContactDetails(Set.of(ph1, ph2));
		personRepo.save(per);
		
		return "Person information has saved.";
	}
	@Override
	public String saveChild() {
		
		PhoneNumbers ph1 = new PhoneNumbers(7306785226l, "Jio", "Residance");
		PhoneNumbers ph2 = new PhoneNumbers(8501854149l, "Jio", "Office");
		
		Person per = new Person("Gnani Parimella", "Nalgonda");
		
		ph1.setPersons(per);
		ph2.setPersons(per);
		
		per.setContactDetails(Set.of(ph1, ph2));
		pnRepo.save(ph1);
		pnRepo.save(ph2);
		
		return "Person information has saved.";
	}
	@Override
	public void findAllPersonDetails() {
		personRepo.findAll().forEach(per ->{
			System.out.println(per);
			Set<PhoneNumbers> childs = per.getContactDetails();
			childs.forEach(ph->{
				System.out.println(ph.getMobileNo());
			});
		});;
	}
	
	@Override
	public void findAllChildDetails() {
		pnRepo.findAll().forEach(phnum->{
			System.out.println(phnum);
			Person per = phnum.getPersons();
			System.out.println(per);
		});
	}
	@Override
	public String deleteChildRecords(Integer id) {

		//load parent
		Optional<Person> opt = personRepo.findById(id);
		if(opt.isPresent()) {
			//Person per = opt.get();
			//get all childs
			Set<PhoneNumbers> childs = opt.get().getContactDetails();
			/*childs.forEach(child->{
				child.setPersons(null);
			});*/
			pnRepo.deleteAllInBatch(childs);
		}
				
		return "only childs are deleted.";
	}
	
	@Override
	public String addOnlyPhoneNumbers(Integer id) {
		Optional<Person> opt = personRepo.findById(id);
		if(opt.isPresent()) {
			PhoneNumbers pn = new PhoneNumbers(7207386972l, "Airtel", "Residance");
			Set<PhoneNumbers> set = opt.get().getContactDetails();
			pn.setPersons(opt.get());
			set.add(pn);
			personRepo.save(opt.get());
		}
		return "Child record has added";
	}
	
	@Override
	public String deleteParticularChild(Integer id, Long pno) {
		Optional<Person> opt = personRepo.findById(id);
		if(opt.isPresent()) {
			Set<PhoneNumbers> pnos = opt.get().getContactDetails();
			pnos.forEach(ph->{
				/*if(pno.equals(ph.getMobileNo())) {
					ph.setMobileNo(null);
				}*/
				pnRepo.delete(ph);
			});
		}
		return "phone number has deleted.";
	}

}
