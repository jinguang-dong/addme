package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phy extends pil {
    public final ovx a;
    public final long b;

    public phy(peq peqVar, pjr pjrVar, pas pasVar, int i, boolean z) {
        super(peqVar, pjrVar, z);
        ovx ovxVar = new ovx(rvk.a);
        this.a = ovxVar;
        this.b = qpt.ax(i, pasVar);
        rwc rwcVar = peqVar.c;
        if (rwcVar.h()) {
            ovxVar.a(rwcVar);
        }
    }

    @Override // defpackage.peo
    public final int a() {
        return this.h.e;
    }

    @Override // defpackage.peo
    public final pas b() {
        return this.h.d;
    }

    @Override // defpackage.peo
    public final void e(Surface surface) {
        ovx ovxVar = this.a;
        if (surface == null) {
            ovxVar.a(rvk.a);
            return;
        }
        rwc rwcVar = (rwc) ovxVar.d;
        if (rwcVar.h() && surface == rwcVar.c()) {
            return;
        }
        ovxVar.a(rwc.j(surface));
    }

    @Override // defpackage.pil
    public final long g() {
        return this.b;
    }

    @Override // defpackage.pil
    public final pet i() {
        return this.h.a;
    }

    @Override // defpackage.pil
    public final boolean j() {
        return true;
    }
}
