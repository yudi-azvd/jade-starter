package pp;

// https://stackoverflow.com/questions/70405078/vscode-with-custom-settings-xml-maven-file-per-project-in-a-workspace
// https://stackoverflow.com/questions/74817603/could-not-resolve-jade-dependency

// Executar:
// mvn exec:java -Dexec.mainClass=jade.Boot -Dexec.args="-gui -local-host 127.0.0.1 -local-port 1099 jade.Boot;customAgent:pp.Main"
import jade.core.Agent;

public class Main extends Agent {
    private static final long serialVersionUID = 1L;

    protected void setup() {
        System.out.println("Ola mundo! ");
        System.out.println("Meu nome: " + getLocalName());
    }

    public static void main(String[] args) {
        for (String string : args) {
            System.out.println(string);
        }
    }
}