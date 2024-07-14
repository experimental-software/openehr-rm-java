package io.github.openehr4j.rm.common.archetyped;

import java.util.List;

import io.github.openehr4j.rm.data_types.encapsulated.DvEncapsulated;

public interface FeederAudit {

  List getOriginatingSystemItemIds();

  List getFeederSystemItemIds();

  DvEncapsulated getOriginalContent();

  FeederAuditDetails getOriginatingSystemAudit();

  FeederAuditDetails getFeederSystemAudit();
}