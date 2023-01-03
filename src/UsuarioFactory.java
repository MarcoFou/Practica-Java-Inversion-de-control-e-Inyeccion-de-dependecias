public class UsuarioFactory {

    IUsuario usr;

    // Consructor
    public UsuarioFactory(IUsuario usr){

        this.usr = usr;

    }

    public void getInsertaUsuario(){
        usr.insertaUsuario();
    }

    public void getEliminarUsuarioByID(int id){
        usr.eliminaUsuario(1);
    }




}
