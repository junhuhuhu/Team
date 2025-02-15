package com.company.admin.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.admin.command.AdminCriteria;
import com.company.admin.command.AdminVO;
import com.company.admin.mapper.AdminMapper;
import com.company.board.command.BoardVO;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper mapper;

	@Override
	public ArrayList<AdminVO> adGetList(AdminCriteria adcri) {
		ArrayList<AdminVO> list = mapper.adGetList();
		return list;
		
	}

	@Override
	public void adRegister(AdminVO vo) {
		mapper.adRegister(vo);

	}

	@Override
	public AdminVO adContent(int nno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adUpdate(AdminVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void adDelete(int nno) {
		// TODO Auto-generated method stub

	}

	@Override
	public int adTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
