package com.example.poc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testAddReturnsSumOfTwoNumbers() {
		App app = new App();
		assertThat(app.add(2, 3)).isEqualTo(5);
	}
}