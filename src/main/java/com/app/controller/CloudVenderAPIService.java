package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVenderAPIService {

	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) {
		return new CloudVendor("C1", "Vendor 1",
				"Address One", "xxxx");
	}
	
	
}
