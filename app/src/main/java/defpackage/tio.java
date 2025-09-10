package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tio extends til {
    public final tjq a = new tjq(tjq.a, false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof tio) && ((tio) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
