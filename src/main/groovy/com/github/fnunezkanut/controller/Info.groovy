package com.github.fnunezkanut.controller

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@EnableAutoConfiguration
class Info {

	@RequestMapping(
		value = "/info",
		method = RequestMethod.GET,
		produces = "application/json"
	)
	@ResponseBody
	HashMap<String, String> tokeninfo(
		@RequestHeader(value = "Accept", defaultValue = "No Accept") String accept,
		@RequestHeader(value = "User-Agent", defaultValue = "No User-Agent") String userAgent
	) {

		final Date now = new Date()
		final String uuid = UUID.randomUUID().toString()

		final HashMap<String, String> message = [
			'message': 'hello',
			'uuid' : uuid,
			'accept' : accept,
			'userAgent' : userAgent,
			'time' : now.toString()
		]

		return message
	}
}
