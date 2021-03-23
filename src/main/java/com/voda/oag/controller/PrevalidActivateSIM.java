package com.voda.oag.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/prevalid")
public class PrevalidActivateSIM {
	
//	/prevalid/prevalidSIM
	@RequestMapping(value="/prevalidSim", method=RequestMethod.GET)
	@ResponseBody
	public void prevalidate4SIM(@RequestParam(value="sim_id") String sim_id)  {
		
		//DAO -->sim data will be extracted
		//status check
		//msisd --10
		//prevalidation is success
		
	}

}
