package springtutorialapp;

import net.spring.service.TutorialService;
import net.spring.tutorial.AppConfig;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class TestChapter1 {
	@Autowired
	TutorialService service;
	@Before
	public void setUp() {
	}
	@Test
	public void test() {
		Assert.assertNotNull(service.getChapterDetails());
	}

}
