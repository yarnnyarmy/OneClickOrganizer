package dashboard;

import Model.User;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private JFXButton btnLocation;

    @FXML
    private Label dashboardAddress;

    @FXML
    private AnchorPane dashboardAnchorPane;

    @FXML
    private Label dashboardEmpName;

    @FXML
    private VBox dashboardMenu;

    @FXML
    private HBox headerTitle;

    @FXML
    private Label lblAddress;

    @FXML
    private Label lblName;

    @FXML
    private BorderPane mainDashPane;

    @FXML
    private VBox profileBox;

    @FXML
    private Label userName;

    @FXML
    private ImageView userProfile;

    private List<User> addUser (){
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setFirstName("Yarnell");
        user.setLastName("Locklear");
        user.setBirthDate(LocalDate.of(1987,02,12));
        user.setGender("Male");
        user.setAddress("210 Melinda Rd. Maxton, NC 28364");
        user.setImage("/user.png");
        users.add(user);
        return users;
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (var user : addUser()){
            setData(user);
        }
    }



    public void setData (User user){
        userName.setText(user.getFirstName() + " " + user.getLastName());
        dashboardEmpName.setText(user.getFirstName() + " " + user.getLastName());
        dashboardAddress.setText(user.getAddress());
        Image img = new Image(getClass().getResourceAsStream(user.getImage()));
        userProfile.setImage(img);
    }

}
