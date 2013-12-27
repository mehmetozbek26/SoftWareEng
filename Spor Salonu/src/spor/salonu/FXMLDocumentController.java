/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spor.salonu;



import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javax.xml.ws.BindingProvider;
import org.datacontract.schemas._2004._07.software.ArrayOfKisiBilgileriDB;
import org.datacontract.schemas._2004._07.software.KisiBilgileriDB;
import org.datacontract.schemas._2004._07.software.ProgramDersDB;
import org.tempuri.ISoftwareWebService;
import org.tempuri.SoftwareWebService;


/**
 *
 * @author MERKAN
 */
public class FXMLDocumentController implements Initializable {
    
   @FXML    private Pane AnchorPane;
   @FXML    private Pane girispane;
   @FXML    private Pane anasayfapanel;
   @FXML    private Pane anadurumpanel;
   @FXML    private Pane anapro;
   @FXML    private Pane anarezervasyon;
   @FXML    private Pane anabugunpane;
   @FXML    private Pane beklemepanel;
   @FXML    private Pane bugunhatapanel;
   @FXML    private Pane rezpztkatpane;
   @FXML    private Pane rezsalkatpane;
   @FXML    private Pane rezcrskatpane;
   @FXML    private Pane rezprskatpane;
   @FXML    private Pane rezcmkatpane;
   @FXML    private Pane rezcmtkatpane;
   @FXML    private Pane rezpzkatpane;
   @FXML    private Pane rezpzterrpane;
   @FXML    private Pane rezsalerrpane;
   @FXML    private Pane rezcrserrpane;
   @FXML    private Pane rezprserrpane;
   @FXML    private Pane rezcmerrpane;
   @FXML    private Pane rezcmterrpane;
   @FXML    private Pane rezpzerrpane;
   @FXML    private Pane bugunerrpane;
   @FXML    private Pane bugunkaypane;
   @FXML    private Pane programerrpanel;
   @FXML    private Pane programbirsonraki;
   
   @FXML    private TitledPane rezervasyon1;
   @FXML    private TitledPane rezervasyon22;
   @FXML    private TitledPane rezervasyon3;
   @FXML    private TitledPane rezervasyon4;
   @FXML    private TitledPane rezervasyon5;
   @FXML    private TitledPane rezervasyon6;
   @FXML    private TitledPane rezervasyon7;
   
   @FXML    private TextField bugunkalori;
   @FXML    private TextField giriskullaniciAdi;
   @FXML    private TextField buguncalismatext;
   @FXML    private TextField bugunkilo;
   @FXML    private TextField bugunboytext;
   @FXML    private TextField bugunkosutext;
   @FXML    private TextField bugundeneme;
   @FXML    private PasswordField girissifre;
   
   @FXML    private LineChart durumlinechart;

   @FXML    private ComboBox durumcombobox;
   @FXML    private NumberAxis numberx;
   @FXML    private NumberAxis numbery;
   
   
   @FXML    private Button giristamam;
   @FXML    private Button anadurumbt;
   @FXML    private Button anaprobt;
   @FXML    private Button anarezervasyonbt;
   @FXML    private Button anabugunbt;
   @FXML    private Button rezervasyonpzbt;
   @FXML    private Button rezervasyoncmtbt;
   @FXML    private Button rezervasyoncmbt;
   @FXML    private Button rezervasyonprsbt;
   @FXML    private Button rezervasyoncrsbt;
   @FXML    private Button rezervasyonsalbt;
   @FXML    private Button rezervasyonpztbt;
   
   @FXML    private ImageView grisiimage;
   
   @FXML    private Label bugunhata;
   @FXML    private Label labelservice;
   @FXML    private Label giriserrorlabel;
   @FXML    private Label rezervasyonpzt1;
   @FXML    private Label rezervasyonpzt2;
   @FXML    private Label rezervasyonpzt3;
   @FXML    private Label rezervasyonpzt4;
   @FXML    private Label rezervasyonpzt5;
   @FXML    private Label rezervasyonpzt6;
   @FXML    private Label rezervasyonsal1;
   @FXML    private Label rezervasyonsal2;
   @FXML    private Label rezervasyonsal3;
   @FXML    private Label rezervasyonsal4;
   @FXML    private Label rezervasyonsal5;
   @FXML    private Label rezervasyonsal6;
   @FXML    private Label rezervasyoncrs1;
   @FXML    private Label rezervasyoncrs2;
   @FXML    private Label rezervasyoncrs3;
   @FXML    private Label rezervasyoncrs4;
   @FXML    private Label rezervasyoncrs5;
   @FXML    private Label rezervasyoncrs6;
   @FXML    private Label rezervasyonprs1;
   @FXML    private Label rezervasyonprs2;
   @FXML    private Label rezervasyonprs3;
   @FXML    private Label rezervasyonprs4;
   @FXML    private Label rezervasyonprs5;
   @FXML    private Label rezervasyonprs6;
   @FXML    private Label rezervasyoncm1;
   @FXML    private Label rezervasyoncm2;
   @FXML    private Label rezervasyoncm3;
   @FXML    private Label rezervasyoncm4;
   @FXML    private Label rezervasyoncm5;
   @FXML    private Label rezervasyoncm6;
   @FXML    private Label rezervasyoncmt1;
   @FXML    private Label rezervasyoncmt2;
   @FXML    private Label rezervasyoncmt3;
   @FXML    private Label rezervasyoncmt4;
   @FXML    private Label rezervasyoncmt5;
   @FXML    private Label rezervasyoncmt6;
   @FXML    private Label rezervasyonpz1;
   @FXML    private Label rezervasyonpz2;
   @FXML    private Label rezervasyonpz3;
   @FXML    private Label rezervasyonpz4;
   @FXML    private Label rezervasyonpz5;
   @FXML    private Label rezervasyonpz6;
   @FXML    private Label rezpzerrlabel;
   @FXML    private Label rezpzterrlabel;
   @FXML    private Label rezsalerrlabel;
   @FXML    private Label rezcrserrlabel;
   @FXML    private Label rezprserrlabel;
   @FXML    private Label rezcmerrlabel;
   @FXML    private Label rezcmterrlabel;
   @FXML    private Label bugunerrlabel;
   @FXML    private Label programerrlabel;
   @FXML    private Label program1label;
   @FXML    private Label program2label;
   @FXML    private Label program3label;
   @FXML    private Label program4label;
   @FXML    private Label program5label;
   @FXML    private Label program6label;
   @FXML    private Label programtarih;
   
            private  Parola par=Parola.getInstance();
            private SoftwareWebService s=new SoftwareWebService();
            private ISoftwareWebService port=s.getBasicHttpBindingISoftwareWebService();
            protected static String servis="http://localhost/Software/SoftwareWebService.svc";
            protected DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
           
   
            
    @FXML protected void Errorhide(KeyEvent event)
    {
        giriserrorlabel.setVisible(false);
    }
    
    @FXML protected void Save(ActionEvent event)
    {
        try
        {
            
            if(bugunboytext.getText()=="" || bugunboytext.getText()==null || Integer.parseInt(bugunboytext.getText())<0)  throw new Exception("Boyunuzu Kontrol Ediniz!");
            if(buguncalismatext.getText()=="" || buguncalismatext.getText()==null || Integer.parseInt(buguncalismatext.getText())<0)  throw new Exception("Calisma Saatini Kontrol Ediniz!");
            if(bugunkilo.getText()=="" || bugunkilo.getText()==null || Integer.parseInt(bugunkilo.getText())<0)  throw new Exception("Kilonuzu Kontrol Ediniz!");
            if(bugunkosutext.getText()=="" || bugunkosutext.getText()==null || Integer.parseInt(bugunkosutext.getText())<0)  throw new Exception("Kosu Miktarını Kontrol Ediniz!");                               
            ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
            String cevap=port.kisiselBilgiEkle(par.getKullaniciAdi(), par.getKullaniciSifre(),dateFormat.format(new Date()),Integer.parseInt(bugunkilo.getText()),
                    Integer.parseInt(bugunboytext.getText()),Integer.parseInt(bugunkalori.getText()),Integer.parseInt(bugunkosutext.getText()),Integer.parseInt(buguncalismatext.getText()));
           if(cevap==null)
               bugunhata.setText("Bağlantı Hatası Oluştu.\nLütfen Yetkili Kişiye Bildiriniz");
           else            
                bugunhata.setText(cevap);
            bugunhatapanel.setVisible(true);          
        }
        catch(Exception err)
        {
            bugunhata.setText(err.getMessage());
        }
    }
    private void prepareChart()
    {
        
        durumlinechart.setTitle("KİLO");

       
            
            
    }
    private void openDurumScene()
   {     
       try
        {   
            lineChartDeneme(null);
            durumlinechart.setTitle("KİLO");
            girispane.setVisible(false); 
            anarezervasyon.setVisible(false);
            anabugunpane.setVisible(false);
            anapro.setVisible(false);
            anasayfapanel.setVisible(true);
            anadurumpanel.setVisible(true); 
            beklemepanel.setVisible(false);
        }
        catch(Exception err)
        {

        }
    }
    private void Cikis()
    {
        giriskullaniciAdi.clear();
        girissifre.clear();
        girispane.setVisible(true); 
        anarezervasyon.setVisible(false);
        anabugunpane.setVisible(false);
        anapro.setVisible(false);
        anasayfapanel.setVisible(false);
        anadurumpanel.setVisible(false);
    }
    @FXML protected void openGiris(ActionEvent event)
    {
        try
        {   
            ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
            boolean  out=port.userControl(giriskullaniciAdi.getText(), girissifre.getText());
            giriserrorlabel.setVisible(!out);
            if(out)
            {
                par.setKullaniciAdi(giriskullaniciAdi.getText());
                par.setKullaniciSifre(girissifre.getText());
                openDurumScene();
            }
            else
            {             
               beklemepanel.setVisible(false);
               girispane.setVisible(true); 
               anasayfapanel.setVisible(false); 
            }
           
        }
        catch(Exception err)
        {
            
        }
    }
    @FXML protected void openProgramScene(ActionEvent event)
    {
        Calendar c=Calendar.getInstance();
        String tempday= c.get(c.YEAR)+"-"+(c.get(c.MONTH)+1)+"-"+(c.get(c.DATE));
        ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
        ProgramDersDB pro1=port.birSonrakiProgramiBul(par.getKullaniciAdi(), par.getKullaniciSifre(), tempday);
        if(pro1!=null)
        {
            programbirsonraki.setVisible(true);
            programerrpanel.setVisible(false);
            programtarih.setText(c.get(c.DATE)+" "+ConvertToMount(c.get(c.MONTH)+1)+" "+c.get(c.YEAR)+" "+ConvertToDay(c.get(c.DAY_OF_WEEK)));
            program1label.setText(pro1.getDers1().getValue());
            program2label.setText(pro1.getDers2().getValue());
            program3label.setText(pro1.getDers3().getValue());
            program4label.setText(pro1.getDers4().getValue());
            program5label.setText(pro1.getDers5().getValue());
            program6label.setText(pro1.getDers6().getValue());
        }
        else
        {
            programbirsonraki.setVisible(false);
            programerrpanel.setVisible(true);
            programerrlabel.setText("Yedi Gün İçerisinde Çalışma Programınız Bulunmamaktadır.");
        }
        girispane.setVisible(false); 
        anarezervasyon.setVisible(false);
        anabugunpane.setVisible(false);
        anapro.setVisible(true);
        anasayfapanel.setVisible(true);
        anadurumpanel.setVisible(false); 
    }
    private String ConvertToMount(int mount)
    {
        switch(mount)
        {
            case 1: return "ocak".toUpperCase();
            case 2: return "şubat".toUpperCase();
            case 3: return "mart".toUpperCase();
            case 4: return "nisan".toUpperCase();
            case 5: return "mayıs".toUpperCase();
            case 6: return "haziran".toUpperCase();
            case 7: return "temmuz".toUpperCase();
            case 8: return "ağustos".toUpperCase();
            case 9: return "eylül".toUpperCase();
            case 10: return "ekim".toUpperCase();
            case 11: return "kasım".toUpperCase();
            case 12: return "aralık".toUpperCase();
        }
        return null;
        
    }
    private String ConvertToDay(int day)
    {
        switch(day)
        {
            case 1: return "Pazar".toUpperCase();
            case 2: return "Pazartesi".toUpperCase();
            case 3: return "Salı".toUpperCase();
            case 4: return "Çarşamba".toUpperCase();
            case 5: return "Perşembe".toUpperCase();
            case 6: return "Cuma".toUpperCase();
            case 7: return "Cumartesi".toUpperCase();           
        }
        System.out.println("Gelen Sayı "+day);
        return null;
        
    }

    @FXML protected void openRezervasyonScene(ActionEvent event)
    {
       String tempday="";
        Date tomorrow=null;
        Calendar c=Calendar.getInstance();
        ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
        /* 1 GUN PAZARTESİ */
        ProgramDersDB pro1=port.programGetById(par.getKullaniciAdi(), par.getKullaniciSifre(),c.get(c.YEAR)+"-"+(c.get(c.MONTH)+1)+"-"+c.get(c.DATE));
        rezervasyon1.setText(c.get(c.DATE)+" "+ConvertToMount(c.get(c.MONTH)+1)+" "+c.get(c.YEAR)+" "+ConvertToDay(c.get(c.DAY_OF_WEEK)));
        if(pro1==null)
        {
            rezpztkatpane.setVisible(false);
            rezpzterrpane.setVisible(true);
            rezpzterrlabel.setText("Bugun Program Bulunmuyor"); 

        }
        else
        {
            rezpztkatpane.setVisible(true);
            rezpzterrpane.setVisible(false);
            rezervasyonpzt1.setText(pro1.getDers1().getValue());
            rezervasyonpzt2.setText(pro1.getDers2().getValue());
            rezervasyonpzt3.setText(pro1.getDers3().getValue());
            rezervasyonpzt4.setText(pro1.getDers4().getValue());
            rezervasyonpzt5.setText(pro1.getDers5().getValue());
            rezervasyonpzt6.setText(pro1.getDers6().getValue());
        }
                   /* 2. GUN SALI */
                   c.add(c.DAY_OF_MONTH, 1);
                   tempday = c.get(c.YEAR)+"-"+(c.get(c.MONTH)+1)+"-"+(c.get(c.DATE));
                   ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
                   rezervasyon22.setText((c.get(c.DATE))+" "+ConvertToMount(c.get(c.MONTH)+1)+" "+c.get(c.YEAR)+" "+ConvertToDay(c.get(c.DAY_OF_WEEK)));
                   ProgramDersDB pro2=port.programGetById(par.getKullaniciAdi(), par.getKullaniciSifre(),tempday);
                   if(pro2==null)
                   {
                       rezsalkatpane.setVisible(false);
                       rezsalerrpane.setVisible(true);
                       rezsalerrlabel.setText("Bugun Program Bulunmuyor");
                   }
                   else
                   {
                       rezsalkatpane.setVisible(true);
                       rezsalerrpane.setVisible(false);
                       rezervasyonsal1.setText(pro2.getDers1().getValue());
                       rezervasyonsal2.setText(pro2.getDers2().getValue());
                       rezervasyonsal3.setText(pro2.getDers3().getValue());
                       rezervasyonsal4.setText(pro2.getDers4().getValue());
                       rezervasyonsal5.setText(pro2.getDers5().getValue());
                       rezervasyonsal6.setText(pro2.getDers6().getValue());
                   }
  
        


                   /* 3. GUN ÇARŞAMBA */
                   c.add(c.DAY_OF_MONTH, 1);
                   tempday = c.get(c.YEAR)+"-"+(c.get(c.MONTH)+1)+"-"+(c.get(c.DATE));
                   ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);

                   rezervasyon3.setText((c.get(c.DATE))+" "+ConvertToMount(c.get(c.MONTH)+1)+" "+c.get(c.YEAR)+" "+ConvertToDay(c.get(c.DAY_OF_WEEK)));
                   ProgramDersDB pro3=port.programGetById(par.getKullaniciAdi(), par.getKullaniciSifre(),tempday);
                   if(pro3==null)
                   {
                       rezcrskatpane.setVisible(false);
                       rezcrserrpane.setVisible(true);
                       rezcrserrlabel.setText("Bugun Program Bulunmuyor");
                   }
                   else
                   {
                       rezcrskatpane.setVisible(true);
                       rezcrserrpane.setVisible(false);
                       rezervasyoncrs1.setText(pro3.getDers1().getValue());
                       rezervasyoncrs2.setText(pro3.getDers2().getValue());
                       rezervasyoncrs3.setText(pro3.getDers3().getValue());
                       rezervasyoncrs4.setText(pro3.getDers4().getValue());
                       rezervasyoncrs5.setText(pro3.getDers5().getValue());
                       rezervasyoncrs6.setText(pro3.getDers6().getValue());
                   }


                   /* 4. GUN PERŞEMBE */
                   c.add(c.DAY_OF_MONTH, 1);
                   tempday = c.get(c.YEAR)+"-"+(c.get(c.MONTH)+1)+"-"+(c.get(c.DATE));
                   ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
                   rezervasyon4.setText((c.get(c.DATE))+" "+ConvertToMount(c.get(c.MONTH)+1)+" "+c.get(c.YEAR)+" "+ConvertToDay(c.get(c.DAY_OF_WEEK)));
                   ProgramDersDB pro4=port.programGetById(par.getKullaniciAdi(), par.getKullaniciSifre(),tempday);
                   if(pro4==null)
                   {
                       rezprskatpane.setVisible(false);
                       rezprserrpane.setVisible(true);
                       rezprserrlabel.setText("Bugun Program Bulunmuyor");
                   }
                   else
                   {
                       rezprskatpane.setVisible(true);
                       rezprserrpane.setVisible(false);
                       rezervasyonprs1.setText(pro4.getDers1().getValue());
                       rezervasyonprs2.setText(pro4.getDers2().getValue());
                       rezervasyonprs3.setText(pro4.getDers3().getValue());
                       rezervasyonprs4.setText(pro4.getDers4().getValue());
                       rezervasyonprs5.setText(pro4.getDers5().getValue());
                       rezervasyonprs6.setText(pro4.getDers6().getValue());
                   }

                   /* 5. GUN CUMA */
                   c.add(c.DAY_OF_MONTH, 1);
                   tempday = c.get(c.YEAR)+"-"+(c.get(c.MONTH)+1)+"-"+(c.get(c.DATE));
                   ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
                   rezervasyon5.setText((c.get(c.DATE))+" "+ConvertToMount(c.get(c.MONTH)+1)+" "+c.get(c.YEAR)+" "+ConvertToDay(c.get(c.DAY_OF_WEEK)));
                   ProgramDersDB pro5=port.programGetById(par.getKullaniciAdi(), par.getKullaniciSifre(),tempday);
                   if(pro5==null)
                   {
                       rezcmkatpane.setVisible(false);
                       rezcmerrpane.setVisible(true);
                       rezcmerrlabel.setText("Bugun Program Bulunmuyor");
                   }
                   else
                   {
                       rezcmkatpane.setVisible(true);
                       rezcmerrpane.setVisible(false);
                       rezervasyoncm1.setText(pro5.getDers1().getValue());
                       rezervasyoncm2.setText(pro5.getDers2().getValue());
                       rezervasyoncm3.setText(pro5.getDers3().getValue());
                       rezervasyoncm4.setText(pro5.getDers4().getValue());
                       rezervasyoncm5.setText(pro5.getDers5().getValue());
                       rezervasyoncm6.setText(pro5.getDers6().getValue()); 
                   }

                   /* 6. GUN CUMARTESİ */
                   c.add(c.DAY_OF_MONTH, 1);
                   tempday = c.get(c.YEAR)+"-"+(c.get(c.MONTH)+1)+"-"+(c.get(c.DATE));
                   ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
                   rezervasyon6.setText((c.get(c.DATE))+" "+ConvertToMount(c.get(c.MONTH)+1)+" "+c.get(c.YEAR)+" "+ConvertToDay(c.get(c.DAY_OF_WEEK)));
                   ProgramDersDB pro6=port.programGetById(par.getKullaniciAdi(), par.getKullaniciSifre(),tempday);
                   if(pro6==null)
                   {
                       rezcmtkatpane.setVisible(false);
                       rezcmterrpane.setVisible(true);
                       rezcmterrlabel.setText("Bugun Program Bulunmuyor");
                   }
                   else
                   {
                       rezcmtkatpane.setVisible(true);
                       rezcmterrpane.setVisible(false);
                       rezervasyoncmt1.setText(pro6.getDers1().getValue());
                       rezervasyoncmt2.setText(pro6.getDers2().getValue());
                       rezervasyoncmt3.setText(pro6.getDers3().getValue());
                       rezervasyoncmt4.setText(pro6.getDers4().getValue());
                       rezervasyoncmt5.setText(pro6.getDers5().getValue());
                       rezervasyoncmt6.setText(pro6.getDers6().getValue());
                   }
 
                   /* 7. GUN pazar */
                   c.add(c.DAY_OF_MONTH, 1);
                   tempday = c.get(c.YEAR)+"-"+(c.get(c.MONTH)+1)+"-"+(c.get(c.DATE));
                   ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
                   rezervasyon7.setText((c.get(c.DATE))+" "+ConvertToMount(c.get(c.MONTH)+1)+" "+c.get(c.YEAR)+" "+ConvertToDay(c.get(c.DAY_OF_WEEK)));
                   
                   ProgramDersDB pro7=port.programGetById(par.getKullaniciAdi(), par.getKullaniciSifre(),tempday);
                   if(pro7==null)
                   {
                       rezpzkatpane.setVisible(false);
                       rezpzerrpane.setVisible(true);
                       rezpzerrlabel.setText("Bugun Program Bulunmuyor");
                   }
                   else
                   {
                       rezpzkatpane.setVisible(true);
                       rezpzerrpane.setVisible(false);
                       rezervasyonpz1.setText(pro7.getDers1().getValue());
                       rezervasyonpz2.setText(pro7.getDers2().getValue());
                       rezervasyonpz3.setText(pro7.getDers3().getValue());
                       rezervasyonpz4.setText(pro7.getDers4().getValue());
                       rezervasyonpz5.setText(pro7.getDers5().getValue());
                       rezervasyonpz6.setText(pro7.getDers6().getValue());
                   }      
        girispane.setVisible(false); 
        anarezervasyon.setVisible(true);
        anabugunpane.setVisible(false);
        anapro.setVisible(false);
        anasayfapanel.setVisible(true);
        anadurumpanel.setVisible(false);
        
    }
    @FXML protected void BirinciGun(ActionEvent event)
    {
        try
        {
            String tempday="";
            Date tomorrow=null;
            Calendar c=Calendar.getInstance();
            tomorrow = c.getTime();
            tempday = dateFormat.format(tomorrow);
            ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
            if(!port.rezervasyonYap(par.getKullaniciAdi(), par.getKullaniciSifre(), tempday, tempday))
                throw  new Exception();
                
        }
        catch(Exception err)
        {
            rezpztkatpane.setVisible(false);
            rezpzterrpane.setVisible(true);
            rezpzterrlabel.setText("Hata Oluştu Lütfen Yetkili Kişiye Bildiriniz"); 
        }
    }
    @FXML protected void IkinciGun(ActionEvent event)
    {
        try
        {
            String tempday="",currentday="";
            Date tomorrow=null;
            Calendar c=Calendar.getInstance();          
            tomorrow = c.getTime();
            currentday = dateFormat.format(tomorrow);
            c.add(c.DAY_OF_MONTH, 1);
            tomorrow = c.getTime();
            tempday = dateFormat.format(tomorrow);
            ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
            if(!port.rezervasyonYap(par.getKullaniciAdi(), par.getKullaniciSifre(), tempday, currentday))
                throw  new Exception();
                
        }
        catch(Exception err)
        {
            rezsalkatpane.setVisible(false);
            rezsalerrpane.setVisible(true);
            rezsalerrlabel.setText("Hata Oluştu Lütfen Yetkili Kişiye Bildiriniz"); 
        }
    }
    @FXML protected void UcuncuGun(ActionEvent event)
    {
        try
        {
            String tempday="",currentday="";
            Date tomorrow=null;
            Calendar c=Calendar.getInstance();          
            tomorrow = c.getTime();
            currentday = dateFormat.format(tomorrow);
            c.add(c.DAY_OF_MONTH, 2);
            tomorrow = c.getTime();
            tempday = dateFormat.format(tomorrow);
            ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
            if(!port.rezervasyonYap(par.getKullaniciAdi(), par.getKullaniciSifre(), tempday, currentday))
                throw  new Exception();
                
        }
        catch(Exception err)
        {
            rezcrskatpane.setVisible(false);
            rezcrserrpane.setVisible(true);
            rezcrserrlabel.setText("Hata Oluştu Lütfen Yetkili Kişiye Bildiriniz");
        }
    }
    @FXML protected void DorduncuGun(ActionEvent event)
    {
        try
        {
            String tempday="",currentday="";
            Date tomorrow=null;
            Calendar c=Calendar.getInstance();          
            tomorrow = c.getTime();
            currentday = dateFormat.format(tomorrow);
            c.add(c.DAY_OF_MONTH, 3);
            tomorrow = c.getTime();
            tempday = dateFormat.format(tomorrow);
            ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
            if(!port.rezervasyonYap(par.getKullaniciAdi(), par.getKullaniciSifre(), tempday, currentday))
                throw  new Exception();
                
        }
        catch(Exception err)
        {
             rezprskatpane.setVisible(false);
            rezprserrpane.setVisible(true);
            rezprserrlabel.setText("Hata Oluştu Lütfen Yetkili Kişiye Bildiriniz");
        }
    }
    @FXML protected void BesinciGun(ActionEvent event)
    {
        try
        {
            String tempday="",currentday="";
            Date tomorrow=null;
            Calendar c=Calendar.getInstance();          
            tomorrow = c.getTime();
            currentday = dateFormat.format(tomorrow);
            c.add(c.DAY_OF_MONTH, 4);
            tomorrow = c.getTime();
            tempday = dateFormat.format(tomorrow);
            ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
            if(!port.rezervasyonYap(par.getKullaniciAdi(), par.getKullaniciSifre(), tempday, currentday))
                throw  new Exception();
                
        }
        catch(Exception err)
        {
             rezcmkatpane.setVisible(false);
            rezcmerrpane.setVisible(true);
            rezcmerrlabel.setText("Hata Oluştu Lütfen Yetkili Kişiye Bildiriniz");
        }
    }
    @FXML protected void AltinciGun(ActionEvent event)
    {
        try
        {
            String tempday="",currentday="";
            Date tomorrow=null;
            Calendar c=Calendar.getInstance();          
            tomorrow = c.getTime();
            currentday = dateFormat.format(tomorrow);
            c.add(c.DAY_OF_MONTH, 5);
            tomorrow = c.getTime();
            tempday = dateFormat.format(tomorrow);
            ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
            if(!port.rezervasyonYap(par.getKullaniciAdi(), par.getKullaniciSifre(), tempday, currentday))
                throw  new Exception();
                
        }
        catch(Exception err)
        {
             rezcmtkatpane.setVisible(false);
            rezcmterrpane.setVisible(true);
            rezcmterrlabel.setText("Hata Oluştu Lütfen Yetkili Kişiye Bildiriniz");
        }
    }
    @FXML protected void YedinciGun(ActionEvent event)
    {
        try
        {
            String tempday="",currentday="";
            Date tomorrow=null;
            Calendar c=Calendar.getInstance();          
            tomorrow = c.getTime();
            currentday = dateFormat.format(tomorrow);
            c.add(c.DAY_OF_MONTH, 6);
            tomorrow = c.getTime();
            tempday = dateFormat.format(tomorrow);
            ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
            if(!port.rezervasyonYap(par.getKullaniciAdi(), par.getKullaniciSifre(), tempday, currentday))
                throw  new Exception();
                
        }
        catch(Exception err)
        {
             rezpzkatpane.setVisible(false);
            rezpzerrpane.setVisible(true);
            rezpzerrlabel.setText("Hata Oluştu Lütfen Yetkili Kişiye Bildiriniz");
        }
    }
    @FXML protected void openBugunScene(ActionEvent event)
    {
        Calendar c=Calendar.getInstance(); 
        String tempday = c.get(c.YEAR)+"-"+(c.get(c.MONTH)+1)+"-"+(c.get(c.DATE));
        ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
        boolean  out=port.bugunRezervasyonYapilmismi(par.getKullaniciAdi(), par.getKullaniciSifre(), tempday);
        if(out)
        {
            bugunkaypane.setVisible(true);
            bugunerrpane.setVisible(false);
            bugunhatapanel.setVisible(false);
            bugunhata.setText("");
            bugunboytext.setText("0");
            buguncalismatext.setText("0");
            bugunkilo.setText("0");
            bugunkosutext.setText("0");
            bugunkalori.setText("0");
        }
        else
        {
            bugunkaypane.setVisible(false);
            bugunerrpane.setVisible(true);
            bugunerrlabel.setText("Bugun için Kayıtlı Rezervasyonunuz Yoktur");
        }
        
        girispane.setVisible(false); 
        anarezervasyon.setVisible(false);
        anabugunpane.setVisible(true);
        anapro.setVisible(false);
        anasayfapanel.setVisible(true);
        anadurumpanel.setVisible(false); 
    }
    @FXML protected void openGirisScene(ActionEvent event)
    {
         Cikis();
    }
     @FXML
    private void cikis(ActionEvent event) {        
        System.exit(0);
    }
    @FXML
    private void lineChartDeneme(ActionEvent event) {        
        ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, servis);
        ArrayOfKisiBilgileriDB kisibilgileri=port.kisiselBilgiler(par.getKullaniciAdi(), par.getKullaniciSifre());
        int temp=durumcombobox.getSelectionModel().getSelectedIndex();
        switch(temp)
        {
            case 1:
            {
                durumlinechart.setTitle("BOY");
                durumlinechart.getData().clear();
                XYChart.Series series=new XYChart.Series<CategoryAxis, NumberAxis>();               
                for(int i=0;i<kisibilgileri.getKisiBilgileriDB().size();i++)
                {
                    String  tempstr = kisibilgileri.getKisiBilgileriDB().get(i).getTarih().getDay()+" "+ConvertToMount(kisibilgileri.getKisiBilgileriDB().get(i).getTarih().getMonth())+" "+kisibilgileri.getKisiBilgileriDB().get(i).getTarih().getYear();                 
                    series.getData().add(new XYChart.Data(tempstr,kisibilgileri.getKisiBilgileriDB().get(i).getBoy()));
                }
                durumlinechart.getData().add(series);
                break;
            }
            case 0:
            {
                durumlinechart.setTitle("KİLO");
                durumlinechart.getData().clear();
                XYChart.Series series=new XYChart.Series<CategoryAxis, NumberAxis>();               
                for(int i=0;i<kisibilgileri.getKisiBilgileriDB().size();i++)
                {
                    String  tempstr = kisibilgileri.getKisiBilgileriDB().get(i).getTarih().getDay()+" "+ConvertToMount(kisibilgileri.getKisiBilgileriDB().get(i).getTarih().getMonth())+" "+kisibilgileri.getKisiBilgileriDB().get(i).getTarih().getYear();                 
                    series.getData().add(new XYChart.Data(tempstr,kisibilgileri.getKisiBilgileriDB().get(i).getKilo()));
                }
                durumlinechart.getData().add(series);
                 break;
            }
            case 2:
            {
                durumlinechart.setTitle("KALORİ");
                durumlinechart.getData().clear();
                XYChart.Series series=new XYChart.Series<CategoryAxis, NumberAxis>();               
                for(int i=0;i<kisibilgileri.getKisiBilgileriDB().size();i++)
                {
                    String  tempstr = kisibilgileri.getKisiBilgileriDB().get(i).getTarih().getDay()+" "+ConvertToMount(kisibilgileri.getKisiBilgileriDB().get(i).getTarih().getMonth())+" "+kisibilgileri.getKisiBilgileriDB().get(i).getTarih().getYear();                 
                    series.getData().add(new XYChart.Data(tempstr,kisibilgileri.getKisiBilgileriDB().get(i).getKalori()));
                }
                durumlinechart.getData().add(series);
                
            }
            case 3:
            {
                durumlinechart.setTitle("KOSU");
                durumlinechart.getData().clear();
                XYChart.Series series=new XYChart.Series<CategoryAxis, NumberAxis>();               
                for(int i=0;i<kisibilgileri.getKisiBilgileriDB().size();i++)
                {
                    String  tempstr = kisibilgileri.getKisiBilgileriDB().get(i).getTarih().getDay()+" "+ConvertToMount(kisibilgileri.getKisiBilgileriDB().get(i).getTarih().getMonth())+" "+kisibilgileri.getKisiBilgileriDB().get(i).getTarih().getYear();                 
                    series.getData().add(new XYChart.Data(tempstr,kisibilgileri.getKisiBilgileriDB().get(i).getKosu()));
                }
                durumlinechart.getData().add(series);
            }
            case 4:
            {
                durumlinechart.setTitle("ÇALIŞMA SAATİ");
                durumlinechart.getData().clear();
                XYChart.Series series=new XYChart.Series<CategoryAxis, NumberAxis>();               
                for(int i=0;i<kisibilgileri.getKisiBilgileriDB().size();i++)
                {
                    String  tempstr = kisibilgileri.getKisiBilgileriDB().get(i).getTarih().getDay()+" "+ConvertToMount(kisibilgileri.getKisiBilgileriDB().get(i).getTarih().getMonth())+" "+kisibilgileri.getKisiBilgileriDB().get(i).getTarih().getYear();                 
                    series.getData().add(new XYChart.Data(tempstr,kisibilgileri.getKisiBilgileriDB().get(i).getCalismaSaati()));
                }
                durumlinechart.getData().add(series);
            }
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        double he=Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        double wi=Toolkit.getDefaultToolkit().getScreenSize().getWidth();    
       girispane.setLayoutX((he/2)-(girispane.getWidth()/2));
       anasayfapanel.setLayoutX((he/2)-(anasayfapanel.getHeight()/2));
       Image image1 = new Image("/a.jpg", true);
       grisiimage.setImage(image1);
       durumcombobox.getItems().clear();
       durumcombobox.getItems().addAll( "KİLO",
                "BOY",
                "KALORİ",
                "KOSU",
                "ÇALIŞMA SAATİ");
    }   
    
}
