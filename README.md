# ERS_Sonido_video

HOLA!

trabajo realizado por:
  -Miranda M. Jhonn C.
  -Catucuago V. Juan P.
  -Moyano A. Darwin D.

Para ver mis repositorios puedes acceder a mi perfil y conocer más sobre mis proyectos

Perfil GitHub: Dzhon251 (github.com)

Construcción de appmovil -ERS/Sonido/Video

![image](https://github.com/Dzhon251/ERS_Sonido_video/assets/133244354/9412608d-eea7-4a7b-91ed-4222273e5316)

![image](https://github.com/Dzhon251/ERS_Sonido_video/assets/133244354/f31d1a0f-8e11-470f-9829-094370444b04)

CÓDIGO DEL PROYECTO

public class MainActivity extends AppCompatActivity {

       VideoView VideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView= (VideoView) findViewById(R.id.Video1);


        VideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.espe));


        MediaController mediaController=new MediaController(this);

        VideoView.setMediaController(mediaController);

        mediaController.setAnchorView(VideoView);

        VideoView.start();

        Button playButton = findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoView.start();
            }
        });
    }
}

