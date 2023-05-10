package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ITravelManageDAO;
import com.example.demo.dto.TravelManage;

@Service
public class TravelManageService {
	@Autowired
	ITravelManageDAO travelManageDAO;

	public List<TravelManage> listTravelManage() {
		return travelManageDAO.findAll();
	}

	public TravelManage saveTravelManage(TravelManage travelManage) {
		return travelManageDAO.save(travelManage);
	}

	public TravelManage travelManageXID(Long id) {
		return travelManageDAO.findById(id).get();
	}

	public TravelManage updateTravelManage(TravelManage travelManage) {
		return travelManageDAO.save(travelManage);
	}

	public void deleteTravelManage(Long id) {
		travelManageDAO.deleteById(id);
	}
}