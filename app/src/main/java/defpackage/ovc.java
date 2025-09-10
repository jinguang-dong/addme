package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovc {
    public String a;
    public boolean b;
    public byte c;
    public ojl d;
    private int e;
    private int f;

    public final ovd a() {
        String str;
        ojl ojlVar;
        if (this.c != 7 || (str = this.a) == null || (ojlVar = this.d) == null) {
            throw new IllegalStateException();
        }
        return new ovd(this.e, str, this.f, this.b, ojlVar);
    }

    public final void b(int i) {
        this.f = i;
        this.c = (byte) (this.c | 2);
    }

    public final void c(int i) {
        this.e = i;
        this.c = (byte) (this.c | 1);
    }
}
