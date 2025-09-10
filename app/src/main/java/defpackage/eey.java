package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eey extends eev {
    public int b;
    public String c;
    public String d;

    public eey() {
        this.b = 2048;
        this.c = "\n";
        this.d = "  ";
    }

    @Override // defpackage.eev
    protected final int a() {
        return 4976;
    }

    public final String b() {
        return c() ? "UTF-16BE" : d() ? "UTF-16LE" : "UTF-8";
    }

    public final boolean c() {
        return (this.a & 3) == 2;
    }

    public final Object clone() {
        try {
            eey eeyVar = new eey(this.a);
            eeyVar.d = this.d;
            eeyVar.c = this.c;
            eeyVar.b = this.b;
            return eeyVar;
        } catch (edv unused) {
            return null;
        }
    }

    public final boolean d() {
        return (this.a & 3) == 3;
    }

    public final boolean i() {
        return h(512);
    }

    public final boolean j() {
        return h(256);
    }

    public final boolean k() {
        return h(16);
    }

    public final boolean l() {
        return h(32);
    }

    public eey(int i) {
        super(i);
        this.b = 2048;
        this.c = "\n";
        this.d = "  ";
    }
}
