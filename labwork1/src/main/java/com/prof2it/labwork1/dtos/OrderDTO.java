package com.prof2it.labwork1.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.prof2it.labwork1.enums.Status;
import com.prof2it.labwork1.model.Coffee;
import com.prof2it.labwork1.model.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
	private Long id;
	private User user;
	private Coffee coffee;
	private LocalDate placementDate;
	private LocalDate deliveryDate;
	private BigDecimal totalPrice;
	private Status status;
}
