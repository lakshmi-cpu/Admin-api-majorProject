package com.sb.crudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.sb.crudoperation.binding.CaseWorkerAccount;
import com.sb.crudoperation.binding.PlanScreen;
import com.sb.crudoperation.service.CaseWorkerService;
import com.sb.crudoperation.service.PlanScreenService;

@RestController
public class AdminApiController {
	
	@Autowired
	private CaseWorkerService caseworkerservice;
	
	
	@Autowired
	private PlanScreenService plan;
	

	@PostMapping("/caseworker")
	public String createCaseworker(@RequestBody CaseWorkerAccount caseworker)
	{
	    String status=caseworkerservice.saveCaseWorker(caseworker);
		return status;
		
	}
	
	public String createPlan(@RequestBody PlanScreen planname)
	{
	    String planstatus=plan.saveplanscreen(planname);
		return planstatus;
		
	}
	
	@GetMapping("/getallcaseworkers")
	public List<CaseWorkerAccount> getAllcaseworkers()
	{
		List getcaseworkers=caseworkerservice.viewcaseworker();
				
		return getcaseworkers;
	}
	
	@GetMapping("/getallplans")
	public List<PlanScreen> getAllplans()
	{
		List viewplans=plan.viewplanscreen();
				
		return viewplans;
	}
	
	@GetMapping("/caseworker/{editcaseworker}")
	public CaseWorkerAccount editcaseworker(@PathVariable Integer caseworkerid)
	{
		
		return caseworkerservice.getCaseworkerId(caseworkerid);
		
		
	}
	
	@GetMapping("/plan/{editplan}")
	public PlanScreen editContact(@PathVariable Integer sno)
	{
		return plan.getplanId(sno);
		
	}
	
	
	@PutMapping("/caseworker/{updatecaseworker}")
	public String updatecaseworker(@RequestBody CaseWorkerAccount caseworker)
	{
		
		return caseworkerservice.editcaseworker(caseworker);
		
	}
	
	@PutMapping("/plan/{updateplan}")
	public String updateContact(@RequestBody PlanScreen planupdate)
	{
		return plan.editplanscreen(planupdate);
	}
	
	
	@DeleteMapping("/caseworker/{caseworkerid}")
	public String deletecaseworker(@PathVariable Integer caseworkerid)
	{
		return caseworkerservice.deleteCaseworkerId(caseworkerid);
		
	}
	
	
	@DeleteMapping("/plan/{planid}")
	public String deleteplan(@PathVariable Integer planid)
	{
		return plan.deleteplanid(planid);
	
	}
	

}
