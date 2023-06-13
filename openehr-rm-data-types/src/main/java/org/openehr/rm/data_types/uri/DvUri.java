package org.openehr.rm.data_types.uri;

import org.openehr.rm.data_types.basic.DataValue;

/**
 * A reference to an object which structurally conforms to the Universal Resource Identifier (URI) RFC-3986 standard. The reference is contained in the `_value_` attribute, which is a `String`. So-called 'plain-text URIs' that contain RFC-3986 forbidden characters such as spaces etc, are allowed on the basis that they need to be RFC-3986 encoded prior to use in e.g. REST APIs or other contexts relying on machine-level conformance.
 */
public interface DvUri extends DataValue {
  /**
   * Value of URI as a String. 'Plain-text' URIs are allowed, enabling better readability, but must be RFC-3986 encoded in use.
   */
  String getValue();

  /**
   * A distributed information 'space' in which  information objects  exist. The scheme simultaneously specifies an information space and a mechanism for accessing objects in  that  space.  For  example  if  scheme  = "ftp", it identifies the information space in which  all  ftp-able objects  exist,  and also the application - ftp - which can be used to access them. Values may include: "ftp", "telnet", "mailto", etc. Refer to RFC-3986 for a full list.
   */
  String scheme();

  /**
   * A string whose format is  a  function  of  the  scheme. Identifies   the   location  in  <scheme>-space  of  an information entity. Typical values include hierarchical directory  paths  for  any  machine.  For example, with scheme = "ftp", path might be `"/pub/images/image_01"`. The strings "." and ".." are reserved for use in the path. Paths may include internet/intranet location identifiers of the form: `sub_domain...domain`, e.g. `"info.cern.ch"`.
   */
  String path();

  /**
   * A part of, a  fragment  or  a  sub-function  within  an object. Allows references to sub-parts of objects, such as a certain line and character  position  in  a  text object. The  syntax  and semantics are defined by the application responsible for the object.
   */
  String fragmentId();

  /**
   * Query string to send to application implied  by  scheme and  path.  Enables  queries  to applications, including databases  to  be  included in  the  URI. Supports any query meaningful to the server, including SQL.
   */
  String query();
}
