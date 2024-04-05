/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa.poo1;

/**
 *
 * @author gdelg
 */
public class Libro {
    
    //Atributos
    private int isbn;               //numero identificador del libro
    private int numero_paginas;     //numero de pagians
    private String titulo;          //titulo del libro
    private String autor;           //autor del libro

    //Constructores
    public Libro() {
    }

    public Libro(int isbn, int numero_paginas, String titulo, String autor) {
        this.isbn = isbn;
        this.numero_paginas = numero_paginas;
        this.titulo = titulo;
        this.autor = autor;
    }

    //Getter
    public int getIsbn() {
        return isbn;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    //Setter
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    //toString
    @Override
    public String toString() {
        return "El libro " + titulo + " con ISBN " + isbn + 
                " creado por el autor " + autor + 
                " tiene " + numero_paginas + " paginas";
    }
    
    
    
    
}
