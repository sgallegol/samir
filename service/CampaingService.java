package com.Samir.bvc.prueba.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.Samir.bvc.prueba.app.entity.Campaing;

public interface CampaingService {
	
	public Iterable<Campaing> findAll();
	
	public Page<Campaing> findAll(Pageable pageable);
	
	public Optional<Campaing> findById(Long id);
	
	public Campaing save(Campaing campaing);
	
	public void deleteById(Long id);

}
