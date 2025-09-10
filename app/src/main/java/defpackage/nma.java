package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nma implements lpc {
    final /* synthetic */ owf a;
    final /* synthetic */ owf b;
    final /* synthetic */ tzj c;
    final /* synthetic */ Context d;
    final /* synthetic */ rwc e;
    final /* synthetic */ imi f;

    public nma(owf owfVar, owf owfVar2, imi imiVar, tzj tzjVar, Context context, rwc rwcVar) {
        this.a = owfVar;
        this.b = owfVar2;
        this.f = imiVar;
        this.c = tzjVar;
        this.d = context;
        this.e = rwcVar;
    }

    @Override // defpackage.lpc
    public final void b(boolean z) {
        boolean zBooleanValue = ((Boolean) ((ovx) this.a).d).booleanValue();
        nkw nkwVar = (nkw) this.b.dL();
        nan nanVar = (nan) this.c.a();
        rwc rwcVar = this.e;
        ojl.bf(zBooleanValue, z, nkwVar, this.f, nanVar, this.d);
        owd owdVar = (owd) rwcVar.c();
        if (owdVar.a()) {
            ((luj) owdVar.d).a(luf.aY).a(Boolean.valueOf(z));
        }
        owdVar.a = z;
    }

    @Override // defpackage.lpc
    public final /* synthetic */ void a(int i) {
    }

    @Override // defpackage.lpc
    public final /* synthetic */ void c(float f) {
    }

    @Override // defpackage.lpc
    public final /* synthetic */ void d(float f) {
    }
}
