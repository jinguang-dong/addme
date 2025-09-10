package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kju implements kka, paq {
    public final Executor a;
    public final lpr c;
    public final pbn d;
    public final ocq e;
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final owq f = new ovx(2);
    public final pmi b = new pmc(2);
    private final kjc h = new kjc(2);

    public kju(Executor executor, ocq ocqVar, lpr lprVar, pbn pbnVar) {
        this.a = executor;
        this.e = ocqVar;
        this.c = lprVar;
        this.d = pbnVar;
    }

    @Override // defpackage.kjz
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final syu a(lmg lmgVar) {
        poj pojVar = lmgVar.a;
        if (pojVar.a() == 35) {
            return this.h.a(new kjs(this, lmgVar));
        }
        pojVar.close();
        return ske.L(new pco("Only YUV_420_888 images are supported"));
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.g.compareAndSet(false, true)) {
            this.h.close();
            this.f.a(0);
        }
    }
}
