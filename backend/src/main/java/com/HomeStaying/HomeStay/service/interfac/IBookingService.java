package com.HomeStaying.HomeStay.service.interfac;

import com.HomeStaying.HomeStay.dto.Response;
import com.HomeStaying.HomeStay.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
