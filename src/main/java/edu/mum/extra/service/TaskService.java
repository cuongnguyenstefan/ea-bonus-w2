package edu.mum.extra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.extra.dao.TaskRepository;
import edu.mum.extra.entity.Task;

@Service
@Transactional
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	public Task get(int id) {
		Task findOne = taskRepository.findOne(id);
		return findOne;
	}
	
}
