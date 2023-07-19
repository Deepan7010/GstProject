package com.tech.gst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tech.gst.entity.GstEntity;

public interface GstRepository extends JpaRepository<GstEntity, Integer> {
@Query(value="select tax from gst_details where hsn=?",nativeQuery=true)
public int getTaxByHsn(int a);
}
