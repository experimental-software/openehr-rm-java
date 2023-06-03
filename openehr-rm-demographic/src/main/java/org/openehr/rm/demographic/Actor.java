package org.openehr.rm.demographic;

/**
 * Ancestor of all real-world types, including people and organisations. An actor is any real-world entity capable of taking on a role.
 */
public interface Actor extends Party {
  /**
   * Languages which can be used to communicate with this actor, in preferred order of use (if known, else order irrelevant).
   */
  List<DVTEXT> getLanguages();

  /**
   * Identifiers of the Version container for each Role played by this Party.
   */
  List<PARTYREF> getRoles();
}
