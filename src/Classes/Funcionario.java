/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Gabriel-Note
 */
public class Funcionario {

    private String func;
    private String admicao;
    private String setor;
    private String cargo;

    private double salario;
    private double salariomensal;
    private double encargos;
    private double convmed;
    private double seis;
    private double valetrans;
    private double cestaBasica;
    private double beneficio;
    private double Custot;

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public String getAdmicao() {
        return admicao;
    }

    public void setAdmicao(String admicao) {
        this.admicao = admicao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalariomensal() {
        return salariomensal;
    }

    public void setSalariomensal(double salariomensal) {
        this.salariomensal = salariomensal;
    }

    public double getEncargos() {
        return encargos;
    }

    public void setEncargos(double encargos) {
        this.encargos = encargos;
    }

    public double getConvmed() {
        return convmed;
    }

    public void setConvmed(double convmed) {
        this.convmed = convmed;
    }

    public double getSeis() {
        return seis;
    }

    public void setSeis(double seis) {
        this.seis = seis;
    }

    public double getValetrans() {
        return valetrans;
    }

    public void setValetrans(double valetrans) {
        this.valetrans = valetrans;
    }

    public double getCestaBasica() {
        return cestaBasica;
    }

    public void setCestaBasica(double cestaBasica) {
        this.cestaBasica = cestaBasica;
    }

    public double getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(double beneficio) {
        this.beneficio = beneficio;
    }

    public double getCustot() {
        return Custot;
    }

    public void setCustot(double Custot) {
        this.Custot = Custot;
    }
    public double simplifica(double tot){
        tot *= 100;
        tot = Math.round(tot);
        tot /= 100;
        return tot;
    }
 public static double totS, totSM,totE, totCon, tot6, totVal,totCes,totBen, totCus ;
    public void total(double sal,double salM, double enc, double con, double sei, double valt, double cest, double bene, double cust ){
  
    totS=totS+sal;
    totS = simplifica(totS);
    
    totSM=totSM+salM;
     totSM = simplifica(totSM);
    
    totE=totE+enc;
     totE = simplifica(totE);
    
    totCon=totCon+con;
    totCon = simplifica(totCon);
    
    tot6=tot6+sei;
   tot6 = simplifica(tot6);
    
    totVal=totVal+valt;
    totVal = simplifica(totVal);
   
    totCes=totCes+cest;
     totCes= simplifica(totCes);
    
    totBen=totBen+bene;
    totBen = simplifica(totBen);
    
    totCus=totCus+cust;
    totCus = simplifica(totCus);
    
            }
}
