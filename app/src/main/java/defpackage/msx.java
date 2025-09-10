package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class msx extends uht implements uiu {
    final /* synthetic */ float a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msx(float f, bqc bqcVar, uif uifVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.a = f;
        this.b = bqcVar;
        this.c = uifVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((msx) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((msx) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, uif] */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        if (this.d == 0) {
            rnt.aN(obj);
            if (Math.abs(this.a) >= ((int) (((bql) this.b).g & 4294967295L))) {
                this.c.a();
            }
            return ufg.a;
        }
        rnt.aN(obj);
        gwv gwvVar = (gwv) this.b;
        ValueAnimator valueAnimator = gwvVar.p;
        if (this.c != niz.f && valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        owq owqVar = gwvVar.g;
        float f = this.a;
        owqVar.a(new Float(f));
        gwvVar.x(f);
        return ufg.a;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [bqc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, uif] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.d == 0) {
            return new msx(this.a, (bqc) this.b, (uif) this.c, uhbVar, 0);
        }
        Object obj2 = this.b;
        return new msx((gwv) obj2, (niz) this.c, this.a, uhbVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msx(gwv gwvVar, niz nizVar, float f, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = gwvVar;
        this.c = nizVar;
        this.a = f;
    }
}
