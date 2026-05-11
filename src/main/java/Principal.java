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

            if (MENUCD == 4) {

                boolean novaExclusao = true;

                while (novaExclusao) {

                    // Input 1 - Nome
                    String nome = JOptionPane.showInputDialog(null,
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "EXCLUSÃO DE PRODUTO"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "NOME :"
                        + "</div></html>",
                        "SEX ON THE BAR LTDA - Tela 1.1.4",
                        JOptionPane.PLAIN_MESSAGE);

                    if (nome == null) break;

                    // Input 2 - Preço
                    String preco = JOptionPane.showInputDialog(null,
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "EXCLUSÃO DE PRODUTO"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "NOME      : " + nome + "<br><br>"
                        + "PREÇO :"
                        + "</div></html>",
                        "SEX ON THE BAR LTDA - Tela 1.1.4",
                        JOptionPane.PLAIN_MESSAGE);

                    if (preco == null) break;

                    // Input 3 - Unidade
                    String unidade = JOptionPane.showInputDialog(null,
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "EXCLUSÃO DE PRODUTO"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "NOME      : " + nome + "<br>"
                        + "PREÇO     : " + preco + "<br><br>"
                        + "UNIDADE :"
                        + "</div></html>",
                        "SEX ON THE BAR LTDA - Tela 1.1.4",
                        JOptionPane.PLAIN_MESSAGE);

                    if (unidade == null) break;

                    // Input 4 - Quantidade
                    String quantidade = JOptionPane.showInputDialog(null,
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "EXCLUSÃO DE PRODUTO"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "NOME      : " + nome + "<br>"
                        + "PREÇO     : " + preco + "<br>"
                        + "UNIDADE   : " + unidade + "<br><br>"
                        + "QUANTIDADE :"
                        + "</div></html>",
                        "SEX ON THE BAR LTDA - Tela 1.1.4",
                        JOptionPane.PLAIN_MESSAGE);

                    if (quantidade == null) break;

                    // Input 5 - Confirmação da exclusão (S/N)
                    String confirmacao = "";
                    while (!confirmacao.equalsIgnoreCase("S") && !confirmacao.equalsIgnoreCase("N")) {
                        confirmacao = JOptionPane.showInputDialog(null,
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "EXCLUSÃO DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "NOME      : " + nome + "<br>"
                            + "PREÇO     : " + preco + "<br>"
                            + "UNIDADE   : " + unidade + "<br>"
                            + "QUANTIDADE: " + quantidade + "<br><br>"
                            + "CONFIRMA EXCLUSÃO ( S/N ) ?"
                            + "</div></html>",
                            "SEX ON THE BAR LTDA - Tela 1.1.4",
                            JOptionPane.PLAIN_MESSAGE);

                        if (confirmacao == null) { confirmacao = "N"; break; }

                        if (!confirmacao.equalsIgnoreCase("S") && !confirmacao.equalsIgnoreCase("N")) {
                            JOptionPane.showMessageDialog(null,
                                "Entrada inválida. Digite S para Sim ou N para Não.",
                                "Aviso", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                    if (confirmacao.equalsIgnoreCase("S")) {
                        JOptionPane.showMessageDialog(null,
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "EXCLUSÃO DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "PRODUTO EXCLUÍDO COM SUCESSO!"
                            + "</div></html>",
                            "SEX ON THE BAR LTDA - Tela 1.1.4",
                            JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "EXCLUSÃO DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "EXCLUSÃO CANCELADA."
                            + "</div></html>",
                            "SEX ON THE BAR LTDA - Tela 1.1.4",
                            JOptionPane.INFORMATION_MESSAGE);
                    }

                    // Input 6 - Nova exclusão (S/N)
                    String resposta = "";
                    while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                        resposta = JOptionPane.showInputDialog(null,
                            "<html><div style='text-align: center;'>"
                            + "SEX ON THE BAR LTDA<br>"
                            + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                            + "EXCLUSÃO DE PRODUTO"
                            + "</div><br><br>"
                            + "<div style='text-align: justify;'>"
                            + "NOVA EXCLUSÃO ( S/N ) ?"
                            + "</div></html>",
                            "SEX ON THE BAR LTDA - Tela 1.1.4",
                            JOptionPane.PLAIN_MESSAGE);

                        if (resposta == null) { resposta = "N"; break; }

                        if (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                            JOptionPane.showMessageDialog(null,
                                "Entrada inválida. Digite S para Sim ou N para Não.",
                                "Aviso", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                    if (resposta.equalsIgnoreCase("N")) {
                        novaExclusao = false; // Retorna para Tela 1.1
                    }
                }
            }

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

        if (MENUPP == 3) {

            String NOVOREAJUSTE = "S";

            while (NOVOREAJUSTE.equalsIgnoreCase("S")) {

                String TIPOREAJUSTE = JOptionPane.showInputDialog(
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "REAJUSTE DE PREÇOS"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "REAJUSTE GERAL OU DE UM PRODUTO?<br><br>"
                    + "1 - GERAL<br>"
                    + "2 - UM PRODUTO<br>"
                    + "</div></html>"
                );

                String NOMEPRODUTORJ = JOptionPane.showInputDialog(
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "REAJUSTE DE PREÇOS"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "REAJUSTE : " + (TIPOREAJUSTE.equals("1") ? "GERAL" : "UM PRODUTO") + "<br><br>"
                    + "PRODUTO:"
                    + "</div></html>"
                );

                String UNIDADEPRODUTO = JOptionPane.showInputDialog(
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "REAJUSTE DE PREÇOS"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "REAJUSTE : " + (TIPOREAJUSTE.equals("1") ? "GERAL" : "UM PRODUTO") + "<br>"
                    + "PRODUTO  : " + NOMEPRODUTORJ + "<br><br>"
                    + "UNIDADE:"
                    + "</div></html>"
                );

                String PRECOATUALSTR = JOptionPane.showInputDialog(
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "REAJUSTE DE PREÇOS"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "REAJUSTE : " + (TIPOREAJUSTE.equals("1") ? "GERAL" : "UM PRODUTO") + "<br>"
                    + "PRODUTO  : " + NOMEPRODUTORJ + "<br>"
                    + "UNIDADE  : " + UNIDADEPRODUTO + "<br><br>"
                    + "PREÇO ATUAL:"
                    + "</div></html>"
                );
                double PRECOATUAL = Double.parseDouble(PRECOATUALSTR.replace(",", "."));

                String PERCENTUALSTR = JOptionPane.showInputDialog(
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "REAJUSTE DE PREÇOS"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "REAJUSTE   : " + (TIPOREAJUSTE.equals("1") ? "GERAL" : "UM PRODUTO") + "<br>"
                    + "PRODUTO    : " + NOMEPRODUTORJ + "<br>"
                    + "UNIDADE    : " + UNIDADEPRODUTO + "<br>"
                    + "PREÇO ATUAL: " + PRECOATUALSTR + "<br><br>"
                    + "PERCENTUAL DE REAJUSTE:"
                    + "</div></html>"
                );
                double PERCENTUAL = Double.parseDouble(PERCENTUALSTR.replace(",", "."));

                double PRECOFINAL = PRECOATUAL + (PRECOATUAL * PERCENTUAL / 100);

                String CONFIRMAREAJUSTE = JOptionPane.showInputDialog(
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "REAJUSTE DE PREÇOS"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "REAJUSTE   : " + (TIPOREAJUSTE.equals("1") ? "GERAL" : "UM PRODUTO") + "<br>"
                    + "PRODUTO    : " + NOMEPRODUTORJ + "<br>"
                    + "UNIDADE    : " + UNIDADEPRODUTO + "<br>"
                    + "PREÇO ATUAL: " + String.format("%.2f", PRECOATUAL) + "<br>"
                    + "PERCENTUAL : " + String.format("%.2f", PERCENTUAL) + "%<br>"
                    + "PREÇO FINAL: " + String.format("%.2f", PRECOFINAL) + "<br><br>"
                    + "CONFIRMA REAJUSTE (S/N)?:"
                    + "</div></html>"
                );

                if (CONFIRMAREAJUSTE.equalsIgnoreCase("S")) {
                    NOVOREAJUSTE = JOptionPane.showInputDialog(
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "REAJUSTE DE PREÇOS"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "REAJUSTE CONFIRMADO COM SUCESSO!<br><br>"
                        + "NOVO REAJUSTE (S/N)?:"
                        + "</div></html>"
                    );
                } else {
                    NOVOREAJUSTE = JOptionPane.showInputDialog(
                        "<html><div style='text-align: center;'>"
                        + "SEX ON THE BAR LTDA<br>"
                        + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                        + "REAJUSTE DE PREÇOS"
                        + "</div><br><br>"
                        + "<div style='text-align: justify;'>"
                        + "REAJUSTE CANCELADO.<br><br>"
                        + "NOVO REAJUSTE (S/N)?:"
                        + "</div></html>"
                    );
                }
            }
        }

        }
    }
}
