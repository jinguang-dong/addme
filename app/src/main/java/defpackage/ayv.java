package defpackage;

import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayv extends bhm implements bbo {
    public final uif a;
    public final bbi b;
    public ayu c = new ayu(bgr.b().v());

    public ayv(uif uifVar, bbi bbiVar) {
        this.a = uifVar;
        this.b = bbiVar;
    }

    @Override // defpackage.bbo
    public final Object a() {
        uiq uiqVarI = bgr.b().i();
        if (uiqVarI != null) {
            uiqVarI.a(this);
        }
        bgj bgjVarB = bgr.b();
        return b((ayu) bgr.f(this.c, bgjVarB), bgjVarB, true, this.a).e;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ayu b(defpackage.ayu r21, defpackage.bgj r22, boolean r23, defpackage.uif r24) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayv.b(ayu, bgj, boolean, uif):ayu");
    }

    @Override // defpackage.bhl
    public final bhn c() {
        return this.c;
    }

    @Override // defpackage.bhl
    public final void d(bhn bhnVar) {
        bhnVar.getClass();
        this.c = (ayu) bhnVar;
    }

    public final ayu e() {
        bgj bgjVarB = bgr.b();
        return b((ayu) bgr.f(this.c, bgjVarB), bgjVarB, false, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        ayu ayuVar = (ayu) bgr.e(this.c);
        sb.append(ayuVar.d(bgr.b()) ? String.valueOf(ayuVar.e) : CZAHo.DXIjJdkwdTpd);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
