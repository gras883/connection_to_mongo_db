package com.example.demo6.entity.oms;

import com.example.demo6.constants.OrderStatus;
import com.example.demo6.constants.OrderType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Order_table")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Order_ID")
    private Integer orderId;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status")
    private OrderStatus status;

    @Enumerated(EnumType.STRING)
    @Column(name = "Order_Type")
    private OrderType orderType;


}
