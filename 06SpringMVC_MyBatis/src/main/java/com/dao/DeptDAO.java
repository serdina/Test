
package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entity.DeptDTO;

//JdbcDaoSupport���� setDataSource() �޼ҵ尡 ����ȴ�.

@Component
public class DeptDAO{

	SqlSessionTemplate template;

	@Autowired
	public void setTemplate(SqlSessionTemplate template) {
		this.template = template;
	}
	
	//insert
		public void insert(DeptDTO dto){
			
			int n = template.insert("insert", dto);
			
		}
		//�����ϱ�
		public void update(DeptDTO dto){
			
			int n = template.update("update", dto);
		}
	
		//�����ϱ�
		public void delete(int deptno2){
			
			int n = template.delete("delete", deptno2);
		}
		
		//select
		public List<DeptDTO> select(){
			
			return template.selectList("selectAll");
			
		}
		//Ư�� ���ڵ� 
		public DeptDTO selectById(int deptno){
			
			return (DeptDTO)template.selectOne("selectById", deptno );
			
		}
	
/*
	public static SqlSessionFactory factory;
	
	
	static{
		
		String resource = "configuration.xml";
		try{
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		factory = builder.build(inputStream);
		}catch(Exception e){e.printStackTrace();}
		

	}//end static 
	
	//insert
	public void insert(DeptDTO dto){
		
		SqlSession session = factory.openSession();
		try{
			session.insert("insert", dto);
		}catch(Exception e){e.printStackTrace();}
		    session.commit();
		    session.close();
	}
	
	//�����ϱ�
	public void update(DeptDTO dto){
		
		SqlSession session = factory.openSession();
		try{
			session.update("update", dto);
		}catch(Exception e){ e.printStackTrace();}
		session.commit();
	    session.close();
		
	}
	
	//�����ϱ�
	public void delete(int deptno2){
		
		SqlSession session = factory.openSession();
		try{
			session.delete("delete", deptno2);
		}catch(Exception e){ e.printStackTrace();}
		session.commit();
	    session.close();
		
	}
	
	//select
	public List<DeptDTO> selectAll(){
		System.out.println(">>>>>>" + factory);
		List<DeptDTO> list = null;
		SqlSession session = factory.openSession();
		try{
			list = session.selectList("selectAll");
		}catch(Exception e){e.printStackTrace();}
		session.close();
		return list;
	}
	
	//Ư�� ���ڵ� 
	public DeptDTO selectById(int deptno){
		DeptDTO dto = null;
		SqlSession session = factory.openSession();
		try{
			dto = (DeptDTO)session.selectOne("selectById", deptno);
		}catch(Exception e){e.printStackTrace();}
		session.close();
		
		return dto;
	}
	*/

	
}
