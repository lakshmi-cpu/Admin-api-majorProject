package com.sb.crudoperation.service;

import java.util.List;


import com.sb.crudoperation.binding.CaseWorkerAccount;

public interface CaseWorkerService {
	
	
	public String saveCaseWorker(CaseWorkerAccount caseworker);
	public List<CaseWorkerAccount> viewcaseworker();
	public CaseWorkerAccount getCaseworkerId(Integer caseworkerid);
	public String editcaseworker(CaseWorkerAccount caseworker);
	public String deleteCaseworkerId(Integer caseworkerid);

}
