package com.snapskills.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "SnapSkills User Service API",
                version = "1.0",
                description = "This API provides endpoints for managing users within the SnapSkills platform. " +
                        "It allows for the creation, retrieval, updating, and deletion of user profiles.",
                contact = @Contact(
                        name = "SnapSkills Support",
                        email = "support@snapskills.com",
                        url = "https://snapskills.com/contact"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0.html"
                )
        )
)
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
