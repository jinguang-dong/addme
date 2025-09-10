package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jal {
    public long a;

    public jal() {
        this.a = 0L;
    }

    public final long a() {
        return Math.max(0L, this.a - System.nanoTime());
    }

    public jal(long j) {
        this.a = j;
    }

    public jal(byte[] bArr) {
    }
}
