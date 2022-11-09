package com.example.myfirstproject;

import com.example.myfirstproject.controller.MarkController;
import com.example.myfirstproject.dto.SubjectMarksDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class MyfirstprojectApplicationTests {

	@Autowired
	MarkController markController;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetHighestMarkInAllSubject() {
		Long examTypeId = 1L;
		SubjectMarksDto highestMarkDto = markController.getHighMarkInEachSubject(examTypeId);
		String response = highestMarkDto.toString();
		log.info("This is tamil case output: " + highestMarkDto.getTamil());
	}
}
