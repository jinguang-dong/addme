package defpackage;

import android.hardware.camera2.CaptureFailure;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phv implements ra {
    private final Map a;
    private final uma b;
    private final ojl c;

    public phv(ojl ojlVar, Map map, uma umaVar) {
        this.c = ojlVar;
        this.a = map;
        this.b = umaVar;
    }

    @Override // defpackage.ra
    public final void a(rb rbVar) {
        rbVar.getClass();
        this.c.dH(null);
    }

    @Override // defpackage.ra
    public final void b(sy syVar, long j, int i) {
        syVar.getClass();
        this.c.dG((peo) this.a.get(new rh(i)), j);
    }

    @Override // defpackage.ra
    public final void c(sy syVar, long j, qb qbVar) {
        syVar.getClass();
        this.c.a(new phu(qbVar));
    }

    @Override // defpackage.ra
    public final void d(sy syVar, long j, rc rcVar) {
        syVar.getClass();
        int i = ukb.a;
        Object objC = rcVar.c(new uji(CaptureFailure.class));
        qd.a(j);
        Objects.toString(objC != null ? Integer.valueOf(((CaptureFailure) objC).getReason()) : null);
        this.c.dH(new piw((CaptureFailure) objC));
    }

    @Override // defpackage.ra
    public final void e(sy syVar) {
        syVar.getClass();
        this.c.dW();
    }

    @Override // defpackage.ra
    public final void f(sy syVar, long j) {
        syVar.getClass();
        this.c.m(j);
    }

    @Override // defpackage.ra
    public final void g(sy syVar) {
        syVar.getClass();
        Map mapB = syVar.b();
        HashSet hashSet = new HashSet();
        Iterator it = mapB.keySet().iterator();
        while (it.hasNext()) {
            int i = ((rh) it.next()).a;
            peo peoVar = (peo) this.a.get(new rh(i));
            if (peoVar != null) {
                hashSet.add(peoVar);
            } else {
                Log.e("FrameListeners", "No Stream found for StreamId: ".concat(rh.a(i)));
            }
        }
        this.c.dV(hashSet);
    }

    @Override // defpackage.ra
    public final void h(sy syVar) {
        syVar.getClass();
        this.c.n();
    }

    @Override // defpackage.ra
    public final void i(sy syVar, long j, long j2) {
        syVar.getClass();
        this.c.l(new pdo(j2, j, this.b.c()));
    }

    @Override // defpackage.ra
    public final /* synthetic */ void j(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final void k(sy syVar, qc qcVar) {
        syVar.getClass();
        this.c.dT(new phq(qcVar));
    }

    @Override // defpackage.ra
    public final /* synthetic */ void l(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void m(sy syVar) {
        syVar.getClass();
    }
}
