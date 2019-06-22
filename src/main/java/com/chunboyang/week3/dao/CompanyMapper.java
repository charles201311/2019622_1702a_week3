package com.chunboyang.week3.dao;

import java.util.List;
import java.util.Map;

import com.chunboyang.week3.domain.Company;

/**
 * 
 * @ClassName: CompanyMapper 
 * @Description: 公司的接口
 * @author: charles
 * @date: 2019年6月21日 上午8:59:42
 */
public interface CompanyMapper {

    /**
     * 	
     * @Title: list 
     * @Description: 根据查询条件返回公司的列表信息
     * @param map
     * @return
     * @return: List<Map>
     */
	List<Map> list(Map map);
	
	/**
	 * 
	 * @Title: insert 
	 * @Description: 增加公司
	 * @param company
	 * @return
	 * @return: int
	 */
	int insert(Company company);
	
}
