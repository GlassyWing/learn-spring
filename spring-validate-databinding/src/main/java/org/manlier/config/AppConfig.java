package org.manlier.config;

import org.manlier.propertyeditor.ExoticType;
import org.manlier.propertyeditor.ExoticTypeEditor;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.beans.PropertyEditor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by manlier on 2016/10/27.
 */
@Configuration
@ImportResource("classpath:spring-vd.xml")
public class AppConfig {

//    @Bean
//    public CustomEditorConfigurer customEditorConfigurer() {
//        CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
//        Map<Class<?>, Class<? extends PropertyEditor>> editors = new HashMap<>();
//        editors.put(ExoticType.class, ExoticTypeEditor.class);
//        customEditorConfigurer.setCustomEditors(editors);
//        return customEditorConfigurer;
//    }
}
