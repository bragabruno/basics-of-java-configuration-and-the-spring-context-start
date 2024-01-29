package com.baeldung.ls.spring;

import com.baeldung.ls.persistence.repository.impl.ProjectRepositoryImpl;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link PersistenceConfig}.
 */
public class PersistenceConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'persistenceConfig'.
   */
  public static BeanDefinition getPersistenceConfigBeanDefinition() {
    Class<?> beanType = PersistenceConfig.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(PersistenceConfig.class);
    beanDefinition.setInstanceSupplier(PersistenceConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'projectRepository'.
   */
  private static BeanInstanceSupplier<ProjectRepositoryImpl> getProjectRepositoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ProjectRepositoryImpl>forFactoryMethod(PersistenceConfig.class, "projectRepository")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(PersistenceConfig.class).projectRepository());
  }

  /**
   * Get the bean definition for 'projectRepository'.
   */
  public static BeanDefinition getProjectRepositoryBeanDefinition() {
    Class<?> beanType = ProjectRepositoryImpl.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getProjectRepositoryInstanceSupplier());
    return beanDefinition;
  }
}
