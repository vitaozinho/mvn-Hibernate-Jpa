package view;

import java.util.List;

import javax.swing.JFrame;

import Controller.ClienteJpaDAO;
import Model.Cliente;

public class App
{
    public static void main( String[] args )
    {
    	 Cliente cliente = new Cliente();
    	 /*cliente.setId(2);
         cliente.setCpf("456.654.465-98");
         cliente.setNome("Vitor Hugo de Macedo");
         cliente.setRg("65.849.123-2");*/
         //ClienteJpaDAO.getInstance().merge(cliente);

         
    	 List<Cliente> clientes = ClienteJpaDAO.getInstance().findAll();
    	 System.out.println("Nome:");
    	 System.out.println(clientes.get(0).getNome());
      	 System.out.println("CPF:");
    	 System.out.println(clientes.get(0).getCpf());
      	 System.out.println("RG:");
    	 System.out.println(clientes.get(0).getRg());
         
         
         //System.out.println("Objetos salvo com sucesso!!!");
    }
}