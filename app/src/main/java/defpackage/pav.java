package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pav {
    final String a;
    private boolean b = false;

    public pav(String str) {
        this.a = str;
    }

    public final synchronized boolean a() {
        return this.b;
    }

    public final synchronized void b() {
        if (this.b) {
            return;
        }
        System.loadLibrary(this.a);
        this.b = true;
    }
}
