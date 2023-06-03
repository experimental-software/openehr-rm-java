package org.openehr.rm.demographic;

/**
 * Generic description of a role performed by an Actor. The role corresponds to a competency of the Party. Roles are used to define the responsibilities undertaken by a Party for a purpose. Roles should have credentials qualifying the performer to perform the role.
 */
public interface Role extends Party {
  /**
   * Valid time interval for this role.
   */
  DvINTERVAL<DVDATE> getTimeValidity();

  /**
   * Reference to Version container of Actor playing the role.
   */
  PartyRef getPerformer();

  /**
   * The capabilities of this role.
   */
  List<CAPABILITY> getCapabilities();
}
