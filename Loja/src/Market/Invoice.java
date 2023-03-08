package Market;


public class Invoice {  
	
	// Classe
	
	private int Numero;
	private String descrevItem;
	private int Quantidade;
	private double precItem;
	
	public Invoice(int Numero, String descrevItem, int Quantidade, double precItem) {
		
		this.Numero = Numero;
		this.descrevItem = descrevItem;
		this.Quantidade = Quantidade;
		this.precItem = precItem;	
	}
		public void setNumero(int Numero) {
			
			this.Numero = Numero;	
		}
		
		public int getNumero() {
			
			return Numero;			
		}
		
		public void setdescrevItem(String descrevItem) {
			
			this.descrevItem = descrevItem;	
		}
		
		public String getdescrevItem() {
			
			return descrevItem;
		}
		
		public void  setQuantidade(int Quantidade) {
			
			if(Quantidade >= 0) {
				
			this.Quantidade = Quantidade;
			
			}else {
				
				this.Quantidade=0;
				
			}
		
		}
		
		public int getQuantidade() {
			
			return Quantidade;
			
		}
		
		public void setprecItem(double precItem) {
			
			if(precItem >= 0) {
				
				this.precItem = precItem;
				
			} else {
				
				this.precItem = 0;
					
			}
			
		}
		
		public double getprecItem() {
			
			return precItem;
			
		}
		
		public double getInvoiceAmount() {
			
			return Quantidade * precItem;
			
		}
		
		
	/*   public static void main(String[] args) {
		
           
		// Criar fatura
		Invoice invoice = new Invoice(444,"Impressora",1,50.0);
		
		
		//Valores da Fatura
		System.out.println("Numero: " +invoice.getNumero());
		System.out.println("Descricao: " +invoice.getdescrevItem());
		System.out.println("Quantidade de Item: " +invoice.getQuantidade());
		System.out.println("Preco Por Item: " +invoice.getprecItem());
		
		
		// Alterar valor da fatura
		invoice.setNumero(321);
		invoice.setQuantidade(5);
		invoice.setprecItem(60);
		
		//Valor atualizado da fatura
		
		System.out.println("Numero:" +invoice.getNumero());
		System.out.println("Descricao:" +invoice.getdescrevItem());
		System.out.println("Quantidade de Item:" +invoice.getQuantidade());
		System.out.println("Preco Por Item:" +invoice.getprecItem());
		
		// Imprime valor total da fatura
		
		System.out.println("Valor Total da Fatura:"+ invoice.getInvoiceAmount());
		
	}
	*/
       
}


