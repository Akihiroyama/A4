import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;



/**
 *
 * @author akihiro
 */
public class A4FX extends Application {
   
    private VBox vbox;
    private Scene scene;
    private TextArea textArea;
    private Label label;
    private Button commandButton;
    private Button commandButton1;
    private HBox commandArea;
    private String string1;
    private String new_string1; 
    private String new_string2;
  
   
    @Override
    public void start(Stage stage) {
        vbox = new VBox();
        scene = new Scene(vbox);
        textArea = new TextArea();
	label = new Label("3文字以上入力してください！");
        commandButton = new Button("OK");
        commandButton1 = new Button("Clear");
        commandArea = new HBox();
        commandArea.setSpacing(5);
        string1 = textArea.getText();
     
        
        commandArea.getChildren().addAll(commandButton, commandButton1);
        vbox.getChildren().addAll(label,textArea, commandArea);
 
   
        commandButton.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void handle(ActionEvent actionEvent) {
            string1 = textArea.getText();
            int i=2;
             if(string1.length() <= i){
                JOptionPane.showMessageDialog(null, "正しく入力して！");
                 
             }else if(i < string1.length()){
                 new_string1 = string1.substring(0,3);
                 new_string2 = string1.substring(3);
                 textArea.setText(new_string1+ "waja"+new_string2);
             }
        }
      
    });
   
         commandButton1.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void handle(ActionEvent actionEvent) {

            textArea.setText("");
           
        }
    });
         
    stage.setScene(scene);
    stage.setTitle("JavaFX2");
    stage.setWidth(500); stage.setHeight(300);
    stage.show();
  }

    public static void main(String[] args) {
        Application.launch(A4FX.class, args);
      
    }
    
}
