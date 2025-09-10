package defpackage;

import android.graphics.RectF;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgq implements owf, paq {
    private static final paq a = new fgp(0);
    private final out b;
    private final fft c;
    private final owq d;
    private final owf e;
    private paq f;
    private float g;
    private float h;
    private float i;
    private float j;
    private mye k;

    public fgq(out outVar, fft fftVar) {
        ovx ovxVar = new ovx(new RectF());
        this.d = ovxVar;
        this.e = owb.a(ovxVar);
        this.f = a;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.b = outVar;
        this.c = fftVar;
        this.f = fftVar.dK(new fbo(this, 14), outVar);
    }

    private final synchronized RectF g() {
        if (this.c.dL().equals(fhc.ACTIVE) && j() && i()) {
            float fWidth = this.k.a().width();
            float f = fWidth - this.g;
            float f2 = this.i;
            float f3 = this.j;
            return new RectF(f - f2, f3, fWidth - f2, this.h + f3);
        }
        return new RectF();
    }

    private final synchronized void h() {
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
    }

    private final synchronized boolean i() {
        if (this.g != 0.0f) {
            if (this.h != 0.0f) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean j() {
        mye myeVar = this.k;
        if (myeVar != null) {
            myeVar.a();
            if (this.k.a().width() != 0.0f) {
                if (this.k.a().height() != 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.owf
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RectF dL() {
        return (RectF) this.e.dL();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f.close();
        this.f = a;
        this.k = null;
        h();
    }

    public final synchronized void d() {
        this.d.a(g());
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.e.dK(pauVar, executor);
    }

    public final synchronized void e(float f, float f2, float f3, float f4) {
        this.g = f;
        this.h = f2;
        this.i = f3;
        this.j = f4;
        this.b.execute(new ea(this, 20, null));
    }

    public final synchronized void f(mye myeVar) {
        this.k = myeVar;
        this.b.execute(new ea(this, 20, null));
    }
}
