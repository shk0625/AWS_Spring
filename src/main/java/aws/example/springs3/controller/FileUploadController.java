package aws.example.springs3.controller;

import aws.example.springs3.service.S3Upload;
import lombok.RequiredArgsConstructor;
import org.apache.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
public class FileUploadController {

    private final S3Upload s3Upload;

    @PostMapping("/upload")
    public ApiResponse<String> uploadFile(@RequestParam("images") MultipartFile multipartFile)
        throws IOException {
        return ApiResponse.success(HttpStatus.CREATED, s3Upload.upload(multipartFile.getInputStream(),
                multipartFile.getOriginalFilename(), fileSize));
    }

}
