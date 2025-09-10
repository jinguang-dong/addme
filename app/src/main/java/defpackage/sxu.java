package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxu implements sxh {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public sxu(rso rsoVar, sxh sxhVar, int i) {
        this.c = i;
        this.b = rsoVar;
        this.a = sxhVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, rso] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, sxh] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, sxh] */
    @Override // defpackage.sxh
    public final syu a() {
        if (this.c == 0) {
            return !((sxw) this.a).compareAndSet(sxv.NOT_RUN, sxv.STARTED) ? ske.K() : this.b.a();
        }
        ?? r0 = this.b;
        rsn rsnVarA = rsa.a();
        rso rsoVarC = rsa.c(rsnVarA, r0);
        try {
            syu syuVarA = this.a.a();
            rsa.c(rsnVarA, rsoVarC);
            syuVarA.getClass();
            return syuVarA;
        } finally {
        }
    }

    public final String toString() {
        if (this.c == 0) {
            return this.b.toString();
        }
        return "propagating=[" + this.a + "]";
    }

    public sxu(sxw sxwVar, sxh sxhVar, int i) {
        this.c = i;
        this.a = sxwVar;
        this.b = sxhVar;
    }
}
