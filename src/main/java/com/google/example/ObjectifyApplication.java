package com.google.example;

import static com.googlecode.objectify.ObjectifyService.ofy;

import com.googlecode.objectify.ObjectifyService;
import java.util.Collections;

public class ObjectifyApplication {

  public static void main(String[] args) {
    ObjectifyService.init();
    ObjectifyService.register(ObjectifyLibrary.class);
    ObjectifyService.register(ObjectifyBook.class);

    ObjectifyService.run(() -> {
        ofy().save().entity(new ObjectifyLibrary(
            "primitive",
            Collections.singleton("primitives"),
            Collections.singletonMap("key", "value"),
            Collections.singletonMap("key", Collections.singleton("value")),
            new ObjectifyBook("a"),
            Collections.singletonList(new ObjectifyBook("b")),
            Collections.singletonMap("k", new ObjectifyBook("c"))
            ));
    });
  }
}