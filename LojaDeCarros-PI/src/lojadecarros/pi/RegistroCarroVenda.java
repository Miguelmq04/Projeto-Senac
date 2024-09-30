
package lojadecarros.pi;

import java.time.LocalDate;


public class RegistroCarroVenda {
    protected LocalDate dataRegistro = LocalDate.now();

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    
}
