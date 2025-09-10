package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtu extends qtq implements qqs {
    public final syx a;
    public final qnl b;
    public final tzj c;
    public final qqp d;
    public final qtx e;
    private final boolean f;
    private final qtp g;

    public qtu(qqq qqqVar, qtp qtpVar, syx syxVar, tzj tzjVar, qtx qtxVar, qnl qnlVar, uem uemVar, Executor executor, rwc rwcVar) {
        new AtomicReference(qtl.a);
        new ConcurrentHashMap();
        this.g = qtpVar;
        this.b = qnlVar;
        this.d = qqqVar.a(executor, tzjVar, uemVar);
        this.a = syxVar;
        this.c = tzjVar;
        this.e = qtxVar;
        this.f = ((Boolean) rwcVar.e(Boolean.FALSE)).booleanValue();
    }

    @Override // defpackage.qtq
    public final void a() {
        qto qtoVar = new qto() { // from class: qts
            @Override // defpackage.qto
            public final void a(int i, String str) {
                qtu qtuVar = this.a;
                if (qtuVar.b.a) {
                    ske.K();
                } else {
                    ske.R(new qtr(qtuVar, i, str, 0), qtuVar.a);
                }
            }
        };
        qtp qtpVar = this.g;
        qtpVar.d = qtoVar;
        if (qtpVar.c.getAndSet(true)) {
            return;
        }
        ske.R(new qrr(qtpVar, 4), qtpVar.b);
    }

    @Override // defpackage.qqs
    public final void cA() {
        if (this.f) {
            a();
        }
    }
}
