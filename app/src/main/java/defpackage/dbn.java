package defpackage;

import android.content.res.AssetManager;
import androidx.wear.ambient.AmbientMode;
import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbn {
    public final AssetManager a;
    public final File c;
    public final String d;
    public dbo[] h;
    public byte[] i;
    public final AmbientMode.AmbientController j;
    private final Executor k;
    public boolean g = false;
    public final String e = "dexopt/baseline.prof";
    public final String f = "dexopt/baseline.profm";
    public final byte[] b = dbu.a;

    public dbn(AssetManager assetManager, Executor executor, AmbientMode.AmbientController ambientController, String str, File file) {
        this.a = assetManager;
        this.k = executor;
        this.j = ambientController;
        this.d = str;
        this.c = file;
    }

    public final void b(int i, Object obj) {
        this.k.execute(new ng(this, i, obj, 3, (byte[]) null));
    }

    public final void a() {
        if (!this.g) {
            throw new IllegalStateException(pAAtrB.XswxdcYFdoX);
        }
    }
}
