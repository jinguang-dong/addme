package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvc {
    public float a;
    public byte b;
    public int c;

    public final qvd a() {
        int i;
        if (this.b != 1 || (i = this.c) == 0) {
            throw new IllegalStateException();
        }
        qvd qvdVar = new qvd(i, this.a);
        float f = qvdVar.a;
        rnt.M(f >= 0.0f && f <= 1.0f, "Probability shall be between 0 and 1.");
        return qvdVar;
    }

    public final void b(boolean z) {
        this.c = true != z ? 2 : 3;
    }
}
