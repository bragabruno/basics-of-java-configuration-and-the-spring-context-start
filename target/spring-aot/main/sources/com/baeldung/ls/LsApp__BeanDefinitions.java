package com.baeldung.ls;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link LsApp}.
 */
public class LsApp__BeanDefinitions {
  /**
   * Get the bean definition for 'lsApp'.
   */
  public static BeanDefinition getLsAppBeanDefinition() {
    Class<?> beanType = LsApp.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(LsApp.class);
    beanDefinition.setInstanceSupplier(LsApp$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
