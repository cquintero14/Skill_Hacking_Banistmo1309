package co.com.SkillHacking.questions;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class ValidarPdf implements Question<Boolean>{
    public static ValidarPdf pdfCorrecto() {
        return new ValidarPdf();
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean verificador = false;
        String titulo_esperado = "Prohibiciones";
        String titulo_obtenido = null;

        try {
            titulo_obtenido = URLDecoder.decode(Serenity.getWebdriverManager().getWebdriver().getCurrentUrl(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        if (titulo_obtenido.contains(titulo_esperado)) {
            verificador = true;
        }
        return verificador;
    }
    }

