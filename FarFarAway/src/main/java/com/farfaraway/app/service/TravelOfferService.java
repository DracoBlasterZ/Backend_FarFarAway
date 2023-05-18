package com.farfaraway.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farfaraway.app.dao.ITravelOfferDAO;
import com.farfaraway.app.dto.TravelOffer;

@Service
public class TravelOfferService {
	@Autowired
	ITravelOfferDAO iTravelOfferDAO;

	public List<TravelOffer> listTravelOffers() {
		return iTravelOfferDAO.findAll();
	}

	public TravelOffer saveTravelOffer(TravelOffer travelOffer) {
		return iTravelOfferDAO.save(travelOffer);
	}

	public TravelOffer travelOfferXID(Long id) {
		return iTravelOfferDAO.findById(id).get();
	}

	public TravelOffer updateTravelOffer(TravelOffer travelOffer) {
		return iTravelOfferDAO.save(travelOffer);
	}

	public void deleteTravelOffer(Long id) {
		iTravelOfferDAO.deleteById(id);
	}
}