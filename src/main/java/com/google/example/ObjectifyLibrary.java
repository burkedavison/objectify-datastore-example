package com.google.example;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Unindex;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@Entity
public class ObjectifyLibrary {

  @Id private String id = UUID.randomUUID().toString();

  @Unindex private String primitive;
  @Unindex private Set<String> collectionOfPrimitive;
  @Unindex private Map<String, String> mapOfPrimitives;
  @Unindex private Map<String, Set<String>> mapOfSetOfPrimitives;

  @Unindex private ObjectifyBook ref;
  @Unindex private List<ObjectifyBook> refs;
  @Unindex private Map<String, ObjectifyBook> mapOfRefs;

  public ObjectifyLibrary(String primitive, Set<String> collectionOfPrimitive,
      Map<String, String> mapOfPrimitives, Map<String, Set<String>> mapOfSetOfPrimitives,
      ObjectifyBook ref, List<ObjectifyBook> refs, Map<String, ObjectifyBook> mapOfRefs) {
    this.primitive = primitive;
    this.collectionOfPrimitive = collectionOfPrimitive;
    this.mapOfPrimitives = mapOfPrimitives;
    this.mapOfSetOfPrimitives = mapOfSetOfPrimitives;
    this.ref = ref;
    this.refs = refs;
    this.mapOfRefs = mapOfRefs;
  }
}
