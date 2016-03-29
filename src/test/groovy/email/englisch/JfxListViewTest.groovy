package email.englisch

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.SceneAntialiasing
import javafx.scene.control.ListView
import javafx.scene.layout.StackPane
import javafx.scene.paint.Color
import javafx.stage.Stage

class JfxListViewTest extends Application {
    void start(Stage primaryStage) {
        ListView<String> listView = new ListView<>()
        listView.getItems().addAll('Item1', 'Item2', 'Item3')
        StackPane stackPane = new StackPane(listView)
        Scene scene = new Scene(stackPane)
        //Scene scene = new Scene(stackPane, -1, -1, Color.WHITE, false, SceneAntialiasing.DISABLED)
        primaryStage.title = 'JfxListViewTest'
        primaryStage.scene = scene
        primaryStage.show()
    }
}
