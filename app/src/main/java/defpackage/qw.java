package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class qw {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof qw) && this.a == ((qw) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "SensorPixelMode(value=" + this.a + ')';
    }
}
