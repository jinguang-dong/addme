package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfx {
    public rwc a;
    public rwc b;
    public rwc c;
    private sbk d;
    private sbp e;
    private sbk f;
    private sbp g;
    private rwc h;
    private rwc i;
    private sbp j;

    public rfx() {
        throw null;
    }

    public final rfy a() {
        sbk sbkVar = this.d;
        if (sbkVar != null) {
            this.e = sbkVar.g();
        } else if (this.e == null) {
            int i = sbp.d;
            this.e = sex.a;
        }
        sbk sbkVar2 = this.f;
        if (sbkVar2 != null) {
            this.g = sbkVar2.g();
        } else if (this.g == null) {
            int i2 = sbp.d;
            this.g = sex.a;
        }
        if (this.j == null) {
            int i3 = sbp.d;
            this.j = sex.a;
        }
        return new rfy(this.a, this.e, this.g, this.h, this.i, this.b, this.j, this.c);
    }

    public final sbk b() {
        if (this.d == null) {
            if (this.e == null) {
                int i = sbp.d;
                this.d = new sbk();
            } else {
                int i2 = sbp.d;
                sbk sbkVar = new sbk();
                this.d = sbkVar;
                sbkVar.j(this.e);
                this.e = null;
            }
        }
        return this.d;
    }

    public final sbk c() {
        if (this.f == null) {
            if (this.g == null) {
                int i = sbp.d;
                this.f = new sbk();
            } else {
                int i2 = sbp.d;
                sbk sbkVar = new sbk();
                this.f = sbkVar;
                sbkVar.j(this.g);
                this.g = null;
            }
        }
        return this.f;
    }

    public final void d(String str) {
        this.h = rwc.j(str);
    }

    public final void e(String str) {
        this.i = rwc.j(str);
    }

    public rfx(byte[] bArr) {
        rvk rvkVar = rvk.a;
        this.a = rvkVar;
        this.h = rvkVar;
        this.i = rvkVar;
        this.b = rvkVar;
        this.c = rvkVar;
    }
}
