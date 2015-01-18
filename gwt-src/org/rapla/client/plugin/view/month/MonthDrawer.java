package org.rapla.client.plugin.view.month;

import org.rapla.client.edit.reservation.impl.ReservationController;
import org.rapla.client.factory.ViewServiceProviderInterface;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class MonthDrawer implements ViewServiceProviderInterface {
	
ReservationController reservationController;
	
	public ReservationController getReservationController() {
		return reservationController;
	}

	public void setReservationController(ReservationController reservationController) {
		this.reservationController = reservationController;
	}

	@Override
	public Widget createContent() {
		return new HTML("Monat-Darstellung");
	}

	@Override
	public void updateContent() {
		// Check
	}

}