package cotemig.com.br.cotrello.ui.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import cotemig.com.br.cotrello.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        ButterKnife.bind(this);
    }
//    @OnClick(R.id.entrar)
//    public void buscar(){
//        ServiceTempo s = TempoApplication.getInstance().getServiceTime();
//        Call<Tempo> call = s.weather(cidadeinput.getText().toString(),"metric","bb2e507347157cca9e33072fbd34ae68");
//
//        call.enqueue(new Callback<Tempo>() {
//            @Override
//            public void onResponse(Call<Tempo> call, Response<Tempo> response) {
//                temperatura.setText(response.body().getMain().getTemp().toString());
//                cidade.setText(response.body().getName());
//                Glide.with(context).load("http://openweathermap.org/img/w/"+response.body().getWeather().get(0).getIcon() + ".png").into(icone);
//            }
//
//            @Override
//            public void onFailure(Call<Tempo> call, Throwable t) {
//                Toast.makeText(MainActivity.this, "Ops", Toast.LENGTH_LONG).show();
//            }
//
//        });
//    }
}
