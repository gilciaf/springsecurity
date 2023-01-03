package com.ciaf.springrolejwt.entities;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Persons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf_cnpj;
    private String rg_insc_estadual;//informa sobre tipo de situação perante o estado 1 -contribuinte // 2-isento // 9
    private String corporate;
    private String nickname;
    private String cep;
    private String address;
    private String number;
    private String compl;
    private String district;
    private String cMun;
    private String city;
    private String state;
    private String phonenumber;
    private String cellnumber;
    private String email;
    private String indfinal;
    private String ind_ie_dest;
    private String cod_pais;
    private String cod_uf;

    public Persons() {
    }

    public Persons(Long id, String name, String cpf_cnpj, String rg_insc_estadual, String corporate, String nickname, String cep, String address, String number, String compl, String district, String cMun, String city, String state, String phonenumber, String cellnumber, String email, String indfinal, String ind_ie_dest, String cod_pais, String cod_uf) {
        this.id = id;
        this.name = name;
        this.cpf_cnpj = cpf_cnpj;
        this.rg_insc_estadual = rg_insc_estadual;
        this.corporate = corporate;
        this.nickname = nickname;
        this.cep = cep;
        this.address = address;
        this.number = number;
        this.compl = compl;
        this.district = district;
        this.cMun = cMun;
        this.city = city;
        this.state = state;
        this.phonenumber = phonenumber;
        this.cellnumber = cellnumber;
        this.email = email;
        this.indfinal = indfinal;
        this.ind_ie_dest = ind_ie_dest;
        this.cod_pais = cod_pais;
        this.cod_uf = cod_uf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getRg_insc_estadual() {
        return rg_insc_estadual;
    }

    public void setRg_insc_estadual(String rg_insc_estadual) {
        this.rg_insc_estadual = rg_insc_estadual;
    }

    public String getCorporate() {
        return corporate;
    }

    public void setCorporate(String corporate) {
        this.corporate = corporate;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCompl() {
        return compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getcMun() {
        return cMun;
    }

    public void setcMun(String cMun) {
        this.cMun = cMun;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCellnumber() {
        return cellnumber;
    }

    public void setCellnumber(String cellnumber) {
        this.cellnumber = cellnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndfinal() {
        return indfinal;
    }

    public void setIndfinal(String indfinal) {
        this.indfinal = indfinal;
    }

    public String getInd_ie_dest() {
        return ind_ie_dest;
    }

    public void setInd_ie_dest(String ind_ie_dest) {
        this.ind_ie_dest = ind_ie_dest;
    }

    public String getCod_pais() {
        return cod_pais;
    }

    public void setCod_pais(String cod_pais) {
        this.cod_pais = cod_pais;
    }

    public String getCod_uf() {
        return cod_uf;
    }

    public void setCod_uf(String cod_uf) {
        this.cod_uf = cod_uf;
    }
}
