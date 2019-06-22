package com.chunboyang.week3.service;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chunboyang.week3.domain.Company;
import com.lisi.common.utils.RandomSimpleChinese;
import com.lisi.common.utils.RandomStringUtil;
import com.lisi.common.utils.RandomUtil;

@ContextConfiguration(locations="classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CompanyServiceImplTest {

	@Resource
   private CompanyService companyService;
	

	
	@Test
	public void testList() {
		Map<String, Object> map = new HashMap<>();
		map.put("minMoney", 10000);//注册资金
		map.put("maxMoney", 2000000);//注册资金
		
		map.put("tid", 1); //按照类型查询
		
		
		List<Map> list = companyService.list(map);	
		
		System.out.println(list);
		
		
		
	}

	/**
	 * 利用第 2 周的工具类模拟 1 万条数据到数据库，例如公司名称以“北京”
开头，以“有限公司”或“股份有限公司”或“集团有限公司”结尾，中
间使用 2-4 个随机汉字。 注册资本调用第 2 周的随机数工具方法生成，
值在 10 万元-10 亿元之间，公司经济类型值在公司类型表中的所有 id
中随机抽取等等
	 * @Title: testInsert 
	 * @Description: TODO
	 * @return: void
	 * @throws UnsupportedEncodingException 
	 */
	@Test
	public void testInsert() throws UnsupportedEncodingException {
		
		
		for(int j =0;j<10000;j++) {
		
		//产生2-4个随机数
		
		Integer number = RandomUtil.getRandomNumber(2, 4);
		//根据随机数产生指定个数的中文
		String name = RandomStringUtil.getRandomString(number);
		//产生注册资本
		int money  = RandomUtil.getRandomNumber(100000, 1000000000);
		
		//公司的后缀
		String [] suffixName = {"有限公司","股份有限公司","集团有限公司","国企","私企"};
		   
		Integer i = RandomUtil.getRandomNumber(0, 4);
		String cname ="北京"+name + suffixName[i];
		//产生的公司的法人
		String person =RandomStringUtil.getRandomChineseName();
		//执行增加公司
		companyService.insert(new Company(cname, money, person, new Date(), i+1));
		}
	}

}
