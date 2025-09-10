package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aji {
    public ajd a;
    public afy b;
    public aii c;
    public boolean d;
    public bpb e;
    public final uif f;
    public boolean g;
    public apg k;
    private final ajc m;
    public int h = 1;
    public aim i = aiu.b;
    public final rnu l = new rnu(this);
    public final uiq j = new np(this, 9);

    public aji(ajd ajdVar, afy afyVar, apg apgVar, aii aiiVar, boolean z, bpb bpbVar, ajc ajcVar, uif uifVar) {
        this.a = ajdVar;
        this.b = afyVar;
        this.k = apgVar;
        this.c = aiiVar;
        this.d = z;
        this.e = bpbVar;
        this.m = ajcVar;
        this.f = uifVar;
    }

    public final float a(float f) {
        return this.d ? -f : f;
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.c == aii.b ? j >> 32 : j & 4294967295L));
    }

    public final long c(aim aimVar, long j, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        long jB = this.e.b(j, i);
        long jAc = a.ac(j, jB);
        long jD = d(f(aimVar.a(b(d(e(jAc))))));
        ajc ajcVar = this.m;
        if (ajcVar.w) {
            ViewTreeObserver viewTreeObserver = ((bxv) bko.D(ajcVar)).getViewTreeObserver();
            try {
                if (bxv.d == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    bxv.d = declaredMethod;
                }
                Method method = bxv.d;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        return a.E(a.E(jB, jD), this.e.a(jD, a.ac(jAc, jD), i));
    }

    public final long d(long j) {
        return this.d ? bkf.b(j, -1.0f) : j;
    }

    public final long e(long j) {
        return bkf.d(j, this.c == aii.b ? 1 : 2);
    }

    public final long f(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.c == aii.b) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(long r12, defpackage.uhb r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.aje
            if (r0 == 0) goto L13
            r0 = r14
            aje r0 = (defpackage.aje) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aje r0 = new aje
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            ujz r12 = r0.d
            defpackage.rnt.aN(r14)     // Catch: java.lang.Throwable -> L2b
            r6 = r11
            goto L58
        L2b:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L68
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            defpackage.rnt.aN(r14)
            ujz r7 = new ujz
            r7.<init>()
            r7.a = r12
            r11.g = r4
            afs r14 = defpackage.afs.a     // Catch: java.lang.Throwable -> L65
            ajg r5 = new ajg     // Catch: java.lang.Throwable -> L65
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L63
            r0.d = r7     // Catch: java.lang.Throwable -> L63
            r0.c = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r11 = r6.i(r14, r5, r0)     // Catch: java.lang.Throwable -> L63
            if (r11 == r1) goto L62
            r12 = r7
        L58:
            r6.g = r3
            long r11 = r12.a
            cif r13 = new cif
            r13.<init>(r11)
            return r13
        L62:
            return r1
        L63:
            r0 = move-exception
            goto L67
        L65:
            r0 = move-exception
            r6 = r11
        L67:
            r12 = r0
        L68:
            r6.g = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aji.g(long, uhb):java.lang.Object");
    }

    public final Object h(long j, boolean z, uhb uhbVar) {
        if (!z) {
            long jB = cif.b(j, 0.0f, 0.0f, this.c == aii.b ? 1 : 2);
            ajh ajhVar = new ajh(this, null);
            afy afyVar = this.b;
            if (afyVar == null || !j()) {
                Object objA = ajhVar.a(new cif(jB), uhbVar);
                if (objA == uhi.a) {
                    return objA;
                }
            } else {
                Object objE = afyVar.e(jB, ajhVar, uhbVar);
                if (objE == uhi.a) {
                    return objE;
                }
            }
        }
        return ufg.a;
    }

    public final Object i(afs afsVar, uiu uiuVar, uhb uhbVar) {
        Object objB = this.a.b(afsVar, new ahq(this, uiuVar, (uhb) null, 3), uhbVar);
        return objB == uhi.a ? objB : ufg.a;
    }

    public final boolean j() {
        return this.a.d() || this.a.c();
    }

    public final boolean k() {
        return this.c == aii.a;
    }
}
