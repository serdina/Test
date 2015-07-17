package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.DeptDAO;
import com.entity.DeptDTO;

@Component
public class DeptService {

	DeptDAO dao;

	public DeptDAO getDao() {
		return dao;
	}

	@Autowired
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	
	
	//��Ϻ���
	public ArrayList<DeptDTO> select(){
		return (ArrayList<DeptDTO>)dao.select();
	}
	
	//Ư�� ���ڵ� 
	public DeptDTO selectById(int deptno){
		return dao.selectById(deptno);
	}
	
	//���ڵ� ����
	public void insert(int deptno, String dname, String loc){
		DeptDTO dto = new DeptDTO(deptno, dname, loc);
		dao.insert(dto);
	}
	
	//���ڵ� ����
	public void update(int deptno, String dname, String loc){
		DeptDTO dto = new DeptDTO(deptno, dname, loc);
		dao.update(dto);
	}
	
	//���ڵ� ����
	public void delete(int deptno){
		dao.delete(deptno);
	}
	
}
