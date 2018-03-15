/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.aggregation.mice;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * Listing Page  *
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-03-14")
public class TPropertyWithStandardDetails implements org.apache.thrift.TBase<TPropertyWithStandardDetails, TPropertyWithStandardDetails._Fields>, java.io.Serializable, Cloneable, Comparable<TPropertyWithStandardDetails> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPropertyWithStandardDetails");

  private static final org.apache.thrift.protocol.TField COMMON_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("commonValues", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TAGS_FIELD_DESC = new org.apache.thrift.protocol.TField("tags", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField INCLUSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("inclusions", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField MAP_POINTS_FIELD_DESC = new org.apache.thrift.protocol.TField("mapPoints", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField AVAILABLE_MONTHS_FIELD_DESC = new org.apache.thrift.protocol.TField("availableMonths", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPropertyWithStandardDetailsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPropertyWithStandardDetailsTupleSchemeFactory();

  private TCommonValues commonValues; // required
  private java.util.List<java.lang.String> tags; // required
  private java.util.List<java.lang.String> inclusions; // required
  private TMapLocation mapPoints; // required
  private java.util.List<java.lang.String> availableMonths; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COMMON_VALUES((short)1, "commonValues"),
    TAGS((short)2, "tags"),
    INCLUSIONS((short)3, "inclusions"),
    MAP_POINTS((short)4, "mapPoints"),
    AVAILABLE_MONTHS((short)5, "availableMonths");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COMMON_VALUES
          return COMMON_VALUES;
        case 2: // TAGS
          return TAGS;
        case 3: // INCLUSIONS
          return INCLUSIONS;
        case 4: // MAP_POINTS
          return MAP_POINTS;
        case 5: // AVAILABLE_MONTHS
          return AVAILABLE_MONTHS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMMON_VALUES, new org.apache.thrift.meta_data.FieldMetaData("commonValues", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TCommonValues.class)));
    tmpMap.put(_Fields.TAGS, new org.apache.thrift.meta_data.FieldMetaData("tags", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.INCLUSIONS, new org.apache.thrift.meta_data.FieldMetaData("inclusions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.MAP_POINTS, new org.apache.thrift.meta_data.FieldMetaData("mapPoints", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TMapLocation.class)));
    tmpMap.put(_Fields.AVAILABLE_MONTHS, new org.apache.thrift.meta_data.FieldMetaData("availableMonths", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPropertyWithStandardDetails.class, metaDataMap);
  }

  public TPropertyWithStandardDetails() {
  }

  public TPropertyWithStandardDetails(
    TCommonValues commonValues,
    java.util.List<java.lang.String> tags,
    java.util.List<java.lang.String> inclusions,
    TMapLocation mapPoints,
    java.util.List<java.lang.String> availableMonths)
  {
    this();
    this.commonValues = commonValues;
    this.tags = tags;
    this.inclusions = inclusions;
    this.mapPoints = mapPoints;
    this.availableMonths = availableMonths;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPropertyWithStandardDetails(TPropertyWithStandardDetails other) {
    if (other.isSetCommonValues()) {
      this.commonValues = new TCommonValues(other.commonValues);
    }
    if (other.isSetTags()) {
      java.util.List<java.lang.String> __this__tags = new java.util.ArrayList<java.lang.String>(other.tags);
      this.tags = __this__tags;
    }
    if (other.isSetInclusions()) {
      java.util.List<java.lang.String> __this__inclusions = new java.util.ArrayList<java.lang.String>(other.inclusions);
      this.inclusions = __this__inclusions;
    }
    if (other.isSetMapPoints()) {
      this.mapPoints = new TMapLocation(other.mapPoints);
    }
    if (other.isSetAvailableMonths()) {
      java.util.List<java.lang.String> __this__availableMonths = new java.util.ArrayList<java.lang.String>(other.availableMonths);
      this.availableMonths = __this__availableMonths;
    }
  }

  public TPropertyWithStandardDetails deepCopy() {
    return new TPropertyWithStandardDetails(this);
  }

  @Override
  public void clear() {
    this.commonValues = null;
    this.tags = null;
    this.inclusions = null;
    this.mapPoints = null;
    this.availableMonths = null;
  }

  public TCommonValues getCommonValues() {
    return this.commonValues;
  }

  public void setCommonValues(TCommonValues commonValues) {
    this.commonValues = commonValues;
  }

  public void unsetCommonValues() {
    this.commonValues = null;
  }

  /** Returns true if field commonValues is set (has been assigned a value) and false otherwise */
  public boolean isSetCommonValues() {
    return this.commonValues != null;
  }

  public void setCommonValuesIsSet(boolean value) {
    if (!value) {
      this.commonValues = null;
    }
  }

  public int getTagsSize() {
    return (this.tags == null) ? 0 : this.tags.size();
  }

  public java.util.Iterator<java.lang.String> getTagsIterator() {
    return (this.tags == null) ? null : this.tags.iterator();
  }

  public void addToTags(java.lang.String elem) {
    if (this.tags == null) {
      this.tags = new java.util.ArrayList<java.lang.String>();
    }
    this.tags.add(elem);
  }

  public java.util.List<java.lang.String> getTags() {
    return this.tags;
  }

  public void setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
  }

  public void unsetTags() {
    this.tags = null;
  }

  /** Returns true if field tags is set (has been assigned a value) and false otherwise */
  public boolean isSetTags() {
    return this.tags != null;
  }

  public void setTagsIsSet(boolean value) {
    if (!value) {
      this.tags = null;
    }
  }

  public int getInclusionsSize() {
    return (this.inclusions == null) ? 0 : this.inclusions.size();
  }

  public java.util.Iterator<java.lang.String> getInclusionsIterator() {
    return (this.inclusions == null) ? null : this.inclusions.iterator();
  }

  public void addToInclusions(java.lang.String elem) {
    if (this.inclusions == null) {
      this.inclusions = new java.util.ArrayList<java.lang.String>();
    }
    this.inclusions.add(elem);
  }

  public java.util.List<java.lang.String> getInclusions() {
    return this.inclusions;
  }

  public void setInclusions(java.util.List<java.lang.String> inclusions) {
    this.inclusions = inclusions;
  }

  public void unsetInclusions() {
    this.inclusions = null;
  }

  /** Returns true if field inclusions is set (has been assigned a value) and false otherwise */
  public boolean isSetInclusions() {
    return this.inclusions != null;
  }

  public void setInclusionsIsSet(boolean value) {
    if (!value) {
      this.inclusions = null;
    }
  }

  public TMapLocation getMapPoints() {
    return this.mapPoints;
  }

  public void setMapPoints(TMapLocation mapPoints) {
    this.mapPoints = mapPoints;
  }

  public void unsetMapPoints() {
    this.mapPoints = null;
  }

  /** Returns true if field mapPoints is set (has been assigned a value) and false otherwise */
  public boolean isSetMapPoints() {
    return this.mapPoints != null;
  }

  public void setMapPointsIsSet(boolean value) {
    if (!value) {
      this.mapPoints = null;
    }
  }

  public int getAvailableMonthsSize() {
    return (this.availableMonths == null) ? 0 : this.availableMonths.size();
  }

  public java.util.Iterator<java.lang.String> getAvailableMonthsIterator() {
    return (this.availableMonths == null) ? null : this.availableMonths.iterator();
  }

  public void addToAvailableMonths(java.lang.String elem) {
    if (this.availableMonths == null) {
      this.availableMonths = new java.util.ArrayList<java.lang.String>();
    }
    this.availableMonths.add(elem);
  }

  public java.util.List<java.lang.String> getAvailableMonths() {
    return this.availableMonths;
  }

  public void setAvailableMonths(java.util.List<java.lang.String> availableMonths) {
    this.availableMonths = availableMonths;
  }

  public void unsetAvailableMonths() {
    this.availableMonths = null;
  }

  /** Returns true if field availableMonths is set (has been assigned a value) and false otherwise */
  public boolean isSetAvailableMonths() {
    return this.availableMonths != null;
  }

  public void setAvailableMonthsIsSet(boolean value) {
    if (!value) {
      this.availableMonths = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case COMMON_VALUES:
      if (value == null) {
        unsetCommonValues();
      } else {
        setCommonValues((TCommonValues)value);
      }
      break;

    case TAGS:
      if (value == null) {
        unsetTags();
      } else {
        setTags((java.util.List<java.lang.String>)value);
      }
      break;

    case INCLUSIONS:
      if (value == null) {
        unsetInclusions();
      } else {
        setInclusions((java.util.List<java.lang.String>)value);
      }
      break;

    case MAP_POINTS:
      if (value == null) {
        unsetMapPoints();
      } else {
        setMapPoints((TMapLocation)value);
      }
      break;

    case AVAILABLE_MONTHS:
      if (value == null) {
        unsetAvailableMonths();
      } else {
        setAvailableMonths((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COMMON_VALUES:
      return getCommonValues();

    case TAGS:
      return getTags();

    case INCLUSIONS:
      return getInclusions();

    case MAP_POINTS:
      return getMapPoints();

    case AVAILABLE_MONTHS:
      return getAvailableMonths();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case COMMON_VALUES:
      return isSetCommonValues();
    case TAGS:
      return isSetTags();
    case INCLUSIONS:
      return isSetInclusions();
    case MAP_POINTS:
      return isSetMapPoints();
    case AVAILABLE_MONTHS:
      return isSetAvailableMonths();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TPropertyWithStandardDetails)
      return this.equals((TPropertyWithStandardDetails)that);
    return false;
  }

  public boolean equals(TPropertyWithStandardDetails that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_commonValues = true && this.isSetCommonValues();
    boolean that_present_commonValues = true && that.isSetCommonValues();
    if (this_present_commonValues || that_present_commonValues) {
      if (!(this_present_commonValues && that_present_commonValues))
        return false;
      if (!this.commonValues.equals(that.commonValues))
        return false;
    }

    boolean this_present_tags = true && this.isSetTags();
    boolean that_present_tags = true && that.isSetTags();
    if (this_present_tags || that_present_tags) {
      if (!(this_present_tags && that_present_tags))
        return false;
      if (!this.tags.equals(that.tags))
        return false;
    }

    boolean this_present_inclusions = true && this.isSetInclusions();
    boolean that_present_inclusions = true && that.isSetInclusions();
    if (this_present_inclusions || that_present_inclusions) {
      if (!(this_present_inclusions && that_present_inclusions))
        return false;
      if (!this.inclusions.equals(that.inclusions))
        return false;
    }

    boolean this_present_mapPoints = true && this.isSetMapPoints();
    boolean that_present_mapPoints = true && that.isSetMapPoints();
    if (this_present_mapPoints || that_present_mapPoints) {
      if (!(this_present_mapPoints && that_present_mapPoints))
        return false;
      if (!this.mapPoints.equals(that.mapPoints))
        return false;
    }

    boolean this_present_availableMonths = true && this.isSetAvailableMonths();
    boolean that_present_availableMonths = true && that.isSetAvailableMonths();
    if (this_present_availableMonths || that_present_availableMonths) {
      if (!(this_present_availableMonths && that_present_availableMonths))
        return false;
      if (!this.availableMonths.equals(that.availableMonths))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCommonValues()) ? 131071 : 524287);
    if (isSetCommonValues())
      hashCode = hashCode * 8191 + commonValues.hashCode();

    hashCode = hashCode * 8191 + ((isSetTags()) ? 131071 : 524287);
    if (isSetTags())
      hashCode = hashCode * 8191 + tags.hashCode();

    hashCode = hashCode * 8191 + ((isSetInclusions()) ? 131071 : 524287);
    if (isSetInclusions())
      hashCode = hashCode * 8191 + inclusions.hashCode();

    hashCode = hashCode * 8191 + ((isSetMapPoints()) ? 131071 : 524287);
    if (isSetMapPoints())
      hashCode = hashCode * 8191 + mapPoints.hashCode();

    hashCode = hashCode * 8191 + ((isSetAvailableMonths()) ? 131071 : 524287);
    if (isSetAvailableMonths())
      hashCode = hashCode * 8191 + availableMonths.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TPropertyWithStandardDetails other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCommonValues()).compareTo(other.isSetCommonValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommonValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.commonValues, other.commonValues);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTags()).compareTo(other.isSetTags());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTags()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tags, other.tags);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetInclusions()).compareTo(other.isSetInclusions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInclusions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inclusions, other.inclusions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMapPoints()).compareTo(other.isSetMapPoints());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMapPoints()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mapPoints, other.mapPoints);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAvailableMonths()).compareTo(other.isSetAvailableMonths());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAvailableMonths()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.availableMonths, other.availableMonths);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPropertyWithStandardDetails(");
    boolean first = true;

    sb.append("commonValues:");
    if (this.commonValues == null) {
      sb.append("null");
    } else {
      sb.append(this.commonValues);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tags:");
    if (this.tags == null) {
      sb.append("null");
    } else {
      sb.append(this.tags);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("inclusions:");
    if (this.inclusions == null) {
      sb.append("null");
    } else {
      sb.append(this.inclusions);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mapPoints:");
    if (this.mapPoints == null) {
      sb.append("null");
    } else {
      sb.append(this.mapPoints);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("availableMonths:");
    if (this.availableMonths == null) {
      sb.append("null");
    } else {
      sb.append(this.availableMonths);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (commonValues != null) {
      commonValues.validate();
    }
    if (mapPoints != null) {
      mapPoints.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TPropertyWithStandardDetailsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPropertyWithStandardDetailsStandardScheme getScheme() {
      return new TPropertyWithStandardDetailsStandardScheme();
    }
  }

  private static class TPropertyWithStandardDetailsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPropertyWithStandardDetails> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPropertyWithStandardDetails struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMMON_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.commonValues = new TCommonValues();
              struct.commonValues.read(iprot);
              struct.setCommonValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TAGS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.tags = new java.util.ArrayList<java.lang.String>(_list16.size);
                java.lang.String _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = iprot.readString();
                  struct.tags.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setTagsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INCLUSIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list19 = iprot.readListBegin();
                struct.inclusions = new java.util.ArrayList<java.lang.String>(_list19.size);
                java.lang.String _elem20;
                for (int _i21 = 0; _i21 < _list19.size; ++_i21)
                {
                  _elem20 = iprot.readString();
                  struct.inclusions.add(_elem20);
                }
                iprot.readListEnd();
              }
              struct.setInclusionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MAP_POINTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.mapPoints = new TMapLocation();
              struct.mapPoints.read(iprot);
              struct.setMapPointsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // AVAILABLE_MONTHS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list22 = iprot.readListBegin();
                struct.availableMonths = new java.util.ArrayList<java.lang.String>(_list22.size);
                java.lang.String _elem23;
                for (int _i24 = 0; _i24 < _list22.size; ++_i24)
                {
                  _elem23 = iprot.readString();
                  struct.availableMonths.add(_elem23);
                }
                iprot.readListEnd();
              }
              struct.setAvailableMonthsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPropertyWithStandardDetails struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.commonValues != null) {
        oprot.writeFieldBegin(COMMON_VALUES_FIELD_DESC);
        struct.commonValues.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.tags != null) {
        oprot.writeFieldBegin(TAGS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.tags.size()));
          for (java.lang.String _iter25 : struct.tags)
          {
            oprot.writeString(_iter25);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.inclusions != null) {
        oprot.writeFieldBegin(INCLUSIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.inclusions.size()));
          for (java.lang.String _iter26 : struct.inclusions)
          {
            oprot.writeString(_iter26);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.mapPoints != null) {
        oprot.writeFieldBegin(MAP_POINTS_FIELD_DESC);
        struct.mapPoints.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.availableMonths != null) {
        oprot.writeFieldBegin(AVAILABLE_MONTHS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.availableMonths.size()));
          for (java.lang.String _iter27 : struct.availableMonths)
          {
            oprot.writeString(_iter27);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPropertyWithStandardDetailsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPropertyWithStandardDetailsTupleScheme getScheme() {
      return new TPropertyWithStandardDetailsTupleScheme();
    }
  }

  private static class TPropertyWithStandardDetailsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPropertyWithStandardDetails> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPropertyWithStandardDetails struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCommonValues()) {
        optionals.set(0);
      }
      if (struct.isSetTags()) {
        optionals.set(1);
      }
      if (struct.isSetInclusions()) {
        optionals.set(2);
      }
      if (struct.isSetMapPoints()) {
        optionals.set(3);
      }
      if (struct.isSetAvailableMonths()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetCommonValues()) {
        struct.commonValues.write(oprot);
      }
      if (struct.isSetTags()) {
        {
          oprot.writeI32(struct.tags.size());
          for (java.lang.String _iter28 : struct.tags)
          {
            oprot.writeString(_iter28);
          }
        }
      }
      if (struct.isSetInclusions()) {
        {
          oprot.writeI32(struct.inclusions.size());
          for (java.lang.String _iter29 : struct.inclusions)
          {
            oprot.writeString(_iter29);
          }
        }
      }
      if (struct.isSetMapPoints()) {
        struct.mapPoints.write(oprot);
      }
      if (struct.isSetAvailableMonths()) {
        {
          oprot.writeI32(struct.availableMonths.size());
          for (java.lang.String _iter30 : struct.availableMonths)
          {
            oprot.writeString(_iter30);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPropertyWithStandardDetails struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.commonValues = new TCommonValues();
        struct.commonValues.read(iprot);
        struct.setCommonValuesIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list31 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.tags = new java.util.ArrayList<java.lang.String>(_list31.size);
          java.lang.String _elem32;
          for (int _i33 = 0; _i33 < _list31.size; ++_i33)
          {
            _elem32 = iprot.readString();
            struct.tags.add(_elem32);
          }
        }
        struct.setTagsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list34 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.inclusions = new java.util.ArrayList<java.lang.String>(_list34.size);
          java.lang.String _elem35;
          for (int _i36 = 0; _i36 < _list34.size; ++_i36)
          {
            _elem35 = iprot.readString();
            struct.inclusions.add(_elem35);
          }
        }
        struct.setInclusionsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.mapPoints = new TMapLocation();
        struct.mapPoints.read(iprot);
        struct.setMapPointsIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.availableMonths = new java.util.ArrayList<java.lang.String>(_list37.size);
          java.lang.String _elem38;
          for (int _i39 = 0; _i39 < _list37.size; ++_i39)
          {
            _elem38 = iprot.readString();
            struct.availableMonths.add(_elem38);
          }
        }
        struct.setAvailableMonthsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

