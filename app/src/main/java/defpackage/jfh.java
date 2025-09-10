package defpackage;

import android.os.Environment;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jfh {
    public static final sgv a = sgv.g("jfh");
    public File b;
    public final mft c;
    public final File d;
    public final File e;
    public final jid f;
    public final lsr g;
    public final qqq h;
    public final obu i;

    public final File a() {
        this.b.getAbsolutePath();
        File file = new File(this.b, "thumbnails");
        if (file.mkdirs() || file.exists()) {
            return file;
        }
        ((sgt) a.b().M(2724)).s("Thumbnails directory not created.");
        return null;
    }

    public jfh(lrp lrpVar, mft mftVar, obu obuVar, lsr lsrVar, jid jidVar, qqq qqqVar) {
        this.d = lrpVar.b("");
        this.e = lrpVar.b("panorama_sessions");
        File file = new File(Environment.getExternalStorageDirectory(), CZAHo.DuTTjdZn);
        if (!file.mkdirs() && !file.exists()) {
            ((sgt) a.b().M(2721)).s("Panorama directory not created.");
            file = null;
        }
        this.b = file;
        this.c = mftVar;
        this.i = obuVar;
        this.g = lsrVar;
        this.f = jidVar;
        this.h = qqqVar;
    }
}
