package com.sb.crudoperation.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.crudoperation.binding.PlanScreen;

public interface PlanScreenRepo extends JpaRepository<PlanScreen, Serializable> {

}
