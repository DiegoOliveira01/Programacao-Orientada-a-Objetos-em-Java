/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultorio_dentista;

/**
 *
 * @author diego
 */
public class Dados_Usuarios {
    private String nome;
    private String rg;
    private String endereco;
    
    
    public Dados_Usuarios(String nomeCompleto, String rg, String endereco) {
        this.nome = nomeCompleto;
        this.rg = rg;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

