package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class quv {
    public int a;
    public float b;
    public rwc c;
    public byte d;
    public int e;

    public quv() {
        throw null;
    }

    public final quw a() {
        int i;
        if (this.d != 3 || (i = this.e) == 0) {
            throw new IllegalStateException();
        }
        quw quwVar = new quw(i, this.a, this.b, this.c);
        rnt.M(true, "Rate limit per second must be >= 0");
        float f = quwVar.a;
        rnt.M(f > 0.0f && f <= 1.0f, "Sampling Probability shall be > 0 and <= 1");
        return quwVar;
    }

    public final void b(boolean z) {
        this.e = true != z ? 2 : 3;
    }

    public quv(byte[] bArr) {
        this.c = rvk.a;
    }
}
