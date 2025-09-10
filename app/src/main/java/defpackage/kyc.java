package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kyc implements paq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ kyc(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kmy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, uem] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        int i = this.d;
        if (i == 0) {
            kye kyeVar = (kye) this.a;
            pbn pbnVar = kyeVar.f;
            pbnVar.f(ezh.ai("PckPostShutterCaptureController#closeOnDone"));
            kyeVar.a(this.b);
            pbnVar.g();
            ((fsf) this.c).close();
            return;
        }
        if (i == 1) {
            ?? r0 = this.c;
            r0.f("MICRO_EncoderModule#shutdown_controller");
            ((jpb) this.b.a()).a(false);
            ((obu) this.a.a()).y();
            r0.g();
            return;
        }
        if (i == 2) {
            if (((AtomicBoolean) this.b).getAndSet(false)) {
                ?? r02 = this.a;
                ((kzl) this.c).b.getQueueLength();
                r02.unlock();
                return;
            }
            return;
        }
        Object obj = this.b;
        synchronized (((nfh) obj).j) {
            ((nfh) obj).i = true;
        }
        Object obj2 = this.a;
        ((nfe) this.c).close();
        ((nfi) obj2).close();
    }

    public /* synthetic */ kyc(kye kyeVar, kmy kmyVar, fsf fsfVar, int i) {
        this.d = i;
        this.a = kyeVar;
        this.b = kmyVar;
        this.c = fsfVar;
    }

    public /* synthetic */ kyc(nfh nfhVar, nfe nfeVar, nfi nfiVar, int i) {
        this.d = i;
        this.b = nfhVar;
        this.c = nfeVar;
        this.a = nfiVar;
    }
}
