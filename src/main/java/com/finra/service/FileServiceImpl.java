package com.finra.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finra.model.UploadModel;
import com.finrarepositories.FileRepository;

@Service
public class FileServiceImpl  implements FileService{

	@Autowired
	FileRepository fr;
	
	@Override
	public void writeFile(String name, File f) throws IOException {
		fr.writeFile(name, f);
	}

	 
	
}
