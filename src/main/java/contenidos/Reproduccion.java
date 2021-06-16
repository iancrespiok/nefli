package contenidos;

public class Reproduccion {
  private Contenido contenidoAsociado;
  private Integer minuto;

  public Reproduccion(Contenido contenidoAsociado) {
    this.contenidoAsociado = contenidoAsociado;
  }

  void print(){
    System.out.println(contenidoAsociado.getTitulo() + " en el minuto " + minuto);
  }

  public Contenido getContenidoAsociado() {
    return contenidoAsociado;
  }

  public Integer getMinuto() {
    return minuto;
  }

  public void setMinuto(Integer minuto) {
    this.minuto = minuto;
  }
}
