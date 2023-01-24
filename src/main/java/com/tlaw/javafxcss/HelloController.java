package com.tlaw.javafxcss;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import static jdk.jpackage.internal.WixAppImageFragmentBuilder.ShortcutsFolder.Desktop;


public class HelloController {
      @FXML
      private Label label;
public void initialize(){

            button4.setEffect(new DropShadow());
}
@FXML
      public void handleMouseEnter(){
      label.setScaleX(2.0);
      label.setScaleY(2.0);
}
@FXML
      public void handleMouseExit(){
      label.setScaleX(1.0);
      label.setScaleY(1.0);
}
@FXML
      private Button button4;
@FXML
      public void handleClick(){
      FileChooser chooser = new FileChooser();
      chooser.setTitle("Save Application File");
      chooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("Text", "*.txt"),
            new FileChooser.ExtensionFilter("PDF", "*.pdf"),
            new FileChooser.ExtensionFilter("Images", "*.png", "*.jpg", "*.gif"),
            new FileChooser.ExtensionFilter("ALL", "*.*")
      );
      List<File> file = chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());
      if(file != null) {
            for(int i=0; i<file.size(); i++) {
                  System.out.println(file.get(i));
            }
//            System.out.println(file.getPath());
      } else {
            System.out.println("Chooser was cancelled");
      }
}
@FXML
      private GridPane gridPane;
@FXML
      public void handleLinkClicked(){
      //        try {
//            Desktop.getDesktop().browse(new URI("http://www.javafx.com"));
//        } catch(IOException e) {
//            e.printStackTrace();
//        } catch(URISyntaxException e) {
//            e.printStackTrace();
//        }
      WebEngine engine = webView.getEngine();
      engine.load("http://www.javafx.com");
}
}