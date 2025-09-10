package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class unc extends ugx {
    public static final azn b = new azn();
    public final String a;

    public unc(String str) {
        super(b);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof unc) && a.ao(this.a, ((unc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.a + ")";
    }
}
