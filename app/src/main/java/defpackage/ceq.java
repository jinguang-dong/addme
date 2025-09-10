package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ceq {
    public final int a;

    public ceq(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ceq) && this.a == ((ceq) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.a + ')';
    }
}
