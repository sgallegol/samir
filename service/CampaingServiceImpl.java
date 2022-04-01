package com.Samir.bvc.prueba.app.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Samir.bvc.prueba.app.dao.CampaingDao;
import com.Samir.bvc.prueba.app.entity.Campaing;


@Service
public class CampaingServiceImpl implements CampaingService {
	@Autowired
	private CampaingDao campaingDao;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Campaing> findAll() {
		return campaingDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Campaing> findAll(Pageable pageable) {
		return campaingDao.findAll(pageable);
	}

	@Override
	@Transactional
	public Optional<Campaing> findById(Long id) {
		return campaingDao.findById(id);
	}

	@Override
	@Transactional
	public Campaing save(Campaing campaing) {
		return campaingDao.save(campaing);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		campaingDao.deleteById(id);
	}

	

	
	

}
