package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vm {
    public final uif a;
    public final Object b;
    public int c;
    public uol d;
    public boolean e;
    private final und f;

    public vm(und undVar, uif uifVar) {
        this.f = undVar;
        this.a = uifVar;
        Object obj = new Object();
        this.b = obj;
        synchronized (obj) {
            a();
        }
    }

    public final void a() {
        this.d = ukc.C(this.f, null, 0, new si(this, (uhb) null, 7), 3);
    }

    public final void b() {
        synchronized (this.b) {
            if (this.e) {
                return;
            }
            this.e = true;
            uol uolVar = this.d;
            if (uolVar != null) {
                uolVar.s(null);
            }
            this.d = null;
            ukc.C(this.f, null, 0, new vl(this, (uhb) null, 0), 3);
        }
    }
}
