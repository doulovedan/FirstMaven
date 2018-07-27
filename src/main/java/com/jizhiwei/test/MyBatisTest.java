package com.jizhiwei.test;

import javax.annotation.security.RunAs;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:contextApplication.xml" })
public class MyBatisTest {

}
