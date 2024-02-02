package org.springProject.Configuration;

import org.springProject.ContactSupport.PhoneFormatter;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import javax.xml.stream.Location;
import java.util.List;
import java.util.Properties;

@EnableWebMvc
@Configuration
@ComponentScan("org.springProject")
//@PropertySource("classpath:email.properties")
public class Spring_config implements WebMvcConfigurer {
    @Bean
    PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
    @Bean
    JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource());
        return jdbcTemplate;
    }
    @Bean
   DataSource dataSource(){
       DriverManagerDataSource dataSource=new DriverManagerDataSource();
       dataSource.setUrl("jdbc:mysql://localhost:3306/love_calculator_project");
       dataSource.setUsername("root");
       dataSource.setPassword("nitinsoni0103");
       dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
       return dataSource;
   }

//    Logger logger=Logger.getLogger(Spring_config.class.getName());
    Environment environment;
    @Bean
    InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }
    @Bean
    public JavaMailSender javaMailSender(){
        JavaMailSenderImpl javaMailSender=new JavaMailSenderImpl();
        javaMailSender.setHost("smtp.gmail.com");
       // System.out.println("${setHost}");
        javaMailSender.setUsername("nitinsoni13.cool@gmail.com");
        javaMailSender.setPassword("Nitinsoni@13");
        javaMailSender.setPort(587);

        Properties mailproperties=new Properties();
        mailproperties.put("mail.smtp.starttls.enable", true);
        mailproperties.put("mail.smtp.ssl.trust","smtp.gmail.com");
//        mailproperties.put("mail.smtp.auth", true);
//        mailproperties.put("mail.smtp.starttls.enable", true);
//        mailproperties.put("mail.smtp.host", "smtp.gmail.com");
//        mailproperties.put("mail.smtp.port", "587");
        javaMailSender.setJavaMailProperties(mailproperties);

        return javaMailSender;

    }

    @Override
    public void addFormatters(FormatterRegistry formatterRegistry) {
        formatterRegistry.addFormatter(new PhoneFormatter());
    }


    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> list) {

    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> list) {

    }

    @Override
    public Validator getValidator() {
        return null;
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer contentNegotiationConfigurer) {

    }

    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer asyncSupportConfigurer) {

    }

    @Override
    public void configurePathMatch(PathMatchConfigurer pathMatchConfigurer) {

    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> list) {

    }

    @Override
    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> list) {

    }

    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> list) {

    }

    @Override
    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> list) {

    }

    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry) {

    }

    @Override
    public MessageCodesResolver getMessageCodesResolver() {
        return null;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {

    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry viewResolverRegistry) {

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry) {

    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer defaultServletHandlerConfigurer) {

    }

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {

    }
}
