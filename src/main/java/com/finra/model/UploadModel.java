package com.finra.model;

import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

public class UploadModel {

    private String name;

    private MultipartFile[] files;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MultipartFile[] getFiles() {
        return files;
    }

    public void setFiles(MultipartFile[] files) {
        this.files = files;
    }

	@Override
	public String toString() {
		return "UploadModel [name=" + name + ", files=" + Arrays.toString(files) + "]";
	}
}
