
package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entity.DeptDTO;

//JdbcDaoSupport���� setDataSource() �޼ҵ尡 ����ȴ�.

@Component
public class DeptDAO implements DAO{

	SqlSessionTemplate template;

	/* (non-Javadoc)
	 * @see com.dao.DAO#setTemplate(org.mybatis.spring.SqlSessionTemplate)
	 */
	@Override
	public void setTemplate(SqlSessionTemplate template) {
		this.template = template;
	}
	
	public List<DeptDTO> list(){
		return template.selectList("deptALL");
	}

	@Override
	public void write(DeptDTO dto) {
		template.insert("insert",dto);
	}
	
	
	


	
}
