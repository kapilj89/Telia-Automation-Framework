
package com.siebel.xml.tsswicustomerpartyio_lw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.xml.tsswicustomerpartyio_lw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListOfSwicustomerpartyioLw_QNAME = new QName("http://www.siebel.com/xml/TSSWICustomerPartyIO_LW", "ListOfSwicustomerpartyio_lw");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.xml.tsswicustomerpartyio_lw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfSwicustomerpartyioLw }
     * 
     */
    public ListOfSwicustomerpartyioLw createListOfSwicustomerpartyioLw() {
        return new ListOfSwicustomerpartyioLw();
    }

    /**
     * Create an instance of {@link ListOfSwicustomerpartyioLwTopElmt }
     * 
     */
    public ListOfSwicustomerpartyioLwTopElmt createListOfSwicustomerpartyioLwTopElmt() {
        return new ListOfSwicustomerpartyioLwTopElmt();
    }

    /**
     * Create an instance of {@link Accounts }
     * 
     */
    public Accounts createAccounts() {
        return new Accounts();
    }

    /**
     * Create an instance of {@link ListOfAccountContacts }
     * 
     */
    public ListOfAccountContacts createListOfAccountContacts() {
        return new ListOfAccountContacts();
    }

    /**
     * Create an instance of {@link AccountContacts }
     * 
     */
    public AccountContacts createAccountContacts() {
        return new AccountContacts();
    }

    /**
     * Create an instance of {@link ListOfCutAddresses }
     * 
     */
    public ListOfCutAddresses createListOfCutAddresses() {
        return new ListOfCutAddresses();
    }

    /**
     * Create an instance of {@link CutAddresses }
     * 
     */
    public CutAddresses createCutAddresses() {
        return new CutAddresses();
    }

    /**
     * Create an instance of {@link ListOfContacts }
     * 
     */
    public ListOfContacts createListOfContacts() {
        return new ListOfContacts();
    }

    /**
     * Create an instance of {@link Contacts }
     * 
     */
    public Contacts createContacts() {
        return new Contacts();
    }

    /**
     * Create an instance of {@link ListOfInternalDivisions }
     * 
     */
    public ListOfInternalDivisions createListOfInternalDivisions() {
        return new ListOfInternalDivisions();
    }

    /**
     * Create an instance of {@link InternalDivisions }
     * 
     */
    public InternalDivisions createInternalDivisions() {
        return new InternalDivisions();
    }

    /**
     * Create an instance of {@link ListOfComInvoiceProfiles }
     * 
     */
    public ListOfComInvoiceProfiles createListOfComInvoiceProfiles() {
        return new ListOfComInvoiceProfiles();
    }

    /**
     * Create an instance of {@link ComInvoiceProfiles }
     * 
     */
    public ComInvoiceProfiles createComInvoiceProfiles() {
        return new ComInvoiceProfiles();
    }

    /**
     * Create an instance of {@link ListOfAccountBusinessAddresses }
     * 
     */
    public ListOfAccountBusinessAddresses createListOfAccountBusinessAddresses() {
        return new ListOfAccountBusinessAddresses();
    }

    /**
     * Create an instance of {@link AccountBusinessAddresses }
     * 
     */
    public AccountBusinessAddresses createAccountBusinessAddresses() {
        return new AccountBusinessAddresses();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSwicustomerpartyioLw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/TSSWICustomerPartyIO_LW", name = "ListOfSwicustomerpartyio_lw")
    public JAXBElement<ListOfSwicustomerpartyioLw> createListOfSwicustomerpartyioLw(ListOfSwicustomerpartyioLw value) {
        return new JAXBElement<ListOfSwicustomerpartyioLw>(_ListOfSwicustomerpartyioLw_QNAME, ListOfSwicustomerpartyioLw.class, null, value);
    }

}
