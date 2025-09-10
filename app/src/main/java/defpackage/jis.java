package defpackage;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jis implements imx {
    final /* synthetic */ imx a;
    final /* synthetic */ TimeUnit o;
    final /* synthetic */ String p = "AppSettings";

    public jis(imx imxVar, TimeUnit timeUnit) {
        this.a = imxVar;
        this.o = timeUnit;
    }

    @Override // defpackage.imx
    public final Object a(qzx qzxVar) {
        imx imxVar = this.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objA = imxVar.a(qzxVar);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > TimeUnit.MILLISECONDS.convert(5L, this.o)) {
            Log.w(this.p, "Warning: providing system service " + ((String) qzxVar.c) + " took " + jCurrentTimeMillis2 + " ms");
        }
        return objA;
    }
}
