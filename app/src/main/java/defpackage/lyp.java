package defpackage;

import android.graphics.Bitmap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyp implements lst {
    public final /* synthetic */ lyq a;
    private final Set b = new HashSet();

    public lyp(lyq lyqVar) {
        this.a = lyqVar;
    }

    private final synchronized void a(ltd ltdVar, ltf ltfVar) {
        ltf ltfVar2 = ltf.UNKNOWN;
        int iOrdinal = ltfVar.ordinal();
        if ((iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 12 || iOrdinal == 14 || iOrdinal == 26) && this.b.add(ltdVar)) {
            lyq lyqVar = this.a;
            lyqVar.c.c(new lmw(this, 17));
        }
    }

    private final synchronized void k(ltd ltdVar) {
        if (this.b.remove(ltdVar)) {
            lyq lyqVar = this.a;
            lyqVar.d.postDelayed(new lmw(this, 16), 3000L);
        }
    }

    @Override // defpackage.lst
    public final void b(ltd ltdVar) {
        k(ltdVar);
    }

    @Override // defpackage.lst
    public final void d(ltd ltdVar) {
        k(ltdVar);
    }

    @Override // defpackage.lst
    public final /* synthetic */ void g(ltd ltdVar, Bitmap bitmap, int i) {
        lpa.j(this, bitmap);
    }

    @Override // defpackage.lst
    public final void i(ltd ltdVar, lsy lsyVar, ltg ltgVar) {
        a(ltdVar, lsyVar.c);
    }

    @Override // defpackage.lst
    public final void n(ltd ltdVar) {
        k(ltdVar);
    }

    @Override // defpackage.lst
    public final /* synthetic */ void c(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void e(long j) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void eh(Bitmap bitmap) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void j(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void h(ltd ltdVar, par parVar) {
    }
}
