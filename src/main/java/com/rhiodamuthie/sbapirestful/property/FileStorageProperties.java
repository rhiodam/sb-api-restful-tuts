package com.rhiodamuthie.sbapirestful.property;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileStorageProperties {

    private String uploadDir;

    private String downloadDir;

//    public String getUploadDir() {
//        return uploadDir;
//    }
//
//    public void setUploadDir(String uploadDir) {
//        this.uploadDir = uploadDir;
//    }

}
