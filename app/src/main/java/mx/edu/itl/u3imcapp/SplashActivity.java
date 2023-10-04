/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*                       Apliacion que calcula el IMC
:*
:*  Archivo     : SplashActivity.java
:*  Autor       : Carlos Fernando Aguilera Garcia    No. 20130811
:*  Fecha       : 02/Oct/2023
:*  Compilador  : Android Studio Flamingo 2022.2.1
:*  Descripci�n : Pantalla de carga de la aplicacion

:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/
package mx.edu.itl.u3imcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        //Hacer la transicion al mainActivity de 2 seg
        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                //Crear el Intent para llamar el mainActivity
                Intent intent = new Intent ( SplashActivity.this, MainActivity.class );
                startActivity( intent );
                finish();
            }
        } , 2000 );
    }
}