//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.25 at 05:35:33 PM GMT 
//


package com.github.ronanquillevre.jqassistantrulesjava;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="rowCount" type="{http://www.buschmais.com/jqassistant/core/analysis/rules/schema/v1.0}rowCountVerificationType"/&gt;
 *         &lt;element name="aggregation" type="{http://www.buschmais.com/jqassistant/core/analysis/rules/schema/v1.0}aggregationVerificationType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificationType", propOrder = {
    "rowCount",
    "aggregation"
})
public class VerificationType {

    protected RowCountVerificationType rowCount;
    protected AggregationVerificationType aggregation;

    /**
     * Gets the value of the rowCount property.
     * 
     * @return
     *     possible object is
     *     {@link RowCountVerificationType }
     *     
     */
    public RowCountVerificationType getRowCount() {
        return rowCount;
    }

    /**
     * Sets the value of the rowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowCountVerificationType }
     *     
     */
    public void setRowCount(RowCountVerificationType value) {
        this.rowCount = value;
    }

    /**
     * Gets the value of the aggregation property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationVerificationType }
     *     
     */
    public AggregationVerificationType getAggregation() {
        return aggregation;
    }

    /**
     * Sets the value of the aggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationVerificationType }
     *     
     */
    public void setAggregation(AggregationVerificationType value) {
        this.aggregation = value;
    }

}
