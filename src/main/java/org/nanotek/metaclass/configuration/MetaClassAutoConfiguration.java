package org.nanotek.metaclass.configuration;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AutoConfiguration
@AutoConfigureBefore(value = {RepositoryRestMvcAutoConfiguration.class})
public class MetaClassAutoConfiguration {

	@Bean
	MetaClassRegistry<?> metaClassRegistry() {
		System.err.println("meta class registry bean");
		return new MetaClassRegistry<>();
	}
	
	@Configuration(proxyBeanMethods = false)
	public static class MetaClassConfiguration {
	}
	
	
}
