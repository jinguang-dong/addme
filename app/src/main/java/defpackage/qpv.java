package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpv extends qpt implements qpe, qov, qqs {
    final AtomicBoolean a = new AtomicBoolean();
    private final Context b;
    private final qpf e;
    private final Executor f;
    private final qqe g;
    private final uem h;
    private final qqp i;
    private final AtomicBoolean j;
    private final qoz k;

    public qpv(qqq qqqVar, Context context, qpf qpfVar, qoz qozVar, syx syxVar, tzj tzjVar, qqe qqeVar, uem uemVar, uem uemVar2, Executor executor) {
        new ConcurrentHashMap();
        this.j = new AtomicBoolean(false);
        this.k = qozVar;
        this.i = qqqVar.a(executor, tzjVar, uemVar2);
        this.b = context;
        this.e = qpfVar;
        this.f = syxVar;
        this.g = qqeVar;
        this.h = uemVar;
    }

    private final syu cB(final uxn uxnVar) {
        return ske.R(new sxh() { // from class: qpu
            @Override // defpackage.sxh
            public final syu a() {
                return qpv.cx(this.a, uxnVar, null);
            }
        }, this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05d4  */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v136, types: [sgt, shi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ defpackage.syu cx(defpackage.qpv r18, defpackage.uxn r19, defpackage.qna r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpv.cx(qpv, uxn, qna):syu");
    }

    @Override // defpackage.qpe
    public void a(Activity activity, Bundle bundle) {
        if (this.j.getAndSet(true)) {
            return;
        }
        j(null);
    }

    @Override // defpackage.qqs
    public void cA() {
        this.k.a(this);
        this.e.a(this);
    }

    public syu cy() {
        if (!prt.g(this.b)) {
            return syq.a;
        }
        try {
            rnt.L(this.a.getAndSet(false));
            return cB(uxn.FOREGROUND_TO_BACKGROUND);
        } catch (Exception e) {
            return ske.L(e);
        }
    }

    public syu cz() {
        if (!prt.g(this.b)) {
            return syq.a;
        }
        if (!this.a.getAndSet(true)) {
            return cB(uxn.BACKGROUND_TO_FOREGROUND);
        }
        ((sgt) qnj.a.c().M(5714)).s("App is already in the foreground.");
        return ske.K();
    }

    @Override // defpackage.qov
    public void i(qna qnaVar) {
        cy();
    }

    @Override // defpackage.qov
    public void j(qna qnaVar) {
        if (this.a.get()) {
            return;
        }
        cz();
    }

    @Override // defpackage.qpe
    public /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.qpe
    public /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.qpe
    public /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.qpe
    public /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.qpe
    public /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.qpe
    public /* synthetic */ void h(int i) {
    }

    @Override // defpackage.qpe
    public /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
