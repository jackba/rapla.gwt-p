package org.rapla.client.edit.reservation.sample;

import org.rapla.client.base.View;
import org.rapla.client.edit.reservation.sample.ReservationView.Presenter;
import org.rapla.entities.domain.Reservation;
import org.rapla.entities.dynamictype.Attribute;

public interface ReservationView<W> extends View<Presenter> {

  public interface Presenter {
    void onSaveButtonClicked();
    void onDeleteButtonClicked();
    void changeEventName(String newEvent);
    boolean isDeleteButtonEnabled();
    void onCancelButtonClicked();
	void onTabChanged(int selectedTab);
	void onEventTypesChanged();
	void onStudiengangChanged();
	void onGarbageCanButtonClicked();
	void onWholeDaySelected();
	void onButtonPlusClicked();
	void onRewriteDateClicked();
	void onAddDateClicked();
  }

  void show(Reservation event);
  void hide();
  void addSubView(ReservationEditSubView<W> view);
  void update(int selectedTab);
  String getTitelInput();
  Attribute getVorlesungsStundenInput();
  String getSelectedEventType();
}
