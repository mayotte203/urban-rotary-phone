import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class View{
    final private String widthLabelText = new String("Длинна");
    final private String heightLabelText = new String("Высота");
    final private String squareButtonText = new String("Площадь");
    final private String perimeterButtonText = new String("Периметр");

    private Label widthLabel = new Label(widthLabelText);
    private Label heightLabel = new Label(heightLabelText);
    private Label squareLabel = new Label("0");
    private Label perimeterLabel = new Label("0");
    private TextField widthField = new TextField();
    private TextField heightField = new TextField();
    private Button squareButton = new Button(squareButtonText);
    private Button perimeterButton = new Button(perimeterButtonText);

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
    public Integer getWidth()
    {
        try {
            return Integer.parseInt(widthField.getText());
        }
        catch (NumberFormatException e)
        {
            return 0;
        }
    }
    public Integer getHeight()
    {
        try {
            return Integer.parseInt(heightField.getText());
        }
        catch (NumberFormatException e)
        {
            return 0;
        }
    }
    public void setPane(Pane pane)
    {
        pane.getChildren().addAll(widthLabel, widthField, heightLabel, heightField, squareButton, squareLabel, perimeterButton,perimeterLabel);
    }
}
