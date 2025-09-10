package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sha implements shi, sid {
    private static final String a = new String();
    public final long b;
    public sgz c;
    public shq d;
    private final Level e;
    private shd f;
    private sjf g;
    private Object[] h;

    protected sha(Level level) {
        long jB = sjd.b();
        this.c = null;
        this.f = null;
        this.d = null;
        this.g = null;
        this.h = null;
        level.getClass();
        this.e = level;
        this.b = jB;
    }

    private final void R(String str, Object... objArr) {
        this.h = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof ijm) {
                ijm ijmVar = (ijm) obj;
                ijo ijoVar = ijmVar.a;
                objArr[i] = ezh.O(ijmVar.b, ijoVar.a, ijoVar.d.k());
            }
        }
        if (str != a) {
            this.g = new sjf(a(), str);
        }
        skl sklVarK = sjd.k();
        if (!sklVarK.a()) {
            sij sijVarK = k();
            shl shlVar = sgy.h;
            skl sklVar = (skl) sijVarK.d(shlVar);
            if (sklVar != null && !sklVar.a()) {
                sklVarK = sklVarK.a() ? sklVar : new skl(new skj(sklVarK.c, sklVar.c));
            }
            p(shlVar, sklVarK);
        }
        sgm sgmVarC = c();
        try {
            sky skyVarA = sky.a();
            int i2 = skyVarA.a + 1;
            skyVarA.a = i2;
            if (i2 == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i2 <= 100) {
                    sgmVarC.a.c(this);
                } else {
                    sgm.d("unbounded recursion in log statement", this);
                }
                if (skyVarA != null) {
                    skyVarA.close();
                }
            } finally {
            }
        } catch (RuntimeException e) {
            try {
                sgmVarC.a.b(e, this);
            } catch (sig e2) {
                throw e2;
            } catch (RuntimeException e3) {
                sgm.d(e3.getClass().getName() + ": " + e3.getMessage(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private final boolean S() {
        she sheVarB;
        sgz sgzVar;
        int i;
        if (this.f == null) {
            this.f = sjd.g().a(sha.class, 1);
        }
        if (this.f != shd.a) {
            sheVarB = this.f;
            sgz sgzVar2 = this.c;
            if (sgzVar2 != null && (i = sgzVar2.b) > 0) {
                sheVarB.getClass();
                for (int i2 = 0; i2 < i; i2++) {
                    if (sgy.f.equals(sgzVar2.c(i2))) {
                        Object objE = sgzVar2.e(i2);
                        sheVarB = objE instanceof shj ? ((shj) objE).b() : new shu(sheVarB, objE);
                    }
                }
            }
        } else {
            sheVarB = null;
        }
        boolean zB = b(sheVarB);
        shq shqVar = this.d;
        if (shqVar == null) {
            return zB;
        }
        shp shpVar = (shp) shp.a.b(sheVarB, this.c);
        int iIncrementAndGet = shpVar.c.incrementAndGet();
        int i3 = -1;
        if (shqVar != shq.c && shpVar.b.compareAndSet(false, true)) {
            try {
                shqVar.a();
                shpVar.b.set(false);
                shpVar.c.addAndGet(-iIncrementAndGet);
                i3 = (-1) + iIncrementAndGet;
            } catch (Throwable th) {
                shpVar.b.set(false);
                throw th;
            }
        }
        if (zB && i3 > 0 && (sgzVar = this.c) != null) {
            sgzVar.f(sgy.e, Integer.valueOf(i3));
        }
        return zB & (i3 >= 0);
    }

    @Override // defpackage.shi
    public final void A(String str, long j, long j2) {
        if (S()) {
            R(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    @Override // defpackage.shi
    public final void B(String str, long j, Object obj) {
        if (S()) {
            R(str, Long.valueOf(j), obj);
        }
    }

    @Override // defpackage.shi
    public final void C(String str, Object obj, int i) {
        if (S()) {
            R(str, obj, Integer.valueOf(i));
        }
    }

    @Override // defpackage.shi
    public final void D(String str, Object obj, long j) {
        if (S()) {
            R(str, obj, Long.valueOf(j));
        }
    }

    @Override // defpackage.shi
    public final void E(String str, Object obj, Object obj2) {
        if (S()) {
            R(str, obj, obj2);
        }
    }

    @Override // defpackage.shi
    public final void F(String str, Object obj, boolean z) {
        if (S()) {
            R(str, obj, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.shi
    public final void G(String str, Object obj, Object obj2, Object obj3) {
        if (S()) {
            R(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.shi
    public final void H(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (S()) {
            R(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // defpackage.shi
    public final void I(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (S()) {
            R(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // defpackage.shi
    public final void J(String str, Object[] objArr) {
        if (S()) {
            R(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.sid
    public final boolean K() {
        return this.c != null && Boolean.TRUE.equals(this.c.d(sgy.g));
    }

    @Override // defpackage.sid
    public final Object[] L() {
        ske.g(this.g != null, "cannot get arguments unless a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr;
        }
        throw new IllegalStateException("cannot get arguments before calling log()");
    }

    @Override // defpackage.shi
    public final shi M(int i) {
        shd shdVar = shd.a;
        shc shcVar = new shc(i);
        if (this.f == null) {
            this.f = shcVar;
        }
        return d();
    }

    @Override // defpackage.shi
    public final void N(float f, float f2) {
        if (S()) {
            R("Avoiding b/115930193, modeListWidth=%g myWidth=%g", Float.valueOf(f), Float.valueOf(f2));
        }
    }

    @Override // defpackage.shi
    public final void O(float f, Object obj) {
        if (S()) {
            R("Focal length needed = %g / available: %s", Float.valueOf(f), obj);
        }
    }

    @Override // defpackage.shi
    public final void P(boolean z, Object obj) {
        if (S()) {
            R("Setting Auto Night Sight allowed to %s for mode %s", Boolean.valueOf(z), obj);
        }
    }

    @Override // defpackage.shi
    public final void Q() {
        if (K()) {
            return;
        }
        c().e(this.e);
    }

    protected abstract skt a();

    protected boolean b(she sheVar) {
        throw null;
    }

    protected abstract sgm c();

    protected abstract shi d();

    @Override // defpackage.sid
    public final long e() {
        return this.b;
    }

    @Override // defpackage.sid
    public final shd f() {
        shd shdVar = this.f;
        if (shdVar != null) {
            return shdVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.shi
    public final shi g(int i, TimeUnit timeUnit) {
        if (!K()) {
            shl shlVar = sgy.d;
            shf shfVar = sgr.a;
            p(shlVar, new sgq(i, timeUnit));
        }
        return d();
    }

    @Override // defpackage.shi
    public final shi h(shl shlVar, Object obj) {
        shlVar.getClass();
        if (obj != null) {
            p(shlVar, obj);
        }
        return d();
    }

    @Override // defpackage.shi
    public final shi i(Throwable th) {
        return h(sgy.a, th);
    }

    @Override // defpackage.shi
    public final shi j(shw shwVar) {
        shwVar.getClass();
        if (shwVar != shw.NONE) {
            p(sgy.i, shwVar);
        }
        return d();
    }

    @Override // defpackage.sid
    public final sij k() {
        sgz sgzVar = this.c;
        return sgzVar != null ? sgzVar : sii.a;
    }

    @Override // defpackage.sid
    public final sjf l() {
        return this.g;
    }

    @Override // defpackage.sid
    public final Object m() {
        ske.g(this.g == null, "cannot get literal argument if a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr[0];
        }
        throw new IllegalStateException("cannot get literal argument before calling log()");
    }

    @Override // defpackage.sid
    public final String n() {
        return c().a.a();
    }

    @Override // defpackage.sid
    public final Level o() {
        return this.e;
    }

    protected final void p(shl shlVar, Object obj) {
        if (this.c == null) {
            this.c = new sgz();
        }
        this.c.f(shlVar, obj);
    }

    @Override // defpackage.shi
    public final void q() {
        if (S()) {
            R(a, "");
        }
    }

    @Override // defpackage.shi
    public final void r(Object obj) {
        if (S()) {
            R("%s", obj);
        }
    }

    @Override // defpackage.shi
    public final void s(String str) {
        if (S()) {
            R(a, str);
        }
    }

    @Override // defpackage.shi
    public final void t(String str, int i) {
        if (S()) {
            R(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.shi
    public final void u(String str, long j) {
        if (S()) {
            R(str, Long.valueOf(j));
        }
    }

    @Override // defpackage.shi
    public final void v(String str, Object obj) {
        if (S()) {
            R(str, obj);
        }
    }

    @Override // defpackage.shi
    public final void w(String str, int i, int i2) {
        if (S()) {
            R(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // defpackage.shi
    public final void x(String str, int i, long j) {
        if (S()) {
            R(str, Integer.valueOf(i), Long.valueOf(j));
        }
    }

    @Override // defpackage.shi
    public final void y(String str, int i, Object obj) {
        if (S()) {
            R(str, Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.shi
    public final void z(String str, int i, boolean z) {
        if (S()) {
            R(str, Integer.valueOf(i), Boolean.valueOf(z));
        }
    }
}
