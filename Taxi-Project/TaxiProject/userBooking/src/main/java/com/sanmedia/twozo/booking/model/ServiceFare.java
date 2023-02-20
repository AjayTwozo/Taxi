package com.sanmedia.twozo.booking.model;

import com.sanmedia.twozo.genericDAO.model.GenericModel;

/**
 * ServiceFare pattern
 * Contains service, com.TaxiProject.booking
 *
 * @author Ajay
 * @version 1.0
 */
public class ServiceFare implements GenericModel {

    private Long id;
    private Service service;
    private Booking booking;

    public Service getService() {
        return service;
    }

    public void setService(final Service service) {
        this.service = service;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(final Booking booking) {
        this.booking = booking;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }
}
