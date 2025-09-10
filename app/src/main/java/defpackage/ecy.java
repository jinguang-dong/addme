package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ecy {
    public static final String a = dwj.a("NetworkRequestCompat");
    public final Object b;

    public ecy() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ecy) && a.ao(this.b, ((ecy) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.b + ')';
    }

    public ecy(Object obj) {
        this.b = obj;
    }

    public /* synthetic */ ecy(byte[] bArr) {
        this((Object) null);
    }
}
