import service.Helper;
import service.Service;

public class App {
    public static void main(String[] args) {
        System.out.println("*********************START*********************");

        Service.run(Helper.getMainString(), Helper.getQueryString(), Helper.getWordsDelimiter());

        System.out.println("*********************STOP*********************");
    }
}
