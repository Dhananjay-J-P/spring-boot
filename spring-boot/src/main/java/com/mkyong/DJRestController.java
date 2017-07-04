/**
 * 
 */
package com.mkyong;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dhananjay P
 *
 */
@RestController
public class DJRestController {

	/**
	 * 
	 */
	public DJRestController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/JSON")
	public List<JSonClass> getJSON() {
		return Arrays.asList(new JSonClass("1", "name", "contact"), new JSonClass("2", "name", "contact"),
				new JSonClass("3", "name", "contact")

		);

	}

}
