package sample;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Controller {

    @FXML private Button btn_convert;
    @FXML private TextField tf_euro;
    @FXML private TextField tf_selCur;      //Text Field of selected currency
    @FXML private ChoiceBox<String> chBox = new ChoiceBox<String>();


    @FXML public void initialize(){
        CurrencyConverter cc = new CurrencyConverter();
        for(int i = 0; i < cc.getCurrencies().size(); i++)
            chBox.getItems().add(cc.getCurrencies().get(i).getSign());
    }

    @FXML private void doConvertion(){
        CurrencyConverter cc = new CurrencyConverter();
        double convertedCurrency = 0;

        try {
            double euro = Double.parseDouble(tf_euro.getText());
            if (chBox.getValue().equals("Yen")) {
                convertedCurrency = euro * cc.getCurrencies().get(0).getValue();
                tf_selCur.setText(String.valueOf(convertedCurrency));
            }
            else if (chBox.getValue().equals("USD")) {
                convertedCurrency = euro * cc.getCurrencies().get(1).getValue();
                tf_selCur.setText(String.valueOf(convertedCurrency));
            }
            else if (chBox.getValue().equals("Pfund")) {
                convertedCurrency = euro * cc.getCurrencies().get(2).getValue();
                tf_selCur.setText(String.valueOf(convertedCurrency));
            }

        }
        catch(Exception e){
            tf_selCur.setText("Es wurde ein falscher Wert eingegeben.");
        }
    }
}
