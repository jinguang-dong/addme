package defpackage;

import java.util.Map;

/* compiled from: PG */
@ueo
/* loaded from: classes.dex */
public final class aus {
    public final aby a;
    public final uiq b;
    public final azr c;
    public final azr d;
    public final urk e;
    public float f;
    public float g;
    public final azr h;
    public final azr i;
    public final bbb j;
    public final bbb k;
    public final bbb l;
    public final bbb m;
    public final got n;
    private final azr o;
    private final azr p;

    public aus(Object obj, aby abyVar, uiq uiqVar) {
        this.a = abyVar;
        this.b = uiqVar;
        bap bapVar = bap.c;
        this.o = new azz(obj, bapVar);
        this.p = new azz(false, bapVar);
        this.j = new azv(0.0f);
        this.k = new azv(0.0f);
        this.l = new azv(0.0f);
        this.c = new azz(null, bapVar);
        this.d = new azz(ufx.a, bapVar);
        this.e = new usa(new aur(byi.ai(new apa(this, 5))));
        this.f = Float.NEGATIVE_INFINITY;
        this.g = Float.POSITIVE_INFINITY;
        this.h = new azz(new ane(3), bapVar);
        this.m = new azv(0.0f);
        this.i = new azz(null, bapVar);
        arc arcVar = new arc(this, 2);
        uiv uivVar = ahp.a;
        this.n = new got(arcVar);
    }

    public final Object a(float f, aby abyVar, uhb uhbVar) throws Throwable {
        Object objX = this.n.x(afs.a, new dnr(this, f, abyVar, (uhb) null, 1), uhbVar);
        return objX == uhi.a ? objX : ufg.a;
    }

    public final Object b(Object obj, aby abyVar, uhb uhbVar) {
        Object objGc = this.e.gc(new auj(obj, this, abyVar), uhbVar);
        return objGc == uhi.a ? objGc : ufg.a;
    }

    public final Object c() {
        return this.o.a();
    }

    public final Object d() {
        float fT;
        Float f = (Float) this.c.a();
        if (f != null) {
            fT = f.floatValue();
        } else {
            bbb bbbVar = this.j;
            float fFloatValue = bbbVar.a().floatValue();
            Float fU = bay.U(g(), c());
            fT = bay.T(fFloatValue, fU != null ? fU.floatValue() : bbbVar.a().floatValue(), g().keySet(), h(), 0.0f, Float.POSITIVE_INFINITY);
        }
        Object obj = g().get(Float.valueOf(fT));
        return obj == null ? c() : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (f(r10, r0) == r1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a4, code lost:
    
        if (r12 == r1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e0, code lost:
    
        if (r12 != r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e2, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v43, types: [float] */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.util.Map r10, java.util.Map r11, defpackage.uhb r12) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aus.e(java.util.Map, java.util.Map, uhb):java.lang.Object");
    }

    public final Object f(float f, uhb uhbVar) throws Throwable {
        Object objX = this.n.x(afs.a, new aum(f, this, null), uhbVar);
        return objX == uhi.a ? objX : ufg.a;
    }

    public final Map g() {
        return (Map) this.d.a();
    }

    public final uiu h() {
        return (uiu) this.h.a();
    }

    public final void i(boolean z) {
        this.p.b(Boolean.valueOf(z));
    }

    public final void j(Object obj) {
        this.o.b(obj);
    }

    public final boolean k() {
        return ((Boolean) this.p.a()).booleanValue();
    }
}
