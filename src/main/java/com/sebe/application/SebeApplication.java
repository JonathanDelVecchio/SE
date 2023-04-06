/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sebe.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sebe"})
@EnableJpaRepositories(basePackages = "com.sebe.repository")
@EntityScan(basePackages = {"com.sebe.model"})
public class SebeApplication {
    public static void main(String[] args) {
        SpringApplication.run(SebeApplication.class, args);
    }
}