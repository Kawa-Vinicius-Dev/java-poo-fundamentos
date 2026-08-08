import java.util.Scanner;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        status = false;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int escolherTipo() {
        System.out.print("1 - CONTA CORRENTE (CC) - BONUS DE 50$\n" +
                "2 - CONTA POUPANÇA (CP) - BONUS DE 150$\nEscolha: ");
        Scanner sc = new Scanner(System.in);
        int tipo = sc.nextInt();
        if (tipo == 1) {
            this.tipo = "CC";
        } else if (tipo == 2) {
            this.tipo = "CP";
        } else {
            System.out.println("Digite um número valido!");
        }
        return tipo;
    }

    public double lerValor() {
        System.out.print("Digite o valor: ");
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        return valor;
    }

    public void abrirConta(int numConta, String dono) {
        int num = escolherTipo();
        if (num == 1) {
            this.numConta = numConta;
            this.dono = dono;
            this.saldo = 50;
            this.status = true;
        } else if (num == 2) {
            this.numConta = numConta;
            this.dono = dono;
            this.saldo = 150;
            this.status = true;
        }
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Operação não realizada\nVocê possui saldo na conta!");
        } else if (this.saldo < 0) {
            System.out.println("Operação não realizada \nVocê possui saldo devedor na conta!");
        } else {
            System.out.println("Conta Fechada!");
            this.dono = "Conta Fechada!";
            this.numConta = 0;
            this.status = false;
        }
    }

    public void depositar() {
        System.out.println("DEPOSITO");
        if (this.status == false) {
            System.out.println("ERRO! Você não possui conta!");
        } else {
            double valor = lerValor();
            if (valor <= 0) {
                System.out.println("Operação não realizada");
            } else {
                this.saldo += valor;
            }
        }
    }

    public void sacar() {
        System.out.println("SAQUE");
        if (this.status == false) {
            System.out.println("ERRO! Você não possui conta!");
        } else {
            double valor = lerValor();
            if (valor <= 0) {
                System.out.println("Operação não realizada!");
            } else {
                if (valor > this.saldo) {
                    System.out.println("ERRO: Saldo insuficiente!");
                }else{
                    this.saldo -= valor;
                }
            }
        }
    }

    public void pagarMensal() {
        if (tipo.equals("CC")) {
            this.saldo -= 12;
        } else {
            this.saldo -= 20;
        }
    }

    public void statusConta() {
        System.out.println("Numéro Conta: " + this.numConta +
                "\nTipo:  " + this.tipo +
                "\nDono: " + this.dono +
                "\nSaldo: " + this.saldo +
                "\nStatus: " + this.status);
    }
}
