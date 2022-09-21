package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MobilePlan;
import com.example.demo.repo.PlanRepository;

@Service
public class MobilePlanService {

	private PlanRepository repo;

	
	@Autowired
	public MobilePlanService(PlanRepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<MobilePlan> findAll(){
		
		return this.repo.findAll();
	}
	

	public MobilePlan add(MobilePlan entity){
		
		return this.repo.save(entity);
	}
	

	public MobilePlan findById(int id){
		
		String message= new StringBuilder("Element With Given id")
						.append(id).append("Not Found").toString();
		
		return this.repo.findById(id)
				.orElseThrow(  () -> new RuntimeException(message));
								
	}

	

	public MobilePlan update(MobilePlan entity) {
		// TODO Auto-generated method stub
		return this.repo.save(entity);
	}

	public void remove(int id) {
		// TODO Auto-generated method stub
		this.repo.deleteById(id);
		
	}
	
	
}
