package com.kku.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {

	public String upload(MultipartFile file);

}
