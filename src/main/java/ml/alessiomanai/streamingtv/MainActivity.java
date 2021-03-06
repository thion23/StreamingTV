package ml.alessiomanai.streamingtv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ml.alessiomanai.streamingtv.canali.Canale5;
import ml.alessiomanai.streamingtv.canali.ChannelInterface;
import ml.alessiomanai.streamingtv.canali.FoodNetwork;
import ml.alessiomanai.streamingtv.canali.Giallo;
import ml.alessiomanai.streamingtv.canali.Italia1;
import ml.alessiomanai.streamingtv.canali.Rai2;
import ml.alessiomanai.streamingtv.canali.RsiLa1;
import ml.alessiomanai.streamingtv.canali.RsiLa2;
import ml.alessiomanai.streamingtv.canali.TgrSardegna;
import ml.alessiomanai.streamingtv.canali.TopCrime;
import ml.alessiomanai.streamingtv.canali.Tv8;
import ml.alessiomanai.streamingtv.canali.Videolina;

public class MainActivity extends AppCompatActivity {

    Button foodNetwork;
    Button radioItaliaTv;
    Button videolina;
    Button canale5;
    Button rsiLa1;
    Button rsiLa2;
    Button tv8;
    Button italia1;
    Button topcrime;
    Button giallo, superTv;
    Button rete4, mediasetExtra, mediaset20, italia2, la5, motorTrend, realTime, cielo, dMax, nove;
    Button iris, focus, boing, cartoonito, paramountChannel, tgcom24, skytg24, spyke, cine34, k2, frisbee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodNetwork = findViewById(R.id.foodnetworkButton);
        radioItaliaTv = findViewById(R.id.radioItaliaButton);
        videolina = findViewById(R.id.videolinaButton);
        canale5 = findViewById(R.id.canale5button);
        rsiLa1 = findViewById(R.id.rsila1button);
        rsiLa2 = findViewById(R.id.rsila2button);
        tv8 = findViewById(R.id.tv8button);
        italia1 = findViewById(R.id.italia1button);
        topcrime = findViewById(R.id.topcrimebutton);
        giallo = findViewById(R.id.giallobutton);
        rete4 = findViewById(R.id.rete4button);
        mediasetExtra = findViewById(R.id.mediasetExtrabutton);
        mediaset20 = findViewById(R.id.mediaset20button);
        italia2 = findViewById(R.id.italia2button);
        la5 = findViewById(R.id.la5button);
        motorTrend = findViewById(R.id.motorTrendbutton);
        realTime = findViewById(R.id.realTimebutton);
        cielo = findViewById(R.id.cieloButton);
        dMax = findViewById(R.id.dmaxButton);
        nove = findViewById(R.id.noveButton);
        iris = findViewById(R.id.irisbutton);
        focus = findViewById(R.id.focusbutton);
        boing = findViewById(R.id.boingbutton);
        cartoonito = findViewById(R.id.cartoonitobutton);
        paramountChannel = findViewById(R.id.paramountChannelbutton);
        tgcom24 = findViewById(R.id.tgcom24button);
        skytg24 = findViewById(R.id.skyTg24button);
        spyke = findViewById(R.id.spikebutton);
        cine34 = findViewById(R.id.cine34button);
        k2 = findViewById(R.id.k2button);
        frisbee = findViewById(R.id.frisbeebutton);
        superTv = findViewById(R.id.superButton);

        foodNetwork.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent food = new Intent(getBaseContext(), FoodNetwork.class);
                startActivity(food);

            }
        });

        videolina.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent videolinaWeb = new Intent(getBaseContext(), ChannelInterface.class);
                videolinaWeb.putExtra("URL", "http://livestreaming.videolina.it/live/Videolina/chunklist_w1548194757.m3u8");
                startActivity(videolinaWeb);

            }
        });

        canale5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                String url = "https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(c5)/index.m3u8";
                Intent canale5Web = new Intent(getBaseContext(), ChannelInterface.class);
                canale5Web.putExtra("URL", url);
                startActivity(canale5Web);

            }
        });

        rsiLa1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent rsiLa1web = new Intent(getBaseContext(), RsiLa1.class);
                startActivity(rsiLa1web);

            }
        });

        rsiLa2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent rsiLa2web = new Intent(getBaseContext(), RsiLa2.class);
                startActivity(rsiLa2web);

            }
        });

        tv8.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent tv8web = new Intent(getBaseContext(), Tv8.class);
                startActivity(tv8web);

            }
        });


        italia1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent italia1web = new Intent(getBaseContext(), Italia1.class);
                startActivity(italia1web);

            }
        });

        topcrime.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent topcrimeweb = new Intent(getBaseContext(), TopCrime.class);
                startActivity(topcrimeweb);

            }
        });

        giallo.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent gialloweb = new Intent(getBaseContext(), Giallo.class);
                startActivity(gialloweb);

            }
        });

        rete4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent rete4web = new Intent(getBaseContext(), ChannelInterface.class);
                rete4web.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(r4)/index.m3u8");
                startActivity(rete4web);

            }
        });

        mediasetExtra.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(kq)/index.m3u8");
                startActivity(intent);

            }
        });

        mediaset20.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(lb)/index.m3u8");
                startActivity(intent);

            }
        });

        italia2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(i2)/index.m3u8");
                startActivity(intent);

            }
        });

        la5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(ka)/index.m3u8");
                startActivity(intent);

            }
        });

        motorTrend.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://sbshdlu5-lh.akamaihd.net/i/sbshdl_1@810993/master.m3u8?hdnts=st=1559845194~exp=1559931594~acl=/*~hmac=877e074ac091df4a9d3406b63474da090678d4eef65c21489d443b94d4de7087&mux_audio=true");
                startActivity(intent);

            }
        });

        realTime.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://sbshdlu5-lh.akamaihd.net/i/sbshdl_4@810998/master.m3u8?hdnts=st=1564228002~exp=1564314402~acl=/*~hmac=6c0b77c0af71417fd823ef483a0d15c72e267308b83fdcb0e1b2228dba9dd703&mux_audio=true");
                startActivity(intent);

            }
        });

        cielo.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://skyanywhere3-i.akamaihd.net/hls/live/510693/cielo/playlist.m3u8?hdnea=st=1572279606~exp=1608028200~acl=/*~hmac=18c005bed78d7962401e55b92d29ee4f05023f9144388266daf5dfcf3b22b47a&Origin=www.cielotv.it");
                startActivity(intent);

            }
        });

        dMax.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://sbshdlu5-lh.akamaihd.net/i/sbshdl_5@825063/master.m3u8");
                startActivity(intent);

            }
        });

        nove.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://sbshdlu5-lh.akamaihd.net/i/sbshdl_3@810997/master.m3u8?hdnts=st=1585746893~exp=1585833293~acl=/i/*~hmac=7aa28aab591fe6ddf8d0480b4f202d3536f6f5b26dedf9d944c35b6320950ca4&mux_audio=true");
                startActivity(intent);

            }
        });

        paramountChannel.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","http://viacomitalytest-lh.akamaihd.net/i/sbshdlive_1@195657/index_2500_av-p.m3u8");
                startActivity(intent);

            }
        });

        boing.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(kb)/index.m3u8");
                startActivity(intent);

            }
        });

        cartoonito.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(la)/index.m3u8");
                startActivity(intent);

            }
        });

        spyke.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://viacomitalytest-lh.akamaihd.net/i/sbshdlive_1@829515/master.m3u8");
                startActivity(intent);

            }
        });

        skytg24.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://skyanywhere3-i.akamaihd.net/hls/live/510696/tg24/playlist.m3u8");
                startActivity(intent);

            }
        });

        tgcom24.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-radio-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(KF)/index.m3u8");
                startActivity(intent);

            }
        });

        iris.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(ki)/index.m3u8");
                startActivity(intent);

            }
        });

        focus.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(fu)/index.m3u8");
                startActivity(intent);

            }
        });

        cine34.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://live3-radio-mediaset-it.akamaized.net/Content/hls_h0_clr_vos/live/channel(b6)/index.m3u8");
                startActivity(intent);

            }
        });

        k2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://www.mytivu.it/Application/Channels/K2.php");
                startActivity(intent);

            }
        });

        frisbee.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {


                Intent intent = new Intent(getBaseContext(), ChannelInterface.class);
                intent.putExtra("URL","https://www.mytivu.it/Application/Channels/Frisbee.php");
                startActivity(intent);

            }
        });

        radioItaliaTv.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent radioitaliaWeb = new Intent(getBaseContext(), ChannelInterface.class);
                radioitaliaWeb.putExtra("URL", "http://radioitaliatv-lh.akamaihd.net/i/radioitaliatv_1@329645/index_384x256_av-p.m3u8?sd=10&rebase=on");
                startActivity(radioitaliaWeb);

            }
        });


        superTv.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View arg0) {

                Intent radioitaliaWeb = new Intent(getBaseContext(), ChannelInterface.class);
                radioitaliaWeb.putExtra("URL", "https://viacomitalytest-lh.akamaihd.net/i/sbshdlive_1@357018/index_800_av-p.m3u8");
                startActivity(radioitaliaWeb);

            }
        });
    }
}
