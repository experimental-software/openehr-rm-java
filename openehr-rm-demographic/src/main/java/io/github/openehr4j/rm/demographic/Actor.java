package io.github.openehr4j.rm.demographic;

import java.util.List;

public interface Actor extends Party {

  List getLanguages();

  List getRoles();
}