/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*                          Aplicacion que calcula el IMC
:*
:*  Archivo     : MainActivity.java
:*  Autor       : Carlos Fernando Aguilera Garcia    No. 20130811
:*  Fecha       : 02/Oct/2023
:*  Compilador  : Android Studio Flamingo 2022.2.1
:*  Descripci�n : Es una app que nos dice el estado de salud en el que estamos
                  calculando el IMC

:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/
package mx.edu.itl.u3imcapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//--------------------------------------------------------------------------------------------------

    public void btnAccionClick ( View v ) {
        if( v.getId() == R.id.btnCalcular ){
            EditText  peso = findViewById( R.id.edtxtPeso     );
            EditText estat = findViewById( R.id.edtxtEstatura );

            float     masa = 0.0f;
            float estatura = 0.0f;
            if ( !peso.getText().toString().equals( "" )  || !estat.getText().toString().equals( "" ) ) {
                masa = Float.parseFloat(peso.getText() + "");
                estatura = Float.parseFloat(estat.getText() + "");

                AlertDialog.Builder builder = new AlertDialog.Builder( this );
                builder.setMessage( "La condicion de salud es : " + calcularIMC( masa, estatura ) ).setTitle( "IMC" )
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick( DialogInterface dialogInterface, int i ) {

                            }
                        })
                        .create()
                        .show();
            }else{
                Toast.makeText( this, "Introduzca los valores", Toast.LENGTH_SHORT).show();
            }


        }else if ( v.getId() == R.id.btnSalir ) {
            finish();
        } else if ( v.getId() == R.id.btnAcercaDe ) {
            // Mostrar mensaje de quien lo creo
            setContentView( R.layout.activity_acerca_de );

        }else  if ( v.getId() == R.id.btnAtras) {
            setContentView( R.layout.activity_main );

        }
    }
//-------------------------------------------------------------------------------------------------
    public String calcularIMC ( float masa, float estatura ){
        float IMC = 0.0f;
        estatura *= estatura;
        String salud = "";
        if( masa != 0 || estatura != 0 )
             IMC = masa / estatura;

        if  (IMC < 15.0 ) {
            salud = "Delgadez muy severa, con un IMC de " + IMC;
        }else if ( IMC <= 15.0 && IMC <= 15.9 ){
            salud = "Delgadez severa, con un IMC de " + IMC;
        }else if ( IMC >= 16 && IMC <= 18.4 ){
            salud = "Delgadez, con un IMC de " + IMC;
        }else if ( IMC >= 18.5 && IMC <= 24.9 ){
            salud = "Peso Saludable, con un IMC de " + IMC;
        }else if ( IMC >= 25 && IMC <= 29.9 ){
            salud = "Sobrepeso, con un IMC de " + IMC;
        }else if ( IMC >= 30 && IMC <= 34.9 ){
            salud = "Obesidad Moderada, con un IMC de " + IMC;
        }else if ( IMC >= 35 && IMC <= 39.9 ){
            salud = "Obesidad servera, con un IMC de " + IMC;
        }else if ( IMC > 40.0 ){
            salud = "Obesidad Morvida, con un IMC de " + IMC;
        }

        return salud;
    }
}