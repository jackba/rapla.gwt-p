package org.rapla.client.edit.reservation.sample;

import java.util.List;

import org.rapla.client.base.View;
import org.rapla.client.edit.reservation.sample.ResourceDatesView.Presenter;
import org.rapla.client.edit.reservation.sample.gwt.RaplaDate;
import org.rapla.entities.domain.Appointment;

import com.google.gwt.event.dom.client.ClickEvent;

public interface ResourceDatesView<W>  extends View<Presenter>, ReservationEditSubView<W> {
    public interface Presenter
    {
        void newAppButtonPressed();
        //add handler here 

		void onGarbageCanButtonClicked();

		void onWholeDaySelected();

		void onButtonPlusClicked();

		void onRewriteDateClicked();

		void onAddDateClicked();

		void onResourcesAdded();

		void onAddTerminButtonClicked(ClickEvent event);


    }


    void hide();
    
    void update(List<Appointment> appointments);
    //add  methoden des alten infoViewInterface

	void show();

	void addDateWidget();

	void RewriteDate();

	void setVisiblityOfDateElements();

	void clearInputFields();

	void addResources();


	void setRaplaDate(RaplaDate tmp);

	void openEditView();
    
}
