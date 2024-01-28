package org.springProject.Configuration;

import org.springProject.Configuration.Spring_config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Web_Config extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] arr={Spring_config.class};
        return arr;
    }

    @Override
    protected String[] getServletMappings() {
        String[] arr={"/"};
        return arr;
    }
}
