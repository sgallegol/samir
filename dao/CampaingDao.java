package com.Samir.bvc.prueba.app.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Samir.bvc.prueba.app.entity.Campaing;

@Repository
public interface CampaingDao extends JpaRepository<Campaing,Long> {
	

}
