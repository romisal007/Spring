package com.rohit.spring.springadvance.sterotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {

	// @Value("#{60+40}")
	// @Value("#{T(java.lang.Math).abs(-99)}")
	@Value("#{new Integer(88)}")
	private int id;
	// @Value("Rohit")
	// @Value("#{'Rohit Misal'}")
	// @Value("#{'Rohit Misal'.toUpperCase()}")
	@Value("#{new java.lang.String('Rohit Misal')}")
	private String name;

	@Value("#{2+4>5}")
	private boolean active;

	@Value("#{myList}")
	private List<String> topics;

	@Autowired
	private Profile profile;

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", active=" + active + ", topics=" + topics + ", profile="
				+ profile + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
}
