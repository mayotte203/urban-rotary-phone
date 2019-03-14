import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;

public class Controller {
    private View view = new View();
    private Model model = new Model();
    EventHandler<ActionEvent> squareButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event)
        {
            view.displaySqaure(model.computeSquare(view.getHeight(), view.getWidth()));
        }
    };
    EventHandler<ActionEvent> perimeterButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event)
        {
            view.displayPerimeter(model.computePerimeter(view.getHeight(), view.getWidth()));
        }
    };
    public Controller()
    {
        view.setPerimeterButtonEventHandler(perimeterButtonActionEvent);
        view.setSquareButtonEventHandler(squareButtonActionEvent);
    }
    public void setVeiwPane(Pane pane)
    {
        view.setPane(pane);
    }
}
