
public class Pedido {
	Item[] i;
	
	Pedido(int q){
		this.i = new Item[q];
	}
	
	float totalPedido() {
		float s=0;
		for(int j=0;j<this.i.length;j++) {
			s+=i[j].vTotalItem();
		}
		return s;
	}
	
	void add(Item i, int seq) {
		this.i[seq]=i;
	}

}
