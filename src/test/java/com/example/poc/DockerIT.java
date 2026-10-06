package com.example.poc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
class DockerIT {

	@Container
	private static final MongoDBContainer mongo = new MongoDBContainer("mongo:7.0");

	@Test
	void testContainerIsRunning() {
		assertThat(mongo.isRunning()).isTrue();
	}
}