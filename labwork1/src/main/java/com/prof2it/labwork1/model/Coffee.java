package com.prof2it.labwork1.model;

import com.prof2it.labwork1.enums.Sort;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "COFFEE")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Coffee {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "sort")
	private Sort sort;
	
	@Column (name = "weight")
	private BigDecimal weight;

	@Column(name = "price")
	private BigDecimal price;
}
