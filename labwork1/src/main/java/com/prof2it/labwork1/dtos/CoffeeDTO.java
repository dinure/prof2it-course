package com.prof2it.labwork1.dtos;

import java.math.BigDecimal;
import com.prof2it.labwork1.enums.Sort;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoffeeDTO {
	private Long id;
	private Sort sort;
	private BigDecimal weight;
	private BigDecimal price;
}
