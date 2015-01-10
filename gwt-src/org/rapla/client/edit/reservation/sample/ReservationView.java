package org.rapla.client.edit.reservation.sample;

import org.rapla.client.base.View;
import org.rapla.client.edit.reservation.sample.ReservationView.Presenter;
import org.rapla.entities.domain.Reservation;

public interface ReservationView<W> extends View<Presenter> {

  public interface Presenter {
    void onSaveButtonClicked();
    void onDeleteButtonClicked();
    void changeEventName(String newEvent);
    boolean isDeleteButtonEnabled();
    void onCancelButtonClicked();
    void onCourseButtonClicked();
  }

  void show(Reservation event);
  void hide();
  void addSubView(ReservationEditSubView<W> view);
}