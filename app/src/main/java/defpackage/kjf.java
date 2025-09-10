package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjf implements kle {
    final /* synthetic */ klb a;
    private final kle b;

    public kjf(klb klbVar, kle kleVar) {
        this.a = klbVar;
        this.b = kleVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.kle
    public final void a(poj pojVar, syu syuVar) {
        if (this.a.a.contains(Integer.valueOf(pojVar.a()))) {
            this.b.a(pojVar, syuVar);
        } else {
            pojVar.close();
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
