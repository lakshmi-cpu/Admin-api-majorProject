package com.sb.crudoperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sb.crudoperation.binding.PlanScreen;
import com.sb.crudoperation.repo.PlanScreenRepo;

public class PlanScreenServiceImpl implements PlanScreenService{
	
	
	@Autowired
	private PlanScreenRepo planRepo;

	@Override
	public String saveplanscreen(PlanScreen plan) {
		
		plan =planRepo.save(plan);
		
		if(plan.getSno()!=null)
		{
			return "plan saved";
		}else
		{
		
		return "plan not saved";}
	}

	@Override
	public List<PlanScreen> viewplanscreen() {
		// TODO Auto-generated method stub
		
		return planRepo.findAll();
	}

	@Override
	public PlanScreen getplanId(Integer planid) {
		// TODO Auto-generated method stub
		
		Optional<PlanScreen> findById=planRepo.findById(planid);
		
		if(findById.isPresent())
		{
			return findById.get();
			
		}else
		{
			return null;
		}
		
		
		
	}

	@Override
	public String editplanscreen(PlanScreen plan) {
		// TODO Auto-generated method stub
		
		if(planRepo.existsById(plan.getSno()))
		{
			PlanScreen plan1=planRepo.save(plan);
			return "plansaved";
		}
		
		return null;
	}

	@Override
	public String deleteplanid(Integer planid) {
		// TODO Auto-generated method stub
		if(planRepo.existsById(planid))
		{
			planRepo.deleteById(planid);
			return "record deleted";
		}
		else
		{
			return "no record deleted";
		}
		
	}

}
