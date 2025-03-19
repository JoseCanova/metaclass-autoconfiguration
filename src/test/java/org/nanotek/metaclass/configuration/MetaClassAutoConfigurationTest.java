package org.nanotek.metaclass.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;

@SpringBootTest
public class MetaClassAutoConfigurationTest {

	public MetaClassAutoConfigurationTest() {
	}

	@Configuration(proxyBeanMethods = false)
	static class UserConfiguration {
	}
	
	@Test
	void testAutoConfiguration() {
		 ApplicationContextRunner contextRunner = new ApplicationContextRunner()
				.withConfiguration(AutoConfigurations.of(MetaClassAutoConfiguration.class));
		 
		 Assert.notNull(contextRunner, "context runner is null");
		 contextRunner.run(cr -> {
//			 cr.containsBean("metaClassRegistry");
		 });
	
	}
	
}
