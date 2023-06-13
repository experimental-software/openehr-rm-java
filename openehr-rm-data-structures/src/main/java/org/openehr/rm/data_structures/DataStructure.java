package org.openehr.rm.data_structures;

import org.openehr.rm.data_structures.representation.Item;

import com.sun.jdi.Locatable;

/**
 * Abstract parent class of all data structure types. Includes the `_as_hierarchy_` function which can generate the equivalent CEN EN13606 single hierarchy for each subtype's physical representation. For example, the physical representation of an `ITEM_LIST` is `List<ELEMENT>`; its implementation of `_as_hierarchy_` will generate a `CLUSTER` containing the set of `ELEMENT` nodes from the list.
 */
public interface DataStructure extends Locatable {
  /**
   * Hierarchical equivalent of the physical representation of each subtype, compatible with CEN EN 13606 structures.
   */
  Item asHierarchy();
}
