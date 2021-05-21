package myproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import common.bean.AppProBean;





@RestController
@EnableConfigurationProperties(AppProBean.class)
public class testController {
	
	@Autowired
	AppProBean appProBean;
	
//	@Value("${appProBean.name}")
//	private String name;
//	@Value("${appProBean.age}")
//	private String age;
//	@Value("${appProBean.sex}")
//	private String sex;

	
	@RequestMapping("/hello")
	public String 	hello() {
		

		return "我的名字：" + appProBean.getName() +
					"\n我的年龄：" + appProBean.getAge() +
						"\n我的性别：" + appProBean.getSex() +"\n";
	}
	



}
