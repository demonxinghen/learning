package example.imports;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @author demonxinghen
 * @description @Configuration+@Bean注解
 */
@Import(value = {Cat.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
@Component
public class ImportConfiguration {

}
