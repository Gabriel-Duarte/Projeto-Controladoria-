/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Classes.Funcionario;
import Classes.Login;
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
public class BD {

    public void create(Funcionario p) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tbl_funcionario (Funcionario,admissao,setor,cargo,salario,salMensal,Encargo,convMed,seis,valTransporte,cesta,beneficos,custoTOT)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setString(1, p.getFunc());
            stmt.setString(2, p.getAdmicao());
            stmt.setString(3, p.getSetor());
            stmt.setString(4, p.getCargo());
            stmt.setDouble(5, p.getSalario());
            stmt.setDouble(6, p.getSalariomensal());
            stmt.setDouble(7, p.getEncargos());
            stmt.setDouble(8, p.getConvmed());
            stmt.setDouble(9, p.getSeis());
            stmt.setDouble(10, p.getValetrans());
            stmt.setDouble(11, p.getCestaBasica());
            stmt.setDouble(12, p.getBeneficio());
            stmt.setDouble(13, p.getCustot());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }

    }

    public void createlogin(Login p) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tbl_login (login, senha, tipo)VALUES(?,?,?)");

            stmt.setString(1, p.getUser());
            stmt.setInt(2, p.getSenha());
            stmt.setString(3, p.getTipo());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }

    }

    public List<Funcionario> read() {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionario = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM  tbl_funcionario");
            rs = stmt.executeQuery();

            while (rs.next()) {

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

    public List<Funcionario> readForFuncionario(String desc) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionario = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM  tbl_funcionario WHERE Funcionario LIKE ?");
            stmt.setString(1, "%" + desc + "%");

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

    public List<Funcionario> readForcargo(String desc) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionario = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM  tbl_funcionario WHERE cargo LIKE ?");
            stmt.setString(1, "%" + desc + "%");

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

    public List<Funcionario> readForsetor(String desc) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionario = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM  tbl_funcionario WHERE setor LIKE ?");
            stmt.setString(1, "%" + desc + "%");

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

    public List<Login> readloginbusca(String desc) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Login> login = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM  tbl_login WHERE login LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Login log = new Login();
                log.setId(rs.getInt("id"));
                log.setUser(rs.getString("login"));
                log.setSenha(rs.getInt("senha"));
                log.setTipo(rs.getString("tipo"));

                login.add(log);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }

        return login;

    }

    public List<Login> readlogin() {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Login> login = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM  tbl_login");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Login log = new Login();
                log.setId(rs.getInt("id"));
                log.setUser(rs.getString("login"));
                log.setSenha(rs.getInt("senha"));
                log.setTipo(rs.getString("tipo"));

                login.add(log);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }

        return login;

    }

    public void update(Funcionario p) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE  tbl_funcionario SET funcionario = ? ,admissao = ?, setor = ?, cargo= ?, salario= ?,salmensal= ?, Encargo= ?, convmed= ?, seis= ?, valtransporte= ?, cesta= ?,beneficos= ?,custotot= ?  WHERE id = ?");
//           
            stmt.setString(1, p.getFunc());
            stmt.setString(2, p.getAdmicao());
            stmt.setString(3, p.getSetor());
            stmt.setString(4, p.getCargo());
            stmt.setDouble(5, p.getSalario());
            stmt.setDouble(6, p.getSalariomensal());
            stmt.setDouble(7, p.getEncargos());
            stmt.setDouble(8, p.getConvmed());
            stmt.setDouble(9, p.getSeis());
            stmt.setDouble(10, p.getValetrans());
            stmt.setDouble(11, p.getCestaBasica());
            stmt.setDouble(12, p.getBeneficio());
            stmt.setDouble(13, p.getCustot());
            stmt.setInt(14, p.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }

    }

    public void updatelogin(Login p) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE  tbl_login SET login= ? ,senha = ?, tipo= ? WHERE id = ?");
//           
            stmt.setString(1, p.getUser());
            stmt.setInt(2, p.getSenha());
            stmt.setString(3, p.getTipo());
            stmt.setInt(4, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }

    }

    public void delete(Funcionario p) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tbl_funcionario WHERE id = ?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }

    }

    public void delete(Login p) {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tbl_login WHERE id = ?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            Conexao.closeConnection(con, stmt);
        }

    }
}
