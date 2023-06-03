package org.openehr.rm.integration;

/**
 * This class is used to create intermediate representations of data from sources not otherwise conforming to openEHR classes, such as HL7 messages, relational databases and so on.
 */
public interface GenericEntry extends ContentItem {
  /**
   * The data from the source message or record. May be recorded in any structural openEHR representation.
   */
  Item getData();
}
