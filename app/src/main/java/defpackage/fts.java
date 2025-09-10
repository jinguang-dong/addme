package defpackage;

import android.media.MicrophoneDirection;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fts implements fzy {
    private static final sgv c = sgv.g("fts");
    public final Executor a;
    public int b = 1;
    private final owf d;
    private final owf e;
    private MicrophoneDirection f;
    private final cxb g;

    public fts(cxb cxbVar, Executor executor, owf owfVar, owf owfVar2) {
        this.g = cxbVar;
        this.a = executor;
        this.d = owfVar;
        this.e = owfVar2;
        gdo gdoVar = gdo.CAPTURE_SESSION;
        cxbVar.w(gdoVar).d(owl.a(owfVar, owfVar2).dK(new fpe(this, 4), sxo.a));
        cxbVar.w(gdoVar).d(this);
    }

    public final float a() {
        float fFloatValue = ((Float) this.d.dL()).floatValue();
        if (fFloatValue < 1.0f) {
            return 0.0f;
        }
        owf owfVar = this.e;
        float fMax = Math.max(1.0f, ((gxi) owfVar.dL()).a);
        return (fFloatValue - fMax) / (((gxi) owfVar.dL()).b - fMax);
    }

    @Override // defpackage.fzy
    public final int b() {
        return 0;
    }

    @Override // defpackage.fzy
    public final gac c() {
        return gac.a;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.f = null;
    }

    @Override // defpackage.fzy
    public final void d(MicrophoneDirection microphoneDirection) {
        this.f = microphoneDirection;
    }

    public final void e(float f) {
        MicrophoneDirection microphoneDirection = this.f;
        if (microphoneDirection != null) {
            if (f == 0.0f) {
                f = 0.001f;
            }
            try {
                if (microphoneDirection.setPreferredMicrophoneFieldDimension(f)) {
                    return;
                }
                ((sgt) c.b().M(379)).v("Failed to set audio zoom ratio (%g)", Float.valueOf(f));
            } catch (RuntimeException e) {
                ((sgt) c.b().M(378)).v("Failed to call audio zoom API. Exception: %s", e.getMessage());
            }
        }
    }

    @Override // defpackage.fzy
    public final void g() {
        this.b = 2;
        e(a());
    }

    @Override // defpackage.fzy
    public final void h() {
        this.b = 3;
    }

    @Override // defpackage.fzy
    public final int i() {
        return 2;
    }

    @Override // defpackage.fzy
    public final void f(fzx fzxVar) {
    }

    @Override // defpackage.fzy
    public final void j(qaq qaqVar) {
    }
}
