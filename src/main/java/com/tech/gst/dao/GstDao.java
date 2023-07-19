package com.tech.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.tech.gst.entity.GstEntity;
import com.tech.gst.repository.GstRepository;

@Repository
public class GstDao {
	@Autowired
	GstRepository gstr;
	
	public String setgst(GstEntity a) {
		 gstr.save(a);
		 return "suceesfully saved";
	}
	public String setalllist(List<GstEntity>a) {
		gstr.saveAll(a);
		return "successfully saved list";
	}
	public GstEntity getgst(int a) {
		return gstr.findById(a).get();
	}
	public List<GstEntity> getallgst() {
		return gstr.findAll();
	}
	public int getTaxByHsn(int a) {
		return gstr.getTaxByHsn(a);
		}

}
