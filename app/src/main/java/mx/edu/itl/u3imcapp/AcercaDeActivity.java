/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*                           Aplicacion que calcula el IMC
:*
:*  Archivo     : AcercaDeActivity.java
:*  Autor       : Carlos Fernando Aguilera Garcia    No. 20130811
:*  Fecha       : 02/Oct/2023
:*  Compilador  : Android Studio Flamingo 2022.2.1
:*  Descripci�n : Esta activity nos muestra la informacion acerca del autor de la
                  app.

:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/
package mx.edu.itl.u3imcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AcercaDeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
    }
    public void btnAccionClick ( View v ){
        if ( v.getId() == R.id.btnAtras) {
            setContentView( R.layout.activity_main );

        }

    }
}