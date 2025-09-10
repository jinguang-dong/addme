package defpackage;

import androidx.wear.ambient.AmbientMode;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkc extends djd {
    private float b;
    private float c;
    private float e;
    private float f;
    private final AmbientMode.AmbientController g;

    public dkc(djk djkVar, AmbientMode.AmbientController ambientController) {
        super(djkVar);
        this.g = ambientController;
    }

    @Override // defpackage.djd, defpackage.djk
    public final float a(float f, float f2, long j) {
        float fM = this.e / m();
        return ((djd) this).a.k(f + fM, f2 - ((this.e + this.f) / m()), j) - fM;
    }

    @Override // defpackage.djd, defpackage.djk
    public final float b(float f) {
        return ((djd) this).a.l(f) + this.b + this.c;
    }

    @Override // defpackage.djd, defpackage.djk
    public final dkd c(float f, float f2) {
        float f3 = this.b;
        dkd dkdVarP = ((djd) this).a.p(f - f3, (f2 - f3) - this.c);
        float f4 = this.e + this.f;
        float f5 = dkdVarP.d;
        float f6 = dkdVarP.a;
        float f7 = dkdVarP.b;
        float f8 = this.b;
        return new dkd(f6 + (f4 / f5), f7 + f8, dkdVarP.c + this.c + f8, f5);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alv, java.lang.Object] */
    @Override // defpackage.djd, defpackage.djk
    public final void e(djo djoVar, Iterator it) {
        ?? r0 = this.g.a;
        alw alwVar = (alw) r0;
        this.b = djoVar.dk(alwVar.a);
        this.c = djoVar.dk(alwVar.b);
        cib cibVar = djoVar.a.c;
        this.e = djoVar.dk(r0.b(cibVar));
        this.f = djoVar.dk(r0.c(cibVar));
        ((djd) this).a.e(djoVar, it);
    }
}
