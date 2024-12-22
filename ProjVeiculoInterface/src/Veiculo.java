import javax.swing.JOptionPane;

public class Veiculo {
    
    public String marca;
    public String modelo;
    private double valor;
    private int ano;
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public double CalcularDesconto(){
        double valorComDesconto;
        if (this.ano <= 2) {
            valorComDesconto = this.valor * 0.9;
            JOptionPane.showMessageDialog(null, "Com o desconto de 10%, o valor total é: " + valorComDesconto);
        } else if (this.ano <= 10) {
            valorComDesconto = this.valor * 0.8;
            JOptionPane.showMessageDialog(null, "Com o desconto de 20%, o valor total é: " + valorComDesconto);
        } else {
            valorComDesconto = this.valor * 0.7;
            JOptionPane.showMessageDialog(null, "Com o desconto de 30%, o valor total é: " + valorComDesconto);
        }
        
        return valorComDesconto;  
   }
    
}
