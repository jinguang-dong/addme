package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzw {
    public String a;
    private int b;
    private int c;
    private boolean d;
    private byte e;

    public final nzx a() {
        String str;
        if (this.e != 7 || (str = this.a) == null) {
            throw new IllegalStateException();
        }
        return new nzx(this.b, str, this.c, this.d);
    }

    public final void b(int i) {
        this.c = i;
        this.e = (byte) (this.e | 2);
    }

    public final void c(int i) {
        this.b = i;
        this.e = (byte) (this.e | 1);
    }

    public final void d(boolean z) {
        this.d = z;
        this.e = (byte) (this.e | 4);
    }
}
