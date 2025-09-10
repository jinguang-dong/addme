package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbn {
    public final Long a;

    public qbn(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qbn) {
            return this.a.equals(((qbn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
