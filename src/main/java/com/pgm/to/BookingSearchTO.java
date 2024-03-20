package com.pgm.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookingSearchTO {
	private String  bookingNumber;
	private Integer bedNumber;
	private Integer roomNumber;
}
