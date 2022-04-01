package com.Samir.bvc.prueba.app.controller;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Samir.bvc.prueba.app.entity.Campaing;
import com.Samir.bvc.prueba.app.service.CampaingService;

@RestController
@RequestMapping("/api/campaings")
public class CampaingController  {
	@Autowired
	private CampaingService campaingService;
	
	//crear una nueva campaña
	@PostMapping
	public ResponseEntity<?> create (@RequestBody Campaing campaing){
		return ResponseEntity.status(HttpStatus.CREATED).body(campaingService.save(campaing));
		
	}
	//leer una campaing
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Long campaingId){
		Optional<Campaing> oCampaing=campaingService.findById(campaingId);
		
		if(!oCampaing.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oCampaing);
	} 
	
	
	//metodo para leer todas las campañas
	@GetMapping
	public List<Campaing> readAll(){
		List<Campaing> campaing = StreamSupport
				.stream(campaingService.findAll().spliterator(),true)
				.collect(Collectors.toList());
				
		return campaing;
		
		
	}
	
	//actualizar una campaña
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Campaing campaingDetails,@PathVariable(value = "id") Long campaingId){
		Optional<Campaing> campaing = campaingService.findById(campaingId);
		
		if(!campaing.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		campaing.get().setName(campaingDetails.getName());
		campaing.get().setAmount(campaingDetails.getAmount());
		campaing.get().setAdminRate(campaingDetails.getAdminRate());
		campaing.get().setRequestedAmount(campaingDetails.getRequestedAmount());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(campaingService.save(campaingDetails));
		
	}
	//eliminar una campaña
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
		if(!campaingService.findById(id).isPresent()){
			
			return ResponseEntity.notFound().build();
			
		}
		campaingService.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	
	
	

}
