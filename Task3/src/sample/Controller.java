package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    public TextField text1;
    public TextField text2;
    public TextField text3;
    public TextField text11;
    public TextField text22;
    public TextField text33;


    public void Btn1(ActionEvent actionEvent) {
        Double value = new Double(text1.getText());
        double value2 = Math.round((value * 0.3d)  * 1000) / 1000d;
        String finalValue = String.valueOf(value2);
        text11.setText(finalValue);

    }


    public void Btn2(ActionEvent actionEvent) {
        Double value = new Double(text2.getText());
        double value2 = Math.round((value * 0.065d) * 1000) / 1000d;
        String finalValue = String.valueOf(value2);
        text22.setText(finalValue);
    }

    public void Btn3(ActionEvent actionEvent) {
        Double value = new Double(text3.getText());
        double value2 = Math.round((value * 0.188d) * 1000) / 1000d;
        String finalValue = String.valueOf(value2);
        text33.setText(finalValue);
    }
}
