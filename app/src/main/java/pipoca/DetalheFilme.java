package pipoca;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import br.com.dennissiqueira.pipoca.R;

public class DetalheFilme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_filme);
        TextView txtFilme = (TextView)findViewById(R.id.txtFilme);
        Intent intent = getIntent();
        Filme filme = (Filme)intent.getSerializableExtra(ListaFilmes.FILME);
        txtFilme.setText(filme.toString());
    }
}
