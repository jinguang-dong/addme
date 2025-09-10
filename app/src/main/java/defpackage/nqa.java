package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqa implements nqh {
    public nqh a = null;

    @Override // defpackage.nqh
    public final boolean a(PointF pointF) {
        nqh nqhVar = this.a;
        if (nqhVar == null) {
            return false;
        }
        return nqhVar.a(pointF);
    }

    @Override // defpackage.nqh
    public final void b() {
        nqh nqhVar = this.a;
        if (nqhVar == null) {
            return;
        }
        nqhVar.b();
    }

    public final void c() {
        this.a = null;
    }

    @Override // defpackage.nqh
    public final boolean g(PointF pointF) {
        nqh nqhVar = this.a;
        if (nqhVar == null) {
            return false;
        }
        return nqhVar.g(pointF);
    }
}
