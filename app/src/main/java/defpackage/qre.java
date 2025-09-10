package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qre {
    public float a;
    public int b;
    public uem c;
    public byte d;
    public int e;
    private rwc f;

    public qre() {
        throw null;
    }

    public final qrf a() {
        int i;
        if (this.d != 3 || (i = this.e) == 0) {
            throw new IllegalStateException();
        }
        qrf qrfVar = new qrf(i, this.a, this.b, this.c, this.f);
        float f = qrfVar.a;
        boolean z = false;
        if (f > 0.0f && f <= 100.0f) {
            z = true;
        }
        rnt.B(z, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        return qrfVar;
    }

    public final void b(boolean z) {
        this.e = true != z ? 2 : 3;
    }

    public qre(byte[] bArr) {
        this.f = rvk.a;
    }
}
