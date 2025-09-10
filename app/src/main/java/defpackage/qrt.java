package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qrt extends qrq implements qqs, qpe, qov {
    public volatile qna a;
    public final tzj b;
    public final uem d;
    public final uem e;
    public final qrh f;
    public final qpf g;
    public final qvj h;
    private final Executor j;
    private final qqp k;
    private final rwc l;
    private final qpf m;
    private final qoz n;
    private final uem s;
    private final rwc t;
    private final uem u;
    private final uem v;
    private final qpf w;
    private final AtomicBoolean i = new AtomicBoolean();
    private final AtomicInteger o = new AtomicInteger();
    private final AtomicInteger p = new AtomicInteger();
    private final AtomicInteger q = new AtomicInteger();
    private final AtomicBoolean r = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public qrt(qqq qqqVar, Executor executor, tzj tzjVar, rwc rwcVar, qpf qpfVar, qoz qozVar, qpf qpfVar2, uem uemVar, uem uemVar2, uem uemVar3, qrh qrhVar, qvj qvjVar, rwc rwcVar2, uem uemVar4, uem uemVar5, qpf qpfVar3) {
        this.b = tzjVar;
        this.l = rwcVar;
        this.m = qpfVar;
        this.n = qozVar;
        this.w = qpfVar2;
        this.k = qqqVar.a(sxo.a, tzjVar, null);
        this.j = executor;
        this.s = uemVar;
        this.d = uemVar2;
        this.e = uemVar3;
        this.f = qrhVar;
        this.h = qvjVar;
        this.t = rwcVar2;
        this.u = uemVar4;
        this.v = uemVar5;
        this.g = qpfVar3;
    }

    private final void p(int i, AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        ske.R(new qtr(this, atomicInteger, i, 1), this.j);
    }

    @Override // defpackage.qpe
    public final void a(Activity activity, Bundle bundle) {
        if (this.r.getAndSet(true)) {
            return;
        }
        p(4, this.p);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, uem] */
    @Override // defpackage.qqs
    public final void cA() {
        ((NativeCrashHandlerImpl) ((rwg) this.l).a.a()).a(this);
        this.m.a(this);
        this.n.a(this);
        p(3, this.o);
        ske.R(new qrr(this, 0), this.j);
    }

    @Override // defpackage.qpe
    public final void d(Activity activity) {
        ske.R(new qrr(this, 2), this.j);
    }

    @Override // defpackage.qpe
    public final void f(Activity activity) {
        this.a = qna.a(activity.getClass());
    }

    @Override // defpackage.qov
    public final void i(qna qnaVar) {
        this.a = null;
    }

    @Override // defpackage.qrq
    public final void k() {
        if (this.i.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new qrs(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:5|(1:7)(1:8)|9|(23:11|(3:13|(1:15)|16)(2:17|(3:19|(1:21)|22)(19:23|(2:25|(3:69|(1:71)|72)(4:28|(1:30)|31|(3:33|(1:35)|36)(4:37|(4:40|(1:42)|43|(6:117|44|115|45|127|46))(0)|59|(3:61|(1:63)|64)(3:65|(1:67)|68))))(0)|118|84|(1:86)(1:87)|88|(1:90)|91|121|(2:96|94)|120|97|(1:102)|123|(2:111|103)|122|(2:107|105)|124|(2:109|110)(1:129)))|73|(1:75)|76|(1:81)|118|84|(0)(0)|88|(0)|91|121|(1:94)|120|97|(2:100|102)|123|(1:103)|122|(1:105)|124|(0)(0))(1:82)|83|118|84|(0)(0)|88|(0)|91|121|(1:94)|120|97|(0)|123|(1:103)|122|(1:105)|124|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02a2, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e3 A[LOOP:2: B:105:0x02db->B:107:0x02e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ed A[LOOP:1: B:103:0x02d3->B:111:0x02ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0226 A[Catch: InterruptedException -> 0x02a2, all -> 0x02a9, TryCatch #5 {InterruptedException -> 0x02a2, all -> 0x02a9, blocks: (B:84:0x0220, B:86:0x0226, B:88:0x023b, B:90:0x0250, B:91:0x0253, B:87:0x0231), top: B:118:0x0220 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0231 A[Catch: InterruptedException -> 0x02a2, all -> 0x02a9, TryCatch #5 {InterruptedException -> 0x02a2, all -> 0x02a9, blocks: (B:84:0x0220, B:86:0x0226, B:88:0x023b, B:90:0x0250, B:91:0x0253, B:87:0x0231), top: B:118:0x0220 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0250 A[Catch: InterruptedException -> 0x02a2, all -> 0x02a9, TryCatch #5 {InterruptedException -> 0x02a2, all -> 0x02a9, blocks: (B:84:0x0220, B:86:0x0226, B:88:0x023b, B:90:0x0250, B:91:0x0253, B:87:0x0231), top: B:118:0x0220 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b1 A[LOOP:0: B:94:0x02a9->B:96:0x02b1, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, rww] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r8v9, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, rww] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.uzf r19, defpackage.qsj r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrt.l(uzf, qsj):void");
    }

    public final boolean m() {
        return ((qri) this.e.a()).b;
    }

    public final syu n(int i, qrf qrfVar) {
        return o(i, qrfVar, qrfVar.a / 100.0f);
    }

    public final syu o(int i, qrf qrfVar, float f) {
        if (!qrfVar.c()) {
            return syq.a;
        }
        qvl qvlVarC = this.w.c(f);
        if (((Random) qvlVarC.b).nextFloat() >= qvlVarC.a) {
            return syq.a;
        }
        qqp qqpVar = this.k;
        qql qqlVarA = qqm.a();
        tpc tpcVarM = uzu.a.m();
        tpc tpcVarM2 = uzt.a.m();
        float f2 = 1.0f / f;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        int i2 = (int) f2;
        tph tphVar = tpcVarM2.b;
        uzt uztVar = (uzt) tphVar;
        uztVar.b |= 2;
        uztVar.d = i2;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        uzt uztVar2 = (uzt) tpcVarM2.b;
        uztVar2.c = i - 1;
        uztVar2.b |= 1;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        uzu uzuVar = (uzu) tpcVarM.b;
        uzt uztVar3 = (uzt) tpcVarM2.l();
        uztVar3.getClass();
        uzuVar.u = uztVar3;
        uzuVar.b |= 16777216;
        qqlVarA.f((uzu) tpcVarM.l());
        return qqpVar.b(qqlVarA.a());
    }

    @Override // defpackage.qpe
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.qpe
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.qpe
    public final /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.qpe
    public final /* synthetic */ void h(int i) {
    }

    @Override // defpackage.qov
    public final /* synthetic */ void j(qna qnaVar) {
    }

    @Override // defpackage.qpe
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
