package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qji {
    public static int a = -1;
    public final int b;
    public final qkr c;
    public final qju d;
    public final qkl j;
    public final Map e = new HashMap();
    public final Map f = new HashMap();
    public final List g = new ArrayList();
    public int[] h = null;
    private final List k = new ArrayList();
    public boolean i = true;

    public qji(int i, qkr qkrVar, qju qjuVar, qkl qklVar) {
        boolean z = true;
        a.I(qkrVar.a.b == qklVar.b);
        if (qjuVar != null && qjuVar.a.b != qklVar.b) {
            z = false;
        }
        a.I(z);
        this.b = i;
        this.c = qkrVar;
        this.d = qjuVar;
        this.j = qklVar;
    }

    public static tym l(qkr qkrVar) {
        a.I(qkrVar.c >= 3);
        return new tym(5, qkrVar, (qju) null);
    }

    public static tym m(qkr qkrVar, qju qjuVar) {
        a.I(qjuVar.b % 3 == 0);
        return new tym(4, qkrVar, qjuVar);
    }

    public static tym n(int i, qkr qkrVar) {
        a.I(qkrVar.c > 0);
        return new tym(i, qkrVar, (qju) null);
    }

    public final void a(qim qimVar) {
        a.I(qimVar.b == this.j.b);
        qimVar.g(new itd(7), new qiy(this)).g(qfs.a);
    }

    public final void b() {
        this.k.add(3042);
    }

    public final void c(String str, int i) {
        a.I(i < this.c.b.length);
        this.f.put(str, Integer.valueOf(i));
    }

    public final void d(String str, qjn qjnVar) {
        a.I(qjnVar.b == this.j.b);
        this.g.add(new qjg(this, qjnVar, str));
    }

    public final void e(String str, qko qkoVar) {
        a.I(qkoVar.b == this.j.b);
        this.g.add(new qjg(this, qkoVar, str));
    }

    public final void f(String str, float f) {
        this.e.put(str, new qja(str, f));
    }

    public final void g(String str, float[] fArr) {
        this.e.put(str, new qje(str, fArr, 1));
    }

    public final void h(String str, float f, float f2) {
        this.e.put(str, new qjb(str, f, f2));
    }

    public final void i(String str, float f, float f2, float f3) {
        this.e.put(str, new qjc(str, f, f2, f3));
    }

    public final void j(String str, float f, float f2, float f3, float f4) {
        this.e.put(str, new qjd(str, f, f2, f3, f4));
    }

    public final void k(int i, int i2, int i3, int i4) {
        this.h = new int[]{i, i2, i3, i4};
    }
}
