
package com.siebel.xml.asset_management_complex_io.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for queryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="sortorder" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sortsequence" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryType", propOrder = {
    "value"
})
public class QueryType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "sortorder")
    protected String sortorder;
    @XmlAttribute(name = "sortsequence")
    protected String sortsequence;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the sortorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortorder() {
        return sortorder;
    }

    /**
     * Sets the value of the sortorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortorder(String value) {
        this.sortorder = value;
    }

    /**
     * Gets the value of the sortsequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortsequence() {
        return sortsequence;
    }

    /**
     * Sets the value of the sortsequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortsequence(String value) {
        this.sortsequence = value;
    }

}
