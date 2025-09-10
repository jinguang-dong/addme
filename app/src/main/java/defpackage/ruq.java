package defpackage;

import androidx.wear.ambient.AmbientMode;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruq {
    public final InputStream c;
    public final AmbientMode.AmbientController e;
    private final ExecutorService f;
    public final Object a = new Object();
    public final String b = "SPEECH_ENHANCER_RAW_AUDIO_STREAM_PARSER";
    public int d = 1;

    public ruq(InputStream inputStream, AmbientMode.AmbientController ambientController, ExecutorService executorService) {
        this.c = inputStream;
        this.e = ambientController;
        this.f = executorService;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [sgt, shi] */
    public final void a(IOException iOException) {
        synchronized (this.a) {
            this.d = 5;
        }
        if (iOException != null) {
            rur rurVar = new rur(iOException);
            ((sgt) ((sgt) rul.a.b().i(rurVar)).M(5808)).E("Got an error from audio stream parser '%s'. Error: %s", "SPEECH_ENHANCER_RAW_AUDIO_STREAM_PARSER", rurVar);
            return;
        }
        try {
            Object obj = this.e.a;
            PipedOutputStream pipedOutputStream = ((rul) obj).c;
            if (pipedOutputStream != null) {
                pipedOutputStream.close();
            } else {
                ((rul) obj).g.d.ifPresent(new lig(18));
            }
        } catch (IOException e) {
            ((sgt) ((sgt) rul.a.b().i(e)).M((char) 5807)).s("Got an exception when trying to close the piped output stream.");
        }
    }

    public final void b() {
        synchronized (this.a) {
            int i = this.d;
            boolean z = i == 1;
            String str = this.b;
            String strA = rup.a(i);
            if (i == 0) {
                throw null;
            }
            rnt.P(z, "Can't run: state of audio stream parser '%s' is '%s'.", str, strA);
            this.d = 2;
        }
        this.f.execute(new smv(this, 1));
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.d == 2;
        }
        return z;
    }
}
