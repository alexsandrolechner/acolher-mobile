package br.com.acolher.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.acolher.helper.Validacoes;

public class InstituicaoController {

    public String validarNome(String nome){

        //String regexNome = @"^[aA-zZ]+((\s[aA-zZ]+)+)?$";
        //Pattern pattern = Pattern.compile(regexNome);
        //Matcher matcher = pattern.matcher(nome);
        //boolean nomeValido = nome.matches("/[A-Z][a-z]* [A-Z][a-z]*/");

        if(nome == null || nome.isEmpty() || nome == "") {
            return "Campo obrigatorio!";
        }

        //if(nome.length() < 7){
          //  return "favor inserir o nome!";
        //}

        //if(nome.indexOf(" ") == -1){
          //  return "O nome deve conter seu nome e sobrenome";
        //}

        /*if(!matcher.find()){
            return "Insira apenas letras!";
        }*/

        return "";
    }

    public String validarTelefone(String telefone){

        if(telefone == null || telefone.isEmpty() || telefone == "") {
            return "Campo obrigatorio!";
        }

        if(telefone.length() < 10 || telefone.length() > 11){
            return "favor preencher o DDD + 8 Digitos!";
        }

        return "";
    }

    public String validarEmail(String email){

        String regexEmail = "^(.+)@(.+)$";

        if(email == null || email.isEmpty() || email == ""){
            return "Campo obrigatório!";
        }

        if(!Validacoes.validaEmail(email)){
            return "formato de email inválido!";
        }

        return "";

    }

    public String validaPassword(String password){

        String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%=+-_]).{4,})";
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);


        //String regexPassword = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{4,20})";

        if(password == null || password.isEmpty() || password == ""){
            return "Campo obrigatório!";
        }

        if(password.length() < 4){
            return "A senha deve ter no mínimo 4 caracteres!";
        }

        if(!matcher.matches()){
            return "Senha fraca!";
        }

        return "";

    }

    public String validaCnpj(String cnpj){

        if(cnpj == null || cnpj.isEmpty() || cnpj == ""){
            return "Campo obrigatorio!";
        }

        if(cnpj.length() != 14){
            return "CNPJ muito curto!";
        }

        if (!Validacoes.isCNPJ(cnpj)){
            return "CNPJ inválido!";
        }

        return "";

    }


}