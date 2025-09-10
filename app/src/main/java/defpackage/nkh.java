package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nkh implements nqh {
    final /* synthetic */ nqh a;

    public nkh(nqh nqhVar) {
        this.a = nqhVar;
    }

    @Override // defpackage.nqh
    public final boolean a(PointF pointF) {
        this.a.a(new PointF(pointF.x, pointF.y));
        return false;
    }

    @Override // defpackage.nqh
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.nqh
    public final boolean g(PointF pointF) {
        this.a.g(new PointF(pointF.x, pointF.y));
        return false;
    }
}
