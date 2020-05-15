package ManagerDashbord.DashbordControllers;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SubmitPaneController implements Initializable {


    public ScrollPane SubmitScrollPane;

    public void showOnTheScrollPane(){
        SubmitScrollPane.setFitToWidth(true);
        SubmitScrollPane.setPannable(true);



        try {
            Node node = (Node) FXMLLoader.load(getClass().getResource("../DashbordFXMLs/Employment/SubmitForm.fxml"));
            SubmitScrollPane.setContent(node);

        } catch (IOException ex) {

            System.out.println("problem in loadnig");
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        showOnTheScrollPane();
    }
}