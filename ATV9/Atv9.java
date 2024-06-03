
abstract class PersonagemDragonBall {
    protected String nome;
    protected double chi;

    public abstract double calcularPoder();
}

class Terraqueo extends PersonagemDragonBall {
    private String cidade;

    public Terraqueo(String nome, double chi, String cidade) {
        this.nome = nome;
        this.chi = chi;
        this.cidade = cidade;
    }

    @Override
    public double calcularPoder() {
        return chi;
    }

    @Override
    public String toString() {
        return "Terraqueo{" +
                "nome='" + nome + '\'' +
                ", chi=" + chi +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}

class Sayajin extends PersonagemDragonBall {
    int nivelMaximoSSJ; 

    public Sayajin(String nome, double chi, int nivelMaximoSSJ) {
        this.nome = nome;
        this.chi = chi;
        this.nivelMaximoSSJ = nivelMaximoSSJ;
    }

    @Override
    public double calcularPoder() {
        return chi * (1 + nivelMaximoSSJ * 0.1);
    }

    @Override
    public String toString() {
        return "Sayajin{" +
                "nome='" + nome + '\'' +
                ", chi=" + chi +
                ", nivelMaximoSSJ=" + nivelMaximoSSJ +
                '}';
    }
}

class Namekuseijin extends PersonagemDragonBall {
    private boolean podeCurar;

    public Namekuseijin(String nome, double chi, boolean podeCurar) {
        this.nome = nome;
        this.chi = chi;
        this.podeCurar = podeCurar;
    }

    @Override
    public double calcularPoder() {
        return chi * (1 + (podeCurar ? 0.2 : 0));
    }

    @Override
    public String toString() {
        return "Namekuseijin{" +
                "nome='" + nome + '\'' +
                ", chi=" + chi +
                ", podeCurar=" + podeCurar +
                '}';
    }

    public String fazerDesejo(String desejo) {
        
        return "Desejo realizado: " + desejo;
    }
}

public class Main {
    public static void main(String[] args) {
        
        PersonagemDragonBall kuririn = new Terraqueo("Kuririn", 100, "Terra");
        PersonagemDragonBall goku = new Sayajin("Goku", 500, 3);
        PersonagemDragonBall gohan = new Sayajin("Gohan", 300, 3);
        PersonagemDragonBall dende = new Namekuseijin("Dendê", 200, true);

        
        ((Sayajin) goku).nivelMaximoSSJ = 5;
        System.out.println(goku);

        
        ((Sayajin) gohan).nivelMaximoSSJ = 5;
        System.out.println(gohan);

        
        String desejo = "Paz, amor, e esperança para todos os seres vivos";
        String desejoNamekusei = ((Namekuseijin) dende).fazerDesejo(desejo);
        System.out.println(desejoNamekusei);
    }
}
