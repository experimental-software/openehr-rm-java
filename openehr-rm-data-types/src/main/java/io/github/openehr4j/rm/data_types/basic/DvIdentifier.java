package io.github.openehr4j.rm.data_types.basic;

public interface DvIdentifier extends DataValue {

  String getIssuer();

  String getAssigner();

  String getId();

  String getType();
}