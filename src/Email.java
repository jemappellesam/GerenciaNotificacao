public class Email implements Notifica {
    String Email;

    @Override
    public void Notificar(String message) {
    System.out.println("Para:"+this.Email );
    System.out.println(message);
    }
    public Email(String email){
        this.Email=email;
    }
}
