import Reproduccion.Reproductor;
import contenidos.Contenido;
import contenidos.Genero;
import contenidos.Reproduccion;
import org.junit.jupiter.api.*;
import users.User;;import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioTest {
  private Reproductor reproductor;
  private User iancrespiok;
  private Contenido ironman1;
  private Contenido inception;
  private Contenido interstellar;
  private Reproduccion reproduccionIronMan1;
  private Reproduccion reproduccionInception;
  private Reproduccion reproduccionInterstellar;

  @BeforeEach
  void setup(){
    iancrespiok = new User(1,reproductor);

    ironman1 = new Contenido("Iron Man", 1, Genero.SUPERHEROES);
    inception = new Contenido("Inception", 2, Genero.CIENCIA_FICCION);
    interstellar = new Contenido("Interstellar", 3, Genero.CIENCIA_FICCION);

    reproduccionIronMan1 = new Reproduccion(ironman1);
    reproduccionIronMan1.setMinuto(34);
    iancrespiok.addReproduccionesParaContinuarViendo(reproduccionIronMan1);

    reproduccionInception = new Reproduccion(inception);
    reproduccionInception.setMinuto(79);
    iancrespiok.addReproduccionesParaContinuarViendo(reproduccionInception);

    reproduccionInterstellar = new Reproduccion(interstellar);
    reproduccionInterstellar.setMinuto(120);
    iancrespiok.addReproduccionesParaContinuarViendo(reproduccionInterstellar);
  }

  @Test
  void listarYElegir(){
   // iancrespiok.obtenerContenidosEnCurso();
    iancrespiok.continuarViendo(ironman1);
    Assertions.assertEquals(reproduccionIronMan1, iancrespiok.getReproduccionEnCurso());
  }


}
