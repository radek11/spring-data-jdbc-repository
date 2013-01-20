package com.blogspot.nurkiewicz.jdbcrepository.h2;

import com.blogspot.nurkiewicz.jdbcrepository.AbstractJdbcRepositoryCompoundPkTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * @author Tomasz Nurkiewicz
 * @since 1/9/13, 10:20 PM
 */
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = AbstractJdbcRepositoryTestH2Config.class)
public class AbstractJdbcRepositoryCompoundPkH2Test extends AbstractJdbcRepositoryCompoundPkTest {
	public AbstractJdbcRepositoryCompoundPkH2Test() {
		super(-1);
	}
}