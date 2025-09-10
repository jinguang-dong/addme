package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpb {
    private final joc a;
    private final rwc b;
    private boolean c = false;
    private boolean d = false;
    private boolean e = true;
    private boolean f = false;

    public jpb(joc jocVar, rwc rwcVar) {
        this.a = jocVar;
        this.b = rwcVar;
    }

    private final void c() {
        boolean z = this.e || this.f;
        if (this.d == z && this.c) {
            return;
        }
        this.c = true;
        if (z) {
            this.a.j();
            rwc rwcVar = this.b;
            if (rwcVar.h()) {
                ((hoq) rwcVar.c()).b(true);
            }
        } else {
            this.a.j();
            rwc rwcVar2 = this.b;
            if (rwcVar2.h()) {
                ((hoq) rwcVar2.c()).b(false);
            }
        }
        this.d = z;
    }

    public final synchronized void a(boolean z) {
        this.e = z;
        c();
    }

    public final synchronized void b(boolean z) {
        this.f = z;
        c();
    }
}
