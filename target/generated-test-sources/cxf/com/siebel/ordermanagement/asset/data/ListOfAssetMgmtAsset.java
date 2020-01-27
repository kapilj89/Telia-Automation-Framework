
package com.siebel.ordermanagement.asset.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAssetMgmt-Asset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAssetMgmt-Asset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssetMgmt-Asset" type="{http://siebel.com/OrderManagement/Asset/Data}AssetMgmt-Asset" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAssetMgmt-Asset", propOrder = {
    "assetMgmtAsset"
})
public class ListOfAssetMgmtAsset {

    @XmlElement(name = "AssetMgmt-Asset")
    protected List<AssetMgmtAsset> assetMgmtAsset;

    /**
     * Gets the value of the assetMgmtAsset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetMgmtAsset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetMgmtAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetMgmtAsset }
     * 
     * 
     */
    public List<AssetMgmtAsset> getAssetMgmtAsset() {
        if (assetMgmtAsset == null) {
            assetMgmtAsset = new ArrayList<AssetMgmtAsset>();
        }
        return this.assetMgmtAsset;
    }

}
