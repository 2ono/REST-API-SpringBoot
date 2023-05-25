package com.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.CloudVendor;
import com.app.repository.CloudVendorRepositry;
import com.app.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

	CloudVendorRepositry cloudVendorRepositry;

	public CloudVendorServiceImpl(CloudVendorRepositry cloudVendorRepositry) {
		this.cloudVendorRepositry = cloudVendorRepositry;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		// TODO Auto-generated method stub
		// More Business Logic
		cloudVendorRepositry.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		// TODO Auto-generated method stub
		// More Business Logic
		cloudVendorRepositry.save(cloudVendor);
		return "Success";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		// TODO Auto-generated method stub
		// More Business Logic 
		cloudVendorRepositry.deleteById(cloudVendorId);
		return "Success";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		// TODO Auto-generated method stub
		// More Business Logic
		return cloudVendorRepositry.findById(cloudVendorId).get();

	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		// TODO Auto-generated method stub
		// More Business Logic 
		return cloudVendorRepositry.findAll();
	}

}
