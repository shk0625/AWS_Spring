package aws.example.springs3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsConfig {

    @Value("$(cloud.aws.credentials.accessKey}")
    private String accessKey;

    @Value("$(cloud.aws.credentials.secretKey}")
    private String secretKey;

    @Value("$(cloud.aws.region.static}")
    private String region;

    @Bean
    public AmazonS3 amazonS3() {

    }
}
