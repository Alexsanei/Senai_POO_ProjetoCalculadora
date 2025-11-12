/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Arquivo {
    private static final String nomeArquivo = "historico.txt";
    
    public static void salvarLinha(String texto) {
        try (FileWriter writer = new FileWriter(nomeArquivo, true)) {
            writer.write(texto + "\n");
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null, 
                    "Erro ao salvar no arquivo: " + e.getMessage(),
                    "Erro de arquivo", JOptionPane.ERROR_MESSAGE);
        }
    } 
}
