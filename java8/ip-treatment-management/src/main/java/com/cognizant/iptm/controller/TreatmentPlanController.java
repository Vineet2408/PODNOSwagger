package com.cognizant.iptm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.iptm.exception.PatientNotFoundException;
import com.cognizant.iptm.exception.TreatmentPlanNotFoundException;
import com.cognizant.iptm.model.PatientDetail;
import com.cognizant.iptm.model.TreatmentPlan;
import com.cognizant.iptm.service.TreatmentPlanService;

@RestController
public class TreatmentPlanController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TreatmentPlanController.class);

	@Autowired
	TreatmentPlanService treatmentPlanService;
	
	@PostMapping("/formTimeTable")
	public TreatmentPlan getTreatmentPlan(@RequestBody PatientDetail patientDetail) {
		System.out.println(patientDetail.toString());
		return treatmentPlanService.getTreatmentPlan(patientDetail);
	}
	
	@RequestMapping("/patients")
	public List<PatientDetail> getAllPatients(){
		return treatmentPlanService.getAllPatient();
	}
	
	@GetMapping("/patient/{id}")
	public PatientDetail getPatient(@PathVariable long id) throws PatientNotFoundException{
		LOGGER.info("start");
		return treatmentPlanService.getPatient(id);
	}
	
	@GetMapping("/treatmentplans")
	public List<TreatmentPlan> getAllTreatmentPlans(){
		return treatmentPlanService.getAllTreatmentPlans();
	}
	
	@GetMapping("/treatmentplan/{id}")
	public TreatmentPlan getTreatmentPlan(@PathVariable long id) throws TreatmentPlanNotFoundException {
		return treatmentPlanService.getTreatmentPlan(id);
	}
	
	
}
