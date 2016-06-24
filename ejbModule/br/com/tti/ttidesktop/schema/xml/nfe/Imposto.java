package br.com.tti.ttidesktop.schema.xml.nfe;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de anonymous complex type.
 * 
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vTotTrib" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="ICMS">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;choice>
 *                       &lt;element name="ICMS00">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="00"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="modBC">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="0"/>
 *                                       &lt;enumeration value="1"/>
 *                                       &lt;enumeration value="2"/>
 *                                       &lt;enumeration value="3"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMS10">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="10"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="modBC">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="0"/>
 *                                       &lt;enumeration value="1"/>
 *                                       &lt;enumeration value="2"/>
 *                                       &lt;enumeration value="3"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="modBCST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="0"/>
 *                                       &lt;enumeration value="1"/>
 *                                       &lt;enumeration value="2"/>
 *                                       &lt;enumeration value="3"/>
 *                                       &lt;enumeration value="4"/>
 *                                       &lt;enumeration value="5"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                 &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                 &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMS20">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="20"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="modBC">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="0"/>
 *                                       &lt;enumeration value="1"/>
 *                                       &lt;enumeration value="2"/>
 *                                       &lt;enumeration value="3"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;sequence minOccurs="0">
 *                                   &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                   &lt;element name="motDesICMS">
 *                                     &lt;simpleType>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                         &lt;whiteSpace value="preserve"/>
 *                                         &lt;enumeration value="3"/>
 *                                         &lt;enumeration value="9"/>
 *                                         &lt;enumeration value="12"/>
 *                                       &lt;/restriction>
 *                                     &lt;/simpleType>
 *                                   &lt;/element>
 *                                 &lt;/sequence>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMS30">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="30"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="modBCST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="0"/>
 *                                       &lt;enumeration value="1"/>
 *                                       &lt;enumeration value="2"/>
 *                                       &lt;enumeration value="3"/>
 *                                       &lt;enumeration value="4"/>
 *                                       &lt;enumeration value="5"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                 &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                 &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;sequence minOccurs="0">
 *                                   &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                   &lt;element name="motDesICMS">
 *                                     &lt;simpleType>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                         &lt;whiteSpace value="preserve"/>
 *                                         &lt;enumeration value="6"/>
 *                                         &lt;enumeration value="7"/>
 *                                         &lt;enumeration value="9"/>
 *                                       &lt;/restriction>
 *                                     &lt;/simpleType>
 *                                   &lt;/element>
 *                                 &lt;/sequence>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMS40">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="40"/>
 *                                       &lt;enumeration value="41"/>
 *                                       &lt;enumeration value="50"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;sequence minOccurs="0">
 *                                   &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                   &lt;element name="motDesICMS">
 *                                     &lt;simpleType>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                         &lt;whiteSpace value="preserve"/>
 *                                         &lt;enumeration value="1"/>
 *                                         &lt;enumeration value="3"/>
 *                                         &lt;enumeration value="4"/>
 *                                         &lt;enumeration value="5"/>
 *                                         &lt;enumeration value="6"/>
 *                                         &lt;enumeration value="7"/>
 *                                         &lt;enumeration value="8"/>
 *                                         &lt;enumeration value="9"/>
 *                                         &lt;enumeration value="10"/>
 *                                         &lt;enumeration value="11"/>
 *                                         &lt;enumeration value="16"/>
 *                                       &lt;/restriction>
 *                                     &lt;/simpleType>
 *                                   &lt;/element>
 *                                 &lt;/sequence>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMS51">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="51"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="modBC" minOccurs="0">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="0"/>
 *                                       &lt;enumeration value="1"/>
 *                                       &lt;enumeration value="2"/>
 *                                       &lt;enumeration value="3"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04" minOccurs="0"/>
 *                                 &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *                                 &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04" minOccurs="0"/>
 *                                 &lt;element name="vICMSOp" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *                                 &lt;element name="pDif" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Max100" minOccurs="0"/>
 *                                 &lt;element name="vICMSDif" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *                                 &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMS60">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="60"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;sequence minOccurs="0">
 *                                   &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                   &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;/sequence>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMS70">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="70"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="modBC">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="0"/>
 *                                       &lt;enumeration value="1"/>
 *                                       &lt;enumeration value="2"/>
 *                                       &lt;enumeration value="3"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="modBCST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="0"/>
 *                                       &lt;enumeration value="1"/>
 *                                       &lt;enumeration value="2"/>
 *                                       &lt;enumeration value="3"/>
 *                                       &lt;enumeration value="4"/>
 *                                       &lt;enumeration value="5"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                 &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                 &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;sequence minOccurs="0">
 *                                   &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                   &lt;element name="motDesICMS">
 *                                     &lt;simpleType>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                         &lt;whiteSpace value="preserve"/>
 *                                         &lt;enumeration value="3"/>
 *                                         &lt;enumeration value="9"/>
 *                                         &lt;enumeration value="12"/>
 *                                       &lt;/restriction>
 *                                     &lt;/simpleType>
 *                                   &lt;/element>
 *                                 &lt;/sequence>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMS90">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="90"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;sequence minOccurs="0">
 *                                   &lt;element name="modBC">
 *                                     &lt;simpleType>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                         &lt;whiteSpace value="preserve"/>
 *                                         &lt;enumeration value="0"/>
 *                                         &lt;enumeration value="1"/>
 *                                         &lt;enumeration value="2"/>
 *                                         &lt;enumeration value="3"/>
 *                                       &lt;/restriction>
 *                                     &lt;/simpleType>
 *                                   &lt;/element>
 *                                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                   &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;/sequence>
 *                                 &lt;sequence minOccurs="0">
 *                                   &lt;element name="modBCST">
 *                                     &lt;simpleType>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                         &lt;whiteSpace value="preserve"/>
 *                                         &lt;enumeration value="0"/>
 *                                         &lt;enumeration value="1"/>
 *                                         &lt;enumeration value="2"/>
 *                                         &lt;enumeration value="3"/>
 *                                         &lt;enumeration value="4"/>
 *                                         &lt;enumeration value="5"/>
 *                                       &lt;/restriction>
 *                                     &lt;/simpleType>
 *                                   &lt;/element>
 *                                   &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                   &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                   &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                   &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                   &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;/sequence>
 *                                 &lt;sequence minOccurs="0">
 *                                   &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                   &lt;element name="motDesICMS">
 *                                     &lt;simpleType>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                         &lt;whiteSpace value="preserve"/>
 *                                         &lt;enumeration value="3"/>
 *                                         &lt;enumeration value="9"/>
 *                                         &lt;enumeration value="12"/>
 *                                       &lt;/restriction>
 *                                     &lt;/simpleType>
 *                                   &lt;/element>
 *                                 &lt;/sequence>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMSPart">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="10"/>
 *                                       &lt;enumeration value="90"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="modBC">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="0"/>
 *                                       &lt;enumeration value="1"/>
 *                                       &lt;enumeration value="2"/>
 *                                       &lt;enumeration value="3"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                 &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="modBCST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="0"/>
 *                                       &lt;enumeration value="1"/>
 *                                       &lt;enumeration value="2"/>
 *                                       &lt;enumeration value="3"/>
 *                                       &lt;enumeration value="4"/>
 *                                       &lt;enumeration value="5"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                 &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                 &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pBCOp" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
 *                                 &lt;element name="UFST" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMSST">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="41"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="vBCSTDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="vICMSSTDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMSSN101">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CSOSN">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="101"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="pCredSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vCredICMSSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMSSN102">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CSOSN">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="102"/>
 *                                       &lt;enumeration value="103"/>
 *                                       &lt;enumeration value="300"/>
 *                                       &lt;enumeration value="400"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMSSN201">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CSOSN">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="201"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="modBCST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="0"/>
 *                                       &lt;enumeration value="1"/>
 *                                       &lt;enumeration value="2"/>
 *                                       &lt;enumeration value="3"/>
 *                                       &lt;enumeration value="4"/>
 *                                       &lt;enumeration value="5"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                 &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                 &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pCredSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vCredICMSSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMSSN202">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CSOSN">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="202"/>
 *                                       &lt;enumeration value="203"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="modBCST">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="0"/>
 *                                       &lt;enumeration value="1"/>
 *                                       &lt;enumeration value="2"/>
 *                                       &lt;enumeration value="3"/>
 *                                       &lt;enumeration value="4"/>
 *                                       &lt;enumeration value="5"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                 &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                 &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMSSN500">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CSOSN">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="500"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;sequence minOccurs="0">
 *                                   &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                   &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;/sequence>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ICMSSN900">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                 &lt;element name="CSOSN">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="900"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;sequence minOccurs="0">
 *                                   &lt;element name="modBC">
 *                                     &lt;simpleType>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                         &lt;whiteSpace value="preserve"/>
 *                                         &lt;enumeration value="0"/>
 *                                         &lt;enumeration value="1"/>
 *                                         &lt;enumeration value="2"/>
 *                                         &lt;enumeration value="3"/>
 *                                       &lt;/restriction>
 *                                     &lt;/simpleType>
 *                                   &lt;/element>
 *                                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                   &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;/sequence>
 *                                 &lt;sequence minOccurs="0">
 *                                   &lt;element name="modBCST">
 *                                     &lt;simpleType>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                         &lt;whiteSpace value="preserve"/>
 *                                         &lt;enumeration value="0"/>
 *                                         &lt;enumeration value="1"/>
 *                                         &lt;enumeration value="2"/>
 *                                         &lt;enumeration value="3"/>
 *                                         &lt;enumeration value="4"/>
 *                                         &lt;enumeration value="5"/>
 *                                       &lt;/restriction>
 *                                     &lt;/simpleType>
 *                                   &lt;/element>
 *                                   &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                   &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                   &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                   &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                   &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;/sequence>
 *                                 &lt;sequence minOccurs="0">
 *                                   &lt;element name="pCredSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                   &lt;element name="vCredICMSSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;/sequence>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/choice>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="IPI" type="{http://www.portalfiscal.inf.br/nfe}TIpi" minOccurs="0"/>
 *             &lt;element name="II" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                       &lt;element name="vDespAdu" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                       &lt;element name="vII" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                       &lt;element name="vIOF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="IPI" type="{http://www.portalfiscal.inf.br/nfe}TIpi" minOccurs="0"/>
 *             &lt;element name="ISSQN">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                       &lt;element name="vAliq" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                       &lt;element name="vISSQN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                       &lt;element name="cMunFG" type="{http://www.portalfiscal.inf.br/nfe}TCodMunIBGE"/>
 *                       &lt;element name="cListServ" type="{http://www.portalfiscal.inf.br/nfe}TCListServ"/>
 *                       &lt;element name="vDeducao" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                       &lt;element name="vOutro" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                       &lt;element name="vDescIncond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                       &lt;element name="vDescCond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                       &lt;element name="vISSRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                       &lt;element name="indISS">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                             &lt;whiteSpace value="preserve"/>
 *                             &lt;enumeration value="1"/>
 *                             &lt;enumeration value="2"/>
 *                             &lt;enumeration value="3"/>
 *                             &lt;enumeration value="4"/>
 *                             &lt;enumeration value="5"/>
 *                             &lt;enumeration value="6"/>
 *                             &lt;enumeration value="7"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                       &lt;element name="cServico" minOccurs="0">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                             &lt;whiteSpace value="preserve"/>
 *                             &lt;minLength value="1"/>
 *                             &lt;maxLength value="20"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                       &lt;element name="cMun" type="{http://www.portalfiscal.inf.br/nfe}TCodMunIBGE" minOccurs="0"/>
 *                       &lt;element name="cPais" minOccurs="0">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                             &lt;whiteSpace value="preserve"/>
 *                             &lt;pattern value="[0-9]{1,4}"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                       &lt;element name="nProcesso" minOccurs="0">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                             &lt;whiteSpace value="preserve"/>
 *                             &lt;minLength value="1"/>
 *                             &lt;maxLength value="30"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                       &lt;element name="indIncentivo">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                             &lt;whiteSpace value="preserve"/>
 *                             &lt;enumeration value="1"/>
 *                             &lt;enumeration value="2"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="PIS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="PISAliq">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CST">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="01"/>
 *                                   &lt;enumeration value="02"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                             &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                             &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PISQtde">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CST">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="03"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
 *                             &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
 *                             &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PISNT">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CST">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="04"/>
 *                                   &lt;enumeration value="05"/>
 *                                   &lt;enumeration value="06"/>
 *                                   &lt;enumeration value="07"/>
 *                                   &lt;enumeration value="08"/>
 *                                   &lt;enumeration value="09"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PISOutr">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CST">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="49"/>
 *                                   &lt;enumeration value="50"/>
 *                                   &lt;enumeration value="51"/>
 *                                   &lt;enumeration value="52"/>
 *                                   &lt;enumeration value="53"/>
 *                                   &lt;enumeration value="54"/>
 *                                   &lt;enumeration value="55"/>
 *                                   &lt;enumeration value="56"/>
 *                                   &lt;enumeration value="60"/>
 *                                   &lt;enumeration value="61"/>
 *                                   &lt;enumeration value="62"/>
 *                                   &lt;enumeration value="63"/>
 *                                   &lt;enumeration value="64"/>
 *                                   &lt;enumeration value="65"/>
 *                                   &lt;enumeration value="66"/>
 *                                   &lt;enumeration value="67"/>
 *                                   &lt;enumeration value="70"/>
 *                                   &lt;enumeration value="71"/>
 *                                   &lt;enumeration value="72"/>
 *                                   &lt;enumeration value="73"/>
 *                                   &lt;enumeration value="74"/>
 *                                   &lt;enumeration value="75"/>
 *                                   &lt;enumeration value="98"/>
 *                                   &lt;enumeration value="99"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;choice>
 *                               &lt;sequence>
 *                                 &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                               &lt;/sequence>
 *                               &lt;sequence>
 *                                 &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
 *                                 &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
 *                               &lt;/sequence>
 *                             &lt;/choice>
 *                             &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PISST" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;sequence>
 *                       &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc"/>
 *                       &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                     &lt;/sequence>
 *                     &lt;sequence>
 *                       &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204"/>
 *                       &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104"/>
 *                     &lt;/sequence>
 *                   &lt;/choice>
 *                   &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="COFINS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="COFINSAliq">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CST">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="01"/>
 *                                   &lt;enumeration value="02"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                             &lt;element name="pCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                             &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="COFINSQtde">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CST">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="03"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
 *                             &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
 *                             &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="COFINSNT">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CST">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="04"/>
 *                                   &lt;enumeration value="05"/>
 *                                   &lt;enumeration value="06"/>
 *                                   &lt;enumeration value="07"/>
 *                                   &lt;enumeration value="08"/>
 *                                   &lt;enumeration value="09"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="COFINSOutr">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CST">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="49"/>
 *                                   &lt;enumeration value="50"/>
 *                                   &lt;enumeration value="51"/>
 *                                   &lt;enumeration value="52"/>
 *                                   &lt;enumeration value="53"/>
 *                                   &lt;enumeration value="54"/>
 *                                   &lt;enumeration value="55"/>
 *                                   &lt;enumeration value="56"/>
 *                                   &lt;enumeration value="60"/>
 *                                   &lt;enumeration value="61"/>
 *                                   &lt;enumeration value="62"/>
 *                                   &lt;enumeration value="63"/>
 *                                   &lt;enumeration value="64"/>
 *                                   &lt;enumeration value="65"/>
 *                                   &lt;enumeration value="66"/>
 *                                   &lt;enumeration value="67"/>
 *                                   &lt;enumeration value="70"/>
 *                                   &lt;enumeration value="71"/>
 *                                   &lt;enumeration value="72"/>
 *                                   &lt;enumeration value="73"/>
 *                                   &lt;enumeration value="74"/>
 *                                   &lt;enumeration value="75"/>
 *                                   &lt;enumeration value="98"/>
 *                                   &lt;enumeration value="99"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;choice>
 *                               &lt;sequence>
 *                                 &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                               &lt;/sequence>
 *                               &lt;sequence>
 *                                 &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
 *                                 &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
 *                               &lt;/sequence>
 *                             &lt;/choice>
 *                             &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="COFINSST" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;sequence>
 *                       &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                       &lt;element name="pCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                     &lt;/sequence>
 *                     &lt;sequence>
 *                       &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204"/>
 *                       &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104"/>
 *                     &lt;/sequence>
 *                   &lt;/choice>
 *                   &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ICMSUFDest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vBCUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="pFCPUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                   &lt;element name="pICMSUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                   &lt;element name="pICMSInter">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="4.00"/>
 *                         &lt;enumeration value="7.00"/>
 *                         &lt;enumeration value="12.00"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pICMSInterPart" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                   &lt;element name="vFCPUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vICMSUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vICMSUFRemet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "vTotTrib", "icms", "ipi", "ii", "issqn", "pis", "pisst", "cofins", "cofinsst",
		"ICMSUFDest" })
public class Imposto {

	private String vTotTrib;

	@XmlElement(name = "ICMS")
	protected ICMS icms;

	@XmlElement(name = "IPI")

	protected TIpi ipi;

	@XmlElement(name = "II")
	protected II ii;

	@XmlElement(name = "ISSQN")
	protected ISSQN issqn;

	@XmlElement(name = "COFINSST")
	protected COFINSST cofinsst;

	@XmlElement(name = "PISST")
	protected PISST pisst;

	@XmlElement(name = "ICMSUFDest")
	protected ICMSUFDest ICMSUFDest;

	// multiple types por CST
	@XmlElement(name = "PIS", required = true)

	protected PIS pis;

	@XmlElement(name = "COFINS", required = true)

	protected COFINS cofins;

	public ICMSUFDest getICMSUFDest() {
		return ICMSUFDest;
	}

	public void setICMSUFDest(ICMSUFDest iCMSUFDest) {
		ICMSUFDest = iCMSUFDest;
	}

	/*
	 * public List<JAXBElement<?>> getContent() { if (content == null) { content
	 * = new ArrayList<JAXBElement<?>>(); } return this.content; }
	 */

	public String getvTotTrib() {
		return vTotTrib;
	}

	public void setvTotTrib(String vTotTrib) {
		this.vTotTrib = vTotTrib;
	}

	public ICMS getICMS() {
		return icms;
	}

	public void setICMS(ICMS icms) {
		this.icms = icms;
	}

	public II getII() {
		return ii;
	}

	public void setII(II ii) {
		this.ii = ii;
	}

	public ISSQN getISSQN() {
		return issqn;
	}

	public void setISSQN(ISSQN issqn) {
		this.issqn = issqn;
	}

	public PIS getPIS() {
		return pis;
	}

	public void setPis(PIS pis) {
		this.pis = pis;
	}

	public PISST getPisst() {
		return pisst;
	}

	public void setPisst(PISST pisst) {
		this.pisst = pisst;
	}

	public COFINS getCofins() {
		return cofins;
	}

	public void setCofins(COFINS cofins) {
		this.cofins = cofins;
	}

	public COFINSST getCofinsst() {
		return cofinsst;
	}

	public void setCofinsst(COFINSST cofinsst) {
		this.cofinsst = cofinsst;
	}

	public TIpi getIPI() {
		return ipi;
	}

	public void setIPI(TIpi ipi) {
		this.ipi = ipi;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "cofinsAliq", "cofinsQtde", "cofinsnt", "cofinsOutr" })
	public static class COFINS {

		@XmlElement(name = "COFINSAliq")
		protected Imposto.COFINS.COFINSAliq cofinsAliq;
		@XmlElement(name = "COFINSQtde")
		protected Imposto.COFINS.COFINSQtde cofinsQtde;
		@XmlElement(name = "COFINSNT")
		protected Imposto.COFINS.COFINSNT cofinsnt;
		@XmlElement(name = "COFINSOutr")
		protected Imposto.COFINS.COFINSOutr cofinsOutr;

		/**
		 * Obtém o valor da propriedade cofinsAliq.
		 * 
		 * @return possible object is {@link Imposto.COFINS.COFINSAliq }
		 * 
		 */
		public Imposto.COFINS.COFINSAliq getCOFINSAliq() {
			return cofinsAliq;
		}

		/**
		 * Define o valor da propriedade cofinsAliq.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.COFINS.COFINSAliq }
		 * 
		 */
		public void setCOFINSAliq(Imposto.COFINS.COFINSAliq value) {
			this.cofinsAliq = value;
		}

		/**
		 * Obtém o valor da propriedade cofinsQtde.
		 * 
		 * @return possible object is {@link Imposto.COFINS.COFINSQtde }
		 * 
		 */
		public Imposto.COFINS.COFINSQtde getCOFINSQtde() {
			return cofinsQtde;
		}

		/**
		 * Define o valor da propriedade cofinsQtde.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.COFINS.COFINSQtde }
		 * 
		 */
		public void setCOFINSQtde(Imposto.COFINS.COFINSQtde value) {
			this.cofinsQtde = value;
		}

		/**
		 * Obtém o valor da propriedade cofinsnt.
		 * 
		 * @return possible object is {@link Imposto.COFINS.COFINSNT }
		 * 
		 */
		public Imposto.COFINS.COFINSNT getCOFINSNT() {
			return cofinsnt;
		}

		/**
		 * Define o valor da propriedade cofinsnt.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.COFINS.COFINSNT }
		 * 
		 */
		public void setCOFINSNT(Imposto.COFINS.COFINSNT value) {
			this.cofinsnt = value;
		}

		/**
		 * Obtém o valor da propriedade cofinsOutr.
		 * 
		 * @return possible object is {@link Imposto.COFINS.COFINSOutr }
		 * 
		 */
		public Imposto.COFINS.COFINSOutr getCOFINSOutr() {
			return cofinsOutr;
		}

		/**
		 * Define o valor da propriedade cofinsOutr.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.COFINS.COFINSOutr }
		 * 
		 */
		public void setCOFINSOutr(Imposto.COFINS.COFINSOutr value) {
			this.cofinsOutr = value;
		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="01"/>
		 *               &lt;enumeration value="02"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="pCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "cst", "vbc", "pcofins", "vcofins" })
		public static class COFINSAliq {

			@XmlElement(name = "CST", required = true)
			protected String cst;
			@XmlElement(name = "vBC", required = true)
			protected String vbc;
			@XmlElement(name = "pCOFINS", required = true)
			protected String pcofins;
			@XmlElement(name = "vCOFINS", required = true)
			protected String vcofins;

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade vbc.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBC() {
				return vbc;
			}

			/**
			 * Define o valor da propriedade vbc.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBC(String value) {
				this.vbc = value;
			}

			/**
			 * Obtém o valor da propriedade pcofins.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPCOFINS() {
				return pcofins;
			}

			/**
			 * Define o valor da propriedade pcofins.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPCOFINS(String value) {
				this.pcofins = value;
			}

			/**
			 * Obtém o valor da propriedade vcofins.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVCOFINS() {
				return vcofins;
			}

			/**
			 * Define o valor da propriedade vcofins.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVCOFINS(String value) {
				this.vcofins = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="04"/>
		 *               &lt;enumeration value="05"/>
		 *               &lt;enumeration value="06"/>
		 *               &lt;enumeration value="07"/>
		 *               &lt;enumeration value="08"/>
		 *               &lt;enumeration value="09"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "cst" })
		public static class COFINSNT {

			@XmlElement(name = "CST", required = true)
			protected String cst;

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="49"/>
		 *               &lt;enumeration value="50"/>
		 *               &lt;enumeration value="51"/>
		 *               &lt;enumeration value="52"/>
		 *               &lt;enumeration value="53"/>
		 *               &lt;enumeration value="54"/>
		 *               &lt;enumeration value="55"/>
		 *               &lt;enumeration value="56"/>
		 *               &lt;enumeration value="60"/>
		 *               &lt;enumeration value="61"/>
		 *               &lt;enumeration value="62"/>
		 *               &lt;enumeration value="63"/>
		 *               &lt;enumeration value="64"/>
		 *               &lt;enumeration value="65"/>
		 *               &lt;enumeration value="66"/>
		 *               &lt;enumeration value="67"/>
		 *               &lt;enumeration value="70"/>
		 *               &lt;enumeration value="71"/>
		 *               &lt;enumeration value="72"/>
		 *               &lt;enumeration value="73"/>
		 *               &lt;enumeration value="74"/>
		 *               &lt;enumeration value="75"/>
		 *               &lt;enumeration value="98"/>
		 *               &lt;enumeration value="99"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;choice>
		 *           &lt;sequence>
		 *             &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *             &lt;element name="pCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *           &lt;/sequence>
		 *           &lt;sequence>
		 *             &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
		 *             &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
		 *           &lt;/sequence>
		 *         &lt;/choice>
		 *         &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "cst", "vbc", "pcofins", "qbcProd", "vAliqProd", "vcofins" })
		public static class COFINSOutr {

			@XmlElement(name = "CST", required = true)
			protected String cst;
			@XmlElement(name = "vBC")
			protected String vbc;
			@XmlElement(name = "pCOFINS")
			protected String pcofins;
			@XmlElement(name = "qBCProd")
			protected String qbcProd;
			protected String vAliqProd;
			@XmlElement(name = "vCOFINS", required = true)
			protected String vcofins;

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade vbc.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBC() {
				return vbc;
			}

			/**
			 * Define o valor da propriedade vbc.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBC(String value) {
				this.vbc = value;
			}

			/**
			 * Obtém o valor da propriedade pcofins.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPCOFINS() {
				return pcofins;
			}

			/**
			 * Define o valor da propriedade pcofins.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPCOFINS(String value) {
				this.pcofins = value;
			}

			/**
			 * Obtém o valor da propriedade qbcProd.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getQBCProd() {
				return qbcProd;
			}

			/**
			 * Define o valor da propriedade qbcProd.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setQBCProd(String value) {
				this.qbcProd = value;
			}

			/**
			 * Obtém o valor da propriedade vAliqProd.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVAliqProd() {
				return vAliqProd;
			}

			/**
			 * Define o valor da propriedade vAliqProd.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVAliqProd(String value) {
				this.vAliqProd = value;
			}

			/**
			 * Obtém o valor da propriedade vcofins.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVCOFINS() {
				return vcofins;
			}

			/**
			 * Define o valor da propriedade vcofins.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVCOFINS(String value) {
				this.vcofins = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;enumeration value="03"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
		 *         &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
		 *         &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "cst", "qbcProd", "vAliqProd", "vcofins" })
		public static class COFINSQtde {

			@XmlElement(name = "CST", required = true)
			protected String cst;
			@XmlElement(name = "qBCProd", required = true)
			protected String qbcProd;
			@XmlElement(required = true)
			protected String vAliqProd;
			@XmlElement(name = "vCOFINS", required = true)
			protected String vcofins;

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade qbcProd.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getQBCProd() {
				return qbcProd;
			}

			/**
			 * Define o valor da propriedade qbcProd.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setQBCProd(String value) {
				this.qbcProd = value;
			}

			/**
			 * Obtém o valor da propriedade vAliqProd.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVAliqProd() {
				return vAliqProd;
			}

			/**
			 * Define o valor da propriedade vAliqProd.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVAliqProd(String value) {
				this.vAliqProd = value;
			}

			/**
			 * Obtém o valor da propriedade vcofins.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVCOFINS() {
				return vcofins;
			}

			/**
			 * Define o valor da propriedade vcofins.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVCOFINS(String value) {
				this.vcofins = value;
			}

		}

	}

	/**
	 * <p>
	 * Classe Java de anonymous complex type.
	 * 
	 * <p>
	 * O seguinte fragmento do esquema especifica o conteúdo esperado contido
	 * dentro desta classe.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;choice>
	 *           &lt;sequence>
	 *             &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *             &lt;element name="pCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *           &lt;/sequence>
	 *           &lt;sequence>
	 *             &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204"/>
	 *             &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104"/>
	 *           &lt;/sequence>
	 *         &lt;/choice>
	 *         &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "vbc", "pcofins", "qbcProd", "vAliqProd", "vcofins" })
	public static class COFINSST {

		@XmlElement(name = "vBC")
		protected String vbc;
		@XmlElement(name = "pCOFINS")
		protected String pcofins;
		@XmlElement(name = "qBCProd")
		protected String qbcProd;
		protected String vAliqProd;
		@XmlElement(name = "vCOFINS", required = true)
		protected String vcofins;

		/**
		 * Obtém o valor da propriedade vbc.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVBC() {
			return vbc;
		}

		/**
		 * Define o valor da propriedade vbc.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVBC(String value) {
			this.vbc = value;
		}

		/**
		 * Obtém o valor da propriedade pcofins.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPCOFINS() {
			return pcofins;
		}

		/**
		 * Define o valor da propriedade pcofins.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPCOFINS(String value) {
			this.pcofins = value;
		}

		/**
		 * Obtém o valor da propriedade qbcProd.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getQBCProd() {
			return qbcProd;
		}

		/**
		 * Define o valor da propriedade qbcProd.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setQBCProd(String value) {
			this.qbcProd = value;
		}

		/**
		 * Obtém o valor da propriedade vAliqProd.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVAliqProd() {
			return vAliqProd;
		}

		/**
		 * Define o valor da propriedade vAliqProd.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVAliqProd(String value) {
			this.vAliqProd = value;
		}

		/**
		 * Obtém o valor da propriedade vcofins.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVCOFINS() {
			return vcofins;
		}

		/**
		 * Define o valor da propriedade vcofins.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVCOFINS(String value) {
			this.vcofins = value;
		}

	}

	/**
	 * <p>
	 * Classe Java de anonymous complex type.
	 * 
	 * <p>
	 * O seguinte fragmento do esquema especifica o conteúdo esperado contido
	 * dentro desta classe.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;choice>
	 *         &lt;element name="ICMS00">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="00"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="modBC">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="0"/>
	 *                         &lt;enumeration value="1"/>
	 *                         &lt;enumeration value="2"/>
	 *                         &lt;enumeration value="3"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMS10">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="10"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="modBC">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="0"/>
	 *                         &lt;enumeration value="1"/>
	 *                         &lt;enumeration value="2"/>
	 *                         &lt;enumeration value="3"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="modBCST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="0"/>
	 *                         &lt;enumeration value="1"/>
	 *                         &lt;enumeration value="2"/>
	 *                         &lt;enumeration value="3"/>
	 *                         &lt;enumeration value="4"/>
	 *                         &lt;enumeration value="5"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                   &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                   &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMS20">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="20"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="modBC">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="0"/>
	 *                         &lt;enumeration value="1"/>
	 *                         &lt;enumeration value="2"/>
	 *                         &lt;enumeration value="3"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;sequence minOccurs="0">
	 *                     &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                     &lt;element name="motDesICMS">
	 *                       &lt;simpleType>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                           &lt;whiteSpace value="preserve"/>
	 *                           &lt;enumeration value="3"/>
	 *                           &lt;enumeration value="9"/>
	 *                           &lt;enumeration value="12"/>
	 *                         &lt;/restriction>
	 *                       &lt;/simpleType>
	 *                     &lt;/element>
	 *                   &lt;/sequence>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMS30">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="30"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="modBCST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="0"/>
	 *                         &lt;enumeration value="1"/>
	 *                         &lt;enumeration value="2"/>
	 *                         &lt;enumeration value="3"/>
	 *                         &lt;enumeration value="4"/>
	 *                         &lt;enumeration value="5"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                   &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                   &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;sequence minOccurs="0">
	 *                     &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                     &lt;element name="motDesICMS">
	 *                       &lt;simpleType>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                           &lt;whiteSpace value="preserve"/>
	 *                           &lt;enumeration value="6"/>
	 *                           &lt;enumeration value="7"/>
	 *                           &lt;enumeration value="9"/>
	 *                         &lt;/restriction>
	 *                       &lt;/simpleType>
	 *                     &lt;/element>
	 *                   &lt;/sequence>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMS40">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="40"/>
	 *                         &lt;enumeration value="41"/>
	 *                         &lt;enumeration value="50"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;sequence minOccurs="0">
	 *                     &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                     &lt;element name="motDesICMS">
	 *                       &lt;simpleType>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                           &lt;whiteSpace value="preserve"/>
	 *                           &lt;enumeration value="1"/>
	 *                           &lt;enumeration value="3"/>
	 *                           &lt;enumeration value="4"/>
	 *                           &lt;enumeration value="5"/>
	 *                           &lt;enumeration value="6"/>
	 *                           &lt;enumeration value="7"/>
	 *                           &lt;enumeration value="8"/>
	 *                           &lt;enumeration value="9"/>
	 *                           &lt;enumeration value="10"/>
	 *                           &lt;enumeration value="11"/>
	 *                           &lt;enumeration value="16"/>
	 *                         &lt;/restriction>
	 *                       &lt;/simpleType>
	 *                     &lt;/element>
	 *                   &lt;/sequence>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMS51">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="51"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="modBC" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="0"/>
	 *                         &lt;enumeration value="1"/>
	 *                         &lt;enumeration value="2"/>
	 *                         &lt;enumeration value="3"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04" minOccurs="0"/>
	 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
	 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04" minOccurs="0"/>
	 *                   &lt;element name="vICMSOp" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
	 *                   &lt;element name="pDif" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Max100" minOccurs="0"/>
	 *                   &lt;element name="vICMSDif" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
	 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMS60">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="60"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;sequence minOccurs="0">
	 *                     &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                     &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;/sequence>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMS70">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="70"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="modBC">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="0"/>
	 *                         &lt;enumeration value="1"/>
	 *                         &lt;enumeration value="2"/>
	 *                         &lt;enumeration value="3"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="modBCST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="0"/>
	 *                         &lt;enumeration value="1"/>
	 *                         &lt;enumeration value="2"/>
	 *                         &lt;enumeration value="3"/>
	 *                         &lt;enumeration value="4"/>
	 *                         &lt;enumeration value="5"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                   &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                   &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;sequence minOccurs="0">
	 *                     &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                     &lt;element name="motDesICMS">
	 *                       &lt;simpleType>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                           &lt;whiteSpace value="preserve"/>
	 *                           &lt;enumeration value="3"/>
	 *                           &lt;enumeration value="9"/>
	 *                           &lt;enumeration value="12"/>
	 *                         &lt;/restriction>
	 *                       &lt;/simpleType>
	 *                     &lt;/element>
	 *                   &lt;/sequence>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMS90">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="90"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;sequence minOccurs="0">
	 *                     &lt;element name="modBC">
	 *                       &lt;simpleType>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                           &lt;whiteSpace value="preserve"/>
	 *                           &lt;enumeration value="0"/>
	 *                           &lt;enumeration value="1"/>
	 *                           &lt;enumeration value="2"/>
	 *                           &lt;enumeration value="3"/>
	 *                         &lt;/restriction>
	 *                       &lt;/simpleType>
	 *                     &lt;/element>
	 *                     &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                     &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                     &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                     &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;/sequence>
	 *                   &lt;sequence minOccurs="0">
	 *                     &lt;element name="modBCST">
	 *                       &lt;simpleType>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                           &lt;whiteSpace value="preserve"/>
	 *                           &lt;enumeration value="0"/>
	 *                           &lt;enumeration value="1"/>
	 *                           &lt;enumeration value="2"/>
	 *                           &lt;enumeration value="3"/>
	 *                           &lt;enumeration value="4"/>
	 *                           &lt;enumeration value="5"/>
	 *                         &lt;/restriction>
	 *                       &lt;/simpleType>
	 *                     &lt;/element>
	 *                     &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                     &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                     &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                     &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                     &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;/sequence>
	 *                   &lt;sequence minOccurs="0">
	 *                     &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                     &lt;element name="motDesICMS">
	 *                       &lt;simpleType>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                           &lt;whiteSpace value="preserve"/>
	 *                           &lt;enumeration value="3"/>
	 *                           &lt;enumeration value="9"/>
	 *                           &lt;enumeration value="12"/>
	 *                         &lt;/restriction>
	 *                       &lt;/simpleType>
	 *                     &lt;/element>
	 *                   &lt;/sequence>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMSPart">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="10"/>
	 *                         &lt;enumeration value="90"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="modBC">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="0"/>
	 *                         &lt;enumeration value="1"/>
	 *                         &lt;enumeration value="2"/>
	 *                         &lt;enumeration value="3"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="modBCST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="0"/>
	 *                         &lt;enumeration value="1"/>
	 *                         &lt;enumeration value="2"/>
	 *                         &lt;enumeration value="3"/>
	 *                         &lt;enumeration value="4"/>
	 *                         &lt;enumeration value="5"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                   &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                   &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="pBCOp" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
	 *                   &lt;element name="UFST" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMSST">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="41"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="vBCSTDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="vICMSSTDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMSSN101">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CSOSN">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="101"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="pCredSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vCredICMSSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMSSN102">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CSOSN">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="102"/>
	 *                         &lt;enumeration value="103"/>
	 *                         &lt;enumeration value="300"/>
	 *                         &lt;enumeration value="400"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMSSN201">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CSOSN">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="201"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="modBCST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="0"/>
	 *                         &lt;enumeration value="1"/>
	 *                         &lt;enumeration value="2"/>
	 *                         &lt;enumeration value="3"/>
	 *                         &lt;enumeration value="4"/>
	 *                         &lt;enumeration value="5"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                   &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                   &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="pCredSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vCredICMSSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMSSN202">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CSOSN">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="202"/>
	 *                         &lt;enumeration value="203"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="modBCST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="0"/>
	 *                         &lt;enumeration value="1"/>
	 *                         &lt;enumeration value="2"/>
	 *                         &lt;enumeration value="3"/>
	 *                         &lt;enumeration value="4"/>
	 *                         &lt;enumeration value="5"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                   &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                   &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMSSN500">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CSOSN">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="500"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;sequence minOccurs="0">
	 *                     &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                     &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;/sequence>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ICMSSN900">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
	 *                   &lt;element name="CSOSN">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="900"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;sequence minOccurs="0">
	 *                     &lt;element name="modBC">
	 *                       &lt;simpleType>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                           &lt;whiteSpace value="preserve"/>
	 *                           &lt;enumeration value="0"/>
	 *                           &lt;enumeration value="1"/>
	 *                           &lt;enumeration value="2"/>
	 *                           &lt;enumeration value="3"/>
	 *                         &lt;/restriction>
	 *                       &lt;/simpleType>
	 *                     &lt;/element>
	 *                     &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                     &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                     &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                     &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;/sequence>
	 *                   &lt;sequence minOccurs="0">
	 *                     &lt;element name="modBCST">
	 *                       &lt;simpleType>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                           &lt;whiteSpace value="preserve"/>
	 *                           &lt;enumeration value="0"/>
	 *                           &lt;enumeration value="1"/>
	 *                           &lt;enumeration value="2"/>
	 *                           &lt;enumeration value="3"/>
	 *                           &lt;enumeration value="4"/>
	 *                           &lt;enumeration value="5"/>
	 *                         &lt;/restriction>
	 *                       &lt;/simpleType>
	 *                     &lt;/element>
	 *                     &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                     &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
	 *                     &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                     &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                     &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;/sequence>
	 *                   &lt;sequence minOccurs="0">
	 *                     &lt;element name="pCredSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                     &lt;element name="vCredICMSSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;/sequence>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/choice>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "icms00", "icms10", "icms20", "icms30", "icms40", "icms51", "icms60", "icms70",
			"icms90", "icmsPart", "icmsst", "icmssn101", "icmssn102", "icmssn201", "icmssn202", "icmssn500",
			"icmssn900" })
	public static class ICMS {

		@XmlElement(name = "ICMS00")
		protected Imposto.ICMS.ICMS00 icms00;
		@XmlElement(name = "ICMS10")
		protected Imposto.ICMS.ICMS10 icms10;
		@XmlElement(name = "ICMS20")
		protected Imposto.ICMS.ICMS20 icms20;
		@XmlElement(name = "ICMS30")
		protected Imposto.ICMS.ICMS30 icms30;
		@XmlElement(name = "ICMS40")
		protected Imposto.ICMS.ICMS40 icms40;
		@XmlElement(name = "ICMS51")
		protected Imposto.ICMS.ICMS51 icms51;
		@XmlElement(name = "ICMS60")
		protected Imposto.ICMS.ICMS60 icms60;
		@XmlElement(name = "ICMS70")
		protected Imposto.ICMS.ICMS70 icms70;
		@XmlElement(name = "ICMS90")
		protected Imposto.ICMS.ICMS90 icms90;
		@XmlElement(name = "ICMSPart")
		protected Imposto.ICMS.ICMSPart icmsPart;
		@XmlElement(name = "ICMSST")
		protected Imposto.ICMS.ICMSST icmsst;
		@XmlElement(name = "ICMSSN101")
		protected Imposto.ICMS.ICMSSN101 icmssn101;
		@XmlElement(name = "ICMSSN102")
		protected Imposto.ICMS.ICMSSN102 icmssn102;
		@XmlElement(name = "ICMSSN201")
		protected Imposto.ICMS.ICMSSN201 icmssn201;
		@XmlElement(name = "ICMSSN202")
		protected Imposto.ICMS.ICMSSN202 icmssn202;
		@XmlElement(name = "ICMSSN500")
		protected Imposto.ICMS.ICMSSN500 icmssn500;
		@XmlElement(name = "ICMSSN900")
		protected Imposto.ICMS.ICMSSN900 icmssn900;

		/**
		 * Obtém o valor da propriedade icms00.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMS00 }
		 * 
		 */
		public Imposto.ICMS.ICMS00 getICMS00() {
			return icms00;
		}

		/**
		 * Define o valor da propriedade icms00.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMS00 }
		 * 
		 */
		public void setICMS00(Imposto.ICMS.ICMS00 value) {
			this.icms00 = value;
		}

		/**
		 * Obtém o valor da propriedade icms10.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMS10 }
		 * 
		 */
		public Imposto.ICMS.ICMS10 getICMS10() {
			return icms10;
		}

		/**
		 * Define o valor da propriedade icms10.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMS10 }
		 * 
		 */
		public void setICMS10(Imposto.ICMS.ICMS10 value) {
			this.icms10 = value;
		}

		/**
		 * Obtém o valor da propriedade icms20.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMS20 }
		 * 
		 */
		public Imposto.ICMS.ICMS20 getICMS20() {
			return icms20;
		}

		/**
		 * Define o valor da propriedade icms20.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMS20 }
		 * 
		 */
		public void setICMS20(Imposto.ICMS.ICMS20 value) {
			this.icms20 = value;
		}

		/**
		 * Obtém o valor da propriedade icms30.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMS30 }
		 * 
		 */
		public Imposto.ICMS.ICMS30 getICMS30() {
			return icms30;
		}

		/**
		 * Define o valor da propriedade icms30.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMS30 }
		 * 
		 */
		public void setICMS30(Imposto.ICMS.ICMS30 value) {
			this.icms30 = value;
		}

		/**
		 * Obtém o valor da propriedade icms40.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMS40 }
		 * 
		 */
		public Imposto.ICMS.ICMS40 getICMS40() {
			return icms40;
		}

		/**
		 * Define o valor da propriedade icms40.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMS40 }
		 * 
		 */
		public void setICMS40(Imposto.ICMS.ICMS40 value) {
			this.icms40 = value;
		}

		/**
		 * Obtém o valor da propriedade icms51.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMS51 }
		 * 
		 */
		public Imposto.ICMS.ICMS51 getICMS51() {
			return icms51;
		}

		/**
		 * Define o valor da propriedade icms51.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMS51 }
		 * 
		 */
		public void setICMS51(Imposto.ICMS.ICMS51 value) {
			this.icms51 = value;
		}

		/**
		 * Obtém o valor da propriedade icms60.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMS60 }
		 * 
		 */
		public Imposto.ICMS.ICMS60 getICMS60() {
			return icms60;
		}

		/**
		 * Define o valor da propriedade icms60.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMS60 }
		 * 
		 */
		public void setICMS60(Imposto.ICMS.ICMS60 value) {
			this.icms60 = value;
		}

		/**
		 * Obtém o valor da propriedade icms70.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMS70 }
		 * 
		 */
		public Imposto.ICMS.ICMS70 getICMS70() {
			return icms70;
		}

		/**
		 * Define o valor da propriedade icms70.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMS70 }
		 * 
		 */
		public void setICMS70(Imposto.ICMS.ICMS70 value) {
			this.icms70 = value;
		}

		/**
		 * Obtém o valor da propriedade icms90.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMS90 }
		 * 
		 */
		public Imposto.ICMS.ICMS90 getICMS90() {
			return icms90;
		}

		/**
		 * Define o valor da propriedade icms90.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMS90 }
		 * 
		 */
		public void setICMS90(Imposto.ICMS.ICMS90 value) {
			this.icms90 = value;
		}

		/**
		 * Obtém o valor da propriedade icmsPart.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMSPart }
		 * 
		 */
		public Imposto.ICMS.ICMSPart getICMSPart() {
			return icmsPart;
		}

		/**
		 * Define o valor da propriedade icmsPart.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMSPart }
		 * 
		 */
		public void setICMSPart(Imposto.ICMS.ICMSPart value) {
			this.icmsPart = value;
		}

		/**
		 * Obtém o valor da propriedade icmsst.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMSST }
		 * 
		 */
		public Imposto.ICMS.ICMSST getICMSST() {
			return icmsst;
		}

		/**
		 * Define o valor da propriedade icmsst.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMSST }
		 * 
		 */
		public void setICMSST(Imposto.ICMS.ICMSST value) {
			this.icmsst = value;
		}

		/**
		 * Obtém o valor da propriedade icmssn101.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMSSN101 }
		 * 
		 */
		public Imposto.ICMS.ICMSSN101 getICMSSN101() {
			return icmssn101;
		}

		/**
		 * Define o valor da propriedade icmssn101.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMSSN101 }
		 * 
		 */
		public void setICMSSN101(Imposto.ICMS.ICMSSN101 value) {
			this.icmssn101 = value;
		}

		/**
		 * Obtém o valor da propriedade icmssn102.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMSSN102 }
		 * 
		 */
		public Imposto.ICMS.ICMSSN102 getICMSSN102() {
			return icmssn102;
		}

		/**
		 * Define o valor da propriedade icmssn102.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMSSN102 }
		 * 
		 */
		public void setICMSSN102(Imposto.ICMS.ICMSSN102 value) {
			this.icmssn102 = value;
		}

		/**
		 * Obtém o valor da propriedade icmssn201.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMSSN201 }
		 * 
		 */
		public Imposto.ICMS.ICMSSN201 getICMSSN201() {
			return icmssn201;
		}

		/**
		 * Define o valor da propriedade icmssn201.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMSSN201 }
		 * 
		 */
		public void setICMSSN201(Imposto.ICMS.ICMSSN201 value) {
			this.icmssn201 = value;
		}

		/**
		 * Obtém o valor da propriedade icmssn202.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMSSN202 }
		 * 
		 */
		public Imposto.ICMS.ICMSSN202 getICMSSN202() {
			return icmssn202;
		}

		/**
		 * Define o valor da propriedade icmssn202.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMSSN202 }
		 * 
		 */
		public void setICMSSN202(Imposto.ICMS.ICMSSN202 value) {
			this.icmssn202 = value;
		}

		/**
		 * Obtém o valor da propriedade icmssn500.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMSSN500 }
		 * 
		 */
		public Imposto.ICMS.ICMSSN500 getICMSSN500() {
			return icmssn500;
		}

		/**
		 * Define o valor da propriedade icmssn500.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMSSN500 }
		 * 
		 */
		public void setICMSSN500(Imposto.ICMS.ICMSSN500 value) {
			this.icmssn500 = value;
		}

		/**
		 * Obtém o valor da propriedade icmssn900.
		 * 
		 * @return possible object is {@link Imposto.ICMS.ICMSSN900 }
		 * 
		 */
		public Imposto.ICMS.ICMSSN900 getICMSSN900() {
			return icmssn900;
		}

		/**
		 * Define o valor da propriedade icmssn900.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.ICMS.ICMSSN900 }
		 * 
		 */
		public void setICMSSN900(Imposto.ICMS.ICMSSN900 value) {
			this.icmssn900 = value;
		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="00"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="modBC">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="0"/>
		 *               &lt;enumeration value="1"/>
		 *               &lt;enumeration value="2"/>
		 *               &lt;enumeration value="3"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "cst", "modBC", "vbc", "picms", "vicms" })
		public static class ICMS00 {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CST", required = true)
			protected String cst;
			@XmlElement(required = true)
			protected String modBC;
			@XmlElement(name = "vBC", required = true)
			protected String vbc;
			@XmlElement(name = "pICMS", required = true)
			protected String picms;
			@XmlElement(name = "vICMS", required = true)
			protected String vicms;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade modBC.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBC() {
				return modBC;
			}

			/**
			 * Define o valor da propriedade modBC.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBC(String value) {
				this.modBC = value;
			}

			/**
			 * Obtém o valor da propriedade vbc.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBC() {
				return vbc;
			}

			/**
			 * Define o valor da propriedade vbc.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBC(String value) {
				this.vbc = value;
			}

			/**
			 * Obtém o valor da propriedade picms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMS() {
				return picms;
			}

			/**
			 * Define o valor da propriedade picms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMS(String value) {
				this.picms = value;
			}

			/**
			 * Obtém o valor da propriedade vicms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMS() {
				return vicms;
			}

			/**
			 * Define o valor da propriedade vicms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMS(String value) {
				this.vicms = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="10"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="modBC">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="0"/>
		 *               &lt;enumeration value="1"/>
		 *               &lt;enumeration value="2"/>
		 *               &lt;enumeration value="3"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="modBCST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="0"/>
		 *               &lt;enumeration value="1"/>
		 *               &lt;enumeration value="2"/>
		 *               &lt;enumeration value="3"/>
		 *               &lt;enumeration value="4"/>
		 *               &lt;enumeration value="5"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *         &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "cst", "modBC", "vbc", "picms", "vicms", "modBCST", "pmvast",
				"pRedBCST", "vbcst", "picmsst", "vicmsst" })
		public static class ICMS10 {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CST", required = true)
			protected String cst;
			@XmlElement(required = true)
			protected String modBC;
			@XmlElement(name = "vBC", required = true)
			protected String vbc;
			@XmlElement(name = "pICMS", required = true)
			protected String picms;
			@XmlElement(name = "vICMS", required = true)
			protected String vicms;
			@XmlElement(required = true)
			protected String modBCST;
			@XmlElement(name = "pMVAST")
			protected String pmvast;
			protected String pRedBCST;
			@XmlElement(name = "vBCST", required = true)
			protected String vbcst;
			@XmlElement(name = "pICMSST", required = true)
			protected String picmsst;
			@XmlElement(name = "vICMSST", required = true)
			protected String vicmsst;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade modBC.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBC() {
				return modBC;
			}

			/**
			 * Define o valor da propriedade modBC.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBC(String value) {
				this.modBC = value;
			}

			/**
			 * Obtém o valor da propriedade vbc.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBC() {
				return vbc;
			}

			/**
			 * Define o valor da propriedade vbc.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBC(String value) {
				this.vbc = value;
			}

			/**
			 * Obtém o valor da propriedade picms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMS() {
				return picms;
			}

			/**
			 * Define o valor da propriedade picms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMS(String value) {
				this.picms = value;
			}

			/**
			 * Obtém o valor da propriedade vicms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMS() {
				return vicms;
			}

			/**
			 * Define o valor da propriedade vicms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMS(String value) {
				this.vicms = value;
			}

			/**
			 * Obtém o valor da propriedade modBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBCST() {
				return modBCST;
			}

			/**
			 * Define o valor da propriedade modBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBCST(String value) {
				this.modBCST = value;
			}

			/**
			 * Obtém o valor da propriedade pmvast.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPMVAST() {
				return pmvast;
			}

			/**
			 * Define o valor da propriedade pmvast.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPMVAST(String value) {
				this.pmvast = value;
			}

			/**
			 * Obtém o valor da propriedade pRedBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPRedBCST() {
				return pRedBCST;
			}

			/**
			 * Define o valor da propriedade pRedBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPRedBCST(String value) {
				this.pRedBCST = value;
			}

			/**
			 * Obtém o valor da propriedade vbcst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBCST() {
				return vbcst;
			}

			/**
			 * Define o valor da propriedade vbcst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBCST(String value) {
				this.vbcst = value;
			}

			/**
			 * Obtém o valor da propriedade picmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMSST() {
				return picmsst;
			}

			/**
			 * Define o valor da propriedade picmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMSST(String value) {
				this.picmsst = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSST() {
				return vicmsst;
			}

			/**
			 * Define o valor da propriedade vicmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSST(String value) {
				this.vicmsst = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="20"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="modBC">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="0"/>
		 *               &lt;enumeration value="1"/>
		 *               &lt;enumeration value="2"/>
		 *               &lt;enumeration value="3"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;sequence minOccurs="0">
		 *           &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *           &lt;element name="motDesICMS">
		 *             &lt;simpleType>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                 &lt;whiteSpace value="preserve"/>
		 *                 &lt;enumeration value="3"/>
		 *                 &lt;enumeration value="9"/>
		 *                 &lt;enumeration value="12"/>
		 *               &lt;/restriction>
		 *             &lt;/simpleType>
		 *           &lt;/element>
		 *         &lt;/sequence>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "cst", "modBC", "pRedBC", "vbc", "picms", "vicms", "vicmsDeson",
				"motDesICMS" })
		public static class ICMS20 {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CST", required = true)
			protected String cst;
			@XmlElement(required = true)
			protected String modBC;
			@XmlElement(required = true)
			protected String pRedBC;
			@XmlElement(name = "vBC", required = true)
			protected String vbc;
			@XmlElement(name = "pICMS", required = true)
			protected String picms;
			@XmlElement(name = "vICMS", required = true)
			protected String vicms;
			@XmlElement(name = "vICMSDeson")
			protected String vicmsDeson;
			protected String motDesICMS;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade modBC.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBC() {
				return modBC;
			}

			/**
			 * Define o valor da propriedade modBC.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBC(String value) {
				this.modBC = value;
			}

			/**
			 * Obtém o valor da propriedade pRedBC.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPRedBC() {
				return pRedBC;
			}

			/**
			 * Define o valor da propriedade pRedBC.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPRedBC(String value) {
				this.pRedBC = value;
			}

			/**
			 * Obtém o valor da propriedade vbc.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBC() {
				return vbc;
			}

			/**
			 * Define o valor da propriedade vbc.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBC(String value) {
				this.vbc = value;
			}

			/**
			 * Obtém o valor da propriedade picms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMS() {
				return picms;
			}

			/**
			 * Define o valor da propriedade picms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMS(String value) {
				this.picms = value;
			}

			/**
			 * Obtém o valor da propriedade vicms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMS() {
				return vicms;
			}

			/**
			 * Define o valor da propriedade vicms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMS(String value) {
				this.vicms = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsDeson.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSDeson() {
				return vicmsDeson;
			}

			/**
			 * Define o valor da propriedade vicmsDeson.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSDeson(String value) {
				this.vicmsDeson = value;
			}

			/**
			 * Obtém o valor da propriedade motDesICMS.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getMotDesICMS() {
				return motDesICMS;
			}

			/**
			 * Define o valor da propriedade motDesICMS.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setMotDesICMS(String value) {
				this.motDesICMS = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="30"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="modBCST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="0"/>
		 *               &lt;enumeration value="1"/>
		 *               &lt;enumeration value="2"/>
		 *               &lt;enumeration value="3"/>
		 *               &lt;enumeration value="4"/>
		 *               &lt;enumeration value="5"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *         &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;sequence minOccurs="0">
		 *           &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *           &lt;element name="motDesICMS">
		 *             &lt;simpleType>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                 &lt;whiteSpace value="preserve"/>
		 *                 &lt;enumeration value="6"/>
		 *                 &lt;enumeration value="7"/>
		 *                 &lt;enumeration value="9"/>
		 *               &lt;/restriction>
		 *             &lt;/simpleType>
		 *           &lt;/element>
		 *         &lt;/sequence>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "cst", "modBCST", "pmvast", "pRedBCST", "vbcst", "picmsst", "vicmsst",
				"vicmsDeson", "motDesICMS" })
		public static class ICMS30 {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CST", required = true)
			protected String cst;
			@XmlElement(required = true)
			protected String modBCST;
			@XmlElement(name = "pMVAST")
			protected String pmvast;
			protected String pRedBCST;
			@XmlElement(name = "vBCST", required = true)
			protected String vbcst;
			@XmlElement(name = "pICMSST", required = true)
			protected String picmsst;
			@XmlElement(name = "vICMSST", required = true)
			protected String vicmsst;
			@XmlElement(name = "vICMSDeson")
			protected String vicmsDeson;
			protected String motDesICMS;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade modBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBCST() {
				return modBCST;
			}

			/**
			 * Define o valor da propriedade modBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBCST(String value) {
				this.modBCST = value;
			}

			/**
			 * Obtém o valor da propriedade pmvast.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPMVAST() {
				return pmvast;
			}

			/**
			 * Define o valor da propriedade pmvast.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPMVAST(String value) {
				this.pmvast = value;
			}

			/**
			 * Obtém o valor da propriedade pRedBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPRedBCST() {
				return pRedBCST;
			}

			/**
			 * Define o valor da propriedade pRedBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPRedBCST(String value) {
				this.pRedBCST = value;
			}

			/**
			 * Obtém o valor da propriedade vbcst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBCST() {
				return vbcst;
			}

			/**
			 * Define o valor da propriedade vbcst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBCST(String value) {
				this.vbcst = value;
			}

			/**
			 * Obtém o valor da propriedade picmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMSST() {
				return picmsst;
			}

			/**
			 * Define o valor da propriedade picmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMSST(String value) {
				this.picmsst = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSST() {
				return vicmsst;
			}

			/**
			 * Define o valor da propriedade vicmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSST(String value) {
				this.vicmsst = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsDeson.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSDeson() {
				return vicmsDeson;
			}

			/**
			 * Define o valor da propriedade vicmsDeson.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSDeson(String value) {
				this.vicmsDeson = value;
			}

			/**
			 * Obtém o valor da propriedade motDesICMS.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getMotDesICMS() {
				return motDesICMS;
			}

			/**
			 * Define o valor da propriedade motDesICMS.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setMotDesICMS(String value) {
				this.motDesICMS = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="40"/>
		 *               &lt;enumeration value="41"/>
		 *               &lt;enumeration value="50"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;sequence minOccurs="0">
		 *           &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *           &lt;element name="motDesICMS">
		 *             &lt;simpleType>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                 &lt;whiteSpace value="preserve"/>
		 *                 &lt;enumeration value="1"/>
		 *                 &lt;enumeration value="3"/>
		 *                 &lt;enumeration value="4"/>
		 *                 &lt;enumeration value="5"/>
		 *                 &lt;enumeration value="6"/>
		 *                 &lt;enumeration value="7"/>
		 *                 &lt;enumeration value="8"/>
		 *                 &lt;enumeration value="9"/>
		 *                 &lt;enumeration value="10"/>
		 *                 &lt;enumeration value="11"/>
		 *                 &lt;enumeration value="16"/>
		 *               &lt;/restriction>
		 *             &lt;/simpleType>
		 *           &lt;/element>
		 *         &lt;/sequence>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "cst", "vicmsDeson", "motDesICMS" })
		public static class ICMS40 {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CST", required = true)
			protected String cst;
			@XmlElement(name = "vICMSDeson")
			protected String vicmsDeson;
			protected String motDesICMS;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsDeson.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSDeson() {
				return vicmsDeson;
			}

			/**
			 * Define o valor da propriedade vicmsDeson.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSDeson(String value) {
				this.vicmsDeson = value;
			}

			/**
			 * Obtém o valor da propriedade motDesICMS.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getMotDesICMS() {
				return motDesICMS;
			}

			/**
			 * Define o valor da propriedade motDesICMS.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setMotDesICMS(String value) {
				this.motDesICMS = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="51"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="modBC" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="0"/>
		 *               &lt;enumeration value="1"/>
		 *               &lt;enumeration value="2"/>
		 *               &lt;enumeration value="3"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04" minOccurs="0"/>
		 *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
		 *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04" minOccurs="0"/>
		 *         &lt;element name="vICMSOp" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
		 *         &lt;element name="pDif" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Max100" minOccurs="0"/>
		 *         &lt;element name="vICMSDif" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
		 *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "cst", "modBC", "pRedBC", "vbc", "picms", "vicmsOp", "pDif",
				"vicmsDif", "vicms" })
		public static class ICMS51 {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CST", required = true)
			protected String cst;
			protected String modBC;
			protected String pRedBC;
			@XmlElement(name = "vBC")
			protected String vbc;
			@XmlElement(name = "pICMS")
			protected String picms;
			@XmlElement(name = "vICMSOp")
			protected String vicmsOp;
			protected String pDif;
			@XmlElement(name = "vICMSDif")
			protected String vicmsDif;
			@XmlElement(name = "vICMS")
			protected String vicms;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade modBC.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBC() {
				return modBC;
			}

			/**
			 * Define o valor da propriedade modBC.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBC(String value) {
				this.modBC = value;
			}

			/**
			 * Obtém o valor da propriedade pRedBC.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPRedBC() {
				return pRedBC;
			}

			/**
			 * Define o valor da propriedade pRedBC.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPRedBC(String value) {
				this.pRedBC = value;
			}

			/**
			 * Obtém o valor da propriedade vbc.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBC() {
				return vbc;
			}

			/**
			 * Define o valor da propriedade vbc.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBC(String value) {
				this.vbc = value;
			}

			/**
			 * Obtém o valor da propriedade picms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMS() {
				return picms;
			}

			/**
			 * Define o valor da propriedade picms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMS(String value) {
				this.picms = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsOp.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSOp() {
				return vicmsOp;
			}

			/**
			 * Define o valor da propriedade vicmsOp.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSOp(String value) {
				this.vicmsOp = value;
			}

			/**
			 * Obtém o valor da propriedade pDif.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPDif() {
				return pDif;
			}

			/**
			 * Define o valor da propriedade pDif.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPDif(String value) {
				this.pDif = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsDif.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSDif() {
				return vicmsDif;
			}

			/**
			 * Define o valor da propriedade vicmsDif.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSDif(String value) {
				this.vicmsDif = value;
			}

			/**
			 * Obtém o valor da propriedade vicms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMS() {
				return vicms;
			}

			/**
			 * Define o valor da propriedade vicms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMS(String value) {
				this.vicms = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="60"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;sequence minOccurs="0">
		 *           &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *           &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;/sequence>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "cst", "vbcstRet", "vicmsstRet" })
		public static class ICMS60 {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CST", required = true)
			protected String cst;
			@XmlElement(name = "vBCSTRet")
			protected String vbcstRet;
			@XmlElement(name = "vICMSSTRet")
			protected String vicmsstRet;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade vbcstRet.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBCSTRet() {
				return vbcstRet;
			}

			/**
			 * Define o valor da propriedade vbcstRet.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBCSTRet(String value) {
				this.vbcstRet = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsstRet.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSSTRet() {
				return vicmsstRet;
			}

			/**
			 * Define o valor da propriedade vicmsstRet.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSSTRet(String value) {
				this.vicmsstRet = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="70"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="modBC">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="0"/>
		 *               &lt;enumeration value="1"/>
		 *               &lt;enumeration value="2"/>
		 *               &lt;enumeration value="3"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="modBCST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="0"/>
		 *               &lt;enumeration value="1"/>
		 *               &lt;enumeration value="2"/>
		 *               &lt;enumeration value="3"/>
		 *               &lt;enumeration value="4"/>
		 *               &lt;enumeration value="5"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *         &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;sequence minOccurs="0">
		 *           &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *           &lt;element name="motDesICMS">
		 *             &lt;simpleType>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                 &lt;whiteSpace value="preserve"/>
		 *                 &lt;enumeration value="3"/>
		 *                 &lt;enumeration value="9"/>
		 *                 &lt;enumeration value="12"/>
		 *               &lt;/restriction>
		 *             &lt;/simpleType>
		 *           &lt;/element>
		 *         &lt;/sequence>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "cst", "modBC", "pRedBC", "vbc", "picms", "vicms", "modBCST",
				"pmvast", "pRedBCST", "vbcst", "picmsst", "vicmsst", "vicmsDeson", "motDesICMS" })
		public static class ICMS70 {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CST", required = true)
			protected String cst;
			@XmlElement(required = true)
			protected String modBC;
			@XmlElement(required = true)
			protected String pRedBC;
			@XmlElement(name = "vBC", required = true)
			protected String vbc;
			@XmlElement(name = "pICMS", required = true)
			protected String picms;
			@XmlElement(name = "vICMS", required = true)
			protected String vicms;
			@XmlElement(required = true)
			protected String modBCST;
			@XmlElement(name = "pMVAST")
			protected String pmvast;
			protected String pRedBCST;
			@XmlElement(name = "vBCST", required = true)
			protected String vbcst;
			@XmlElement(name = "pICMSST", required = true)
			protected String picmsst;
			@XmlElement(name = "vICMSST", required = true)
			protected String vicmsst;
			@XmlElement(name = "vICMSDeson")
			protected String vicmsDeson;
			protected String motDesICMS;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade modBC.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBC() {
				return modBC;
			}

			/**
			 * Define o valor da propriedade modBC.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBC(String value) {
				this.modBC = value;
			}

			/**
			 * Obtém o valor da propriedade pRedBC.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPRedBC() {
				return pRedBC;
			}

			/**
			 * Define o valor da propriedade pRedBC.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPRedBC(String value) {
				this.pRedBC = value;
			}

			/**
			 * Obtém o valor da propriedade vbc.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBC() {
				return vbc;
			}

			/**
			 * Define o valor da propriedade vbc.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBC(String value) {
				this.vbc = value;
			}

			/**
			 * Obtém o valor da propriedade picms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMS() {
				return picms;
			}

			/**
			 * Define o valor da propriedade picms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMS(String value) {
				this.picms = value;
			}

			/**
			 * Obtém o valor da propriedade vicms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMS() {
				return vicms;
			}

			/**
			 * Define o valor da propriedade vicms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMS(String value) {
				this.vicms = value;
			}

			/**
			 * Obtém o valor da propriedade modBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBCST() {
				return modBCST;
			}

			/**
			 * Define o valor da propriedade modBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBCST(String value) {
				this.modBCST = value;
			}

			/**
			 * Obtém o valor da propriedade pmvast.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPMVAST() {
				return pmvast;
			}

			/**
			 * Define o valor da propriedade pmvast.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPMVAST(String value) {
				this.pmvast = value;
			}

			/**
			 * Obtém o valor da propriedade pRedBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPRedBCST() {
				return pRedBCST;
			}

			/**
			 * Define o valor da propriedade pRedBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPRedBCST(String value) {
				this.pRedBCST = value;
			}

			/**
			 * Obtém o valor da propriedade vbcst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBCST() {
				return vbcst;
			}

			/**
			 * Define o valor da propriedade vbcst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBCST(String value) {
				this.vbcst = value;
			}

			/**
			 * Obtém o valor da propriedade picmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMSST() {
				return picmsst;
			}

			/**
			 * Define o valor da propriedade picmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMSST(String value) {
				this.picmsst = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSST() {
				return vicmsst;
			}

			/**
			 * Define o valor da propriedade vicmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSST(String value) {
				this.vicmsst = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsDeson.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSDeson() {
				return vicmsDeson;
			}

			/**
			 * Define o valor da propriedade vicmsDeson.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSDeson(String value) {
				this.vicmsDeson = value;
			}

			/**
			 * Obtém o valor da propriedade motDesICMS.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getMotDesICMS() {
				return motDesICMS;
			}

			/**
			 * Define o valor da propriedade motDesICMS.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setMotDesICMS(String value) {
				this.motDesICMS = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="90"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;sequence minOccurs="0">
		 *           &lt;element name="modBC">
		 *             &lt;simpleType>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                 &lt;whiteSpace value="preserve"/>
		 *                 &lt;enumeration value="0"/>
		 *                 &lt;enumeration value="1"/>
		 *                 &lt;enumeration value="2"/>
		 *                 &lt;enumeration value="3"/>
		 *               &lt;/restriction>
		 *             &lt;/simpleType>
		 *           &lt;/element>
		 *           &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *           &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *           &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *           &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;/sequence>
		 *         &lt;sequence minOccurs="0">
		 *           &lt;element name="modBCST">
		 *             &lt;simpleType>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                 &lt;whiteSpace value="preserve"/>
		 *                 &lt;enumeration value="0"/>
		 *                 &lt;enumeration value="1"/>
		 *                 &lt;enumeration value="2"/>
		 *                 &lt;enumeration value="3"/>
		 *                 &lt;enumeration value="4"/>
		 *                 &lt;enumeration value="5"/>
		 *               &lt;/restriction>
		 *             &lt;/simpleType>
		 *           &lt;/element>
		 *           &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *           &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *           &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *           &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *           &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;/sequence>
		 *         &lt;sequence minOccurs="0">
		 *           &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *           &lt;element name="motDesICMS">
		 *             &lt;simpleType>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                 &lt;whiteSpace value="preserve"/>
		 *                 &lt;enumeration value="3"/>
		 *                 &lt;enumeration value="9"/>
		 *                 &lt;enumeration value="12"/>
		 *               &lt;/restriction>
		 *             &lt;/simpleType>
		 *           &lt;/element>
		 *         &lt;/sequence>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "cst", "modBC", "vbc", "pRedBC", "picms", "vicms", "modBCST",
				"pmvast", "pRedBCST", "vbcst", "picmsst", "vicmsst", "vicmsDeson", "motDesICMS" })
		public static class ICMS90 {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CST", required = true)
			protected String cst;
			protected String modBC;
			@XmlElement(name = "vBC")
			protected String vbc;
			protected String pRedBC;
			@XmlElement(name = "pICMS")
			protected String picms;
			@XmlElement(name = "vICMS")
			protected String vicms;
			protected String modBCST;
			@XmlElement(name = "pMVAST")
			protected String pmvast;
			protected String pRedBCST;
			@XmlElement(name = "vBCST")
			protected String vbcst;
			@XmlElement(name = "pICMSST")
			protected String picmsst;
			@XmlElement(name = "vICMSST")
			protected String vicmsst;
			@XmlElement(name = "vICMSDeson")
			protected String vicmsDeson;
			protected String motDesICMS;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade modBC.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBC() {
				return modBC;
			}

			/**
			 * Define o valor da propriedade modBC.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBC(String value) {
				this.modBC = value;
			}

			/**
			 * Obtém o valor da propriedade vbc.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBC() {
				return vbc;
			}

			/**
			 * Define o valor da propriedade vbc.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBC(String value) {
				this.vbc = value;
			}

			/**
			 * Obtém o valor da propriedade pRedBC.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPRedBC() {
				return pRedBC;
			}

			/**
			 * Define o valor da propriedade pRedBC.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPRedBC(String value) {
				this.pRedBC = value;
			}

			/**
			 * Obtém o valor da propriedade picms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMS() {
				return picms;
			}

			/**
			 * Define o valor da propriedade picms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMS(String value) {
				this.picms = value;
			}

			/**
			 * Obtém o valor da propriedade vicms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMS() {
				return vicms;
			}

			/**
			 * Define o valor da propriedade vicms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMS(String value) {
				this.vicms = value;
			}

			/**
			 * Obtém o valor da propriedade modBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBCST() {
				return modBCST;
			}

			/**
			 * Define o valor da propriedade modBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBCST(String value) {
				this.modBCST = value;
			}

			/**
			 * Obtém o valor da propriedade pmvast.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPMVAST() {
				return pmvast;
			}

			/**
			 * Define o valor da propriedade pmvast.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPMVAST(String value) {
				this.pmvast = value;
			}

			/**
			 * Obtém o valor da propriedade pRedBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPRedBCST() {
				return pRedBCST;
			}

			/**
			 * Define o valor da propriedade pRedBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPRedBCST(String value) {
				this.pRedBCST = value;
			}

			/**
			 * Obtém o valor da propriedade vbcst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBCST() {
				return vbcst;
			}

			/**
			 * Define o valor da propriedade vbcst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBCST(String value) {
				this.vbcst = value;
			}

			/**
			 * Obtém o valor da propriedade picmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMSST() {
				return picmsst;
			}

			/**
			 * Define o valor da propriedade picmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMSST(String value) {
				this.picmsst = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSST() {
				return vicmsst;
			}

			/**
			 * Define o valor da propriedade vicmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSST(String value) {
				this.vicmsst = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsDeson.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSDeson() {
				return vicmsDeson;
			}

			/**
			 * Define o valor da propriedade vicmsDeson.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSDeson(String value) {
				this.vicmsDeson = value;
			}

			/**
			 * Obtém o valor da propriedade motDesICMS.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getMotDesICMS() {
				return motDesICMS;
			}

			/**
			 * Define o valor da propriedade motDesICMS.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setMotDesICMS(String value) {
				this.motDesICMS = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="10"/>
		 *               &lt;enumeration value="90"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="modBC">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="0"/>
		 *               &lt;enumeration value="1"/>
		 *               &lt;enumeration value="2"/>
		 *               &lt;enumeration value="3"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="modBCST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="0"/>
		 *               &lt;enumeration value="1"/>
		 *               &lt;enumeration value="2"/>
		 *               &lt;enumeration value="3"/>
		 *               &lt;enumeration value="4"/>
		 *               &lt;enumeration value="5"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *         &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="pBCOp" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
		 *         &lt;element name="UFST" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "cst", "modBC", "vbc", "pRedBC", "picms", "vicms", "modBCST",
				"pmvast", "pRedBCST", "vbcst", "picmsst", "vicmsst", "pbcOp", "ufst" })
		public static class ICMSPart {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CST", required = true)
			protected String cst;
			@XmlElement(required = true)
			protected String modBC;
			@XmlElement(name = "vBC", required = true)
			protected String vbc;
			protected String pRedBC;
			@XmlElement(name = "pICMS", required = true)
			protected String picms;
			@XmlElement(name = "vICMS", required = true)
			protected String vicms;
			@XmlElement(required = true)
			protected String modBCST;
			@XmlElement(name = "pMVAST")
			protected String pmvast;
			protected String pRedBCST;
			@XmlElement(name = "vBCST", required = true)
			protected String vbcst;
			@XmlElement(name = "pICMSST", required = true)
			protected String picmsst;
			@XmlElement(name = "vICMSST", required = true)
			protected String vicmsst;
			@XmlElement(name = "pBCOp", required = true)
			protected String pbcOp;
			@XmlElement(name = "UFST", required = true)
			@XmlSchemaType(name = "string")
			protected TUf ufst;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade modBC.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBC() {
				return modBC;
			}

			/**
			 * Define o valor da propriedade modBC.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBC(String value) {
				this.modBC = value;
			}

			/**
			 * Obtém o valor da propriedade vbc.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBC() {
				return vbc;
			}

			/**
			 * Define o valor da propriedade vbc.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBC(String value) {
				this.vbc = value;
			}

			/**
			 * Obtém o valor da propriedade pRedBC.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPRedBC() {
				return pRedBC;
			}

			/**
			 * Define o valor da propriedade pRedBC.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPRedBC(String value) {
				this.pRedBC = value;
			}

			/**
			 * Obtém o valor da propriedade picms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMS() {
				return picms;
			}

			/**
			 * Define o valor da propriedade picms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMS(String value) {
				this.picms = value;
			}

			/**
			 * Obtém o valor da propriedade vicms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMS() {
				return vicms;
			}

			/**
			 * Define o valor da propriedade vicms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMS(String value) {
				this.vicms = value;
			}

			/**
			 * Obtém o valor da propriedade modBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBCST() {
				return modBCST;
			}

			/**
			 * Define o valor da propriedade modBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBCST(String value) {
				this.modBCST = value;
			}

			/**
			 * Obtém o valor da propriedade pmvast.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPMVAST() {
				return pmvast;
			}

			/**
			 * Define o valor da propriedade pmvast.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPMVAST(String value) {
				this.pmvast = value;
			}

			/**
			 * Obtém o valor da propriedade pRedBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPRedBCST() {
				return pRedBCST;
			}

			/**
			 * Define o valor da propriedade pRedBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPRedBCST(String value) {
				this.pRedBCST = value;
			}

			/**
			 * Obtém o valor da propriedade vbcst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBCST() {
				return vbcst;
			}

			/**
			 * Define o valor da propriedade vbcst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBCST(String value) {
				this.vbcst = value;
			}

			/**
			 * Obtém o valor da propriedade picmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMSST() {
				return picmsst;
			}

			/**
			 * Define o valor da propriedade picmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMSST(String value) {
				this.picmsst = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSST() {
				return vicmsst;
			}

			/**
			 * Define o valor da propriedade vicmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSST(String value) {
				this.vicmsst = value;
			}

			/**
			 * Obtém o valor da propriedade pbcOp.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPBCOp() {
				return pbcOp;
			}

			/**
			 * Define o valor da propriedade pbcOp.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPBCOp(String value) {
				this.pbcOp = value;
			}

			/**
			 * Obtém o valor da propriedade ufst.
			 * 
			 * @return possible object is {@link TUf }
			 * 
			 */
			public TUf getUFST() {
				return ufst;
			}

			/**
			 * Define o valor da propriedade ufst.
			 * 
			 * @param value
			 *            allowed object is {@link TUf }
			 * 
			 */
			public void setUFST(TUf value) {
				this.ufst = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CSOSN">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="101"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="pCredSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vCredICMSSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "csosn", "pCredSN", "vCredICMSSN" })
		public static class ICMSSN101 {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CSOSN", required = true)
			protected String csosn;
			@XmlElement(required = true)
			protected String pCredSN;
			@XmlElement(required = true)
			protected String vCredICMSSN;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade csosn.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCSOSN() {
				return csosn;
			}

			/**
			 * Define o valor da propriedade csosn.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCSOSN(String value) {
				this.csosn = value;
			}

			/**
			 * Obtém o valor da propriedade pCredSN.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPCredSN() {
				return pCredSN;
			}

			/**
			 * Define o valor da propriedade pCredSN.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPCredSN(String value) {
				this.pCredSN = value;
			}

			/**
			 * Obtém o valor da propriedade vCredICMSSN.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVCredICMSSN() {
				return vCredICMSSN;
			}

			/**
			 * Define o valor da propriedade vCredICMSSN.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVCredICMSSN(String value) {
				this.vCredICMSSN = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CSOSN">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="102"/>
		 *               &lt;enumeration value="103"/>
		 *               &lt;enumeration value="300"/>
		 *               &lt;enumeration value="400"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "csosn" })
		public static class ICMSSN102 {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CSOSN", required = true)
			protected String csosn;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade csosn.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCSOSN() {
				return csosn;
			}

			/**
			 * Define o valor da propriedade csosn.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCSOSN(String value) {
				this.csosn = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CSOSN">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="201"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="modBCST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="0"/>
		 *               &lt;enumeration value="1"/>
		 *               &lt;enumeration value="2"/>
		 *               &lt;enumeration value="3"/>
		 *               &lt;enumeration value="4"/>
		 *               &lt;enumeration value="5"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *         &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="pCredSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vCredICMSSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "csosn", "modBCST", "pmvast", "pRedBCST", "vbcst", "picmsst",
				"vicmsst", "pCredSN", "vCredICMSSN" })
		public static class ICMSSN201 {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CSOSN", required = true)
			protected String csosn;
			@XmlElement(required = true)
			protected String modBCST;
			@XmlElement(name = "pMVAST")
			protected String pmvast;
			protected String pRedBCST;
			@XmlElement(name = "vBCST", required = true)
			protected String vbcst;
			@XmlElement(name = "pICMSST", required = true)
			protected String picmsst;
			@XmlElement(name = "vICMSST", required = true)
			protected String vicmsst;
			@XmlElement(required = true)
			protected String pCredSN;
			@XmlElement(required = true)
			protected String vCredICMSSN;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade csosn.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCSOSN() {
				return csosn;
			}

			/**
			 * Define o valor da propriedade csosn.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCSOSN(String value) {
				this.csosn = value;
			}

			/**
			 * Obtém o valor da propriedade modBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBCST() {
				return modBCST;
			}

			/**
			 * Define o valor da propriedade modBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBCST(String value) {
				this.modBCST = value;
			}

			/**
			 * Obtém o valor da propriedade pmvast.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPMVAST() {
				return pmvast;
			}

			/**
			 * Define o valor da propriedade pmvast.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPMVAST(String value) {
				this.pmvast = value;
			}

			/**
			 * Obtém o valor da propriedade pRedBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPRedBCST() {
				return pRedBCST;
			}

			/**
			 * Define o valor da propriedade pRedBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPRedBCST(String value) {
				this.pRedBCST = value;
			}

			/**
			 * Obtém o valor da propriedade vbcst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBCST() {
				return vbcst;
			}

			/**
			 * Define o valor da propriedade vbcst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBCST(String value) {
				this.vbcst = value;
			}

			/**
			 * Obtém o valor da propriedade picmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMSST() {
				return picmsst;
			}

			/**
			 * Define o valor da propriedade picmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMSST(String value) {
				this.picmsst = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSST() {
				return vicmsst;
			}

			/**
			 * Define o valor da propriedade vicmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSST(String value) {
				this.vicmsst = value;
			}

			/**
			 * Obtém o valor da propriedade pCredSN.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPCredSN() {
				return pCredSN;
			}

			/**
			 * Define o valor da propriedade pCredSN.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPCredSN(String value) {
				this.pCredSN = value;
			}

			/**
			 * Obtém o valor da propriedade vCredICMSSN.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVCredICMSSN() {
				return vCredICMSSN;
			}

			/**
			 * Define o valor da propriedade vCredICMSSN.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVCredICMSSN(String value) {
				this.vCredICMSSN = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CSOSN">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="202"/>
		 *               &lt;enumeration value="203"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="modBCST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="0"/>
		 *               &lt;enumeration value="1"/>
		 *               &lt;enumeration value="2"/>
		 *               &lt;enumeration value="3"/>
		 *               &lt;enumeration value="4"/>
		 *               &lt;enumeration value="5"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *         &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "csosn", "modBCST", "pmvast", "pRedBCST", "vbcst", "picmsst",
				"vicmsst" })
		public static class ICMSSN202 {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CSOSN", required = true)
			protected String csosn;
			@XmlElement(required = true)
			protected String modBCST;
			@XmlElement(name = "pMVAST")
			protected String pmvast;
			protected String pRedBCST;
			@XmlElement(name = "vBCST", required = true)
			protected String vbcst;
			@XmlElement(name = "pICMSST", required = true)
			protected String picmsst;
			@XmlElement(name = "vICMSST", required = true)
			protected String vicmsst;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade csosn.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCSOSN() {
				return csosn;
			}

			/**
			 * Define o valor da propriedade csosn.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCSOSN(String value) {
				this.csosn = value;
			}

			/**
			 * Obtém o valor da propriedade modBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBCST() {
				return modBCST;
			}

			/**
			 * Define o valor da propriedade modBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBCST(String value) {
				this.modBCST = value;
			}

			/**
			 * Obtém o valor da propriedade pmvast.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPMVAST() {
				return pmvast;
			}

			/**
			 * Define o valor da propriedade pmvast.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPMVAST(String value) {
				this.pmvast = value;
			}

			/**
			 * Obtém o valor da propriedade pRedBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPRedBCST() {
				return pRedBCST;
			}

			/**
			 * Define o valor da propriedade pRedBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPRedBCST(String value) {
				this.pRedBCST = value;
			}

			/**
			 * Obtém o valor da propriedade vbcst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBCST() {
				return vbcst;
			}

			/**
			 * Define o valor da propriedade vbcst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBCST(String value) {
				this.vbcst = value;
			}

			/**
			 * Obtém o valor da propriedade picmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMSST() {
				return picmsst;
			}

			/**
			 * Define o valor da propriedade picmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMSST(String value) {
				this.picmsst = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSST() {
				return vicmsst;
			}

			/**
			 * Define o valor da propriedade vicmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSST(String value) {
				this.vicmsst = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CSOSN">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="500"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;sequence minOccurs="0">
		 *           &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *           &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;/sequence>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "csosn", "vbcstRet", "vicmsstRet" })
		public static class ICMSSN500 {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CSOSN", required = true)
			protected String csosn;
			@XmlElement(name = "vBCSTRet")
			protected String vbcstRet;
			@XmlElement(name = "vICMSSTRet")
			protected String vicmsstRet;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade csosn.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCSOSN() {
				return csosn;
			}

			/**
			 * Define o valor da propriedade csosn.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCSOSN(String value) {
				this.csosn = value;
			}

			/**
			 * Obtém o valor da propriedade vbcstRet.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBCSTRet() {
				return vbcstRet;
			}

			/**
			 * Define o valor da propriedade vbcstRet.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBCSTRet(String value) {
				this.vbcstRet = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsstRet.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSSTRet() {
				return vicmsstRet;
			}

			/**
			 * Define o valor da propriedade vicmsstRet.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSSTRet(String value) {
				this.vicmsstRet = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CSOSN">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="900"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;sequence minOccurs="0">
		 *           &lt;element name="modBC">
		 *             &lt;simpleType>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                 &lt;whiteSpace value="preserve"/>
		 *                 &lt;enumeration value="0"/>
		 *                 &lt;enumeration value="1"/>
		 *                 &lt;enumeration value="2"/>
		 *                 &lt;enumeration value="3"/>
		 *               &lt;/restriction>
		 *             &lt;/simpleType>
		 *           &lt;/element>
		 *           &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *           &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *           &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *           &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;/sequence>
		 *         &lt;sequence minOccurs="0">
		 *           &lt;element name="modBCST">
		 *             &lt;simpleType>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                 &lt;whiteSpace value="preserve"/>
		 *                 &lt;enumeration value="0"/>
		 *                 &lt;enumeration value="1"/>
		 *                 &lt;enumeration value="2"/>
		 *                 &lt;enumeration value="3"/>
		 *                 &lt;enumeration value="4"/>
		 *                 &lt;enumeration value="5"/>
		 *               &lt;/restriction>
		 *             &lt;/simpleType>
		 *           &lt;/element>
		 *           &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *           &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
		 *           &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *           &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *           &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;/sequence>
		 *         &lt;sequence minOccurs="0">
		 *           &lt;element name="pCredSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *           &lt;element name="vCredICMSSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;/sequence>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "csosn", "modBC", "vbc", "pRedBC", "picms", "vicms", "modBCST",
				"pmvast", "pRedBCST", "vbcst", "picmsst", "vicmsst", "pCredSN", "vCredICMSSN" })
		public static class ICMSSN900 {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CSOSN", required = true)
			protected String csosn;
			protected String modBC;
			@XmlElement(name = "vBC")
			protected String vbc;
			protected String pRedBC;
			@XmlElement(name = "pICMS")
			protected String picms;
			@XmlElement(name = "vICMS")
			protected String vicms;
			protected String modBCST;
			@XmlElement(name = "pMVAST")
			protected String pmvast;
			protected String pRedBCST;
			@XmlElement(name = "vBCST")
			protected String vbcst;
			@XmlElement(name = "pICMSST")
			protected String picmsst;
			@XmlElement(name = "vICMSST")
			protected String vicmsst;
			protected String pCredSN;
			protected String vCredICMSSN;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade csosn.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCSOSN() {
				return csosn;
			}

			/**
			 * Define o valor da propriedade csosn.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCSOSN(String value) {
				this.csosn = value;
			}

			/**
			 * Obtém o valor da propriedade modBC.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBC() {
				return modBC;
			}

			/**
			 * Define o valor da propriedade modBC.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBC(String value) {
				this.modBC = value;
			}

			/**
			 * Obtém o valor da propriedade vbc.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBC() {
				return vbc;
			}

			/**
			 * Define o valor da propriedade vbc.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBC(String value) {
				this.vbc = value;
			}

			/**
			 * Obtém o valor da propriedade pRedBC.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPRedBC() {
				return pRedBC;
			}

			/**
			 * Define o valor da propriedade pRedBC.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPRedBC(String value) {
				this.pRedBC = value;
			}

			/**
			 * Obtém o valor da propriedade picms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMS() {
				return picms;
			}

			/**
			 * Define o valor da propriedade picms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMS(String value) {
				this.picms = value;
			}

			/**
			 * Obtém o valor da propriedade vicms.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMS() {
				return vicms;
			}

			/**
			 * Define o valor da propriedade vicms.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMS(String value) {
				this.vicms = value;
			}

			/**
			 * Obtém o valor da propriedade modBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModBCST() {
				return modBCST;
			}

			/**
			 * Define o valor da propriedade modBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModBCST(String value) {
				this.modBCST = value;
			}

			/**
			 * Obtém o valor da propriedade pmvast.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPMVAST() {
				return pmvast;
			}

			/**
			 * Define o valor da propriedade pmvast.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPMVAST(String value) {
				this.pmvast = value;
			}

			/**
			 * Obtém o valor da propriedade pRedBCST.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPRedBCST() {
				return pRedBCST;
			}

			/**
			 * Define o valor da propriedade pRedBCST.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPRedBCST(String value) {
				this.pRedBCST = value;
			}

			/**
			 * Obtém o valor da propriedade vbcst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBCST() {
				return vbcst;
			}

			/**
			 * Define o valor da propriedade vbcst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBCST(String value) {
				this.vbcst = value;
			}

			/**
			 * Obtém o valor da propriedade picmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPICMSST() {
				return picmsst;
			}

			/**
			 * Define o valor da propriedade picmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPICMSST(String value) {
				this.picmsst = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSST() {
				return vicmsst;
			}

			/**
			 * Define o valor da propriedade vicmsst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSST(String value) {
				this.vicmsst = value;
			}

			/**
			 * Obtém o valor da propriedade pCredSN.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPCredSN() {
				return pCredSN;
			}

			/**
			 * Define o valor da propriedade pCredSN.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPCredSN(String value) {
				this.pCredSN = value;
			}

			/**
			 * Obtém o valor da propriedade vCredICMSSN.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVCredICMSSN() {
				return vCredICMSSN;
			}

			/**
			 * Define o valor da propriedade vCredICMSSN.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVCredICMSSN(String value) {
				this.vCredICMSSN = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="41"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="vBCSTDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="vICMSSTDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "orig", "cst", "vbcstRet", "vicmsstRet", "vbcstDest", "vicmsstDest" })
		public static class ICMSST {

			@XmlElement(required = true)
			protected String orig;
			@XmlElement(name = "CST", required = true)
			protected String cst;
			@XmlElement(name = "vBCSTRet", required = true)
			protected String vbcstRet;
			@XmlElement(name = "vICMSSTRet", required = true)
			protected String vicmsstRet;
			@XmlElement(name = "vBCSTDest", required = true)
			protected String vbcstDest;
			@XmlElement(name = "vICMSSTDest", required = true)
			protected String vicmsstDest;

			/**
			 * Obtém o valor da propriedade orig.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getOrig() {
				return orig;
			}

			/**
			 * Define o valor da propriedade orig.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setOrig(String value) {
				this.orig = value;
			}

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade vbcstRet.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBCSTRet() {
				return vbcstRet;
			}

			/**
			 * Define o valor da propriedade vbcstRet.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBCSTRet(String value) {
				this.vbcstRet = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsstRet.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSSTRet() {
				return vicmsstRet;
			}

			/**
			 * Define o valor da propriedade vicmsstRet.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSSTRet(String value) {
				this.vicmsstRet = value;
			}

			/**
			 * Obtém o valor da propriedade vbcstDest.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBCSTDest() {
				return vbcstDest;
			}

			/**
			 * Define o valor da propriedade vbcstDest.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBCSTDest(String value) {
				this.vbcstDest = value;
			}

			/**
			 * Obtém o valor da propriedade vicmsstDest.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVICMSSTDest() {
				return vicmsstDest;
			}

			/**
			 * Define o valor da propriedade vicmsstDest.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVICMSSTDest(String value) {
				this.vicmsstDest = value;
			}

		}

	}

	/**
	 * <p>
	 * Classe Java de anonymous complex type.
	 * 
	 * <p>
	 * O seguinte fragmento do esquema especifica o conteúdo esperado contido
	 * dentro desta classe.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="vBCUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="pFCPUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *         &lt;element name="pICMSUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *         &lt;element name="pICMSInter">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;enumeration value="4.00"/>
	 *               &lt;enumeration value="7.00"/>
	 *               &lt;enumeration value="12.00"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="pICMSInterPart" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *         &lt;element name="vFCPUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vICMSUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vICMSUFRemet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "vbcufDest", "pfcpufDest", "picmsufDest", "picmsInter", "picmsInterPart",
			"vfcpufDest", "vicmsufDest", "vicmsufRemet" })
	public static class ICMSUFDest {

		@XmlElement(name = "vBCUFDest", required = true)
		protected String vbcufDest;
		@XmlElement(name = "pFCPUFDest", required = true)
		protected String pfcpufDest;
		@XmlElement(name = "pICMSUFDest", required = true)
		protected String picmsufDest;
		@XmlElement(name = "pICMSInter", required = true)
		protected String picmsInter;
		@XmlElement(name = "pICMSInterPart", required = true)
		protected String picmsInterPart;
		@XmlElement(name = "vFCPUFDest", required = true)
		protected String vfcpufDest;
		@XmlElement(name = "vICMSUFDest", required = true)
		protected String vicmsufDest;
		@XmlElement(name = "vICMSUFRemet", required = true)
		protected String vicmsufRemet;

		/**
		 * Obtém o valor da propriedade vbcufDest.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVBCUFDest() {
			return vbcufDest;
		}

		/**
		 * Define o valor da propriedade vbcufDest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVBCUFDest(String value) {
			this.vbcufDest = value;
		}

		/**
		 * Obtém o valor da propriedade pfcpufDest.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPFCPUFDest() {
			return pfcpufDest;
		}

		/**
		 * Define o valor da propriedade pfcpufDest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPFCPUFDest(String value) {
			this.pfcpufDest = value;
		}

		/**
		 * Obtém o valor da propriedade picmsufDest.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPICMSUFDest() {
			return picmsufDest;
		}

		/**
		 * Define o valor da propriedade picmsufDest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPICMSUFDest(String value) {
			this.picmsufDest = value;
		}

		/**
		 * Obtém o valor da propriedade picmsInter.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPICMSInter() {
			return picmsInter;
		}

		/**
		 * Define o valor da propriedade picmsInter.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPICMSInter(String value) {
			this.picmsInter = value;
		}

		/**
		 * Obtém o valor da propriedade picmsInterPart.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPICMSInterPart() {
			return picmsInterPart;
		}

		/**
		 * Define o valor da propriedade picmsInterPart.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPICMSInterPart(String value) {
			this.picmsInterPart = value;
		}

		/**
		 * Obtém o valor da propriedade vfcpufDest.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVFCPUFDest() {
			return vfcpufDest;
		}

		/**
		 * Define o valor da propriedade vfcpufDest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVFCPUFDest(String value) {
			this.vfcpufDest = value;
		}

		/**
		 * Obtém o valor da propriedade vicmsufDest.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVICMSUFDest() {
			return vicmsufDest;
		}

		/**
		 * Define o valor da propriedade vicmsufDest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVICMSUFDest(String value) {
			this.vicmsufDest = value;
		}

		/**
		 * Obtém o valor da propriedade vicmsufRemet.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVICMSUFRemet() {
			return vicmsufRemet;
		}

		/**
		 * Define o valor da propriedade vicmsufRemet.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVICMSUFRemet(String value) {
			this.vicmsufRemet = value;
		}

	}

	/**
	 * <p>
	 * Classe Java de anonymous complex type.
	 * 
	 * <p>
	 * O seguinte fragmento do esquema especifica o conteúdo esperado contido
	 * dentro desta classe.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vDespAdu" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vII" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vIOF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "vbc", "vDespAdu", "vii", "viof" })
	public static class II {

		@XmlElement(name = "vBC", required = true)
		protected String vbc;
		@XmlElement(required = true)
		protected String vDespAdu;
		@XmlElement(name = "vII", required = true)
		protected String vii;
		@XmlElement(name = "vIOF", required = true)
		protected String viof;

		/**
		 * Obtém o valor da propriedade vbc.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVBC() {
			return vbc;
		}

		/**
		 * Define o valor da propriedade vbc.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVBC(String value) {
			this.vbc = value;
		}

		/**
		 * Obtém o valor da propriedade vDespAdu.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVDespAdu() {
			return vDespAdu;
		}

		/**
		 * Define o valor da propriedade vDespAdu.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVDespAdu(String value) {
			this.vDespAdu = value;
		}

		/**
		 * Obtém o valor da propriedade vii.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVII() {
			return vii;
		}

		/**
		 * Define o valor da propriedade vii.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVII(String value) {
			this.vii = value;
		}

		/**
		 * Obtém o valor da propriedade viof.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVIOF() {
			return viof;
		}

		/**
		 * Define o valor da propriedade viof.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVIOF(String value) {
			this.viof = value;
		}

	}

	/**
	 * <p>
	 * Classe Java de anonymous complex type.
	 * 
	 * <p>
	 * O seguinte fragmento do esquema especifica o conteúdo esperado contido
	 * dentro desta classe.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vAliq" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *         &lt;element name="vISSQN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="cMunFG" type="{http://www.portalfiscal.inf.br/nfe}TCodMunIBGE"/>
	 *         &lt;element name="cListServ" type="{http://www.portalfiscal.inf.br/nfe}TCListServ"/>
	 *         &lt;element name="vDeducao" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vOutro" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vDescIncond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vDescCond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vISSRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="indISS">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;enumeration value="1"/>
	 *               &lt;enumeration value="2"/>
	 *               &lt;enumeration value="3"/>
	 *               &lt;enumeration value="4"/>
	 *               &lt;enumeration value="5"/>
	 *               &lt;enumeration value="6"/>
	 *               &lt;enumeration value="7"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="cServico" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="20"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="cMun" type="{http://www.portalfiscal.inf.br/nfe}TCodMunIBGE" minOccurs="0"/>
	 *         &lt;element name="cPais" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;pattern value="[0-9]{1,4}"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="nProcesso" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="30"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="indIncentivo">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;enumeration value="1"/>
	 *               &lt;enumeration value="2"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "vbc", "vAliq", "vissqn", "cMunFG", "cListServ", "vDeducao", "vOutro",
			"vDescIncond", "vDescCond", "vissRet", "indISS", "cServico", "cMun", "cPais", "nProcesso", "indIncentivo" })
	public static class ISSQN {

		@XmlElement(name = "vBC", required = true)
		protected String vbc;
		@XmlElement(required = true)
		protected String vAliq;
		@XmlElement(name = "vISSQN", required = true)
		protected String vissqn;
		@XmlElement(required = true)
		protected String cMunFG;
		@XmlElement(required = true)
		protected String cListServ;
		protected String vDeducao;
		protected String vOutro;
		protected String vDescIncond;
		protected String vDescCond;
		@XmlElement(name = "vISSRet")
		protected String vissRet;
		@XmlElement(required = true)
		protected String indISS;
		protected String cServico;
		protected String cMun;
		protected String cPais;
		protected String nProcesso;
		@XmlElement(required = true)
		protected String indIncentivo;

		/**
		 * Obtém o valor da propriedade vbc.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVBC() {
			return vbc;
		}

		/**
		 * Define o valor da propriedade vbc.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVBC(String value) {
			this.vbc = value;
		}

		/**
		 * Obtém o valor da propriedade vAliq.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVAliq() {
			return vAliq;
		}

		/**
		 * Define o valor da propriedade vAliq.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVAliq(String value) {
			this.vAliq = value;
		}

		/**
		 * Obtém o valor da propriedade vissqn.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVISSQN() {
			return vissqn;
		}

		/**
		 * Define o valor da propriedade vissqn.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVISSQN(String value) {
			this.vissqn = value;
		}

		/**
		 * Obtém o valor da propriedade cMunFG.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCMunFG() {
			return cMunFG;
		}

		/**
		 * Define o valor da propriedade cMunFG.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCMunFG(String value) {
			this.cMunFG = value;
		}

		/**
		 * Obtém o valor da propriedade cListServ.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCListServ() {
			return cListServ;
		}

		/**
		 * Define o valor da propriedade cListServ.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCListServ(String value) {
			this.cListServ = value;
		}

		/**
		 * Obtém o valor da propriedade vDeducao.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVDeducao() {
			return vDeducao;
		}

		/**
		 * Define o valor da propriedade vDeducao.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVDeducao(String value) {
			this.vDeducao = value;
		}

		/**
		 * Obtém o valor da propriedade vOutro.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVOutro() {
			return vOutro;
		}

		/**
		 * Define o valor da propriedade vOutro.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVOutro(String value) {
			this.vOutro = value;
		}

		/**
		 * Obtém o valor da propriedade vDescIncond.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVDescIncond() {
			return vDescIncond;
		}

		/**
		 * Define o valor da propriedade vDescIncond.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVDescIncond(String value) {
			this.vDescIncond = value;
		}

		/**
		 * Obtém o valor da propriedade vDescCond.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVDescCond() {
			return vDescCond;
		}

		/**
		 * Define o valor da propriedade vDescCond.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVDescCond(String value) {
			this.vDescCond = value;
		}

		/**
		 * Obtém o valor da propriedade vissRet.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVISSRet() {
			return vissRet;
		}

		/**
		 * Define o valor da propriedade vissRet.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVISSRet(String value) {
			this.vissRet = value;
		}

		/**
		 * Obtém o valor da propriedade indISS.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getIndISS() {
			return indISS;
		}

		/**
		 * Define o valor da propriedade indISS.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setIndISS(String value) {
			this.indISS = value;
		}

		/**
		 * Obtém o valor da propriedade cServico.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCServico() {
			return cServico;
		}

		/**
		 * Define o valor da propriedade cServico.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCServico(String value) {
			this.cServico = value;
		}

		/**
		 * Obtém o valor da propriedade cMun.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCMun() {
			return cMun;
		}

		/**
		 * Define o valor da propriedade cMun.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCMun(String value) {
			this.cMun = value;
		}

		/**
		 * Obtém o valor da propriedade cPais.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCPais() {
			return cPais;
		}

		/**
		 * Define o valor da propriedade cPais.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCPais(String value) {
			this.cPais = value;
		}

		/**
		 * Obtém o valor da propriedade nProcesso.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNProcesso() {
			return nProcesso;
		}

		/**
		 * Define o valor da propriedade nProcesso.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setNProcesso(String value) {
			this.nProcesso = value;
		}

		/**
		 * Obtém o valor da propriedade indIncentivo.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getIndIncentivo() {
			return indIncentivo;
		}

		/**
		 * Define o valor da propriedade indIncentivo.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setIndIncentivo(String value) {
			this.indIncentivo = value;
		}

	}

	/**
	 * <p>
	 * Classe Java de anonymous complex type.
	 * 
	 * <p>
	 * O seguinte fragmento do esquema especifica o conteúdo esperado contido
	 * dentro desta classe.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;choice>
	 *         &lt;element name="PISAliq">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="CST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="01"/>
	 *                         &lt;enumeration value="02"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                   &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                   &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="PISQtde">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="CST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="03"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
	 *                   &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
	 *                   &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="PISNT">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="CST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="04"/>
	 *                         &lt;enumeration value="05"/>
	 *                         &lt;enumeration value="06"/>
	 *                         &lt;enumeration value="07"/>
	 *                         &lt;enumeration value="08"/>
	 *                         &lt;enumeration value="09"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="PISOutr">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="CST">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="49"/>
	 *                         &lt;enumeration value="50"/>
	 *                         &lt;enumeration value="51"/>
	 *                         &lt;enumeration value="52"/>
	 *                         &lt;enumeration value="53"/>
	 *                         &lt;enumeration value="54"/>
	 *                         &lt;enumeration value="55"/>
	 *                         &lt;enumeration value="56"/>
	 *                         &lt;enumeration value="60"/>
	 *                         &lt;enumeration value="61"/>
	 *                         &lt;enumeration value="62"/>
	 *                         &lt;enumeration value="63"/>
	 *                         &lt;enumeration value="64"/>
	 *                         &lt;enumeration value="65"/>
	 *                         &lt;enumeration value="66"/>
	 *                         &lt;enumeration value="67"/>
	 *                         &lt;enumeration value="70"/>
	 *                         &lt;enumeration value="71"/>
	 *                         &lt;enumeration value="72"/>
	 *                         &lt;enumeration value="73"/>
	 *                         &lt;enumeration value="74"/>
	 *                         &lt;enumeration value="75"/>
	 *                         &lt;enumeration value="98"/>
	 *                         &lt;enumeration value="99"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;choice>
	 *                     &lt;sequence>
	 *                       &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                       &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *                     &lt;/sequence>
	 *                     &lt;sequence>
	 *                       &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
	 *                       &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
	 *                     &lt;/sequence>
	 *                   &lt;/choice>
	 *                   &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/choice>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "pisAliq", "pisQtde", "pisnt", "pisOutr" })
	public static class PIS {

		@XmlElement(name = "PISAliq")
		protected Imposto.PIS.PISAliq pisAliq;
		@XmlElement(name = "PISQtde")
		protected Imposto.PIS.PISQtde pisQtde;
		@XmlElement(name = "PISNT")
		protected Imposto.PIS.PISNT pisnt;
		@XmlElement(name = "PISOutr")
		protected Imposto.PIS.PISOutr pisOutr;

		/**
		 * Obtém o valor da propriedade pisAliq.
		 * 
		 * @return possible object is {@link Imposto.PIS.PISAliq }
		 * 
		 */
		public Imposto.PIS.PISAliq getPISAliq() {
			return pisAliq;
		}

		/**
		 * Define o valor da propriedade pisAliq.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.PIS.PISAliq }
		 * 
		 */
		public void setPISAliq(Imposto.PIS.PISAliq value) {
			this.pisAliq = value;
		}

		/**
		 * Obtém o valor da propriedade pisQtde.
		 * 
		 * @return possible object is {@link Imposto.PIS.PISQtde }
		 * 
		 */
		public Imposto.PIS.PISQtde getPISQtde() {
			return pisQtde;
		}

		/**
		 * Define o valor da propriedade pisQtde.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.PIS.PISQtde }
		 * 
		 */
		public void setPISQtde(Imposto.PIS.PISQtde value) {
			this.pisQtde = value;
		}

		/**
		 * Obtém o valor da propriedade pisnt.
		 * 
		 * @return possible object is {@link Imposto.PIS.PISNT }
		 * 
		 */
		public Imposto.PIS.PISNT getPISNT() {
			return pisnt;
		}

		/**
		 * Define o valor da propriedade pisnt.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.PIS.PISNT }
		 * 
		 */
		public void setPISNT(Imposto.PIS.PISNT value) {
			this.pisnt = value;
		}

		/**
		 * Obtém o valor da propriedade pisOutr.
		 * 
		 * @return possible object is {@link Imposto.PIS.PISOutr }
		 * 
		 */
		public Imposto.PIS.PISOutr getPISOutr() {
			return pisOutr;
		}

		/**
		 * Define o valor da propriedade pisOutr.
		 * 
		 * @param value
		 *            allowed object is {@link Imposto.PIS.PISOutr }
		 * 
		 */
		public void setPISOutr(Imposto.PIS.PISOutr value) {
			this.pisOutr = value;
		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="01"/>
		 *               &lt;enumeration value="02"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *         &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *         &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "cst", "vbc", "ppis", "vpis" })
		public static class PISAliq {

			@XmlElement(name = "CST", required = true)
			protected String cst;
			@XmlElement(name = "vBC", required = true)
			protected String vbc;
			@XmlElement(name = "pPIS", required = true)
			protected String ppis;
			@XmlElement(name = "vPIS", required = true)
			protected String vpis;

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade vbc.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBC() {
				return vbc;
			}

			/**
			 * Define o valor da propriedade vbc.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBC(String value) {
				this.vbc = value;
			}

			/**
			 * Obtém o valor da propriedade ppis.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPPIS() {
				return ppis;
			}

			/**
			 * Define o valor da propriedade ppis.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPPIS(String value) {
				this.ppis = value;
			}

			/**
			 * Obtém o valor da propriedade vpis.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVPIS() {
				return vpis;
			}

			/**
			 * Define o valor da propriedade vpis.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVPIS(String value) {
				this.vpis = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="04"/>
		 *               &lt;enumeration value="05"/>
		 *               &lt;enumeration value="06"/>
		 *               &lt;enumeration value="07"/>
		 *               &lt;enumeration value="08"/>
		 *               &lt;enumeration value="09"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "cst" })
		public static class PISNT {

			@XmlElement(name = "CST", required = true)
			protected String cst;

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="49"/>
		 *               &lt;enumeration value="50"/>
		 *               &lt;enumeration value="51"/>
		 *               &lt;enumeration value="52"/>
		 *               &lt;enumeration value="53"/>
		 *               &lt;enumeration value="54"/>
		 *               &lt;enumeration value="55"/>
		 *               &lt;enumeration value="56"/>
		 *               &lt;enumeration value="60"/>
		 *               &lt;enumeration value="61"/>
		 *               &lt;enumeration value="62"/>
		 *               &lt;enumeration value="63"/>
		 *               &lt;enumeration value="64"/>
		 *               &lt;enumeration value="65"/>
		 *               &lt;enumeration value="66"/>
		 *               &lt;enumeration value="67"/>
		 *               &lt;enumeration value="70"/>
		 *               &lt;enumeration value="71"/>
		 *               &lt;enumeration value="72"/>
		 *               &lt;enumeration value="73"/>
		 *               &lt;enumeration value="74"/>
		 *               &lt;enumeration value="75"/>
		 *               &lt;enumeration value="98"/>
		 *               &lt;enumeration value="99"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;choice>
		 *           &lt;sequence>
		 *             &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *             &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
		 *           &lt;/sequence>
		 *           &lt;sequence>
		 *             &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
		 *             &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
		 *           &lt;/sequence>
		 *         &lt;/choice>
		 *         &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "cst", "vbc", "ppis", "qbcProd", "vAliqProd", "vpis" })
		public static class PISOutr {

			@XmlElement(name = "CST", required = true)
			protected String cst;
			@XmlElement(name = "vBC")
			protected String vbc;
			@XmlElement(name = "pPIS")
			protected String ppis;
			@XmlElement(name = "qBCProd")
			protected String qbcProd;
			protected String vAliqProd;
			@XmlElement(name = "vPIS", required = true)
			protected String vpis;

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade vbc.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVBC() {
				return vbc;
			}

			/**
			 * Define o valor da propriedade vbc.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVBC(String value) {
				this.vbc = value;
			}

			/**
			 * Obtém o valor da propriedade ppis.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPPIS() {
				return ppis;
			}

			/**
			 * Define o valor da propriedade ppis.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPPIS(String value) {
				this.ppis = value;
			}

			/**
			 * Obtém o valor da propriedade qbcProd.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getQBCProd() {
				return qbcProd;
			}

			/**
			 * Define o valor da propriedade qbcProd.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setQBCProd(String value) {
				this.qbcProd = value;
			}

			/**
			 * Obtém o valor da propriedade vAliqProd.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVAliqProd() {
				return vAliqProd;
			}

			/**
			 * Define o valor da propriedade vAliqProd.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVAliqProd(String value) {
				this.vAliqProd = value;
			}

			/**
			 * Obtém o valor da propriedade vpis.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVPIS() {
				return vpis;
			}

			/**
			 * Define o valor da propriedade vpis.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVPIS(String value) {
				this.vpis = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado
		 * contido dentro desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="CST">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="03"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
		 *         &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
		 *         &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "cst", "qbcProd", "vAliqProd", "vpis" })
		public static class PISQtde {

			@XmlElement(name = "CST", required = true)
			protected String cst;
			@XmlElement(name = "qBCProd", required = true)
			protected String qbcProd;
			@XmlElement(required = true)
			protected String vAliqProd;
			@XmlElement(name = "vPIS", required = true)
			protected String vpis;

			/**
			 * Obtém o valor da propriedade cst.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCST() {
				return cst;
			}

			/**
			 * Define o valor da propriedade cst.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCST(String value) {
				this.cst = value;
			}

			/**
			 * Obtém o valor da propriedade qbcProd.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getQBCProd() {
				return qbcProd;
			}

			/**
			 * Define o valor da propriedade qbcProd.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setQBCProd(String value) {
				this.qbcProd = value;
			}

			/**
			 * Obtém o valor da propriedade vAliqProd.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVAliqProd() {
				return vAliqProd;
			}

			/**
			 * Define o valor da propriedade vAliqProd.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVAliqProd(String value) {
				this.vAliqProd = value;
			}

			/**
			 * Obtém o valor da propriedade vpis.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVPIS() {
				return vpis;
			}

			/**
			 * Define o valor da propriedade vpis.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVPIS(String value) {
				this.vpis = value;
			}

		}

	}

	/**
	 * <p>
	 * Classe Java de anonymous complex type.
	 * 
	 * <p>
	 * O seguinte fragmento do esquema especifica o conteúdo esperado contido
	 * dentro desta classe.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;choice>
	 *           &lt;sequence>
	 *             &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc"/>
	 *             &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *           &lt;/sequence>
	 *           &lt;sequence>
	 *             &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204"/>
	 *             &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104"/>
	 *           &lt;/sequence>
	 *         &lt;/choice>
	 *         &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "vbc", "ppis", "qbcProd", "vAliqProd", "vpis" })
	public static class PISST {

		@XmlElement(name = "vBC")
		protected String vbc;
		@XmlElement(name = "pPIS")
		protected String ppis;
		@XmlElement(name = "qBCProd")
		protected String qbcProd;
		protected String vAliqProd;
		@XmlElement(name = "vPIS", required = true)
		protected String vpis;

		/**
		 * Obtém o valor da propriedade vbc.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVBC() {
			return vbc;
		}

		/**
		 * Define o valor da propriedade vbc.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVBC(String value) {
			this.vbc = value;
		}

		/**
		 * Obtém o valor da propriedade ppis.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPPIS() {
			return ppis;
		}

		/**
		 * Define o valor da propriedade ppis.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPPIS(String value) {
			this.ppis = value;
		}

		/**
		 * Obtém o valor da propriedade qbcProd.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getQBCProd() {
			return qbcProd;
		}

		/**
		 * Define o valor da propriedade qbcProd.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setQBCProd(String value) {
			this.qbcProd = value;
		}

		/**
		 * Obtém o valor da propriedade vAliqProd.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVAliqProd() {
			return vAliqProd;
		}

		/**
		 * Define o valor da propriedade vAliqProd.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVAliqProd(String value) {
			this.vAliqProd = value;
		}

		/**
		 * Obtém o valor da propriedade vpis.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVPIS() {
			return vpis;
		}

		/**
		 * Define o valor da propriedade vpis.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVPIS(String value) {
			this.vpis = value;
		}

	}

}