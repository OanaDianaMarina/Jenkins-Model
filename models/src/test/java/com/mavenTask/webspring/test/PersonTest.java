package com.mavenTask.webspring.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.mavenTask.webspring.models.Person;

class PersonTest {

	@Test
	void TestisAdult() {
		Person psn = new Person("Diana", 23);
		boolean isAdult = psn.isAdult();
		assertTrue(isAdult);
	}
	
	void TestisAdult1() {
		Person psn = new Person("Diana", 18);
		boolean isAdult = psn.isAdult();
		assertTrue(isAdult);
	}
	
	void TestisAdult2() {
		Person psn = new Person("Diana", 15);
		boolean isAdult = psn.isAdult();
		assertTrue(isAdult);
	}
}
