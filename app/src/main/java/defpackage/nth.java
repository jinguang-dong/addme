package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nth {
    public long a;
    public long b;
    public boolean c;
    public final pbc d;

    public nth(pbc pbcVar) {
        this.d = pbcVar;
    }

    public final long a() {
        return this.c ? (this.b + System.currentTimeMillis()) - this.a : this.b;
    }

    public final void b() {
        if (this.c) {
            this.d.h("onSessionStart failed because session is already started!");
        } else {
            this.c = true;
            this.a = System.currentTimeMillis();
        }
    }
}
