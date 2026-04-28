import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        
        int MENUPP = -1;
        
        while (MENUPP != 0) {
        
        String MENUPRINCIPAL = JOptionPane.showInputDialog(
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "MENU PRINCIPAL"
                + "<div><br>"
                        
                + "<div style='text-align: justify;'>"
                + "1 - CADASTRO DE PRODUTO<br>"
                + "2 - MOVIMENTAÇÃO<br>"
                + "3 - REAJUSTE DE PREÇOS<br>"
                + "4 - RELATÓRIOS<br>"
                + "0 - FINALIZAR<br><br>"
                + "</div></html>"
             );
        
        MENUPP = Integer.parseInt(MENUPRINCIPAL);
        
        if (MENUPP == 1) {
            
            int MENUCD = -1;
            
            while (MENUCD != 0) {
            String MENUCADASTRO = JOptionPane.showInputDialog(
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "CADASTRO DE PRODUTOS"
                + "</div><br>"
                        
                + "<div style='text-align: justify;'>"
                + "1 - INCLUSÃO<br>"
                + "2 - ALTERAÇÃO<br>"
                + "3 - CONSULTA<br>"
                + "4 - EXCLUSÃO<br>"
                + "0 - RETORNAR<br><br>"
                + "</div></html>"  
            );
            MENUCD = Integer.parseInt(MENUCADASTRO);
            }
        }
        if (MENUPP == 2) {
            
            int MENUMV = -1;
            
            while (MENUMV != 0) {
                String MENUMOVIMENTAÇÃO = JOptionPane.showInputDialog(
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "MOVIMENTAÇÃO"
                + "</div><br>"
                        
                + "<div style='text-align: justify;'>"
                + "1 - ENTRADA<br>"
                + "2 - SAIDA<br>"
                + "0 - RETORNAR<br><br>"
                + "</div></html>"  
            );
            MENUMV = Integer.parseInt(MENUMOVIMENTAÇÃO);
            
            // ============================================================
            // TELA 1.2.1 - ENTRADA DE PRODUTO (CÓDIGO NOVO ADICIONADO AQUI)
            // ============================================================
            if (MENUMV == 1) {
                
                String CONFIRMAENTRADA = "S"; // inicia como S para entrar no loop pela primeira vez
                
                while (CONFIRMAENTRADA.equalsIgnoreCase("S")) {
                    
                    // INPUT 1 - Nome do produto
                    String NOMEPRODUTO = JOptionPane.showInputDialog(
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "PRODUTO:"
                        + "</div></html>"
                    );
                    
                    // INPUT 2 - Quantidade atual
                    String QTDEATUALSTR = JOptionPane.showInputDialog(
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "PRODUTO : " + NOMEPRODUTO + "<br><br>"
                        + "QTDE ATUAL:"
                        + "</div></html>"
                    );
                    int QTDEATUAL = Integer.parseInt(QTDEATUALSTR);
                    
                    // INPUT 3 - Quantidade de entrada
                    String QTDEENTRADASTR = JOptionPane.showInputDialog(
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "PRODUTO   : " + NOMEPRODUTO + "<br>"
                        + "QTDE ATUAL: " + QTDEATUAL + "<br><br>"
                        + "QTDE ENTRADA:"
                        + "</div></html>"
                    );
                    int QTDEENTRADA = Integer.parseInt(QTDEENTRADASTR);
                    
                    // CALCULA A QUANTIDADE FINAL AUTOMATICAMENTE
                    int QTDEFINAL = QTDEATUAL + QTDEENTRADA;
                    
                    // INPUT 4 - Confirmação da entrada (S/N)
                    String CONFIRMA = JOptionPane.showInputDialog(
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "PRODUTO     : " + NOMEPRODUTO + "<br>"
                        + "QTDE ATUAL  : " + QTDEATUAL + "<br>"
                        + "QTDE ENTRADA: " + QTDEENTRADA + "<br>"
                        + "QTDE FINAL  : " + QTDEFINAL + "<br><br>"
                        + "CONFIRMA ENTRADA (S/N)?:"
                        + "</div></html>"
                    );
                    
                    // INPUT 5 - Nova entrada (S/N)
                    if (CONFIRMA.equalsIgnoreCase("S")) {
                        CONFIRMAENTRADA = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "ENTRADA CONFIRMADA COM SUCESSO!<br><br>"
                            + "NOVA ENTRADA (S/N)?:"
                            + "</div></html>"
                        );
                    } else {
                        // Se não confirmou, pergunta nova entrada sem salvar
                        CONFIRMAENTRADA = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "ENTRADA CANCELADA.<br><br>"
                            + "NOVA ENTRADA (S/N)?:"
                            + "</div></html>"
                        );
                    }
                    
                    // Se responder N em nova entrada, sai do loop e volta para tela 1.2.1 (menu movimentação)
                    // O while já cuida disso: se CONFIRMAENTRADA != "S", o loop encerra naturalmente
                }
            }
            // ============================================================
            // FIM DO CÓDIGO NOVO
            // ============================================================
            
            }
        
        }
        }
    }
}
