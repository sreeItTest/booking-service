package com.booking.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.pgm.to.BedTO;
import com.pgm.to.BookingTO;
import com.pgm.to.RoomTO;

@Service
public class BookingService {
	
	Logger logger = LoggerFactory.getLogger(BookingService.class);

	  static List<BookingTO> bookingList = new ArrayList<>();
	  static {
		  BookingTO bookingTO = new BookingTO();
		  bookingTO.setBookingNumber("1a");
		  RoomTO roomTO = new RoomTO();
		  BedTO bed = new BedTO(1,2,"Ram","BLR","9686500500",null);
		  roomTO.setRoomNumber(2);
		  roomTO.setBed(bed);
		  bookingTO.setRoom(roomTO);
		  bookingList.add(bookingTO);
	  }
	  
	   public BookingTO save(BookingTO booking) {
			return booking;
		}
		
	    public BookingTO retriveRoom(Integer bookingNumber) {
	    	BookingTO room = null;
	    	for (BookingTO roomTO : bookingList) {
	    		if(roomTO.getBookingNumber().equals(bookingNumber)) {
	    			room = roomTO;
	    		}
			}
	    	return room;
		}

		public List<BookingTO> findAll() {
			return bookingList;
		}
	

}
