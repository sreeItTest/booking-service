package com.pgm.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BedTO {

	 private Integer bedNumber;
	 private Integer roomNumber;
	 private String coustmorName;
	 private String address;
	 private String phone;
	 private String proofFilePath;
	 
}
