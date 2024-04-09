package com.google.example;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import java.util.UUID;

@Entity
public class ObjectifyBook {

  @Id String id = UUID.randomUUID().toString();
  private String title;

  public ObjectifyBook(String title) {
    this.title = title;
  }
}
