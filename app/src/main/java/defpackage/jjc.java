package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjc {
    public String a;
    public Rect b;
    public rwc c;
    public rwc d;
    public int e;
    public int f;
    private ssc g;
    private boolean h;
    private float i;
    private String j;
    private boolean k;
    private boolean l;
    private boolean m;
    private float n;
    private boolean o;
    private boolean p;
    private boolean q;
    private spr r;
    private sqq s;
    private boolean t;
    private spo u;
    private boolean v;
    private snw w;
    private sov x;
    private boolean y;
    private short z;

    public jjc() {
        throw null;
    }

    public final jjd a() {
        ssc sscVar;
        String str;
        String str2;
        Rect rect;
        int i;
        spr sprVar;
        sqq sqqVar;
        spo spoVar;
        snw snwVar;
        sov sovVar;
        if (this.z != 4095 || (sscVar = this.g) == null || (str = this.a) == null || (str2 = this.j) == null || (rect = this.b) == null || (i = this.f) == 0 || (sprVar = this.r) == null || (sqqVar = this.s) == null || (spoVar = this.u) == null || (snwVar = this.w) == null || (sovVar = this.x) == null || this.e == 0) {
            throw new IllegalStateException();
        }
        return new jjd(sscVar, str, this.h, this.i, str2, this.k, this.l, this.m, this.n, this.o, rect, this.p, this.q, i, sprVar, this.c, sqqVar, this.t, spoVar, this.v, this.d, snwVar, sovVar, this.y);
    }

    public final void b(boolean z) {
        this.k = z;
        this.z = (short) (this.z | 4);
    }

    public final void c(snw snwVar) {
        snwVar.getClass();
        this.w = snwVar;
    }

    public final void d(sov sovVar) {
        sovVar.getClass();
        this.x = sovVar;
    }

    public final void e(spo spoVar) {
        spoVar.getClass();
        this.u = spoVar;
    }

    public final void f(spr sprVar) {
        sprVar.getClass();
        this.r = sprVar;
    }

    public final void g(String str) {
        str.getClass();
        this.j = str;
    }

    public final void h(sqq sqqVar) {
        sqqVar.getClass();
        this.s = sqqVar;
    }

    public final void i(boolean z) {
        this.h = z;
        this.z = (short) (this.z | 1);
    }

    public final void j(boolean z) {
        this.l = z;
        this.z = (short) (this.z | 8);
    }

    public final void k(boolean z) {
        this.t = z;
        this.z = (short) (this.z | 512);
    }

    public final void l(boolean z) {
        this.p = z;
        this.z = (short) (this.z | 128);
    }

    public final void m(ssc sscVar) {
        sscVar.getClass();
        this.g = sscVar;
    }

    public final void n(boolean z) {
        this.q = z;
        this.z = (short) (this.z | 256);
    }

    public final void o(boolean z) {
        this.m = z;
        this.z = (short) (this.z | 16);
    }

    public final void p(boolean z) {
        this.v = z;
        this.z = (short) (this.z | 1024);
    }

    public final void q(float f) {
        this.n = f;
        this.z = (short) (this.z | 32);
    }

    public final void r(boolean z) {
        this.y = z;
        this.z = (short) (this.z | 2048);
    }

    public final void s(boolean z) {
        this.o = z;
        this.z = (short) (this.z | 64);
    }

    public final void t(float f) {
        this.i = f;
        this.z = (short) (this.z | 2);
    }

    public jjc(byte[] bArr) {
        rvk rvkVar = rvk.a;
        this.c = rvkVar;
        this.d = rvkVar;
    }
}
