package defpackage;

import android.util.StringBuilderPrinter;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lbc implements fqk {
    private static final sgv a = sgv.g("lbc");
    private final nkw b;
    private final pjo c;
    private final owf d;
    private final pfu e;

    public lbc(nkw nkwVar, pfu pfuVar, pjo pjoVar, owf owfVar) {
        this.b = nkwVar;
        this.e = pfuVar;
        this.c = pjoVar;
        this.d = owfVar;
    }

    @Override // defpackage.fqk
    public final void a(Throwable th) {
        sgv sgvVar = a;
        ((sgt) sgvVar.b().M(3907)).v("applicationMode=%s", this.b);
        ((sgt) sgvVar.b().M(3908)).v(HHdu.oArT, this.c.l());
        ((sgt) sgvVar.b().M(3909)).v("currentZoom=%f", this.d.dL());
        StringBuilder sb = new StringBuilder();
        this.e.j(new StringBuilderPrinter(sb));
        ((sgt) sgvVar.b().M(3910)).v("%s", sb.toString().trim());
    }
}
