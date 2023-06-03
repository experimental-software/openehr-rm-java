package org.openehr.rm.ehr.ehr;

/**
 * The EHR object is the root object and access point of an EHR for a subject of care.
 */
public interface Ehr {
  /**
   * The identifier of the logical EHR management system in which this EHR was created.
   */
  HierObjectId getSystemId();

  /**
   * The unique identifier of this EHR.
   */
  HierObjectId getEhrId();

  /**
   * List of contributions causing changes to this EHR. Each contribution contains a list of versions, which may include references to any number of `VERSION` instances, i.e. items of type `VERSIONED_COMPOSITION` and `VERSIONED_FOLDER`.
   */
  List<OBJECTREF> getContributions();

  /**
   * Reference to `EHR_STATUS` object for this EHR.
   */
  ObjectRef getEhrStatus();

  /**
   * Reference to `EHR_ACCESS` object for this EHR.
   */
  ObjectRef getEhrAccess();

  /**
   * Master list of all Versioned Composition references in this EHR.
   */
  List<OBJECTREF> getCompositions();

  /**
   * Optional directory structure for this EHR. If present, this is a reference to the first member of `_folders_`.
   */
  ObjectRef getDirectory();

  /**
   * Time of creation of the EHR.
   */
  DvDateTime getTimeCreated();

  /**
   * Optional additional Folder structures for this EHR. If set, the `_directory_` attribute refers to the first member.
   */
  List<OBJECTREF> getFolders();

  /**
   * Optional list of tags associated with this EHR. Tag `_target_` values can only be within the same EHR.
   */
  List<OBJECTREF> getTags();
}
