package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ITravelBookDAO;
import com.example.demo.dto.TravelBook;

@Service
public class TravelBookService {
	@Autowired
	ITravelBookDAO travelBookDAO;

	public List<TravelBook> listTravelBooks() {
		return travelBookDAO.findAll();
	}

	public TravelBook saveTravelBook(TravelBook travelBook) {
		return travelBookDAO.save(travelBook);
	}

	public TravelBook travelBookXID(Long id) {
		return travelBookDAO.findById(id).get();
	}

	public TravelBook updateTravelBook(TravelBook travelBook) {
		return travelBookDAO.save(travelBook);
	}

	public void deleteTravelBook(Long id) {
		travelBookDAO.deleteById(id);
	}
}
