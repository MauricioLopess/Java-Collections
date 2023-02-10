public class App {
    public static void main(String[] args) throws Exception {

        Usuario1 user1 = new Usuario1("Usuario1");
        Usuario1 user2 = new Usuario1("Usuario1");

        System.out.println("Usuário 1: " + user1);
        System.out.println("Usuário 1 hashCode: " + user1.hashCode());
        
        System.out.println();

        System.out.println("Usuário 2: " + user2);
        System.out.println("Usuário 2 hashCode: " + user2.hashCode());
        System.out.println();

        System.out.println("são iguais? " + user1.equals(user2));

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        Usuario2 user3 = new Usuario2("Usuario2");
        Usuario2 user4 = new Usuario2("Usuario2");

        System.out.println("Usuário 1: " + user3);
        System.out.println("Usuário 1 hashCode: " + user3.hashCode());
        System.out.println();

        System.out.println("Usuário 2: " + user4);
        System.out.println("Usuário 2 hashCode: " + user4.hashCode());
        System.out.println();

        System.out.println("são iguais? " + user3.equals(user4));
    }
}
