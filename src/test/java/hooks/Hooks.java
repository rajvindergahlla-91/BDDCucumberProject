package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void init() {

		System.out.println("I am in Before method");
	}

	@After
	public void end() {

		System.out.println("I am in after method");

	}
}
