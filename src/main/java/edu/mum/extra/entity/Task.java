package edu.mum.extra.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer taskId;

	private String description;

	@OneToMany(mappedBy = "task", cascade = CascadeType.REMOVE)
	private List<Service> volunteerServices = new ArrayList<Service>();

	@Temporal(TemporalType.DATE)
	private Date startDate;

	@Temporal(TemporalType.DATE)
	private Date endDate;

	@ManyToOne
	@JoinColumn(name = "projectId")
	private Project project;
	
	@OneToMany(mappedBy = "task", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
	private List<Resource> resources = new ArrayList<Resource>();

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Service> getVolunteerServices() {
		return volunteerServices;
	}

	public void setVolunteerServices(List<Service> volunteerServices) {
		this.volunteerServices = volunteerServices;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<Resource> getResources() {
		return Collections.unmodifiableList(resources);
	}
	
	public void addResource(Resource r) {
		resources.add(r);
		r.setTask(this);
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

}
