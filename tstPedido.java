
public class tstPedido {
	
	public static void main(String[] args) {
		Pedido p = new Pedido (3);
		Item i1 = new Item("Caneta Bic Vermelha","PC",1.5,6.0);
		Item i2 = new Item("Papel A4","PC",30.0,2.0);
		Item i3 = new Item("Lixeira Escritório","PC",50.0,1.0);
		
		p.add(i1,0);
		p.add(i2,1);
		p.add(i3,2);
		
		System.out.println("Total do Pedido R$"+p.totalPedido());
	}

}
