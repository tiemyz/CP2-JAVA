package br.com.fiap;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable{

    @FXML private TextField textFieldTitulo;
    @FXML private TextField textFieldIngredientes;
    @FXML private TextField textFieldModo;
    @FXML private TextField textFieldCusto;
    @FXML private TextField textFieldCategoria;
    @FXML private ChoiceBox<String> choiceBox;
    @FXML private ListView<Receitas> listView;
    @FXML private ListView<Receitas> listViewReceitasFavoritadas;

    private List<Receitas> lista = new ArrayList<>();
    private List<Receitas> listaReceitasFavs= new ArrayList<>();
    String[] listaFavs = {"SIM", "NÃO"};

    public void salvar() {

        String titulo = textFieldTitulo.getText();
        String ingredientes = textFieldIngredientes.getText();
        String modo = textFieldModo.getText();
        Double custo = Double.valueOf(textFieldCusto.getText());
        String categoria = textFieldCategoria.getText();
        String favoritadas = choiceBox.getValue();
      
        Receitas receitas = new Receitas(titulo, ingredientes, modo, (double) custo, categoria, favoritadas);
        if (favoritadas == "SIM") {
            listaReceitasFavs.add(receitas);
        }
        lista.add(receitas);
        atualizarList();
    }

    public void ordenarCategoria(){
        lista.sort((o1, o2) -> o1.getCategoria().compareTo(o2.getCategoria()));
        atualizarList();
    }


    public void ordenarCusto(){
        lista.sort((o1, o2) -> Double.compare(o1.getCusto(), o2.getCusto()) );
        atualizarList();
    }


    public void ordenarTitulo(){
        lista.sort((o1, o2) -> o1.getTitulo().compareTo(o2.getTitulo()));
        atualizarList();
    }

    public void atualizarList(){

        listView.getItems().clear();
        listView.getItems().addAll(lista);
        listViewReceitasFavoritadas.getItems().clear();
        listViewReceitasFavoritadas.getItems().addAll(listaReceitasFavs);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        choiceBox.getItems().addAll(listaFavs);
    }
}