package com.oraykurt.phone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritePhone {
	private static final String phoneNum = "+48123456789";

	WritePhone(File file) throws IOException {
		FileWriter fw = new FileWriter(file);
		fw.write(phoneNum);
		fw.close();
	}
}
