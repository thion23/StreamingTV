package ml.alessiomanai.streamingtv.canali;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ml.alessiomanai.streamingtv.R;
import ml.alessiomanai.streamingtv.utils.M3u8Reader;
import ml.alessiomanai.streamingtv.utils.WebViewSettings;

public class Videolina extends AppCompatActivity {

    private String URL = "http://livestreaming.videolina.it/live/Videolina/chunklist_w1548194757.m3u8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videolina);

        WebView finestra = findViewById(R.id.videolina);

        WebViewSettings.doSettings(finestra);
        finestra.setWebViewClient(new WebViewClient());

        String html = M3u8Reader.getHtmlReader(URL);
        finestra.loadData(html, "text/html", null);
    }
}
