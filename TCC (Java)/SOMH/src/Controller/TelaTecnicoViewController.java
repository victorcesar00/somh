/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.Run;
import static com.sun.glass.ui.Application.run;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author maria
 */
public class TelaTecnicoViewController implements Initializable {

    @FXML
    private Pane pane;
    @FXML
    private Button cadastroOrcamento;
    @FXML
    private Button procuraOS;
    @FXML
    private Button sair;
    @FXML
    private Label nomeFuncionario;
    private Run run;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Inicializando tela do técnico...");
    }

    public void cadastroOrcamento() throws Exception {
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(Run.class.getResource("../View/TelaOrcamentoView.fxml"));
        AnchorPane TelaFuncionario = (AnchorPane) loader.load();

        run.getRootLayout().setCenter(TelaFuncionario);

        TelaListagemOSController controller = loader.getController();
        controller.setRun(run);
    }

    public void procuraOS() throws Exception {
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(Run.class.getResource("../View/TelaListagemOSView.fxml"));
        AnchorPane TelaFuncionario = (AnchorPane) loader.load();

        run.getRootLayout().setCenter(TelaFuncionario);

        TelaListagemOSController controller = loader.getController();
        controller.setRun(run);
    }

    public void sair() throws Exception {
        System.exit(0);
    }

    public void setRun(Run run) {
        this.run = run;
    }
}
