package com.rms.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="robot_parameter")
public class RobotParameterModel {
	
	
    
	@Id
	@GeneratedValue
	@Column(name="param_id")
	Integer paramId;
	@Column(name="robot_id")
	String robotId;
	@Column(name="parameter_name")
	String parameterName;
	@Column(name="max_value")
	String maxValue;
	@Column(name="min_value")
	String minValue;
	@Column(name="added_on")
	String addedOn;
	@Column(name="is_active")
	Boolean isActive;
	@Column(name="updated_on")
	String updatedOn;
	@Column(name="monitor_duration")
	int monitorDuration;

}
