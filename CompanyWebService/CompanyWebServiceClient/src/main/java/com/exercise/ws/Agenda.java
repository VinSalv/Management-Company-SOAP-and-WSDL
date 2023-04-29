/**
 * Agenda.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.exercise.ws;

public class Agenda  implements java.io.Serializable {
    private java.util.HashMap mapProperty;

    public Agenda() {
    }

    public Agenda(
           java.util.HashMap mapProperty) {
           this.mapProperty = mapProperty;
    }


    /**
     * Gets the mapProperty value for this Agenda.
     * 
     * @return mapProperty
     */
    public java.util.HashMap getMapProperty() {
        return mapProperty;
    }


    /**
     * Sets the mapProperty value for this Agenda.
     * 
     * @param mapProperty
     */
    public void setMapProperty(java.util.HashMap mapProperty) {
        this.mapProperty = mapProperty;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Agenda)) return false;
        Agenda other = (Agenda) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mapProperty==null && other.getMapProperty()==null) || 
             (this.mapProperty!=null &&
              this.mapProperty.equals(other.getMapProperty())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMapProperty() != null) {
            _hashCode += getMapProperty().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Agenda.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.exercise.com", "Agenda"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.exercise.com", "mapProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
