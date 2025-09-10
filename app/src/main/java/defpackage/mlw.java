package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import j$.util.Map;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mlw implements mmg, mmh {
    private final mma a;
    private final EnumMap b = new EnumMap(mlv.class);
    private mlv c = mlv.NONE;

    public mlw(mma mmaVar) {
        this.a = mmaVar;
    }

    private final void o() {
        EnumMap enumMap = new EnumMap(mlv.class);
        synchronized (this) {
            enumMap.putAll(this.b);
            this.c = mlv.NONE;
        }
        Map.EL.forEach(enumMap, new ldw(4));
    }

    @Override // defpackage.mmh
    public final paq b(rwc rwcVar, rwc rwcVar2) {
        return this.a.b(rwcVar, rwcVar2);
    }

    public final synchronized mlv d() {
        return this.c;
    }

    @Override // defpackage.mmh
    public final void e(mmg mmgVar) {
        this.a.e(mmgVar);
    }

    @Override // defpackage.mmg
    public final void eV() {
        o();
    }

    @Override // defpackage.mmh
    public final void f(poj pojVar) {
        this.a.f(pojVar);
    }

    @Override // defpackage.mmh
    public final void g(mmg mmgVar) {
        this.a.g(mmgVar);
    }

    public final owf h(PointF pointF, mlv mlvVar) {
        synchronized (this) {
            mlv mlvVar2 = this.c;
            if (mlvVar2 != mlvVar && mlvVar2 != mlv.NONE) {
                return new owi(mmf.b());
            }
            mma mmaVar = this.a;
            mmaVar.h();
            owf owfVarA = mmaVar.a(pointF);
            mmaVar.e(this);
            return owfVarA;
        }
    }

    @Override // defpackage.mmh
    public final boolean i() {
        return this.a.i();
    }

    public final synchronized void j(mlv mlvVar, mlu mluVar) {
        this.b.put((EnumMap) mlvVar, (mlv) mluVar);
    }

    public final void k(mlv mlvVar) {
        synchronized (this) {
            if (this.c != mlvVar) {
                return;
            }
            o();
        }
    }

    public final synchronized void l(mlv mlvVar) {
        this.b.remove(mlvVar);
    }

    public final void m(mlv mlvVar) {
        synchronized (this) {
            if (this.c != mlvVar) {
                return;
            }
            this.a.h();
        }
    }

    public final boolean n(mlv mlvVar) {
        EnumMap enumMap = new EnumMap(mlv.class);
        synchronized (this) {
            mlv mlvVar2 = this.c;
            boolean z = true;
            if (mlvVar == mlvVar2) {
                this.a.g(this);
                return true;
            }
            mlv mlvVar3 = mlv.QR_GLEAMING;
            if ((!mlvVar2.equals(mlvVar3) || !mlvVar.equals(mlv.TAXI)) && ((this.c.equals(mlv.TAXI) && mlvVar.equals(mlvVar3)) || mlvVar.f < this.c.f)) {
                this.c = mlvVar;
                this.a.g(this);
                enumMap.putAll(this.b);
            }
            if (this.c != mlvVar) {
                z = false;
            }
            Map.EL.forEach(enumMap, new glv(mlvVar, 6));
            return z;
        }
    }

    @Override // defpackage.mmg
    public final void eQ() {
    }

    @Override // defpackage.mmg
    public final void c(RectF rectF, float f, mly mlyVar) {
    }
}
