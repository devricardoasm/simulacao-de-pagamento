/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Pedido;
import util.ConectaBanco;

/**
 *
 * @author 11131103404
 */
public class PedidoDAO {

    private static final String UPDATE = "update pedido set status =(?) where id_pedido = (?)";
    
    
    
              public void pagar(Pedido pedido) {

        try {
            Connection conexao = ConectaBanco.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(UPDATE);

            pstmt.setString(1, "pago");
            pstmt.setInt(2, pedido.getPedido());
            pstmt.execute();
            
        } catch (SQLException e) {
            System.out.println("erro de sql:" + e.getMessage());
        }
    }
    

}
