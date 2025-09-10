package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vs implements ra, wc {
    public final long a;
    public wg b;
    private final uma c;

    public vs(long j) {
        this.a = j;
        if (j <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.c = new uma(0L, umc.a);
    }

    @Override // defpackage.ra
    public final /* synthetic */ void a(rb rbVar) {
        rbVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void b(sy syVar, long j, int i) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final void c(sy syVar, long j, qb qbVar) {
        uma umaVar;
        long j2;
        long j3;
        syVar.getClass();
        do {
            umaVar = this.c;
            j2 = umaVar.b;
            j3 = j2 != -1 ? 1 + j2 : -1L;
        } while (!umaVar.d(j2, j3));
        if (j3 == this.a) {
            Log.w("CXCP", "Capture processing is now enabled for " + this.b + " after " + j3 + " frames.");
            n().g(true);
        }
    }

    @Override // defpackage.ra
    public final /* synthetic */ void d(sy syVar, long j, rc rcVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void e(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void f(sy syVar, long j) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void g(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void h(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void i(sy syVar, long j, long j2) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void j(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void k(sy syVar, qc qcVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void l(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void m(sy syVar) {
        syVar.getClass();
    }

    public final wg n() {
        wg wgVar = this.b;
        wgVar.getClass();
        return wgVar;
    }

    @Override // defpackage.wc
    public final void o() {
        this.c.b = -1L;
        n().g(false);
    }

    @Override // defpackage.wc
    public final void p() {
        uma umaVar;
        long j;
        do {
            umaVar = this.c;
            j = umaVar.b;
        } while (!umaVar.d(j, j != -1 ? 0L : -1L));
        n().g(false);
        Log.w("CXCP", "Capture processing has been disabled for " + n() + " until " + this.a + " frames have been completed.");
    }

    @Override // defpackage.wc
    public final void q() {
    }
}
