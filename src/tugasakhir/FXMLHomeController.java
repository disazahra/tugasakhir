/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DISA
 */
public class FXMLHomeController implements Initializable {

    @FXML
    private JFXCheckBox mak1;
    @FXML
    private JFXCheckBox mak2;
    @FXML
    private JFXCheckBox mak3;
    @FXML
    private JFXCheckBox mak4;
    @FXML
    private JFXCheckBox mak5;
    @FXML
    private JFXCheckBox mak6;
    @FXML
    private JFXCheckBox mak7;
    @FXML
    private JFXCheckBox mak8;
    @FXML
    private Label hargaMakanan;
    @FXML
    private Label hargaMakanan1;
    @FXML
    private Label hargaMakanan11;
    @FXML
    private Label hargaMakanan13;
    @FXML
    private Label hargaMakanan12;
    @FXML
    private Label hargaMakanan121;
    @FXML
    private Label hargaMakanan1211;
    @FXML
    private Label hargaMakanan12111;
    @FXML
    private JFXTextField jumlah1;
    @FXML
    private JFXTextField jumlah6;
    @FXML
    private JFXTextField jumlah7;
    @FXML
    private JFXTextField jumlah8;
    @FXML
    private JFXTextField jumlah2;
    @FXML
    private JFXTextField jumlah3;
    @FXML
    private JFXTextField jumlah4;
    @FXML
    private JFXTextField jumlah5;
    @FXML
    private JFXButton btnCetak1;
    @FXML
    private Label hargaMakanan2;
    @FXML
    private Label hargaMakanan3;
    @FXML
    private Label hargaMakanan4;
    @FXML
    private Label hargaMakanan5;
    @FXML
    private Label hargaMakanan6;
    @FXML
    private JFXTextField inAn;
    @FXML
    private JFXTextField jumlahUang;
    @FXML
    private Label total;
    @FXML
    private JFXButton btnCetak;
    @FXML
    private JFXTextArea hasilPesanan;
    @FXML
    private JFXRadioButton radio1;
    @FXML
    private ToggleGroup keterangan;
    @FXML
    private JFXRadioButton radio2;
      @FXML
    private Button btnLain;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
int jumlahmakan, jumlahminum;
    int hagatotal1,hagatotal2,hagatotal3,hagatotal4,hagatotal5,hagatotal6,hagatotal7,hagatotal8,hagatotal9,hagatotal10;
    String menu1, menu2, menu3, menu4,menu5,menu6,menu7,menu8;
    String menu="";
    String kasir="";
    String atasnama, tampilTotalBayar, ket;
    int harga, kembalian,hargal,hargam;
    int totalbayar, jmlUangBayar;
    @FXML
    private void Hitung(ActionEvent event) {
        
        if(mak1.isSelected()){     
        } else {
            harga = 20000;
            menu += mak1.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah1.getText());
            hagatotal1=harga*jumlahmakan;
            System.out.println(hagatotal1);
        }
        if(mak2.isSelected()){
            harga = 20000;
            menu += mak2.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah2.getText());
            hagatotal2=harga*jumlahmakan;
            System.out.println(hagatotal2);
        } else {
        }
        if(mak3.isSelected()){     
            harga = 20000;
            menu += mak3.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah3.getText());
            hagatotal3=harga*jumlahmakan;
            System.out.println(hagatotal3);
        }
        if(mak4.isSelected()){     
            harga = 20000;
            menu += mak4.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah4.getText());
            hagatotal4=harga*jumlahmakan;
            System.out.println(hagatotal4);
        }
        if(mak5.isSelected()){     
            harga = 20000;
            menu += mak5.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah5.getText());
            hagatotal5=harga*jumlahmakan;
            System.out.println(hagatotal5);
        }
        if(mak6.isSelected()){     
            harga = 3000;
            menu += mak6.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah6.getText());
            hagatotal6=harga*jumlahmakan;
            System.out.println(hagatotal6);
        }
        if(mak7.isSelected()){     
            harga = 5000;
            menu += mak7.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah7.getText());
            hagatotal7=harga*jumlahmakan;
            System.out.println(hagatotal7);
        }
        if(mak8.isSelected()){     
            harga = 5000;
            menu += mak8.getText()+", ";
            jumlahmakan=Integer.parseInt(jumlah8.getText());
            hagatotal8=harga*jumlahmakan;
            System.out.println(hagatotal8);
        }
        if(radio1.isSelected()){
         hargal = hagatotal1+hagatotal2+hagatotal3+hagatotal4+hagatotal5 + 20000;
         
        }
        if(radio2.isSelected()){
            hargam = hagatotal1+hagatotal2+hagatotal3+hagatotal4+hagatotal5 + 12000;
        }
        
        totalbayar = hagatotal1+hagatotal2+hagatotal3+hagatotal4+hagatotal5+hagatotal6+hagatotal7+hagatotal8+hargal +hargam;
        tampilTotalBayar=String.valueOf(totalbayar);
        total.setText(tampilTotalBayar);
        
    }

    @FXML
    private void CetakPemesan(ActionEvent event) {
        if (radio1.isSelected()) {
            ket = "Large";
       
        } else if (radio2.isSelected()) {
            ket = "Medium";
        } else {
            ket = "";
        }
        atasnama = inAn.getText();
        jmlUangBayar = Integer.parseInt(jumlahUang.getText());
        kembalian = jmlUangBayar - totalbayar;
        
        hasilPesanan.setText("Nama Pemesanan: " + atasnama + "\n" + "Menu yang Dipesan : "  + menu +"\n" + "Keterangan : " + ket + "\n" + "Total Pembayaran : Rp. " + totalbayar + "\n" + "Jumlah Uang yang Dibayar : Rp. "
                + jmlUangBayar + "\n" + "Uang Kembali : Rp. " + kembalian+ "Kasir : " + kasir);
    }
       
    @FXML
    void btnOther(ActionEvent event) throws IOException{
         ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("food2.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 830, 450);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("MakananLain");
            stage.show();
            
            
    }
    @FXML
    void kembaliAwal(ActionEvent event) throws IOException{
         ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 830, 450);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("halamanAwal");
            stage.show();
            

    }
}
