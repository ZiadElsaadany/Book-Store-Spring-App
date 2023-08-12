package com.trainig.BookStore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
/**
 *
 * @Getter
 * @Setter
 * @AllArgsConstructor
 * */
public class Book {

    private  String title ;
    private  String author ;
    private  String description ;
    private  Integer id ;
    private  Float price;


}
