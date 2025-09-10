package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hkm implements kiz {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public hkm(hkn hknVar, hkk hkkVar, int i) {
        this.c = i;
        this.a = hkkVar;
        this.b = hknVar;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.kiz
    public final syu a() {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                syv syvVar = new syv(new fsu(this, this.b, 4, null));
                ((hjv) this.a).a.execute(syvVar);
                return syvVar;
            }
            final szh szhVar = new szh();
            final ?? r2 = this.b;
            ((idr) this.a).h.c.execute(new Runnable() { // from class: idq
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable = r2;
                    szh szhVar2 = szhVar;
                    try {
                        runnable.run();
                    } finally {
                        szhVar2.e(true);
                    }
                }
            });
            return szhVar;
        }
        hkn hknVar = (hkn) this.b;
        boolean z = hknVar.c;
        if (hknVar.c) {
            return ske.M(false);
        }
        Object obj = this.a;
        Object obj2 = ((hkk) obj).a;
        syv syvVar2 = new syv(new fsu(this, obj, 5));
        hknVar.a.execute(hknVar.b.c("Deeprestore-RGB", syvVar2));
        return syvVar2;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, poj] */
    @Override // defpackage.kiz
    public final syu b() {
        int i = this.c;
        return i != 0 ? i != 1 ? ske.L(new pco()) : ske.M(new hjt(((hkk) this.b).a)) : ske.M(false);
    }

    public hkm(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }
}
