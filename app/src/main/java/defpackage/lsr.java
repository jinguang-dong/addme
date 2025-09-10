package defpackage;

import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lsr {
    private static final sgv a = sgv.g(KsvNaXS.qcpyBMVVAZmnHL);
    private final rwc b;
    private final rwc c;
    private final mfl d;

    public lsr(File file, File file2, mfl mflVar) {
        this.b = rwc.i(file);
        this.c = rwc.i(file2);
        this.d = mflVar;
    }

    private final void b(File file) {
        File[] fileArrListFiles = file.listFiles(new lsq());
        if (fileArrListFiles == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (File file2 : fileArrListFiles) {
            file2.getAbsolutePath();
            if (file2.lastModified() < (-86400000) + jCurrentTimeMillis) {
                try {
                    this.d.a(file2);
                } catch (IOException unused) {
                    ((sgt) a.c().M(4411)).v("Could not clean up %s", file2.getAbsolutePath());
                }
            }
        }
    }

    public final File a(String str) throws IOException {
        boolean z;
        rwc rwcVar = this.b;
        if (!rwcVar.h()) {
            throw new IOException("Could retrieve baseDirectory.");
        }
        File file = new File((File) rwcVar.c(), str);
        synchronized (mfl.a) {
            z = true;
            if (!file.isDirectory() && !file.mkdirs()) {
                z = false;
            }
        }
        if (!z) {
            throw new IOException("Could not create session directory: ".concat(file.toString()));
        }
        if (!file.isDirectory()) {
            throw new IOException("Session directory is not a directory: ".concat(file.toString()));
        }
        b(file);
        b(new File((File) this.c.c(), str));
        return file;
    }
}
