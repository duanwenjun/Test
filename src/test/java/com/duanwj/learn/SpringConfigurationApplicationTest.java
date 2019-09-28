package com.duanwj.learn;

import com.duanwj.learn.config.MyConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author duanwj
 * @since 2019/6/16 0016 16:25
 */
public class SpringConfigurationApplicationTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyConfiguration.class);
        context.refresh();
    }
}
