
package com.siebel.ordermanagement.asset.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAssetMgmt-AssetXa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAssetMgmt-AssetXa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssetMgmt-AssetXa" type="{http://siebel.com/OrderManagement/Asset/Data}AssetMgmt-AssetXa" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAssetMgmt-AssetXa", propOrder = {
    "assetMgmtAssetXa"
})
public class ListOfAssetMgmtAssetXa {

    @XmlElement(name = "AssetMgmt-AssetXa")
    protected List<AssetMgmtAssetXa> assetMgmtAssetXa;

    /**
     * Gets the value of the assetMgmtAssetXa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetMgmtAssetXa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetMgmtAssetXa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetMgmtAssetXa }
     * 
     * 
     */
    public List<AssetMgmtAssetXa> getAssetMgmtAssetXa() {
        if (assetMgmtAssetXa == null) {
            assetMgmtAssetXa = new ArrayList<AssetMgmtAssetXa>();
        }
        return this.assetMgmtAssetXa;
    }

}
