package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.PostviewParams;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxy {
    public static final tcq a;
    public static final tcq b;
    public static final tcq c;
    public static final tcq d;
    public static final long e;
    private final hbj f;

    static {
        tcq tcqVar = tcq.f;
        a = tcqVar;
        b = tcq.d;
        c = tcqVar;
        d = tcq.b;
        e = GcamModuleJNI.DEBUG_SAVE_INPUT_METERING_get() | GcamModuleJNI.DEBUG_SAVE_INPUT_PAYLOAD_get() | GcamModuleJNI.DEBUG_SAVE_METADATA_get();
    }

    public hxy(hbj hbjVar) {
        this.f = hbjVar;
    }

    public static PostviewParams a(pjo pjoVar, kqp kqpVar) {
        int iRound;
        int iRound2;
        PostviewParams postviewParams = new PostviewParams();
        pas pasVar = tgq.j(pjoVar, false).b;
        postviewParams.b(a);
        float fC = pae.i(kqpVar.b).c();
        int i = pasVar.a;
        int i2 = pasVar.b;
        if (i > i2) {
            iRound2 = Math.round(i / 6.0f);
            iRound = Math.round((iRound2 / fC) * 1.05f);
        } else {
            int iRound3 = Math.round(i2 / 6.0f);
            int iRound4 = Math.round(iRound3 * fC * 1.05f);
            iRound = iRound3;
            iRound2 = iRound4;
        }
        pas pasVar2 = new pas((iRound2 + 1) & (-2), (iRound + 1) & (-2));
        int i3 = pasVar2.a;
        int i4 = pasVar2.b;
        if (i3 > i4) {
            postviewParams.d(i3);
            postviewParams.c(0);
            return postviewParams;
        }
        postviewParams.d(0);
        postviewParams.c(i4);
        return postviewParams;
    }

    public static String c(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS");
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return "XXXX_".concat(String.valueOf(simpleDateFormat.format(Long.valueOf(j))));
    }

    public final String b(File file, long j, String str) throws IOException {
        if (!file.exists() || !file.isDirectory()) {
            throw new RuntimeException("Gcam debug directory not valid or doesn't exist: ".concat(String.valueOf(file.getAbsolutePath())));
        }
        File file2 = new File(new File(new File(file, "gcam"), c(j)), str);
        if (file2.exists()) {
            throw new IOException("Gcam debug data folder already exists: ".concat(String.valueOf(file2.getAbsolutePath())));
        }
        if (!file2.mkdirs()) {
            throw new IOException("Could not create Gcam debug data folder: ".concat(String.valueOf(file2.getAbsolutePath())));
        }
        file2.getAbsolutePath();
        return file2.getAbsolutePath();
    }

    public final boolean d() {
        gzi gziVar = gzs.a;
        return this.f.p(hae.p);
    }

    public final boolean e(iao iaoVar) {
        return iaoVar != iao.MOTION_BLUR && d();
    }
}
