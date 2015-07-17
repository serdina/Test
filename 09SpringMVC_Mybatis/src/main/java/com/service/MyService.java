package com.service;

import java.util.List;

import com.entity.DeptDTO;

public interface MyService {

	public abstract List<DeptDTO> select();
	public abstract void write(DeptDTO dto);
}