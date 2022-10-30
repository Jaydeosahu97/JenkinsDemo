package com.dojo.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;
@SpringBootTest
// @Slf4j
class UserTokenTest {

	@Test
	void test() {
		UserToken userToken = new UserToken("user", "token");
		// log.info(userToken.getUsername()+" "+userToken.getAuthToken());
		assertEquals("user", userToken.getUsername());
		assertEquals("token", userToken.getAuthToken());
	}

}
