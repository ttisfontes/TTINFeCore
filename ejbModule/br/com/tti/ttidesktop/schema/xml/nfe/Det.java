package br.com.tti.ttidesktop.schema.xml.nfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="prod">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cProd">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;maxLength value="60"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cEAN">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[0-9]{0}|[0-9]{8}|[0-9]{12,14}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xProd">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;maxLength value="120"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NCM">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[0-9]{2}|[0-9]{8}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NVE" maxOccurs="8" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[A-Z]{2}[0-9]{4}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CEST" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[0-9]{7}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="EXTIPI" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[0-9]{2,3}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CFOP">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[1,2,3,5,6,7]{1}[0-9]{3}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="uCom">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;maxLength value="6"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="qCom" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
 *                   &lt;element name="vUnCom" type="{http://www.portalfiscal.inf.br/nfe}TDec_1110v"/>
 *                   &lt;element name="vProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="cEANTrib">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[0-9]{0}|[0-9]{8}|[0-9]{12,14}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="uTrib">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;maxLength value="6"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="qTrib" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
 *                   &lt;element name="vUnTrib" type="{http://www.portalfiscal.inf.br/nfe}TDec_1110v"/>
 *                   &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vSeg" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vOutro" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="indTot">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="0"/>
 *                         &lt;enumeration value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DI" maxOccurs="100" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nDI">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="12"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dDI" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
 *                             &lt;element name="xLocDesemb">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UFDesemb" type="{http://www.portalfiscal.inf.br/nfe}TUfEmi"/>
 *                             &lt;element name="dDesemb" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
 *                             &lt;element name="tpViaTransp">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                   &lt;enumeration value="4"/>
 *                                   &lt;enumeration value="5"/>
 *                                   &lt;enumeration value="6"/>
 *                                   &lt;enumeration value="7"/>
 *                                   &lt;enumeration value="8"/>
 *                                   &lt;enumeration value="9"/>
 *                                   &lt;enumeration value="10"/>
 *                                   &lt;enumeration value="11"/>
 *                                   &lt;enumeration value="12"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="vAFRMM" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *                             &lt;element name="tpIntermedio">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj" minOccurs="0"/>
 *                             &lt;element name="UFTerceiro" type="{http://www.portalfiscal.inf.br/nfe}TUfEmi" minOccurs="0"/>
 *                             &lt;element name="cExportador">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="adi" maxOccurs="100">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nAdicao">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nSeqAdic">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="cFabricante">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="60"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="vDescDI" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                                       &lt;element name="nDraw" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;pattern value="[0-9]{0,11}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="detExport" maxOccurs="500" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nDraw" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{0,11}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="exportInd" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nRE">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;pattern value="[0-9]{0,12}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
 *                                       &lt;element name="qExport" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="xPed" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="15"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nItemPed" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[0-9]{1,6}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nFCI" type="{http://www.portalfiscal.inf.br/nfe}TGuid" minOccurs="0"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="veicProd">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="tpOp">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;whiteSpace value="preserve"/>
 *                                     &lt;enumeration value="0"/>
 *                                     &lt;enumeration value="1"/>
 *                                     &lt;enumeration value="2"/>
 *                                     &lt;enumeration value="3"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="chassi">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;length value="17"/>
 *                                     &lt;whiteSpace value="preserve"/>
 *                                     &lt;pattern value="[A-Z0-9]+"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="cCor">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="4"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="xCor">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="40"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="pot">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="4"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="cilin">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="4"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="pesoL">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="9"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="pesoB">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="9"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="nSerie">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="9"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="tpComb">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="2"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="nMotor">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="21"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="CMT">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="9"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="dist">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="4"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="anoMod">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;whiteSpace value="preserve"/>
 *                                     &lt;pattern value="[0-9]{4}"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="anoFab">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;whiteSpace value="preserve"/>
 *                                     &lt;pattern value="[0-9]{4}"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="tpPint">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;length value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="tpVeic">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;whiteSpace value="preserve"/>
 *                                     &lt;pattern value="[0-9]{1,2}"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="espVeic">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;whiteSpace value="preserve"/>
 *                                     &lt;pattern value="[0-9]{1}"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="VIN">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;length value="1"/>
 *                                     &lt;enumeration value="R"/>
 *                                     &lt;enumeration value="N"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="condVeic">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;whiteSpace value="preserve"/>
 *                                     &lt;enumeration value="1"/>
 *                                     &lt;enumeration value="2"/>
 *                                     &lt;enumeration value="3"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="cMod">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;whiteSpace value="preserve"/>
 *                                     &lt;pattern value="[0-9]{1,6}"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="cCorDENATRAN">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;whiteSpace value="preserve"/>
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="2"/>
 *                                     &lt;pattern value="[0-9]{1,2}"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="lota">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="3"/>
 *                                     &lt;whiteSpace value="preserve"/>
 *                                     &lt;pattern value="[0-9]{1,3}"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="tpRest">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;whiteSpace value="preserve"/>
 *                                     &lt;enumeration value="0"/>
 *                                     &lt;enumeration value="1"/>
 *                                     &lt;enumeration value="2"/>
 *                                     &lt;enumeration value="3"/>
 *                                     &lt;enumeration value="4"/>
 *                                     &lt;enumeration value="9"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="med" maxOccurs="500">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="nLote">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="20"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="qLote" type="{http://www.portalfiscal.inf.br/nfe}TDec_0803v"/>
 *                               &lt;element name="dFab" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
 *                               &lt;element name="dVal" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
 *                               &lt;element name="vPMC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="arma" maxOccurs="500">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="tpArma">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;whiteSpace value="preserve"/>
 *                                     &lt;enumeration value="0"/>
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="nSerie">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="15"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="nCano">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="15"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="descr">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="256"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="comb">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="cProdANP">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;whiteSpace value="preserve"/>
 *                                     &lt;pattern value="[0-9]{9}"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="pMixGN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0204v" minOccurs="0"/>
 *                               &lt;element name="CODIF" minOccurs="0">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;whiteSpace value="preserve"/>
 *                                     &lt;pattern value="[0-9]{1,21}"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="qTemp" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204temperatura" minOccurs="0"/>
 *                               &lt;element name="UFCons" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
 *                               &lt;element name="CIDE" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
 *                                         &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104"/>
 *                                         &lt;element name="vCIDE" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="encerrante" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="nBico">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;pattern value="[0-9]{1,3}"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="nBomba" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;pattern value="[0-9]{1,3}"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="nTanque">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;pattern value="[0-9]{1,3}"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="vEncIni" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203"/>
 *                                         &lt;element name="vEncFin" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="nRECOPI">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;whiteSpace value="preserve"/>
 *                           &lt;maxLength value="20"/>
 *                           &lt;pattern value="[0-9]{20}"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="imposto">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vTotTrib" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *                   &lt;choice>
 *                     &lt;sequence>
 *                       &lt;element name="ICMS">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;choice>
 *                                 &lt;element name="ICMS00">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="00"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="modBC">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="0"/>
 *                                                 &lt;enumeration value="1"/>
 *                                                 &lt;enumeration value="2"/>
 *                                                 &lt;enumeration value="3"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                           &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMS10">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="10"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="modBC">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="0"/>
 *                                                 &lt;enumeration value="1"/>
 *                                                 &lt;enumeration value="2"/>
 *                                                 &lt;enumeration value="3"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                           &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="modBCST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="0"/>
 *                                                 &lt;enumeration value="1"/>
 *                                                 &lt;enumeration value="2"/>
 *                                                 &lt;enumeration value="3"/>
 *                                                 &lt;enumeration value="4"/>
 *                                                 &lt;enumeration value="5"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                           &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                           &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                           &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMS20">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="20"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="modBC">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="0"/>
 *                                                 &lt;enumeration value="1"/>
 *                                                 &lt;enumeration value="2"/>
 *                                                 &lt;enumeration value="3"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                           &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                           &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;sequence minOccurs="0">
 *                                             &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                             &lt;element name="motDesICMS">
 *                                               &lt;simpleType>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                   &lt;whiteSpace value="preserve"/>
 *                                                   &lt;enumeration value="3"/>
 *                                                   &lt;enumeration value="9"/>
 *                                                   &lt;enumeration value="12"/>
 *                                                 &lt;/restriction>
 *                                               &lt;/simpleType>
 *                                             &lt;/element>
 *                                           &lt;/sequence>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMS30">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="30"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="modBCST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="0"/>
 *                                                 &lt;enumeration value="1"/>
 *                                                 &lt;enumeration value="2"/>
 *                                                 &lt;enumeration value="3"/>
 *                                                 &lt;enumeration value="4"/>
 *                                                 &lt;enumeration value="5"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                           &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                           &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                           &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;sequence minOccurs="0">
 *                                             &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                             &lt;element name="motDesICMS">
 *                                               &lt;simpleType>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                   &lt;whiteSpace value="preserve"/>
 *                                                   &lt;enumeration value="6"/>
 *                                                   &lt;enumeration value="7"/>
 *                                                   &lt;enumeration value="9"/>
 *                                                 &lt;/restriction>
 *                                               &lt;/simpleType>
 *                                             &lt;/element>
 *                                           &lt;/sequence>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMS40">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="40"/>
 *                                                 &lt;enumeration value="41"/>
 *                                                 &lt;enumeration value="50"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;sequence minOccurs="0">
 *                                             &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                             &lt;element name="motDesICMS">
 *                                               &lt;simpleType>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                   &lt;whiteSpace value="preserve"/>
 *                                                   &lt;enumeration value="1"/>
 *                                                   &lt;enumeration value="3"/>
 *                                                   &lt;enumeration value="4"/>
 *                                                   &lt;enumeration value="5"/>
 *                                                   &lt;enumeration value="6"/>
 *                                                   &lt;enumeration value="7"/>
 *                                                   &lt;enumeration value="8"/>
 *                                                   &lt;enumeration value="9"/>
 *                                                   &lt;enumeration value="10"/>
 *                                                   &lt;enumeration value="11"/>
 *                                                   &lt;enumeration value="16"/>
 *                                                 &lt;/restriction>
 *                                               &lt;/simpleType>
 *                                             &lt;/element>
 *                                           &lt;/sequence>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMS51">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="51"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="modBC" minOccurs="0">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="0"/>
 *                                                 &lt;enumeration value="1"/>
 *                                                 &lt;enumeration value="2"/>
 *                                                 &lt;enumeration value="3"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04" minOccurs="0"/>
 *                                           &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *                                           &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04" minOccurs="0"/>
 *                                           &lt;element name="vICMSOp" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *                                           &lt;element name="pDif" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Max100" minOccurs="0"/>
 *                                           &lt;element name="vICMSDif" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *                                           &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMS60">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="60"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;sequence minOccurs="0">
 *                                             &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                             &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;/sequence>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMS70">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="70"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="modBC">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="0"/>
 *                                                 &lt;enumeration value="1"/>
 *                                                 &lt;enumeration value="2"/>
 *                                                 &lt;enumeration value="3"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                           &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                           &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="modBCST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="0"/>
 *                                                 &lt;enumeration value="1"/>
 *                                                 &lt;enumeration value="2"/>
 *                                                 &lt;enumeration value="3"/>
 *                                                 &lt;enumeration value="4"/>
 *                                                 &lt;enumeration value="5"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                           &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                           &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                           &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;sequence minOccurs="0">
 *                                             &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                             &lt;element name="motDesICMS">
 *                                               &lt;simpleType>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                   &lt;whiteSpace value="preserve"/>
 *                                                   &lt;enumeration value="3"/>
 *                                                   &lt;enumeration value="9"/>
 *                                                   &lt;enumeration value="12"/>
 *                                                 &lt;/restriction>
 *                                               &lt;/simpleType>
 *                                             &lt;/element>
 *                                           &lt;/sequence>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMS90">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="90"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;sequence minOccurs="0">
 *                                             &lt;element name="modBC">
 *                                               &lt;simpleType>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                   &lt;whiteSpace value="preserve"/>
 *                                                   &lt;enumeration value="0"/>
 *                                                   &lt;enumeration value="1"/>
 *                                                   &lt;enumeration value="2"/>
 *                                                   &lt;enumeration value="3"/>
 *                                                 &lt;/restriction>
 *                                               &lt;/simpleType>
 *                                             &lt;/element>
 *                                             &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                             &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                             &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                             &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;/sequence>
 *                                           &lt;sequence minOccurs="0">
 *                                             &lt;element name="modBCST">
 *                                               &lt;simpleType>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                   &lt;whiteSpace value="preserve"/>
 *                                                   &lt;enumeration value="0"/>
 *                                                   &lt;enumeration value="1"/>
 *                                                   &lt;enumeration value="2"/>
 *                                                   &lt;enumeration value="3"/>
 *                                                   &lt;enumeration value="4"/>
 *                                                   &lt;enumeration value="5"/>
 *                                                 &lt;/restriction>
 *                                               &lt;/simpleType>
 *                                             &lt;/element>
 *                                             &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                             &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                             &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                             &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                             &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;/sequence>
 *                                           &lt;sequence minOccurs="0">
 *                                             &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                             &lt;element name="motDesICMS">
 *                                               &lt;simpleType>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                   &lt;whiteSpace value="preserve"/>
 *                                                   &lt;enumeration value="3"/>
 *                                                   &lt;enumeration value="9"/>
 *                                                   &lt;enumeration value="12"/>
 *                                                 &lt;/restriction>
 *                                               &lt;/simpleType>
 *                                             &lt;/element>
 *                                           &lt;/sequence>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMSPart">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="10"/>
 *                                                 &lt;enumeration value="90"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="modBC">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="0"/>
 *                                                 &lt;enumeration value="1"/>
 *                                                 &lt;enumeration value="2"/>
 *                                                 &lt;enumeration value="3"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                           &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                           &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="modBCST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="0"/>
 *                                                 &lt;enumeration value="1"/>
 *                                                 &lt;enumeration value="2"/>
 *                                                 &lt;enumeration value="3"/>
 *                                                 &lt;enumeration value="4"/>
 *                                                 &lt;enumeration value="5"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                           &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                           &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                           &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="pBCOp" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
 *                                           &lt;element name="UFST" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMSST">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="41"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="vBCSTDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="vICMSSTDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMSSN101">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CSOSN">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="101"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="pCredSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                           &lt;element name="vCredICMSSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMSSN102">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CSOSN">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="102"/>
 *                                                 &lt;enumeration value="103"/>
 *                                                 &lt;enumeration value="300"/>
 *                                                 &lt;enumeration value="400"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMSSN201">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CSOSN">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="201"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="modBCST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="0"/>
 *                                                 &lt;enumeration value="1"/>
 *                                                 &lt;enumeration value="2"/>
 *                                                 &lt;enumeration value="3"/>
 *                                                 &lt;enumeration value="4"/>
 *                                                 &lt;enumeration value="5"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                           &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                           &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                           &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="pCredSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                           &lt;element name="vCredICMSSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMSSN202">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CSOSN">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="202"/>
 *                                                 &lt;enumeration value="203"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="modBCST">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="0"/>
 *                                                 &lt;enumeration value="1"/>
 *                                                 &lt;enumeration value="2"/>
 *                                                 &lt;enumeration value="3"/>
 *                                                 &lt;enumeration value="4"/>
 *                                                 &lt;enumeration value="5"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                           &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                           &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                           &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMSSN500">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CSOSN">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="500"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;sequence minOccurs="0">
 *                                             &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                             &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;/sequence>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="ICMSSN900">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
 *                                           &lt;element name="CSOSN">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;enumeration value="900"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;sequence minOccurs="0">
 *                                             &lt;element name="modBC">
 *                                               &lt;simpleType>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                   &lt;whiteSpace value="preserve"/>
 *                                                   &lt;enumeration value="0"/>
 *                                                   &lt;enumeration value="1"/>
 *                                                   &lt;enumeration value="2"/>
 *                                                   &lt;enumeration value="3"/>
 *                                                 &lt;/restriction>
 *                                               &lt;/simpleType>
 *                                             &lt;/element>
 *                                             &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                             &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                             &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                             &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;/sequence>
 *                                           &lt;sequence minOccurs="0">
 *                                             &lt;element name="modBCST">
 *                                               &lt;simpleType>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                   &lt;whiteSpace value="preserve"/>
 *                                                   &lt;enumeration value="0"/>
 *                                                   &lt;enumeration value="1"/>
 *                                                   &lt;enumeration value="2"/>
 *                                                   &lt;enumeration value="3"/>
 *                                                   &lt;enumeration value="4"/>
 *                                                   &lt;enumeration value="5"/>
 *                                                 &lt;/restriction>
 *                                               &lt;/simpleType>
 *                                             &lt;/element>
 *                                             &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                             &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
 *                                             &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                             &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                             &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;/sequence>
 *                                           &lt;sequence minOccurs="0">
 *                                             &lt;element name="pCredSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                             &lt;element name="vCredICMSSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;/sequence>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                               &lt;/choice>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="IPI" type="{http://www.portalfiscal.inf.br/nfe}TIpi" minOccurs="0"/>
 *                       &lt;element name="II" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="vDespAdu" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="vII" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="vIOF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                     &lt;sequence>
 *                       &lt;element name="IPI" type="{http://www.portalfiscal.inf.br/nfe}TIpi" minOccurs="0"/>
 *                       &lt;element name="ISSQN">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="vAliq" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                 &lt;element name="vISSQN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="cMunFG" type="{http://www.portalfiscal.inf.br/nfe}TCodMunIBGE"/>
 *                                 &lt;element name="cListServ" type="{http://www.portalfiscal.inf.br/nfe}TCListServ"/>
 *                                 &lt;element name="vDeducao" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                                 &lt;element name="vOutro" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                                 &lt;element name="vDescIncond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                                 &lt;element name="vDescCond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                                 &lt;element name="vISSRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                                 &lt;element name="indISS">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="1"/>
 *                                       &lt;enumeration value="2"/>
 *                                       &lt;enumeration value="3"/>
 *                                       &lt;enumeration value="4"/>
 *                                       &lt;enumeration value="5"/>
 *                                       &lt;enumeration value="6"/>
 *                                       &lt;enumeration value="7"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="cServico" minOccurs="0">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;minLength value="1"/>
 *                                       &lt;maxLength value="20"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="cMun" type="{http://www.portalfiscal.inf.br/nfe}TCodMunIBGE" minOccurs="0"/>
 *                                 &lt;element name="cPais" minOccurs="0">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;pattern value="[0-9]{1,4}"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="nProcesso" minOccurs="0">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;minLength value="1"/>
 *                                       &lt;maxLength value="30"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="indIncentivo">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;whiteSpace value="preserve"/>
 *                                       &lt;enumeration value="1"/>
 *                                       &lt;enumeration value="2"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/choice>
 *                   &lt;element name="PIS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="PISAliq">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CST">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;enumeration value="01"/>
 *                                             &lt;enumeration value="02"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                       &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                       &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PISQtde">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CST">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;enumeration value="03"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
 *                                       &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
 *                                       &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PISNT">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CST">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;enumeration value="04"/>
 *                                             &lt;enumeration value="05"/>
 *                                             &lt;enumeration value="06"/>
 *                                             &lt;enumeration value="07"/>
 *                                             &lt;enumeration value="08"/>
 *                                             &lt;enumeration value="09"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PISOutr">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CST">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;enumeration value="49"/>
 *                                             &lt;enumeration value="50"/>
 *                                             &lt;enumeration value="51"/>
 *                                             &lt;enumeration value="52"/>
 *                                             &lt;enumeration value="53"/>
 *                                             &lt;enumeration value="54"/>
 *                                             &lt;enumeration value="55"/>
 *                                             &lt;enumeration value="56"/>
 *                                             &lt;enumeration value="60"/>
 *                                             &lt;enumeration value="61"/>
 *                                             &lt;enumeration value="62"/>
 *                                             &lt;enumeration value="63"/>
 *                                             &lt;enumeration value="64"/>
 *                                             &lt;enumeration value="65"/>
 *                                             &lt;enumeration value="66"/>
 *                                             &lt;enumeration value="67"/>
 *                                             &lt;enumeration value="70"/>
 *                                             &lt;enumeration value="71"/>
 *                                             &lt;enumeration value="72"/>
 *                                             &lt;enumeration value="73"/>
 *                                             &lt;enumeration value="74"/>
 *                                             &lt;enumeration value="75"/>
 *                                             &lt;enumeration value="98"/>
 *                                             &lt;enumeration value="99"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;choice>
 *                                         &lt;sequence>
 *                                           &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                         &lt;/sequence>
 *                                         &lt;sequence>
 *                                           &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
 *                                           &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
 *                                         &lt;/sequence>
 *                                       &lt;/choice>
 *                                       &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PISST" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;sequence>
 *                                 &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc"/>
 *                                 &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                               &lt;/sequence>
 *                               &lt;sequence>
 *                                 &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204"/>
 *                                 &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104"/>
 *                               &lt;/sequence>
 *                             &lt;/choice>
 *                             &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="COFINS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="COFINSAliq">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CST">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;enumeration value="01"/>
 *                                             &lt;enumeration value="02"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                       &lt;element name="pCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                       &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="COFINSQtde">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CST">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="03"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
 *                                       &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
 *                                       &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="COFINSNT">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CST">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;enumeration value="04"/>
 *                                             &lt;enumeration value="05"/>
 *                                             &lt;enumeration value="06"/>
 *                                             &lt;enumeration value="07"/>
 *                                             &lt;enumeration value="08"/>
 *                                             &lt;enumeration value="09"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="COFINSOutr">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CST">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;enumeration value="49"/>
 *                                             &lt;enumeration value="50"/>
 *                                             &lt;enumeration value="51"/>
 *                                             &lt;enumeration value="52"/>
 *                                             &lt;enumeration value="53"/>
 *                                             &lt;enumeration value="54"/>
 *                                             &lt;enumeration value="55"/>
 *                                             &lt;enumeration value="56"/>
 *                                             &lt;enumeration value="60"/>
 *                                             &lt;enumeration value="61"/>
 *                                             &lt;enumeration value="62"/>
 *                                             &lt;enumeration value="63"/>
 *                                             &lt;enumeration value="64"/>
 *                                             &lt;enumeration value="65"/>
 *                                             &lt;enumeration value="66"/>
 *                                             &lt;enumeration value="67"/>
 *                                             &lt;enumeration value="70"/>
 *                                             &lt;enumeration value="71"/>
 *                                             &lt;enumeration value="72"/>
 *                                             &lt;enumeration value="73"/>
 *                                             &lt;enumeration value="74"/>
 *                                             &lt;enumeration value="75"/>
 *                                             &lt;enumeration value="98"/>
 *                                             &lt;enumeration value="99"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;choice>
 *                                         &lt;sequence>
 *                                           &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                           &lt;element name="pCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                                         &lt;/sequence>
 *                                         &lt;sequence>
 *                                           &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
 *                                           &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
 *                                         &lt;/sequence>
 *                                       &lt;/choice>
 *                                       &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="COFINSST" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;sequence>
 *                                 &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                                 &lt;element name="pCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                               &lt;/sequence>
 *                               &lt;sequence>
 *                                 &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204"/>
 *                                 &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104"/>
 *                               &lt;/sequence>
 *                             &lt;/choice>
 *                             &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ICMSUFDest" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="vBCUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                             &lt;element name="pFCPUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                             &lt;element name="pICMSUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                             &lt;element name="pICMSInter">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="4.00"/>
 *                                   &lt;enumeration value="7.00"/>
 *                                   &lt;enumeration value="12.00"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="pICMSInterPart" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                             &lt;element name="vFCPUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                             &lt;element name="vICMSUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                             &lt;element name="vICMSUFRemet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="impostoDevol" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pDevol" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302Max100"/>
 *                   &lt;element name="IPI">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="vIPIDevol" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infAdProd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="nItem" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="preserve"/>
 *             &lt;pattern value="[1-9]{1}[0-9]{0,1}|[1-8]{1}[0-9]{2}|[9]{1}[0-8]{1}[0-9]{1}|[9]{1}[9]{1}[0]{1}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "prod", "imposto", "impostoDevol", "infAdProd" })
public class Det {

	@XmlElement(required = true)
	protected Prod prod;
	@XmlElement(required = true)
	protected Imposto imposto;
	protected ImpostoDevol impostoDevol;
	protected String infAdProd;
	@XmlAttribute(name = "nItem", required = true)
	protected String nItem;

	/**
	 * Obtém o valor da propriedade prod.
	 * 
	 * @return possible object is {@link Prod }
	 * 
	 */
	public Prod getProd() {
		return prod;
	}

	/**
	 * Define o valor da propriedade prod.
	 * 
	 * @param value
	 *            allowed object is {@link Prod }
	 * 
	 */
	public void setProd(Prod value) {
		this.prod = value;
	}

	/**
	 * Obtém o valor da propriedade imposto.
	 * 
	 * @return possible object is {@link Imposto }
	 * 
	 */
	public Imposto getImposto() {
		return imposto;
	}

	/**
	 * Define o valor da propriedade imposto.
	 * 
	 * @param value
	 *            allowed object is {@link Imposto }
	 * 
	 */
	public void setImposto(Imposto value) {
		this.imposto = value;
	}

	/**
	 * Obtém o valor da propriedade impostoDevol.
	 * 
	 * @return possible object is {@link ImpostoDevol }
	 * 
	 */
	public ImpostoDevol getImpostoDevol() {
		return impostoDevol;
	}

	/**
	 * Define o valor da propriedade impostoDevol.
	 * 
	 * @param value
	 *            allowed object is {@link ImpostoDevol }
	 * 
	 */
	public void setImpostoDevol(ImpostoDevol value) {
		this.impostoDevol = value;
	}

	/**
	 * Obtém o valor da propriedade infAdProd.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInfAdProd() {
		return infAdProd;
	}

	/**
	 * Define o valor da propriedade infAdProd.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInfAdProd(String value) {
		this.infAdProd = value;
	}

	/**
	 * Obtém o valor da propriedade nItem.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNItem() {
		return nItem;
	}

	/**
	 * Define o valor da propriedade nItem.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNItem(String value) {
		this.nItem = value;
	}

}