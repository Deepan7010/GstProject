package com.tech.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tech.gst.dao.GstDao;
import com.tech.gst.entity.GstEntity;

@Service
public class GstService {
	@Autowired
	GstDao gastd;
	
	public String setgst(GstEntity a) {
		return gastd.setgst(a);
	}
	public String setalllist(List<GstEntity>a) {
		return gastd.setalllist(a);
	}
	public GstEntity getgst(int a) {
		return gastd.getgst(a);
	}
	public List<GstEntity> getallgst() {
		return gastd.getallgst();
	}
	public int getTaxByHsn(@PathVariable int a) {
		return gastd.getTaxByHsn(a);
		}

}
