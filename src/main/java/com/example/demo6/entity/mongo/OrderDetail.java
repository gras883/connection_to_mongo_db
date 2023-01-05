package com.example.demo6.entity.mongo;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "OrderDetails")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Integer orderId;
    private Object order;
}
