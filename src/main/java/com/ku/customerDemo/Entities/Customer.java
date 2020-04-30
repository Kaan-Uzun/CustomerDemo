package com.ku.customerDemo.Entities;

import lombok.*;
import javax.persistence.*;


@Entity
@Table(name = "customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @Column(name = "customer_id")
    public int customer_id;
    @Column(name = "password")
    public String password;
    @Column(name = "first_name")
    public String first_name;
    @Column(name = "last_name")
    public String last_name;
}
