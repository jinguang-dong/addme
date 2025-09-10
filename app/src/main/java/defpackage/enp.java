package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class enp implements Runnable {
    final /* synthetic */ RuntimeException a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ enr e;

    public enp(enr enrVar, RuntimeException runtimeException, String str, int i, int i2) {
        this.e = enrVar;
        this.a = runtimeException;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a.b(this.a, this.b, this.c, this.d);
    }
}
