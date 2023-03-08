package PacoteTestes;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Market.Invoice;

public class InvoiceTest{

	
	@Test
	
	
	public void testGetInvoiceAmount() { // Fatura
		
		Invoice invoice = new Invoice (444,"Impressora",1,50.00);
		
		assertEquals(50.00,invoice.getInvoiceAmount(),0.001);
		invoice.setQuantidade(2);
		invoice.setprecItem(10.00);
		invoice.setprecItem(40.00);
		assertEquals(80.00,invoice.getInvoiceAmount(),0.001); 
	//assertEquals(85.00,invoice.getInvoiceAmount(),0.001); teste falha
	}
		@Test
		public void testSetQuantidade() { // Quantidade de item
			
		
			Invoice invoice = new Invoice (444,"Impressora",1,50.00);
			invoice.setQuantidade(2);
			assertEquals(2,invoice.getQuantidade());
			//assertEquals(4,invoice.getQuantidade()); teste falha
			invoice.setQuantidade(-2);
			assertEquals(0,invoice.getQuantidade());
			//assertEquals(2,invoice.getQuantidade());  teste falha
		}
					
		@Test
		public void testSetprecItem() { // Preço por item
			
			Invoice invoice = new Invoice(444,"Impresoura",1,50.00);
			invoice.setprecItem(40.00);
			// invoice.setprecItem(50.00); critério para falha
			assertEquals(40.00,invoice.getprecItem(),0.001);
			//assertEquals(40.00,invoice.getprecItem(),0.001); teste falha 
			invoice.setprecItem(-10.0);
			assertEquals(0.0,invoice.getprecItem(),0.001);
			//assertEquals(1.0,invoice.getprecItem(),0.001); teste falha
				
			
		}
			
	}
			

	
	
    
	


