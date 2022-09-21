package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE) //use to make every attribute private 
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "lumen_mobile_plans") //this is the table that we create which is in sql database
public class MobilePlan {
	
	
	@Id
	@Column(name = "plan_id") //an column gets created in database by name plan_id
	int planId;
	
	@Column(name = "plan_name")
	String planName;
	
	@Column(name = "cost")
	double cost;
	
	@Column(name = "validity")
	String validity;

}
