package com.kiddcorp.spring.testmvc.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * @author John Kidd
 */
@Configuration
@ComponentScan(basePackages = {"com.kiddcorp.spring.testmvc.todo.service"})
@Import({WebAppContext.class, PersistenceContext.class})
@PropertySource("classpath:application.properties")
public class ExampleApplicationContext {

    private static final String MESSAGE_SOURCE_BASE_NAME = "i18n/messages";

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();

        messageSource.setBasename(MESSAGE_SOURCE_BASE_NAME);
        messageSource.setUseCodeAsDefaultMessage(true);

        return messageSource;
    }
}
