package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.entity.DeptDTO;

public interface DAO {

	public abstract void setTemplate(SqlSessionTemplate template);
	public abstract void write(DeptDTO dto);
	public abstract List<DeptDTO> list();

}