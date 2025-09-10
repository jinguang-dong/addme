package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bth implements btg {
    private final String a;
    private final btw b;
    private final brp c;
    private final btw d;
    private final brp e;
    private final /* synthetic */ int f;

    public bth(String str, int i) {
        this.f = i;
        this.a = str;
        this.b = new btw();
        this.c = new brp();
        this.d = new btw();
        this.e = new brp();
    }

    @Override // defpackage.btg
    public final btw c() {
        int i = this.f;
        return this.b;
    }

    @Override // defpackage.btg
    public final btw d() {
        int i = this.f;
        return this.d;
    }

    @Override // defpackage.btg
    public final brp e() {
        int i = this.f;
        return this.e;
    }

    @Override // defpackage.btg
    public final brp f() {
        int i = this.f;
        return this.c;
    }

    public final String toString() {
        if (this.f != 0) {
            return this.a;
        }
        return "RectRulers(" + this.a + ')';
    }

    public bth(String str, int i, byte[] bArr) {
        this.f = i;
        this.a = str;
        this.b = new btw(new brg(3));
        this.c = new brp(new brg(5));
        this.d = new btw(new brg(4));
        this.e = new brp(new brg(2));
    }
}
