import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UsuarioImplOracle implements IUsuario {


    @Override
    public void insertaUsuario() {
        System.out.println("Insertando usuario en Oracle");
    }

    @Override
    public void eliminaUsuario(int id) {

        System.out.println("Eliminando usuario en Oracle");

    }
}
