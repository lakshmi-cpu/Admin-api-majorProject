package com.sb.crudoperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sb.crudoperation.binding.CaseWorkerAccount;
import com.sb.crudoperation.repo.CaseWorkerRepo;

public class CaseWorkerServiceImpl implements CaseWorkerService{
	
	@Autowired
	private CaseWorkerRepo caseRepo;

	@Override
	public String saveCaseWorker(CaseWorkerAccount caseworker) {
		
		caseworker=caseRepo.save(caseworker);
		
		if(caseworker.getCaseworkerid()!=null)
		{
			return "caseworker data saved";
		}
		else {
		
		
		return "failed to save case woker data" ;
		}
	}

	@Override
	public List<CaseWorkerAccount> viewcaseworker() {
		
		List<CaseWorkerAccount> caseworkers=caseRepo.findAll();
		return caseworkers;
		
	
	}

	@Override
	public CaseWorkerAccount getCaseworkerId(Integer caseworkerid) {
		
		Optional<CaseWorkerAccount> findById=caseRepo.findById(caseworkerid);
		
		if(findById.isPresent())
		{
			return findById.get();
		}
		
		return null;
	}

	@Override
	public String editcaseworker(CaseWorkerAccount caseworker) {
		// TODO Auto-generated method stub
		
		if(caseRepo.existsById(caseworker.getCaseworkerid()))
				{
			
			CaseWorkerAccount save=caseRepo.save(caseworker);
			
			return "case worker updated";
			
				}else {
		
		return "no case worker found";}
	}

	@Override
	public String deleteCaseworkerId(Integer caseworkerid) {
		// TODO Auto-generated method stub
		
		if(caseRepo.existsById(caseworkerid))
		{
			caseRepo.deleteById(caseworkerid);
			return "record deleted";
		}else {
		return "record not found";
	}

}
}