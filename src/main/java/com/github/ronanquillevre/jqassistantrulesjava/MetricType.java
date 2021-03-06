//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.25 at 05:35:33 PM GMT 
//


package com.github.ronanquillevre.jqassistantrulesjava;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for metricType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metricType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.buschmais.com/jqassistant/core/analysis/rules/schema/v1.0}referenceableType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requiresConcept" type="{http://www.buschmais.com/jqassistant/core/analysis/rules/schema/v1.0}referenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cypher" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="parameterDefinition" type="{http://www.buschmais.com/jqassistant/core/analysis/rules/schema/v1.0}parameterDefinitionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metricType", propOrder = {
    "description",
    "requiresConcept",
    "cypher",
    "parameterDefinition"
})
public class MetricType
    extends ReferenceableType
{

    protected String description;
    protected List<ReferenceType> requiresConcept;
    @XmlElement(required = true)
    protected String cypher;
    protected List<ParameterDefinitionType> parameterDefinition;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the requiresConcept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiresConcept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiresConcept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getRequiresConcept() {
        if (requiresConcept == null) {
            requiresConcept = new ArrayList<ReferenceType>();
        }
        return this.requiresConcept;
    }

    /**
     * Gets the value of the cypher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCypher() {
        return cypher;
    }

    /**
     * Sets the value of the cypher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCypher(String value) {
        this.cypher = value;
    }

    /**
     * Gets the value of the parameterDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterDefinitionType }
     * 
     * 
     */
    public List<ParameterDefinitionType> getParameterDefinition() {
        if (parameterDefinition == null) {
            parameterDefinition = new ArrayList<ParameterDefinitionType>();
        }
        return this.parameterDefinition;
    }

}
