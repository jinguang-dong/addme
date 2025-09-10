package defpackage;

import android.content.Context;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import java.io.File;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class iix {
    private static final sgv b = sgv.g("iix");
    public final String a;
    private final File c;
    private final mfs d;

    public final String a() {
        File file = this.c;
        return file.getParent() + File.separator + file.getName();
    }

    public final String b() {
        return a() + File.separator + "capture.mp4";
    }

    public final void c() {
        this.d.a().toString();
    }

    public iix(Context context, mfs mfsVar, mft mftVar, Set set) {
        String strC = mftVar.c(System.currentTimeMillis());
        File file = new File(context.getCacheDir(), "datasets");
        File file2 = new File(file, strC);
        synchronized (set) {
            set.add(file2.toString());
        }
        if (!file.exists()) {
            file.mkdir();
        }
        if (!file2.mkdirs()) {
            ((sgt) b.b().M(2060)).s(JvFFEwFNdCrxf.WnPirCserA);
        }
        this.c = file2;
        this.a = file2.getName();
        this.d = mfsVar;
    }
}
