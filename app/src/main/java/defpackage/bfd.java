package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfd {
    public int a;

    public bfd() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfd) && this.a == ((bfd) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DeltaCounter(count=" + this.a + ')';
    }

    public /* synthetic */ bfd(byte[] bArr) {
        this.a = 0;
    }
}
