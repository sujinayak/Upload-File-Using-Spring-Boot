package com.finra.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public interface FileService {

	public void writeFile (String s, File  file) throws IOException;
	
}
