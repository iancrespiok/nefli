package users;

import Reproduccion.Reproductor;
import contenidos.Contenido;
import contenidos.Reproduccion;

import java.util.List;
import java.util.stream.Collectors;

public class User {
  private List<Reproduccion> reproduccionesEnCurso;
  private Integer idUsuario;
  private Reproductor reproductor;

  public User(Integer idUsuario, Reproductor reproductor) {
    this.idUsuario = idUsuario;
    this.reproductor = reproductor;
  }

  public void obtenerContenidosEnCurso(){
    reproduccionesEnCurso.forEach(reproduccion -> reproduccion.getContenidoAsociado().print());
  }

  public void continuarViendo(Contenido contenido){
    Reproduccion reproduccion = reproduccionesEnCurso
        .stream()
        .filter(r -> r.getContenidoAsociado() == contenido)
        .collect(Collectors.toList())
        .get(0);
    reproduccionesEnCurso.remove(reproduccion);
    reproductor.play(contenido.getIdContenido(), reproduccion.getMinuto());
  }

}
