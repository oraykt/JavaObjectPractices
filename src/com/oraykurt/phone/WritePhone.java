package com.oraykurt.phone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritePhone {
	private static final String phoneNum = "+48123456789";

	private String fileName;

	WritePhone(String fileName, File file) throws IOException {
		FileWriter fw = new FileWriter(file);
		fw.write("+48886079489");
		fw.close();
	}
}
