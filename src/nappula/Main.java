package nappula;
import java.util.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.awt.*;
import java.util.List;
import javafx.scene.control.Label;
public class Main extends Application {
    Stage window;
    public static void main(String [] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        grid.setVgap(8);
        grid.setHgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        window = stage;
    List<String> lista = new ArrayList<>();
        lista.add("Kalle");
        lista.add("Mikko");
        lista.add("Mikael");

        for (int i = 0; i < lista.size(); i++) {
            int abc = i;
            Label label = new Label();
            GridPane.setConstraints(label, 0,i);
            label.setText(lista.get(abc));
            Button button = new Button();
            GridPane.setConstraints(button, 1,i);
            button.setText("Click me");
            button.setOnAction(e -> {
                System.out.println(lista.get(abc));
            });
            grid.getChildren().addAll(label, button);
        }
        grid.setAlignment(Pos.CENTER);
        Scene scene = new Scene(grid, 300,300);
        window.setScene(scene);
        window.show();
    }
}
