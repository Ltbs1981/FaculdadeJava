import java.util.Scanner;

public class Automovel {
    // Atributos
    private String modelo, cor, placa;
    private int hora, minuto, dia, mes, ano;
    
    // Métodos de acesso
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String m) {
        if (!m.isEmpty()) {
            modelo = m;
        } else {
            System.out.println("Valor inválido, não foi atribuído");
        }
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String c) {
        cor = c;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String p) {
        if (p.length() == 7) {
            placa = p;
        } else {
            System.out.println("Valor inválido, não foi atribuído");
        }
    }
    public int getHora() {
        return hora;
    }
    public void setHora(int h) {
        if (h >= 0 && h <= 24) {
            hora = h;
        } else {
            System.out.println("Valor inválido, não foi atribuído");
        }
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int m) {
        minuto = m;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int d) {
        dia = d;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int m) {
        mes = m;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int a) {
        ano = a;
    }
    
    // Métodos adicionais
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Modelo:");
        setModelo(sc.nextLine());
        System.out.println("Digite a Cor:");
        setCor(sc.nextLine());
        System.out.println("Digite a Placa:");
        setPlaca(sc.nextLine());
        System.out.println("Digite a Hora:");
        setHora(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o Minuto:");
        setMinuto(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o Dia:");
        setDia(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o Mês:");
        setMes(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o Ano:");
        setAno(Integer.parseInt(sc.nextLine()));
        
    }
    
    public void imprimir() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Hora: " + getHora());
        System.out.println("Minuto: " + getMinuto());
        System.out.println("Dia: " + getDia());
        System.out.println("Mês: " + getMes());
        System.out.println("Ano: " + getAno());
    }
}
