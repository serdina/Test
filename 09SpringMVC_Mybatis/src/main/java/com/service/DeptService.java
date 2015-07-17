package com.service;

import java.util.List;

import com.dao.DAO;
import com.entity.DeptDTO;

public class DeptService implements MyService{

	DAO dao;

	
	
	
	public void setDao(DAO dao) {
		this.dao = dao;
	}

	@Override
	public List<DeptDTO> select() {
		// TODO Auto-generated method stub
		return dao.list();
	}

	@Override
	public void write(DeptDTO dto) {
		// TODO Auto-generated method stub
		dao.write(dto);
		
	}
	

}
