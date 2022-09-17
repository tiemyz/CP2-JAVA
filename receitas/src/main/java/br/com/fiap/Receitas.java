package br.com.fiap;


public class Receitas implements Comparable {

    private String titulo;
    private String ingredientes;
    private String modo;
    private Double custo;
    private String categoria;
    private String favoritadas;

    public Receitas(String titulo, String ingredientes, String modo, Double custo, String categoria, String favoritadas) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.modo = modo;
        this.custo = custo;
        this.categoria = categoria;
        this.favoritadas = favoritadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFavoritadas() {
        return favoritadas;
    }

    public void setFavoritadas(String favoritadas) {
        this.favoritadas = favoritadas;
    }

    @Override
    public String toString() {
        return "Título da receita: " + titulo + "\nIngredientes: " + ingredientes + "\nModo de preparo: " + modo + "\nR$" + custo + "\nCategoria: " + categoria;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
