package defpackage;

import j$.util.DesugarTimeZone;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcd implements qbv {
    public static final /* synthetic */ int d = 0;
    private static final TimeZone e = DesugarTimeZone.getTimeZone("UTC");
    public final Executor a;
    public final Random b;
    public final ren c;

    public qcd(ren renVar, Executor executor, Random random) {
        this.c = renVar;
        this.a = executor;
        this.b = random;
    }

    public static long f(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(e);
        gregorianCalendar.setTimeInMillis(j);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    @Override // defpackage.qbv
    public final syu a() {
        int i = sbp.d;
        AtomicReference atomicReference = new AtomicReference(sex.a);
        qcj qcjVar = new qcj(atomicReference, 1);
        ren renVar = this.c;
        Executor executor = this.a;
        return qsz.m(renVar.b(qcjVar, executor), rsx.a(new pzu(atomicReference, 15)), executor);
    }

    @Override // defpackage.qbv
    public final syu b() {
        AtomicReference atomicReference = new AtomicReference(rvk.a);
        pzu pzuVar = new pzu(atomicReference, 19);
        ren renVar = this.c;
        sxo sxoVar = sxo.a;
        return qsz.m(renVar.b(pzuVar, sxoVar), new pzu(atomicReference, 20), sxoVar);
    }

    @Override // defpackage.qbv
    public final syu c(String str) {
        AtomicReference atomicReference = new AtomicReference(rvk.a);
        hve hveVar = new hve(str, atomicReference, 20);
        ren renVar = this.c;
        sxo sxoVar = sxo.a;
        return qsz.m(renVar.b(hveVar, sxoVar), new pzu(atomicReference, 17), sxoVar);
    }

    @Override // defpackage.qbv
    public final syu d() {
        return qsz.n(this.c.a(), new qaz(this, 9), this.a);
    }

    @Override // defpackage.qbv
    public final syu e(pvg pvgVar) {
        return this.c.b(new pzu(pvgVar, 16), this.a);
    }
}
