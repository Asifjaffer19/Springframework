package com.aasifjaffer.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class samsung {
	@Autowired
	
	mobileProcessor cpu;
	
	public mobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(mobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("core , 8gb RAM , 118 GB HD , 15MP camera");
		cpu.process();
	}

}
