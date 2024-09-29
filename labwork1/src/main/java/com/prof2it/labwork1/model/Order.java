package com.prof2it.labwork1.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.prof2it.labwork1.enums.Status;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ORDER")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coffeId")
	private Coffee coffee;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	@Column(name = "placementDate", columnDefinition = "DATE")
	private LocalDate placementDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	@Column(name = "deliveryDate", columnDefinition = "DATE")
	private LocalDate deliveryDate;

	@Column(name = "totalPrice")
	private BigDecimal totalPrice;

	@Column(name = "status")
	private Status status;
}
