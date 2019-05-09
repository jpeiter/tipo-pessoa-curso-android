package utfpr.edu.tipopessoa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rgSexo;
    private RadioButton rbMasc;
    private RadioButton rbFem;

    private RadioGroup rgEstadoCivil;
    private RadioButton rbCasado;
    private RadioButton rbSolteiro;
    private RadioButton rbDivorciado;

    private CheckBox cbCaminhada;
    private CheckBox cbCiclismo;
    private CheckBox cbProgramar;

    private ToggleButton tbLigado;

    private TextView tvMensagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgSexo = findViewById(R.id.rgSexo);
        rbMasc = findViewById(R.id.rbMasc);
        rbFem = findViewById(R.id.rbFem);

        rgEstadoCivil = findViewById(R.id.rgEstadoCivil);
        rbCasado = findViewById(R.id.rbCasado);
        rbSolteiro = findViewById(R.id.rbSolteiro);
        rbDivorciado = findViewById(R.id.rbDivorciado);

        cbCaminhada = findViewById(R.id.cbCaminhada);
        cbCiclismo = findViewById(R.id.cbCiclismo);
        cbProgramar = findViewById(R.id.cbProgramar);

        tbLigado = findViewById(R.id.tbLigado);

        tvMensagem = findViewById(R.id.tvMensagem);
    }

    public void btConfirmarOnClick(View view) {
        String mensagem = "Sexo: ";

        if (rbMasc.isChecked()) {
            //mensagem = mensagem + rbMasc.getText();
            mensagem += rbMasc.getText();
        } else {
            mensagem += rbFem.getText();
        }

        /*
        Sexo: Masculino
        Estado Civil: Casado
        * */

        mensagem += "\nEstado Civil: ";

        if (rbCasado.isChecked()) {
            mensagem += rbCasado.getText();
        } else if (rbSolteiro.isChecked()) {
            mensagem += rbSolteiro.getText();
        } else {
            mensagem += rbDivorciado.getText();
        }

        mensagem += "\nAtividades Praticadas: ";

        if (cbCaminhada.isChecked()) {
            mensagem += cbCaminhada.getText() + "\n";
        }

        if (cbCiclismo.isChecked()) {
            mensagem += cbCiclismo.getText() + "\n";
        }

        if (cbProgramar.isChecked()) {
            mensagem += cbProgramar.getText() + "\n";
        }

        if (!cbCaminhada.isChecked() &&
                !cbCiclismo.isChecked() &&
                !cbProgramar.isChecked()) {
            mensagem += "Nenhuma.";
        }

        mensagem += "\nLigado: ";

        if(tbLigado.isChecked()){
            mensagem += tbLigado.getText();
            Toast.makeText(this,
                    "Gravando Registros",
                    Toast.LENGTH_SHORT).show();
        }else {
            mensagem += tbLigado.getText();
            Toast.makeText(this,
                    "Não Gravando Registros",
                    Toast.LENGTH_SHORT).show();
        }

        tvMensagem.setText(mensagem);
    }
}
