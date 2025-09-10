package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pff implements Runnable {
    public boolean a;
    public boolean b;
    public boolean d;
    public boolean f;
    public boolean g;
    private final pbn i;
    private final lat j;
    public ojl h = null;
    public pdo c = null;
    public poe e = null;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pbn] */
    public pff(lat latVar) {
        this.j = latVar;
        this.i = latVar.c;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        ojl ojlVar = this.h;
        ojlVar.getClass();
        if (this.a) {
            ojlVar.dI();
        }
        if (this.b) {
            pbn pbnVar = this.i;
            pbnVar.f(String.valueOf(ojlVar.bD()).concat("#onStarted"));
            this.c.getClass();
            ojlVar.eP();
            pbnVar.g();
        }
        if (this.d) {
            ojlVar.dU(this.e);
        }
        if (this.f) {
            pbn pbnVar2 = this.i;
            pbnVar2.f(String.valueOf(ojlVar.bD()).concat("#onImages"));
            ojlVar.dJ();
            pbnVar2.g();
        }
        if (this.g) {
            pbn pbnVar3 = this.i;
            pbnVar3.f(String.valueOf(ojlVar.bD()).concat("#onComplete"));
            ojlVar.dY();
            pbnVar3.g();
        }
        this.h = null;
        this.a = false;
        this.b = false;
        this.c = null;
        this.d = false;
        this.e = null;
        this.f = false;
        this.g = false;
        ?? r0 = this.j.b;
        synchronized (r0) {
            r0.add(this);
        }
    }
}
