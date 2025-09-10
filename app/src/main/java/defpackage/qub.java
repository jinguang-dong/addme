package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qub extends qsz implements qov, qqs {
    public final qqp a;
    public final tzj b;
    public final tzj c;
    private final syx d;
    private final Object e;
    private ArrayList f;
    private final AtomicInteger g;

    public qub(qqq qqqVar, qoz qozVar, syx syxVar, tzj tzjVar, tzj tzjVar2, uem uemVar, Executor executor) {
        super(null);
        this.e = new Object();
        this.f = new ArrayList(0);
        this.g = new AtomicInteger();
        this.a = qqqVar.a(executor, tzjVar, uemVar);
        this.d = syxVar;
        this.b = tzjVar;
        this.c = tzjVar2;
        qozVar.a(this);
    }

    @Override // defpackage.qov
    public final void i(qna qnaVar) {
        w();
    }

    public final syu w() {
        if (this.g.get() > 0) {
            return ske.O(new gea(this, 15), 1L, TimeUnit.SECONDS, this.d);
        }
        synchronized (this.e) {
            if (this.f.isEmpty()) {
                return syq.a;
            }
            ArrayList arrayList = this.f;
            this.f = new ArrayList(0);
            return ske.R(new pwe(this, arrayList, 8), this.d);
        }
    }

    @Override // defpackage.qqs
    public final /* synthetic */ void cA() {
    }

    @Override // defpackage.qov
    public final /* synthetic */ void j(qna qnaVar) {
    }
}
