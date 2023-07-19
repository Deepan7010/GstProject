package com.tech.gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.gst.entity.GstEntity;
import com.tech.gst.service.GstService;

@RestController
public class GstController {
	@Autowired
	GstService gsts;
	
	@PostMapping(value="/setgst")
	public String setgst(@RequestBody GstEntity a) {
		return gsts.setgst(a);
	}
	@PostMapping(value="/setallgst")
	public String setalllist(@RequestBody List<GstEntity>a) {
		return gsts.setalllist(a);
	}
	
	@GetMapping(value="/getgst/{a}")
	public GstEntity getgst(@PathVariable int a) {
		return gsts.getgst(a);
	}
	@GetMapping(value="/getlistgst")
	public List<GstEntity> getallgst() {
		return gsts.getallgst();
	}
	
	@GetMapping(value="/get/{a}")
	public int getTaxByHsn(@PathVariable int a) {
		return gsts.getTaxByHsn(a);
		}
	}


