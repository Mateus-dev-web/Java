package oo.composicao;

public class CompraTeste {
  public static void main(String[] args) {
	Compra compra1 = new Compra();
	compra1.cliente = "João Pedro";
	compra1.adicionarItem("Caneta",2 ,2.5);
	compra1.adicionarItem(new Item("Boracha",3, 1.9));
	compra1.adicionarItem(new Item("Lapis",3,2.9));
	
	System.out.println(compra1.itens.size());
	System.out.printf("Valor %f.1",compra1.obterValorTotal());
	
  }
}
