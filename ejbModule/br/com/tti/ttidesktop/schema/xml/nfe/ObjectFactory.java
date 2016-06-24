//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.06.23 às 02:45:00 PM BRT 
//


package br.com.tti.ttidesktop.schema.xml.nfe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.tti.ttidesktop.schema.xml.nfe package. 
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

    private final static QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private final static QName _TNFeInfNFeDetImpostoICMS_QNAME = new QName("http://www.portalfiscal.inf.br/nfe", "ICMS");
    private final static QName _TNFeInfNFeDetImpostoPISST_QNAME = new QName("http://www.portalfiscal.inf.br/nfe", "PISST");
    private final static QName _TNFeInfNFeDetImpostoCOFINSST_QNAME = new QName("http://www.portalfiscal.inf.br/nfe", "COFINSST");
    private final static QName _TNFeInfNFeDetImpostoIPI_QNAME = new QName("http://www.portalfiscal.inf.br/nfe", "IPI");
    private final static QName _TNFeInfNFeDetImpostoICMSUFDest_QNAME = new QName("http://www.portalfiscal.inf.br/nfe", "ICMSUFDest");
    private final static QName _TNFeInfNFeDetImpostoVTotTrib_QNAME = new QName("http://www.portalfiscal.inf.br/nfe", "vTotTrib");
    private final static QName _TNFeInfNFeDetImpostoII_QNAME = new QName("http://www.portalfiscal.inf.br/nfe", "II");
    private final static QName _TNFeInfNFeDetImpostoISSQN_QNAME = new QName("http://www.portalfiscal.inf.br/nfe", "ISSQN");
    private final static QName _TNFeInfNFeDetImpostoCOFINS_QNAME = new QName("http://www.portalfiscal.inf.br/nfe", "COFINS");
    private final static QName _TNFeInfNFeDetImpostoPIS_QNAME = new QName("http://www.portalfiscal.inf.br/nfe", "PIS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.tti.ttidesktop.schema.xml.nfe
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link SignedInfoType }
     * 
     */
    public SignedInfoType createSignedInfoType() {
        return new SignedInfoType();
    }

    /**
     * Create an instance of {@link TNFe }
     * 
     */
    public TNFe createTNFe() {
        return new TNFe();
    }

    /**
     * Create an instance of {@link InfNFe }
     * 
     */
    public InfNFe createTNFeInfNFe() {
        return new InfNFe();
    }

    /**
     * Create an instance of {@link Cana }
     * 
     */
    public Cana createTNFeInfNFeCana() {
        return new Cana();
    }

    /**
     * Create an instance of {@link InfAdic }
     * 
     */
    public InfAdic createTNFeInfNFeInfAdic() {
        return new InfAdic();
    }

    /**
     * Create an instance of {@link Pag }
     * 
     */
    public Pag createTNFeInfNFePag() {
        return new Pag();
    }

    /**
     * Create an instance of {@link Cobr }
     * 
     */
    public Cobr createTNFeInfNFeCobr() {
        return new Cobr();
    }

    /**
     * Create an instance of {@link Transp }
     * 
     */
    public Transp createTNFeInfNFeTransp() {
        return new Transp();
    }

    /**
     * Create an instance of {@link Vol }
     * 
     */
    public Vol createTNFeInfNFeTranspVol() {
        return new Vol();
    }

    /**
     * Create an instance of {@link Total }
     * 
     */
    public Total createTNFeInfNFeTotal() {
        return new Total();
    }

    /**
     * Create an instance of {@link Det }
     * 
     */
    public Det createTNFeInfNFeDet() {
        return new Det();
    }

    /**
     * Create an instance of {@link ImpostoDevol }
     * 
     */
    public ImpostoDevol createTNFeInfNFeDetImpostoDevol() {
        return new ImpostoDevol();
    }

    /**
     * Create an instance of {@link Imposto }
     * 
     */
    public Imposto createTNFeInfNFeDetImposto() {
        return new Imposto();
    }

    /**
     * Create an instance of {@link Imposto.COFINS }
     * 
     */
    public Imposto.COFINS createTNFeInfNFeDetImpostoCOFINS() {
        return new Imposto.COFINS();
    }

    /**
     * Create an instance of {@link Imposto.PIS }
     * 
     */
    public Imposto.PIS createTNFeInfNFeDetImpostoPIS() {
        return new Imposto.PIS();
    }

    /**
     * Create an instance of {@link Imposto.ICMS }
     * 
     */
    public Imposto.ICMS createTNFeInfNFeDetImpostoICMS() {
        return new Imposto.ICMS();
    }

    /**
     * Create an instance of {@link Prod }
     * 
     */
    public Prod createTNFeInfNFeDetProd() {
        return new Prod();
    }

    /**
     * Create an instance of {@link Prod.Comb }
     * 
     */
    public Prod.Comb createTNFeInfNFeDetProdComb() {
        return new Prod.Comb();
    }

    /**
     * Create an instance of {@link Prod.DetExport }
     * 
     */
    public Prod.DetExport createTNFeInfNFeDetProdDetExport() {
        return new Prod.DetExport();
    }

    /**
     * Create an instance of {@link DI }
     * 
     */
    public DI createTNFeInfNFeDetProdDI() {
        return new DI();
    }

    /**
     * Create an instance of {@link Ide }
     * 
     */
    public Ide createTNFeInfNFeIde() {
        return new Ide();
    }

    /**
     * Create an instance of {@link Ide.NFref }
     * 
     */
    public Ide.NFref createTNFeInfNFeIdeNFref() {
        return new Ide.NFref();
    }

    /**
     * Create an instance of {@link TProtNFe }
     * 
     */
    public TProtNFe createTProtNFe() {
        return new TProtNFe();
    }

    /**
     * Create an instance of {@link TRetEnviNFe }
     * 
     */
    public TRetEnviNFe createTRetEnviNFe() {
        return new TRetEnviNFe();
    }

    /**
     * Create an instance of {@link TIpi }
     * 
     */
    public TIpi createTIpi() {
        return new TIpi();
    }

    /**
     * Create an instance of {@link TConsReciNFe }
     * 
     */
    public TConsReciNFe createTConsReciNFe() {
        return new TConsReciNFe();
    }

    /**
     * Create an instance of {@link TVeiculo }
     * 
     */
    public TVeiculo createTVeiculo() {
        return new TVeiculo();
    }

    /**
     * Create an instance of {@link TEnderEmi }
     * 
     */
    public TEnderEmi createTEnderEmi() {
        return new TEnderEmi();
    }

    /**
     * Create an instance of {@link TEndereco }
     * 
     */
    public TEndereco createTEndereco() {
        return new TEndereco();
    }

    /**
     * Create an instance of {@link TEnviNFe }
     * 
     */
    public TEnviNFe createTEnviNFe() {
        return new TEnviNFe();
    }

    /**
     * Create an instance of {@link TLocal }
     * 
     */
    public TLocal createTLocal() {
        return new TLocal();
    }

    /**
     * Create an instance of {@link TNfeProc }
     * 
     */
    public TNfeProc createTNfeProc() {
        return new TNfeProc();
    }

    /**
     * Create an instance of {@link TRetConsReciNFe }
     * 
     */
    public TRetConsReciNFe createTRetConsReciNFe() {
        return new TRetConsReciNFe();
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link X509DataType }
     * 
     */
    public X509DataType createX509DataType() {
        return new X509DataType();
    }

    /**
     * Create an instance of {@link SignatureValueType }
     * 
     */
    public SignatureValueType createSignatureValueType() {
        return new SignatureValueType();
    }

    /**
     * Create an instance of {@link TransformsType }
     * 
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link KeyInfoType }
     * 
     */
    public KeyInfoType createKeyInfoType() {
        return new KeyInfoType();
    }

    /**
     * Create an instance of {@link ReferenceType.DigestMethod }
     * 
     */
    public ReferenceType.DigestMethod createReferenceTypeDigestMethod() {
        return new ReferenceType.DigestMethod();
    }

    /**
     * Create an instance of {@link SignedInfoType.CanonicalizationMethod }
     * 
     */
    public SignedInfoType.CanonicalizationMethod createSignedInfoTypeCanonicalizationMethod() {
        return new SignedInfoType.CanonicalizationMethod();
    }

    /**
     * Create an instance of {@link SignedInfoType.SignatureMethod }
     * 
     */
    public SignedInfoType.SignatureMethod createSignedInfoTypeSignatureMethod() {
        return new SignedInfoType.SignatureMethod();
    }

    /**
     * Create an instance of {@link InfNFeSupl }
     * 
     */
    public InfNFeSupl createTNFeInfNFeSupl() {
        return new InfNFeSupl();
    }

    /**
     * Create an instance of {@link Emit }
     * 
     */
    public Emit createTNFeInfNFeEmit() {
        return new Emit();
    }

    /**
     * Create an instance of {@link Avulsa }
     * 
     */
    public Avulsa createTNFeInfNFeAvulsa() {
        return new Avulsa();
    }

    /**
     * Create an instance of {@link Dest }
     * 
     */
    public Dest createTNFeInfNFeDest() {
        return new Dest();
    }

    /**
     * Create an instance of {@link AutXML }
     * 
     */
    public AutXML createTNFeInfNFeAutXML() {
        return new AutXML();
    }

    /**
     * Create an instance of {@link Exporta }
     * 
     */
    public Exporta createTNFeInfNFeExporta() {
        return new Exporta();
    }

    /**
     * Create an instance of {@link Compra }
     * 
     */
    public Compra createTNFeInfNFeCompra() {
        return new Compra();
    }

    /**
     * Create an instance of {@link Cana.ForDia }
     * 
     */
    public Cana.ForDia createTNFeInfNFeCanaForDia() {
        return new Cana.ForDia();
    }

    /**
     * Create an instance of {@link Cana.Deduc }
     * 
     */
    public Cana.Deduc createTNFeInfNFeCanaDeduc() {
        return new Cana.Deduc();
    }

    /**
     * Create an instance of {@link InfAdic.ObsCont }
     * 
     */
    public InfAdic.ObsCont createTNFeInfNFeInfAdicObsCont() {
        return new InfAdic.ObsCont();
    }

    /**
     * Create an instance of {@link InfAdic.ObsFisco }
     * 
     */
    public InfAdic.ObsFisco createTNFeInfNFeInfAdicObsFisco() {
        return new InfAdic.ObsFisco();
    }

    /**
     * Create an instance of {@link InfAdic.ProcRef }
     * 
     */
    public InfAdic.ProcRef createTNFeInfNFeInfAdicProcRef() {
        return new InfAdic.ProcRef();
    }

    /**
     * Create an instance of {@link Pag.Card }
     * 
     */
    public Pag.Card createTNFeInfNFePagCard() {
        return new Pag.Card();
    }

    /**
     * Create an instance of {@link Fat }
     * 
     */
    public Fat createTNFeInfNFeCobrFat() {
        return new Fat();
    }

    /**
     * Create an instance of {@link Dup }
     * 
     */
    public Dup createTNFeInfNFeCobrDup() {
        return new Dup();
    }

    /**
     * Create an instance of {@link Transporta }
     * 
     */
    public Transporta createTNFeInfNFeTranspTransporta() {
        return new Transporta();
    }

    /**
     * Create an instance of {@link Transp.RetTransp }
     * 
     */
    public Transp.RetTransp createTNFeInfNFeTranspRetTransp() {
        return new Transp.RetTransp();
    }

    /**
     * Create an instance of {@link Vol.Lacres }
     * 
     */
    public Vol.Lacres createTNFeInfNFeTranspVolLacres() {
        return new Vol.Lacres();
    }

    /**
     * Create an instance of {@link Total.ICMSTot }
     * 
     */
    public Total.ICMSTot createTNFeInfNFeTotalICMSTot() {
        return new Total.ICMSTot();
    }

    /**
     * Create an instance of {@link Total.ISSQNtot }
     * 
     */
    public Total.ISSQNtot createTNFeInfNFeTotalISSQNtot() {
        return new Total.ISSQNtot();
    }

    /**
     * Create an instance of {@link Total.RetTrib }
     * 
     */
    public Total.RetTrib createTNFeInfNFeTotalRetTrib() {
        return new Total.RetTrib();
    }

    /**
     * Create an instance of {@link ImpostoDevol.IPI }
     * 
     */
    public ImpostoDevol.IPI createTNFeInfNFeDetImpostoDevolIPI() {
        return new ImpostoDevol.IPI();
    }

    /**
     * Create an instance of {@link Imposto.II }
     * 
     */
    public Imposto.II createTNFeInfNFeDetImpostoII() {
        return new Imposto.II();
    }

    /**
     * Create an instance of {@link Imposto.ISSQN }
     * 
     */
    public Imposto.ISSQN createTNFeInfNFeDetImpostoISSQN() {
        return new Imposto.ISSQN();
    }

    /**
     * Create an instance of {@link Imposto.PISST }
     * 
     */
    public Imposto.PISST createTNFeInfNFeDetImpostoPISST() {
        return new Imposto.PISST();
    }

    /**
     * Create an instance of {@link Imposto.COFINSST }
     * 
     */
    public Imposto.COFINSST createTNFeInfNFeDetImpostoCOFINSST() {
        return new Imposto.COFINSST();
    }

    /**
     * Create an instance of {@link Imposto.ICMSUFDest }
     * 
     */
    public Imposto.ICMSUFDest createTNFeInfNFeDetImpostoICMSUFDest() {
        return new Imposto.ICMSUFDest();
    }

    /**
     * Create an instance of {@link Imposto.COFINS.COFINSAliq }
     * 
     */
    public Imposto.COFINS.COFINSAliq createTNFeInfNFeDetImpostoCOFINSCOFINSAliq() {
        return new Imposto.COFINS.COFINSAliq();
    }

    /**
     * Create an instance of {@link Imposto.COFINS.COFINSQtde }
     * 
     */
    public Imposto.COFINS.COFINSQtde createTNFeInfNFeDetImpostoCOFINSCOFINSQtde() {
        return new Imposto.COFINS.COFINSQtde();
    }

    /**
     * Create an instance of {@link Imposto.COFINS.COFINSNT }
     * 
     */
    public Imposto.COFINS.COFINSNT createTNFeInfNFeDetImpostoCOFINSCOFINSNT() {
        return new Imposto.COFINS.COFINSNT();
    }

    /**
     * Create an instance of {@link Imposto.COFINS.COFINSOutr }
     * 
     */
    public Imposto.COFINS.COFINSOutr createTNFeInfNFeDetImpostoCOFINSCOFINSOutr() {
        return new Imposto.COFINS.COFINSOutr();
    }

    /**
     * Create an instance of {@link Imposto.PIS.PISAliq }
     * 
     */
    public Imposto.PIS.PISAliq createTNFeInfNFeDetImpostoPISPISAliq() {
        return new Imposto.PIS.PISAliq();
    }

    /**
     * Create an instance of {@link Imposto.PIS.PISQtde }
     * 
     */
    public Imposto.PIS.PISQtde createTNFeInfNFeDetImpostoPISPISQtde() {
        return new Imposto.PIS.PISQtde();
    }

    /**
     * Create an instance of {@link Imposto.PIS.PISNT }
     * 
     */
    public Imposto.PIS.PISNT createTNFeInfNFeDetImpostoPISPISNT() {
        return new Imposto.PIS.PISNT();
    }

    /**
     * Create an instance of {@link Imposto.PIS.PISOutr }
     * 
     */
    public Imposto.PIS.PISOutr createTNFeInfNFeDetImpostoPISPISOutr() {
        return new Imposto.PIS.PISOutr();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMS00 }
     * 
     */
    public Imposto.ICMS.ICMS00 createTNFeInfNFeDetImpostoICMSICMS00() {
        return new Imposto.ICMS.ICMS00();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMS10 }
     * 
     */
    public Imposto.ICMS.ICMS10 createTNFeInfNFeDetImpostoICMSICMS10() {
        return new Imposto.ICMS.ICMS10();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMS20 }
     * 
     */
    public Imposto.ICMS.ICMS20 createTNFeInfNFeDetImpostoICMSICMS20() {
        return new Imposto.ICMS.ICMS20();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMS30 }
     * 
     */
    public Imposto.ICMS.ICMS30 createTNFeInfNFeDetImpostoICMSICMS30() {
        return new Imposto.ICMS.ICMS30();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMS40 }
     * 
     */
    public Imposto.ICMS.ICMS40 createTNFeInfNFeDetImpostoICMSICMS40() {
        return new Imposto.ICMS.ICMS40();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMS51 }
     * 
     */
    public Imposto.ICMS.ICMS51 createTNFeInfNFeDetImpostoICMSICMS51() {
        return new Imposto.ICMS.ICMS51();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMS60 }
     * 
     */
    public Imposto.ICMS.ICMS60 createTNFeInfNFeDetImpostoICMSICMS60() {
        return new Imposto.ICMS.ICMS60();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMS70 }
     * 
     */
    public Imposto.ICMS.ICMS70 createTNFeInfNFeDetImpostoICMSICMS70() {
        return new Imposto.ICMS.ICMS70();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMS90 }
     * 
     */
    public Imposto.ICMS.ICMS90 createTNFeInfNFeDetImpostoICMSICMS90() {
        return new Imposto.ICMS.ICMS90();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMSPart }
     * 
     */
    public Imposto.ICMS.ICMSPart createTNFeInfNFeDetImpostoICMSICMSPart() {
        return new Imposto.ICMS.ICMSPart();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMSST }
     * 
     */
    public Imposto.ICMS.ICMSST createTNFeInfNFeDetImpostoICMSICMSST() {
        return new Imposto.ICMS.ICMSST();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMSSN101 }
     * 
     */
    public Imposto.ICMS.ICMSSN101 createTNFeInfNFeDetImpostoICMSICMSSN101() {
        return new Imposto.ICMS.ICMSSN101();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMSSN102 }
     * 
     */
    public Imposto.ICMS.ICMSSN102 createTNFeInfNFeDetImpostoICMSICMSSN102() {
        return new Imposto.ICMS.ICMSSN102();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMSSN201 }
     * 
     */
    public Imposto.ICMS.ICMSSN201 createTNFeInfNFeDetImpostoICMSICMSSN201() {
        return new Imposto.ICMS.ICMSSN201();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMSSN202 }
     * 
     */
    public Imposto.ICMS.ICMSSN202 createTNFeInfNFeDetImpostoICMSICMSSN202() {
        return new Imposto.ICMS.ICMSSN202();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMSSN500 }
     * 
     */
    public Imposto.ICMS.ICMSSN500 createTNFeInfNFeDetImpostoICMSICMSSN500() {
        return new Imposto.ICMS.ICMSSN500();
    }

    /**
     * Create an instance of {@link Imposto.ICMS.ICMSSN900 }
     * 
     */
    public Imposto.ICMS.ICMSSN900 createTNFeInfNFeDetImpostoICMSICMSSN900() {
        return new Imposto.ICMS.ICMSSN900();
    }

    /**
     * Create an instance of {@link Prod.VeicProd }
     * 
     */
    public Prod.VeicProd createTNFeInfNFeDetProdVeicProd() {
        return new Prod.VeicProd();
    }

    /**
     * Create an instance of {@link Prod.Med }
     * 
     */
    public Prod.Med createTNFeInfNFeDetProdMed() {
        return new Prod.Med();
    }

    /**
     * Create an instance of {@link Prod.Arma }
     * 
     */
    public Prod.Arma createTNFeInfNFeDetProdArma() {
        return new Prod.Arma();
    }

    /**
     * Create an instance of {@link Prod.Comb.CIDE }
     * 
     */
    public Prod.Comb.CIDE createTNFeInfNFeDetProdCombCIDE() {
        return new Prod.Comb.CIDE();
    }

    /**
     * Create an instance of {@link Prod.Comb.Encerrante }
     * 
     */
    public Prod.Comb.Encerrante createTNFeInfNFeDetProdCombEncerrante() {
        return new Prod.Comb.Encerrante();
    }

    /**
     * Create an instance of {@link Prod.DetExport.ExportInd }
     * 
     */
    public Prod.DetExport.ExportInd createTNFeInfNFeDetProdDetExportExportInd() {
        return new Prod.DetExport.ExportInd();
    }

    /**
     * Create an instance of {@link Adi }
     * 
     */
    public Adi createTNFeInfNFeDetProdDIAdi() {
        return new Adi();
    }

    /**
     * Create an instance of {@link Ide.NFref.RefNF }
     * 
     */
    public Ide.NFref.RefNF createTNFeInfNFeIdeNFrefRefNF() {
        return new Ide.NFref.RefNF();
    }

    /**
     * Create an instance of {@link Ide.NFref.RefNFP }
     * 
     */
    public Ide.NFref.RefNFP createTNFeInfNFeIdeNFrefRefNFP() {
        return new Ide.NFref.RefNFP();
    }

    /**
     * Create an instance of {@link Ide.NFref.RefECF }
     * 
     */
    public Ide.NFref.RefECF createTNFeInfNFeIdeNFrefRefECF() {
        return new Ide.NFref.RefECF();
    }

    /**
     * Create an instance of {@link TProtNFe.InfProt }
     * 
     */
    public TProtNFe.InfProt createTProtNFeInfProt() {
        return new TProtNFe.InfProt();
    }

    /**
     * Create an instance of {@link TRetEnviNFe.InfRec }
     * 
     */
    public TRetEnviNFe.InfRec createTRetEnviNFeInfRec() {
        return new TRetEnviNFe.InfRec();
    }

    /**
     * Create an instance of {@link TIpi.IPITrib }
     * 
     */
    public TIpi.IPITrib createTIpiIPITrib() {
        return new TIpi.IPITrib();
    }

    /**
     * Create an instance of {@link TIpi.IPINT }
     * 
     */
    public TIpi.IPINT createTIpiIPINT() {
        return new TIpi.IPINT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Imposto.ICMS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe", name = "ICMS", scope = Imposto.class)
    public JAXBElement<Imposto.ICMS> createTNFeInfNFeDetImpostoICMS(Imposto.ICMS value) {
        return new JAXBElement<Imposto.ICMS>(_TNFeInfNFeDetImpostoICMS_QNAME, Imposto.ICMS.class, Imposto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Imposto.PISST }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe", name = "PISST", scope = Imposto.class)
    public JAXBElement<Imposto.PISST> createTNFeInfNFeDetImpostoPISST(Imposto.PISST value) {
        return new JAXBElement<Imposto.PISST>(_TNFeInfNFeDetImpostoPISST_QNAME, Imposto.PISST.class, Imposto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Imposto.COFINSST }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe", name = "COFINSST", scope = Imposto.class)
    public JAXBElement<Imposto.COFINSST> createTNFeInfNFeDetImpostoCOFINSST(Imposto.COFINSST value) {
        return new JAXBElement<Imposto.COFINSST>(_TNFeInfNFeDetImpostoCOFINSST_QNAME, Imposto.COFINSST.class, Imposto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIpi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe", name = "IPI", scope = Imposto.class)
    public JAXBElement<TIpi> createTNFeInfNFeDetImpostoIPI(TIpi value) {
        return new JAXBElement<TIpi>(_TNFeInfNFeDetImpostoIPI_QNAME, TIpi.class, Imposto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Imposto.ICMSUFDest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe", name = "ICMSUFDest", scope = Imposto.class)
    public JAXBElement<Imposto.ICMSUFDest> createTNFeInfNFeDetImpostoICMSUFDest(Imposto.ICMSUFDest value) {
        return new JAXBElement<Imposto.ICMSUFDest>(_TNFeInfNFeDetImpostoICMSUFDest_QNAME, Imposto.ICMSUFDest.class, Imposto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe", name = "vTotTrib", scope = Imposto.class)
    public JAXBElement<String> createTNFeInfNFeDetImpostoVTotTrib(String value) {
        return new JAXBElement<String>(_TNFeInfNFeDetImpostoVTotTrib_QNAME, String.class, Imposto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Imposto.II }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe", name = "II", scope = Imposto.class)
    public JAXBElement<Imposto.II> createTNFeInfNFeDetImpostoII(Imposto.II value) {
        return new JAXBElement<Imposto.II>(_TNFeInfNFeDetImpostoII_QNAME, Imposto.II.class, Imposto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Imposto.ISSQN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe", name = "ISSQN", scope = Imposto.class)
    public JAXBElement<Imposto.ISSQN> createTNFeInfNFeDetImpostoISSQN(Imposto.ISSQN value) {
        return new JAXBElement<Imposto.ISSQN>(_TNFeInfNFeDetImpostoISSQN_QNAME, Imposto.ISSQN.class, Imposto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Imposto.COFINS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe", name = "COFINS", scope = Imposto.class)
    public JAXBElement<Imposto.COFINS> createTNFeInfNFeDetImpostoCOFINS(Imposto.COFINS value) {
        return new JAXBElement<Imposto.COFINS>(_TNFeInfNFeDetImpostoCOFINS_QNAME, Imposto.COFINS.class, Imposto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Imposto.PIS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe", name = "PIS", scope = Imposto.class)
    public JAXBElement<Imposto.PIS> createTNFeInfNFeDetImpostoPIS(Imposto.PIS value) {
        return new JAXBElement<Imposto.PIS>(_TNFeInfNFeDetImpostoPIS_QNAME, Imposto.PIS.class, Imposto.class, value);
    }

}
