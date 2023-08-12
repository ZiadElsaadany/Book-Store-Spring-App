package com.trainig.BookStore.entity;

import lombok.Data;

@Data
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
