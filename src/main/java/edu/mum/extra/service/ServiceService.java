package edu.mum.extra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.extra.dao.ServiceRepository;

@Service
@Transactional
public class ServiceService {
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	public void create(edu.mum.extra.entity.Service service) {
		serviceRepository.save(service);
	}
	
}
