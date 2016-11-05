package org.manlier.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.manlier.config.AppConfig;
import org.manlier.entity.Company;
import org.manlier.entity.Employee;
import org.manlier.entity.Person;
import org.manlier.propertyeditor.DependsOnExoticType;
import org.manlier.validate.PersonValidator;
import org.manlier.validation.biz.MyService;
import org.manlier.validation.entities.PersonForm;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

import javax.annotation.Resource;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;


/**
 * Created by manlier on 2016/10/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class ConceptTest {

    @Test
    public void testBeanWrapper() {
        BeanWrapper wrapper = new BeanWrapperImpl(new Company());
        wrapper.setPropertyValue("name", "Some Company Inc.");
        BeanWrapper jim = new BeanWrapperImpl(new Employee());
        jim.setPropertyValue("salary","1.7");
        System.out.println(jim.getWrappedInstance());
    }

    @Test
    public void testDataBinder() {
        DataBinder binder = new DataBinder(new Person());

        FormattingConversionService conversionService = new FormattingConversionService();
        conversionService.addFormatterForFieldType(Date.class, new DateFormatter("yyyy-MM-dd"));
        binder.setConversionService(conversionService);

        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.add("birthday","2014-08-10");
        binder.bind(propertyValues);

        binder.setValidator(new PersonValidator());
        binder.validate();
        BindingResult result = binder.getBindingResult();
        System.out.println(result);

        Person person = (Person) binder.getTarget();
        System.out.println(person);
    }

    @Resource
    private DependsOnExoticType dependsOnExoticType;

    @Test
    public void testCustomEditorConfigure() {
        System.out.println(dependsOnExoticType.getType());
    }

    @Resource
    private MyService service;

    @Test
    public void testValidation() {
        service.validate();
    }
}
