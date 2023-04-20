package com.sb.crudoperation.service;

import java.util.List;


import com.sb.crudoperation.binding.PlanScreen;

public interface PlanScreenService {
	
	public String saveplanscreen(PlanScreen plan);
	public List<PlanScreen> viewplanscreen();
	public PlanScreen getplanId(Integer planid);
	public String editplanscreen(PlanScreen plan);
	public String deleteplanid(Integer planid);

}
