    import javafx.application.Application;
    import javafx.scene.layout.Pane;
    import javafx.stage.Stage;
    import javafx.scene.Scene;
    import javafx.scene.Group;

    public class Main extends Application{
        private Controller controller = new Controller();
        public static void main(String[] args) {
            Application.launch(args);
        }

        @Override
        public void start(Stage stage) {
            Pane mainPane = new Pane();
            controller.setVeiwPane(mainPane);
            Group root = new Group(mainPane);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Lab 1");
            stage.setWidth(500);
            stage.setHeight(200);
            stage.show();
        }
    }