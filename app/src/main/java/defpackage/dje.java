package defpackage;

import androidx.wear.ambient.AmbientMode;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dje extends djd {
    public float b;
    public float c;
    private final float e;

    public dje(djk djkVar, float f) {
        super(djkVar);
        this.e = f;
    }

    @Override // defpackage.djd, defpackage.djk
    public final float a(float f, float f2, long j) {
        m();
        ((djd) this).a.k(f, i(f2), j);
        return f;
    }

    @Override // defpackage.djd, defpackage.djk
    public final float b(float f) {
        return ukc.m(((djd) this).a.l(f), this.b, this.c);
    }

    @Override // defpackage.djd, defpackage.djk
    public final dkd c(float f, float f2) {
        dkd dkdVarP = ((djd) this).a.p(f, this.d);
        return new dkd(i(dkdVarP.a), f, this.d, (dkdVarP.d + dkdVarP.b) - f);
    }

    @Override // defpackage.djd, defpackage.djk
    public final void e(djo djoVar, Iterator it) {
        this.b = djoVar.dk(0.0f);
        this.c = djoVar.dk(Float.POSITIVE_INFINITY);
        ((djd) this).a.e(djoVar, it);
    }

    protected final float i(float f) {
        return ukc.m(f, AmbientMode.AmbientCallback.b(0.0f), AmbientMode.AmbientCallback.b(this.e));
    }
}
