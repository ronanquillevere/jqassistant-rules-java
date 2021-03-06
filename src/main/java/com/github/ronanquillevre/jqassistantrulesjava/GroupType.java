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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for groupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="groupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.buschmais.com/jqassistant/core/analysis/rules/schema/v1.0}referenceableType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="includeConcept" type="{http://www.buschmais.com/jqassistant/core/analysis/rules/schema/v1.0}includedReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="includeConstraint" type="{http://www.buschmais.com/jqassistant/core/analysis/rules/schema/v1.0}includedReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="includeGroup" type="{http://www.buschmais.com/jqassistant/core/analysis/rules/schema/v1.0}referenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "groupType", propOrder = {
    "includeConcept",
    "includeConstraint",
    "includeGroup"
})
public class GroupType
    extends ReferenceableType
{

    protected List<IncludedReferenceType> includeConcept;
    protected List<IncludedReferenceType> includeConstraint;
    protected List<ReferenceType> includeGroup;

    /**
     * Gets the value of the includeConcept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeConcept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeConcept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncludedReferenceType }
     * 
     * 
     */
    public List<IncludedReferenceType> getIncludeConcept() {
        if (includeConcept == null) {
            includeConcept = new ArrayList<IncludedReferenceType>();
        }
        return this.includeConcept;
    }

    /**
     * Gets the value of the includeConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncludedReferenceType }
     * 
     * 
     */
    public List<IncludedReferenceType> getIncludeConstraint() {
        if (includeConstraint == null) {
            includeConstraint = new ArrayList<IncludedReferenceType>();
        }
        return this.includeConstraint;
    }

    /**
     * Gets the value of the includeGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getIncludeGroup() {
        if (includeGroup == null) {
            includeGroup = new ArrayList<ReferenceType>();
        }
        return this.includeGroup;
    }

}
