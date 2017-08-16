import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 8/16/17
 */
public class JavaFXMaster extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        final AtomicInteger counter = new AtomicInteger(0);

        primaryStage.setTitle("JavaFXMaster");

        final Button btn = new Button("Click me!");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                int n = counter.incrementAndGet();
                System.out.println("Button clicked " + n + "th");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
