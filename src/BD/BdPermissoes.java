/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Classes.Funcionario;
import Classes.Login;
import Classes.Permissao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel-Note
 */
public class BdPermissoes {

    public Permissao perread(int id) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Permissao> permissao = new ArrayList<>();
        Permissao per = new Permissao();
        try {
            stmt = con.prepareStatement("SELECT * FROM  tbl_Permissoes where id= ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            while (rs.next()) {

                per.setPintura(rs.getString("pintura"));
                per.setEstoquePA(rs.getString("estoquePA"));
                per.setRecebimento(rs.getString("Recebimento"));
                per.setAdmIndustrial(rs.getString("admIndustrial"));
                per.setEstoquedeMateria(rs.getString("estroqueDEmateria"));
                per.setManutencao(rs.getString("manutencao"));
                per.setSegurança(rs.getString("Seguranca"));
                per.setFerramentaria(rs.getString("ferramentaria"));
                per.setInjecao(rs.getString("injecao"));
                per.setCon(rs.getString("controladoria"));
                per.setVendas(rs.getString("Vendas"));
                per.setRecpecao(rs.getString("Recepcao"));
                per.setFinaceiro(rs.getString("Financeiro"));
                per.setCompras(rs.getString("compras"));
                per.setRh(rs.getString("Rh"));
                per.setLogistica(rs.getString("logistica"));
                per.setAdiretoria(rs.getString("adiretoria"));
                per.setAcabamento(rs.getString("Acabamento"));
                per.setMoinho(rs.getString("moinho"));
                per.setPortaria(rs.getString("portaria"));
                per.setSGQ(rs.getString("sgq"));
                  per.setAdministratvo(rs.getString("administrativo"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }

        return per;
    }

    public List<Funcionario> read(String desc) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionario = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM  tbl_funcionario WHERE setor=?");
            stmt.setString(1, desc);

            rs = stmt.executeQuery();

            while (rs.next()) {

                Funcionario produto = new Funcionario();
                Funcionario func = new Funcionario();

                func.setId(rs.getInt("id"));
                func.setFunc(rs.getString("Funcionario"));
                func.setAdmicao(rs.getString("admissao"));
                func.setSetor(rs.getString("Setor"));

                func.setCargo(rs.getString("cargo"));
                func.setSalario(rs.getDouble("salario"));
                func.setSalariomensal(rs.getDouble("salMensal"));
                func.setEncargos(rs.getDouble("Encargo"));
                func.setConvmed(rs.getDouble("Convmed"));
                func.setSeis(rs.getDouble("seis"));
                func.setValetrans(rs.getDouble("valtransporte"));
                func.setCestaBasica(rs.getDouble("cesta"));
                func.setBeneficio(rs.getDouble("beneficos"));
                func.setCustot(rs.getDouble("custoTOT"));

                funcionario.add(func);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }

        return funcionario;

    }

    public List<Funcionario> readForFuncionario(String desc, String Setor) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionario = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM  tbl_funcionario WHERE setor=? and Funcionario LIKE ?");
            stmt.setString(1, Setor);
            stmt.setString(2, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Funcionario produto = new Funcionario();
                Funcionario func = new Funcionario();

                func.setId(rs.getInt("id"));
                func.setFunc(rs.getString("Funcionario"));
                func.setAdmicao(rs.getString("admissao"));
                func.setSetor(rs.getString("Setor"));

                func.setCargo(rs.getString("cargo"));
                func.setSalario(rs.getDouble("salario"));
                func.setSalariomensal(rs.getDouble("salMensal"));
                func.setEncargos(rs.getDouble("Encargo"));
                func.setConvmed(rs.getDouble("Convmed"));
                func.setSeis(rs.getDouble("seis"));
                func.setValetrans(rs.getDouble("valtransporte"));
                func.setCestaBasica(rs.getDouble("cesta"));
                func.setBeneficio(rs.getDouble("beneficos"));
                func.setCustot(rs.getDouble("custoTOT"));

                funcionario.add(func);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }

        return funcionario;

    }

    public List<Funcionario> readForcargo(String desc, String Setor) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionario = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM  tbl_funcionario WHERE setor=? and cargo LIKE ?");
            stmt.setString(1, Setor);
            stmt.setString(2, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Funcionario produto = new Funcionario();
                Funcionario func = new Funcionario();

                func.setId(rs.getInt("id"));
                func.setFunc(rs.getString("Funcionario"));
                func.setAdmicao(rs.getString("admissao"));
                func.setSetor(rs.getString("Setor"));

                func.setCargo(rs.getString("cargo"));
                func.setSalario(rs.getDouble("salario"));
                func.setSalariomensal(rs.getDouble("salMensal"));
                func.setEncargos(rs.getDouble("Encargo"));
                func.setConvmed(rs.getDouble("Convmed"));
                func.setSeis(rs.getDouble("seis"));
                func.setValetrans(rs.getDouble("valtransporte"));
                func.setCestaBasica(rs.getDouble("cesta"));
                func.setBeneficio(rs.getDouble("beneficos"));
                func.setCustot(rs.getDouble("custoTOT"));

                funcionario.add(func);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }

        return funcionario;

    }

    public int id(String s) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        int id = 0;

        try {
            stmt = con.prepareStatement("SELECT id FROM  tbl_login where login=?");
            stmt.setString(1, s);

            rs = stmt.executeQuery();

            while (rs.next()) {

                id = rs.getInt("id");

            }
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }

        return id;

    }

    public void createPermissoes(int id, String x) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tbl_Permissoes (id,usuario,pintura, estoquePA, Recebimento, admIndustrial, estroqueDEmateria,manutencao,Seguranca, ferramentaria, injecao, Vendas,Recepcao, Financeiro, compras, controladoria, Rh, logistica, adiretoria, Acabamento, moinho, portaria, sgq, administrativo  )VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setInt(1, id);
            stmt.setString(2, x);
            stmt.setString(3, "Negado");
            stmt.setString(4, "Negado");
            stmt.setString(5, "Negado");
            stmt.setString(6, "Negado");
            stmt.setString(7, "Negado");
            stmt.setString(8, "Negado");
            stmt.setString(9, "Negado");
            stmt.setString(10, "Negado");
            stmt.setString(11, "Negado");
            stmt.setString(12, "Negado");
            stmt.setString(13, "Negado");
            stmt.setString(14, "Negado");
            stmt.setString(15, "Negado");
            stmt.setString(16, "Negado");
            stmt.setString(17, "Negado");
            stmt.setString(18, "Negado");
            stmt.setString(19, "Negado");
            stmt.setString(20, "Negado");
              stmt.setString(21, "Negado");
                stmt.setString(22, "Negado");
                  stmt.setString(23, "Negado");
                    stmt.setString(24, "Negado");

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }

    }

    public List<Permissao> readpermissoes() {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Permissao> per = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from tbl_permissoes");

            rs = stmt.executeQuery();
            Login log = new Login();

            while (rs.next()) {

                Permissao perm = new Permissao();

                perm.setId(rs.getInt("id"));
                perm.setUser(rs.getString("usuario"));
                perm.setPintura(rs.getString("pintura"));
                perm.setEstoquePA(rs.getString("estoquePA"));
                perm.setRecebimento(rs.getString("Recebimento"));
                perm.setAdmIndustrial(rs.getString("admIndustrial"));
                perm.setEstoquedeMateria(rs.getString("estroqueDEmateria"));
                perm.setManutencao(rs.getString("manutencao"));
                perm.setSegurança(rs.getString("Seguranca"));
                perm.setFerramentaria(rs.getString("ferramentaria"));
                perm.setInjecao(rs.getString("injecao"));
                perm.setVendas(rs.getString("Vendas"));
                perm.setRecpecao(rs.getString("Recepcao"));
                perm.setFinaceiro(rs.getString("Financeiro"));
                perm.setCompras(rs.getString("compras"));
                perm.setCon(rs.getString("controladoria"));
                perm.setRh(rs.getString("Rh"));

                perm.setLogistica(rs.getString("logistica"));
                perm.setAdiretoria(rs.getString("adiretoria"));
                perm.setAcabamento(rs.getString("Acabamento"));
                perm.setMoinho(rs.getString("moinho"));
                perm.setPortaria(rs.getString("portaria"));
                perm.setSGQ(rs.getString("sgq"));
                 perm.setAdministratvo(rs.getString("administrativo"));
                per.add(perm);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }

        return per;

    }

    public List<Permissao> readpermissoespes(String desc) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Permissao> per = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from tbl_permissoes  WHERE usuario LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            Login log = new Login();

            while (rs.next()) {

                Permissao perm = new Permissao();

                 perm.setId(rs.getInt("id"));
                perm.setUser(rs.getString("usuario"));
                perm.setPintura(rs.getString("pintura"));
                perm.setEstoquePA(rs.getString("estoquePA"));
                perm.setRecebimento(rs.getString("Recebimento"));
                perm.setAdmIndustrial(rs.getString("admIndustrial"));
                perm.setEstoquedeMateria(rs.getString("estroqueDEmateria"));
                perm.setManutencao(rs.getString("manutencao"));
                perm.setSegurança(rs.getString("Seguranca"));
                perm.setFerramentaria(rs.getString("ferramentaria"));
                perm.setInjecao(rs.getString("injecao"));
                perm.setVendas(rs.getString("Vendas"));
                perm.setRecpecao(rs.getString("Recepcao"));
                perm.setFinaceiro(rs.getString("Financeiro"));
                perm.setCompras(rs.getString("compras"));
                perm.setCon(rs.getString("controladoria"));
                perm.setRh(rs.getString("Rh"));

                perm.setLogistica(rs.getString("logistica"));
                perm.setAdiretoria(rs.getString("adiretoria"));
                perm.setAcabamento(rs.getString("Acabamento"));
                perm.setMoinho(rs.getString("moinho"));
                perm.setPortaria(rs.getString("portaria"));
                perm.setSGQ(rs.getString("sgq"));
                 perm.setAdministratvo(rs.getString("administrativo"));
                per.add(perm);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }

        return per;

    }

    public void updatePermi(Permissao p) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE  tbl_Permissoes SET pintura = ? ,estoquePA = ?, Recebimento = ?, admIndustrial = ?, estroqueDEmateria = ?, manutencao = ?, Seguranca = ?, ferramentaria = ?, injecao = ?, Vendas = ?, Recepcao= ?, Financeiro = ?, compras=?,controladoria=?, Rh=?, logistica=?, adiretoria=?, Acabamento=?, moinho=?, portaria=?, sgq=?, administrativo=?  WHERE id = ?");

            stmt.setString(1, p.getPintura());
            stmt.setString(2, p.getEstoquePA());
            stmt.setString(3, p.getRecebimento());
            stmt.setString(4, p.getAdmIndustrial());
            stmt.setString(5, p.getEstoquedeMateria());
            stmt.setString(6, p.getManutencao());
            stmt.setString(7, p.getSegurança());
            stmt.setString(8, p.getFerramentaria());
            stmt.setString(9, p.getInjecao());
            stmt.setString(10, p.getVendas());
            stmt.setString(11, p.getRecpecao());
            stmt.setString(12, p.getFinaceiro());
            stmt.setString(13, p.getCompras());
            stmt.setString(14, p.getCon());
            stmt.setString(15, p.getRh());

            stmt.setString(16, p.getLogistica());
            stmt.setString(17, p.getAdiretoria());
            stmt.setString(18, p.getAcabamento());
               stmt.setString(19, p.getMoinho());
                  stmt.setString(20, p.getPortaria());
                     stmt.setString(21, p.getSGQ());
                        stmt.setString(22, p.getAdministratvo());
            
            stmt.setInt(23, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }

    }

    public void delete(Login p) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tbl_Permissoes WHERE id = ?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }
}
