package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgg {
    public boolean a;
    public boolean b;

    public kgg() {
        this.a = true;
        this.b = false;
    }

    public final synchronized void a(boolean z) {
        this.b = z;
    }

    public final synchronized void b(boolean z) {
        this.a = z;
    }

    public final synchronized boolean c() {
        if (this.a) {
            if (this.b) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean d() {
        return this.a;
    }

    public kgg(byte[] bArr) {
    }
}
