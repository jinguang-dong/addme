package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class eev {
    public int a = 0;

    public eev() {
    }

    private final void b(int i) throws edv {
        int i2 = (~a()) & i;
        if (i2 == 0) {
            e(i);
            return;
        }
        throw new edv("The option bit(s) 0x" + Integer.toHexString(i2) + " are invalid!", 103);
    }

    protected abstract int a();

    public final boolean equals(Object obj) {
        return this.a == ((eev) obj).a;
    }

    public final void f(int i, boolean z) {
        int i2;
        if (z) {
            i2 = i | this.a;
        } else {
            i2 = (~i) & this.a;
        }
        this.a = i2;
    }

    public final void g(int i) throws edv {
        b(i);
        this.a = i;
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "0x".concat(String.valueOf(Integer.toHexString(this.a)));
    }

    public eev(int i) throws edv {
        b(i);
        g(i);
    }

    protected void e(int i) {
    }
}
