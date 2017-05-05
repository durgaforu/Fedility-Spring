package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Use {

	@Autowired
	@Qualifier(value = "rectangle")
	private Shape sh;

	@Autowired
	@Qualifier(value = "square")
	private Shape sh1;

	public void getShape() {
		sh.draw();
		sh1.draw();
	}

}
