package defpackage;

import com.google.android.apps.lightcycle.panorama.LightCycleNative;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jwp extends gsn {
    final /* synthetic */ jxa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwp(jxa jxaVar) {
        super((int[]) null);
        this.a = jxaVar;
    }

    @Override // defpackage.gsn
    public final void a() {
        this.a.f();
    }

    @Override // defpackage.gsn
    public final void g() {
        jxa jxaVar = this.a;
        jxaVar.L++;
        if (jxaVar.q == 0) {
            ((sgt) jxa.a.b().M(3090)).s("Can't undo capture, no images captured.");
            return;
        }
        Object obj = jeb.a;
        if (!LightCycleNative.CanUndo() || jxaVar.g.b.g().a() == 8) {
            ((sgt) jxa.a.b().M(3089)).s("Can't undo capture, LightCycle not ready to undo.");
            return;
        }
        int i = jxaVar.q;
        if (i > 0) {
            jxaVar.q = i - 1;
            jxaVar.r.d();
            jxaVar.A.sendEmptyMessage(101);
        }
        if (jxaVar.q == 0) {
            jxaVar.c();
        }
    }
}
