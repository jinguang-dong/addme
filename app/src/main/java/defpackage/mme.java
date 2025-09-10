package defpackage;

import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mme {
    private mmi a;
    private mly b;
    private RectF c;
    private float d;
    private int e;
    private long f;
    private byte g;

    public final mmf a() {
        mmi mmiVar;
        mly mlyVar;
        RectF rectF;
        if (this.g != 7 || (mmiVar = this.a) == null || (mlyVar = this.b) == null || (rectF = this.c) == null) {
            throw new IllegalStateException();
        }
        return new mmf(mmiVar, mlyVar, rectF, this.d, this.e, this.f);
    }

    public final void b(float f) {
        this.d = f;
        this.g = (byte) (this.g | 1);
    }

    public final void c(int i) {
        this.e = i;
        this.g = (byte) (this.g | 2);
    }

    public final void d(RectF rectF) {
        rectF.getClass();
        this.c = rectF;
    }

    public final void e(mmi mmiVar) {
        mmiVar.getClass();
        this.a = mmiVar;
    }

    public final void f(long j) {
        this.f = j;
        this.g = (byte) (this.g | 4);
    }

    public final void g(mly mlyVar) {
        mlyVar.getClass();
        this.b = mlyVar;
    }
}
