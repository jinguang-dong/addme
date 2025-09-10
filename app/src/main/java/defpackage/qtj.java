package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtj {
    public int a;
    public boolean b;
    public byte c;
    public int d;
    public Object e;

    public qtj() {
        throw null;
    }

    public final qtk a() {
        int i;
        if (this.c != 127 || (i = this.d) == 0) {
            throw new IllegalStateException();
        }
        return new qtk(i, this.a, (rwc) this.e, this.b);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, syx] */
    public final qnk b() {
        if (this.c != 7) {
            throw new IllegalStateException();
        }
        qnk qnkVar = new qnk(this.e, this.a, this.d, this.b);
        rnt.N(qnkVar.c > 0, "Thread pool size must be less than or equal to %s", 2);
        return qnkVar;
    }

    public qtj(byte[] bArr) {
        this.e = rvk.a;
    }

    public qtj(char[] cArr) {
    }
}
