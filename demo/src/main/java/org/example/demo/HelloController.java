package org.example.demo;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    private char nowSymbol = 'x';
    private char gameField[][] = new char[3][3];
    private  boolean isGame = true;


    @FXML
    void btnClick(ActionEvent event) {


        Button btn = (Button)event.getSource();

        if (!isGame || !Objects.equals(btn.getText(), "")) return;

        int rowIndex = GridPane.getRowIndex(btn) == null ? 0 : GridPane.getRowIndex(btn);
        int colIndex = GridPane.getColumnIndex(btn) == null ? 0 : GridPane.getColumnIndex(btn);

        gameField[rowIndex][colIndex] = nowSymbol;

        System.out.println(rowIndex);
        System.out.println(colIndex);

        ((Button)event.getSource()).setText(String.valueOf(nowSymbol));

        if (gameField[0][0] == gameField[0][1] && gameField[0][0] == gameField[0][2] &&
                (gameField[0][0] == 'x' || gameField[0][0] == 'o')) {
            isGame = false;
        }
        if (gameField[1][0] == gameField[1][1] && gameField[1][0] == gameField[1][2] &&
                (gameField[1][0] == 'x' || gameField[1][0] == 'o')) {
            isGame = false;
        }
        if (gameField[2][0] == gameField[2][1] && gameField[2][0] == gameField[2][2] &&
                (gameField[2][0] == 'x' || gameField[2][0] == 'o')) {
            isGame = false;
        }
        if (gameField[0][2] == gameField[1][2] && gameField[0][2] == gameField[2][2] &&
                (gameField[0][2] == 'x' || gameField[0][2] == 'o')) {
            isGame = false;
        }
        if (gameField[0][1] == gameField[1][1] && gameField[0][1] == gameField[2][1] &&
                (gameField[0][1] == 'x' || gameField[0][1] == 'o')) {
            isGame = false;
        }
        if (gameField[0][0] == gameField[1][0] && gameField[0][0] == gameField[2][0] &&
                (gameField[0][0] == 'x' || gameField[0][0] == 'o')) {
            isGame = false;
        }
        if (gameField[2][0] == gameField[1][1] && gameField[2][0] == gameField[0][2] &&
                (gameField[2][0] == 'x' || gameField[2][0] == 'o')) {
            isGame = false;
        }
        if (gameField[0][0] == gameField[1][1] && gameField[0][0] == gameField[2][2] &&
                (gameField[0][0] == 'x' || gameField[0][0] == 'o')) {
            isGame = false;
        }

        nowSymbol = nowSymbol == 'x' ? 'o' : 'x';
    }

    @FXML
    void initialize() {

    }

}
