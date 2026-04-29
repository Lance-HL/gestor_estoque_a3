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
            
                
                if (MENUMV == 1) {
                    
                    String CONFIRMAENTRADA = "S";
                    
                    while (CONFIRMAENTRADA.equalsIgnoreCase("S")) {
                        
                        
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
                        
                        
                        String QTDEATUALSTR = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO    : " + NOMEPRODUTO + "<br><br>"
                            + "QTDE ATUAL:"
                            + "</div></html>"
                        );
                        int QTDEATUAL = Integer.parseInt(QTDEATUALSTR);
                        
                        
                        String QTDEENTRADASTR = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO    : " + NOMEPRODUTO + "<br>"
                            + "QTDE ATUAL : " + QTDEATUAL + "<br><br>"
                            + "QTDE ENTRADA:"
                            + "</div></html>"
                        );
                        int QTDEENTRADA = Integer.parseInt(QTDEENTRADASTR);
                        
                        
                        int QTDEFINAL = QTDEATUAL + QTDEENTRADA;
                        
                        
                        String CONFIRMA = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO      : " + NOMEPRODUTO + "<br>"
                            + "QTDE ATUAL   : " + QTDEATUAL + "<br>"
                            + "QTDE ENTRADA : " + QTDEENTRADA + "<br>"
                            + "QTDE FINAL   : " + QTDEFINAL + "<br><br>"
                            + "CONFIRMA ENTRADA (S/N)?:"
                            + "</div></html>"
                        );
                        
                       
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
                    }
                }
                
                if (MENUMV == 2) {
                    
                    String CONFIRMASAIDA = "S";
                    
                    while (CONFIRMASAIDA.equalsIgnoreCase("S")) {
                        
                        
                        String NOMEPRODUTOSAIDA = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO:"
                            + "</div></html>"
                        );
                        
                        
                        String QTDEATUALSAIDASTR = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO    : " + NOMEPRODUTOSAIDA + "<br><br>"
                            + "QTDE ATUAL:"
                            + "</div></html>"
                        );
                        int QTDEATUALSAIDA = Integer.parseInt(QTDEATUALSAIDASTR);
                        
                        
                        String QTDESAIDASTR = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO    : " + NOMEPRODUTOSAIDA + "<br>"
                            + "QTDE ATUAL : " + QTDEATUALSAIDA + "<br><br>"
                            + "QTDE SAÍDA:"
                            + "</div></html>"
                        );
                        int QTDESAIDA = Integer.parseInt(QTDESAIDASTR);
                        
                        
                        int QTDEFINALSAIDA = QTDEATUALSAIDA - QTDESAIDA;
                        
                        
                        String CONFIRMA = JOptionPane.showInputDialog(
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO    : " + NOMEPRODUTOSAIDA + "<br>"
                            + "QTDE ATUAL : " + QTDEATUALSAIDA + "<br>"
                            + "QTDE SAÍDA : " + QTDESAIDA + "<br>"
                            + "QTDE FINAL : " + QTDEFINALSAIDA + "<br><br>"
                            + "CONFIRMA SAÍDA (S/N)?:"
                            + "</div></html>"
                        );
                        
                        
                        if (CONFIRMA.equalsIgnoreCase("S")) {
                            CONFIRMASAIDA = JOptionPane.showInputDialog(
                                "<html><div style='text-align: center;'>"
                                + "SEX ON THE BAR LTDA<br>"
                                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                                + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                                + "</div><br><br>"
                                + "<div style='text-align: justify;'>"
                                + "SAÍDA CONFIRMADA COM SUCESSO!<br><br>"
                                + "NOVA SAÍDA (S/N)?:"
                                + "</div></html>"
                            );
                        } else {
                            CONFIRMASAIDA = JOptionPane.showInputDialog(
                                "<html><div style='text-align: center;'>"
                                + "SEX ON THE BAR LTDA<br>"
                                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                                + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                                + "</div><br><br>"
                                + "<div style='text-align: justify;'>"
                                + "SAÍDA CANCELADA.<br><br>"
                                + "NOVA SAÍDA (S/N)?:"
                                + "</div></html>"
                            );
                        }
                    }
                }
                
            }
        }
        }
    }
}
