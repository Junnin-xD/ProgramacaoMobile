package control;

import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

import Dao.DaoModels;
import model.Models;

//import Dao.DaoModels;

public class Controler {

    public static void cadastrar(JTextField nome, JTextField classificacao, Double valor, JFormattedTextField data,
            boolean ganhoBtn, boolean gastoBtn) {

        // Instancia a classe models
        Models entity = new Models(nome.getText(), classificacao.getText(), valor, data.getText(), ganhoBtn, gastoBtn);

        // Chama o metodo salvar da classe models
        new DaoModels().salvarDB(entity);
    }

    public static List<Models> buscaModel() {

        // Atualiza jtable
        return new DaoModels().buscaModel();

    }

    public static void deletar(int id) {

        // Chama o metodo deletar da classe models
        new DaoModels().deletar(id);
    }
}
