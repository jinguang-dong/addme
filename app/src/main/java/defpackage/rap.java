package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rap {
    public String a;
    public String b;
    private int c;
    private int d;
    private byte e;

    public final raq a() {
        String str;
        String str2;
        if (this.e != 3 || (str = this.a) == null || (str2 = this.b) == null) {
            throw new IllegalStateException();
        }
        return new raq(str, str2, this.c, this.d);
    }

    public final void b(int i) {
        this.c = i;
        this.e = (byte) (this.e | 1);
    }

    public final void c(int i) {
        this.d = i;
        this.e = (byte) (this.e | 2);
    }
}
