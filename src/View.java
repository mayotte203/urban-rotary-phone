import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class View{
    Label widthLabel = new Label("Длинна");
    Label heightLabel = new Label("Высота");
    Label squareLabel = new Label("0");
    Label perimeterLabel = new Label("0");
    TextField widthField = new TextField();
    TextField heightField = new TextField();
    Button squareButton = new Button("Площадь");
    Button perimeterButton = new Button("Периметр");

    public View()
    {
        widthLabel.setLayoutX(20);
        widthLabel.setLayoutY(20);
        heightLabel.setLayoutX(20);
        heightLabel.setLayoutY(60);
        widthField.setLayoutX(100);
        widthField.setLayoutY(20);
        heightField.setLayoutX(100);
        heightField.setLayoutY(60);
        squareButton.setLayoutX(20);
        squareButton.setLayoutY(100);
        squareLabel.setLayoutX(100);
        squareLabel.setLayoutY(105);
        perimeterButton.setLayoutX(210);
        perimeterButton.setLayoutY(100);
        perimeterLabel.setLayoutX(300);
        perimeterLabel.setLayoutY(105);
    }

    public void displaySqaure(String string)
    {
        squareLabel.setText(string);
    }
    public void displayPerimeter(String string)
    {
        perimeterLabel.setText(string);
    }
    public void setSquareButtonEventHandler(EventHandler<ActionEvent> handler)
    {
        squareButton.setOnAction(handler);
    }
    public void setPerimeterButtonEventHandler(EventHandler<ActionEvent> handler)
    {
        perimeterButton.setOnAction(handler);
    }
    public String getWidth()
    {
        return widthField.getText();
    }
    public String getHeight()
    {
        return heightField.getText();
    }
    public void setPane(Pane pane)
    {
        pane.getChildren().addAll(widthLabel, widthField, heightLabel, heightField, squareButton, squareLabel, perimeterButton,perimeterLabel);
    }
}
