package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fzq implements syf {
    private final /* synthetic */ int a;

    public fzq(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v5, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v7, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v9, types: [sgt, shi] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        int i = this.a;
        if (i == 0) {
            ((sgt) ((sgt) fzs.a.b().i(th)).M((char) 622)).s("Failed to submit a task to the executor.");
            return;
        }
        if (i == 1) {
            ((sgt) ((sgt) fze.a.b().i(th)).M((char) 598)).s("Failed to submit a task to the executor.");
        } else if (i != 2) {
            ((sgt) ((sgt) mca.a.b().i(th)).M((char) 4651)).s("Failed to submit a task to the executor.");
        } else {
            ((sgt) ((sgt) fzu.a.b().i(th)).M((char) 634)).s("Failed to submit a task to the executor.");
        }
    }

    @Override // defpackage.syf
    public final void b(Object obj) {
    }
}
