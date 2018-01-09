package com.finrarepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Repository
class FileRepositoryImpl implements FileRepository {

   
	@Autowired
    JdbcTemplate jdbcTemplate;
	
    @Override
    public void writeFile(String name, File file) throws IOException {
    	FileInputStream fileInput = new FileInputStream(file);
    	Object blobOutput = null ;
    //	OutputBlob blobOutput = new OutputBlob(fileInput, file.length());
    	jdbcTemplate.execute("INSERT INTO  UPLOAD_FILE (file_name, File)  VALUES " +(name +","+ blobOutput) +")");
    }
    
}