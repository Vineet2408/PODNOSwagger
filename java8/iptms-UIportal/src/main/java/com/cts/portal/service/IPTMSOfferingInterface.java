package com.cts.portal.service;

import java.util.List;

import com.cts.portal.model.IPTreatmentPackages;
import com.cts.portal.model.SpecialistDetail;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IPTMSOfferingInterface
{

	@GET("/IPTreatmentPackages")
	public Call<List<IPTreatmentPackages>> getIPTPackagesList();
	
	@GET("/IPTreatmentPackageByName/{category}/{packageName}")
	public Call<IPTreatmentPackages> getIPTreatmentPackageByName(@Path("category") String category,@Path("packageName") String packageName);
	
	@GET("/SpecialistDetail")
	public Call<List<SpecialistDetail>> getAllSpecialist();
	
	@GET("/ippackage/{id}")
	public Call<IPTreatmentPackages> getIPTreatmentPackage(@Path("id") int id);

	
}
