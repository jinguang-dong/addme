package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class umt {
    public final Throwable b;
    public final uly c;

    public umt(Throwable th, boolean z) {
        this.b = th;
        this.c = new uly(z, umc.a);
    }

    public final boolean a() {
        return this.c.b();
    }

    public final String toString() {
        return ung.a(this) + "[" + this.b + "]";
    }

    public /* synthetic */ umt(Throwable th) {
        this(th, false);
    }
}
