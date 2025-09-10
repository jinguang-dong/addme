package defpackage;

import android.content.Context;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class odf implements ocl {
    public static final qxr a;
    public static final ConcurrentHashMap b;
    static Boolean c;
    static Long d;
    public final Context e;

    public odf(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        if (applicationContext != null) {
            qxt.f(applicationContext);
        }
    }

    static {
        qxr qxrVar = new qxr(qxc.a("com.google.android.gms.clearcut.public"));
        if (qxrVar.d) {
            throw new IllegalStateException(JvFFEwFNdCrxf.uwTvIHEMV);
        }
        qxr qxrVar2 = new qxr(qxrVar.a, "gms:playlog:service:samplingrules_", qxrVar.c, false, qxrVar.e, qxrVar.f);
        a = new qxr(qxrVar2.a, qxrVar2.b, "LogSamplingRulesV2__", qxrVar2.d, qxrVar2.e, qxrVar2.f);
        b = new ConcurrentHashMap();
        c = null;
        d = null;
    }
}
