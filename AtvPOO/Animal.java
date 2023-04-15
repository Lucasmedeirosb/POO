
public class Animal {
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean estado;
    private int caloria;
    private int forca;

    Animal(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;

        this.estado = true;
        this.idade = 0;
        this.caloria = 10;
        this.forca = 10;

    }

    public void comer() {
        if (this.caloria == 100) {
            System.out.println("O animal já está cheio e não consegue comer mais");
        }
        if (this.estado == false) {
            System.out.println("Seu animal esta morto tente começar o jogo do inicio");
        }
        if (this.forca < 0) {
            morrer();

        } else {
            this.caloria += 10;
            this.forca -= 2;
            if (this.forca < 0) {
                morrer();

            }

            System.out.println(
                    "O animal comeu e agora sua força é de " + this.forca + " e suas calorias valem " + this.caloria);
        }
    }

    public void correr() {
        if (this.caloria == 0) {
            System.out.println("O animal já está exausto e não consegue correr mais");
        }
        if (this.estado == false) {
            System.out.println("Seu animal esta morto tente começar o jogo do inicio");
        }
        if (this.forca <= -1 || this.caloria <= -1) {
            morrer();
        } else {
            this.forca -= 5;
            this.caloria -= 5;
            System.out.println("O animal está correndo!! Agora sua força é de" + this.forca + " e suas calorias valem "
                    + this.caloria);
            if (this.forca < 0) {
                morrer();

            }
        }
    }

    public void dormir() {
        if (this.estado == false) {
            System.out.println("Seu animal esta morto tente começar o jogo do inicio");
        }
        if (this.caloria <= -1) {
            morrer();

        }

        else {
            this.caloria -= 2;
            this.forca += 10;

            System.out.println("O animal está dormindo agora! Sua força aumentou para " + this.forca
                    + " e suas calorias valem " + this.caloria);
            if (this.forca < 0) {
                morrer();

            }
        }
    }

    public void morrer() {
        this.estado = false;
        this.forca = 0;
        System.out.println("O animal morreu!");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Boolean geteEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCaloria() {
        return caloria;
    }

    public void setCaloria(int caloria) {
        this.caloria = caloria;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

}
