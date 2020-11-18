package sample;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML private Button btn_convert;
    @FXML private TextField tf_euro;
    @FXML private TextField tf_yen;

    @FXML private void doConvertion(){
        CurrencyConverter c = new CurrencyConverter();
        double yen = 0;
        try{
             yen = c.euroToYen(Double.parseDouble(tf_euro.getText()));
        }catch(Exception e){
            tf_yen.setText("Es wurde ein falscher Wert eingegeben");

        }

        tf_yen.setText(String.valueOf(yen));

    }
}
