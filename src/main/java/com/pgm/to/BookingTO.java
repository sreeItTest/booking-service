package com.pgm.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookingTO {

	private String  bookingNumber;
	private RoomTO  room;
	
}
