public class App {

    public static void main(String[] args) {
    // Inyeccion -------------------------------------------------------------------
        UsuarioFactory obj = new UsuarioFactory(new UsuarioImplMongo());
    // Inyeccion fin -------------------------------------------------------------------


        obj.getInsertaUsuario();
        obj.getEliminarUsuarioByID(1);
    }
}
