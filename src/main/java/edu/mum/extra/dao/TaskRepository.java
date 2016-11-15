package edu.mum.extra.dao;

import org.springframework.data.repository.CrudRepository;

import edu.mum.extra.entity.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
