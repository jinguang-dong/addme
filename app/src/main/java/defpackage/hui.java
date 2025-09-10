package defpackage;

import com.google.android.apps.camera.jni.serengeti.SerengetiNative;
import java.io.File;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hui implements paq {
    public static final sgv a = sgv.g("hui");
    private final llm A;
    private final boolean B;
    private long C;
    private final EnumMap D;
    private final int E;
    public final tdi b;
    public final iat c;
    public final pbn d;
    public final uhf e;
    public final int f;
    public final hux g;
    public final huw h;
    public final tcd i;
    public final float j;
    public final und k;
    public final Set l;
    public final List m;
    public final File n;
    public final uol o;
    public long p;
    public int q;
    public final List r;
    public boolean s;
    public final SerengetiNative t;
    public final luj u;
    public hxu v;
    public final hbj w;
    public final mdy x;
    public gga y;
    private final rwc z;

    public final Integer a(iby ibyVar) {
        Integer numValueOf;
        synchronized (this) {
            int iIndexOf = this.m.indexOf(Integer.valueOf(ibyVar.a()));
            numValueOf = iIndexOf != -1 ? Integer.valueOf(iIndexOf) : null;
        }
        return numValueOf;
    }

    public final uev b(float[] fArr, hue hueVar) {
        nng nngVar = new nng();
        ojl.bc(fArr, nngVar);
        if (!this.h.b()) {
            EnumMap enumMap = this.D;
            if (!enumMap.containsKey(hueVar)) {
                nng nngVar2 = new nng();
                nngVar2.a = -nngVar.a;
                nngVar2.b = -nngVar.b;
                nngVar2.c = -nngVar.c;
                nngVar2.d = nngVar.d;
                enumMap.put((EnumMap) hueVar, (hue) nngVar2);
            }
            nng nngVar3 = (nng) enumMap.get(hueVar);
            nngVar3.getClass();
            nng nngVar4 = new nng();
            double d = nngVar.a;
            double d2 = nngVar3.d;
            double d3 = d * d2;
            double d4 = nngVar.d;
            double d5 = nngVar3.a * d4;
            double d6 = nngVar.b;
            double d7 = nngVar3.c;
            double d8 = nngVar.c;
            double d9 = nngVar3.b;
            double d10 = ((d3 + d5) + (d6 * d7)) - (d8 * d9);
            nngVar4.a = d10;
            double d11 = d9 * d4;
            double d12 = nngVar3.a;
            double d13 = d8 * d12;
            double d14 = nngVar.a;
            double d15 = (((d6 * d2) + d11) + d13) - (d14 * d7);
            nngVar4.b = d15;
            double d16 = nngVar3.b;
            double d17 = d14 * d16;
            double d18 = nngVar.b;
            double d19 = (((d8 * d2) + (d7 * d4)) + d17) - (d18 * d12);
            nngVar4.c = d19;
            double d20 = (((d4 * d2) - (d14 * d12)) - (d18 * d16)) - (nngVar3.c * nngVar.c);
            nngVar4.d = d20;
            double dSqrt = Math.sqrt((d10 * d10) + (d15 * d15) + (d19 * d19) + (d20 * d20));
            if (dSqrt > 0.0d) {
                double d21 = 1.0d / dSqrt;
                nngVar4.a *= d21;
                nngVar4.b *= d21;
                nngVar4.c *= d21;
                nngVar4.d *= d21;
            }
            nngVar = nngVar4;
        }
        float[] fArr2 = new float[3];
        ojl.bd(nngVar, fArr2);
        float[] fArr3 = new float[16];
        nngVar.b(fArr3);
        return new uev(new ulm(fArr3, 1), new ulm(fArr2, 1));
    }

    public final void c() {
        try {
            List list = this.r;
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw null;
            }
            list.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.s) {
                return;
            }
            this.s = true;
            this.o.s(null);
            if (this.m.isEmpty()) {
                this.x.q(g(3));
                f();
            } else {
                e();
            }
        }
    }

    public final void d(iby ibyVar) {
        synchronized (this) {
            if (this.m.isEmpty()) {
                this.y = null;
                this.v = null;
            }
            this.l.remove(Integer.valueOf(ibyVar.a()));
            e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        synchronized (this) {
            if (this.l.isEmpty() && this.s) {
                gga ggaVar = this.y;
                lss lssVar = ggaVar != null ? ggaVar.b : null;
                if (lssVar == null) {
                    ((sgt) a.c().M(1595)).s("Capture session is null. Aborting.");
                } else {
                    this.d.f("Panorama processing");
                    this.C = System.currentTimeMillis();
                    lme lmeVar = new lme(lssVar);
                    this.A.a(lmeVar);
                    ukc.C(this.k, null, 0, new huf(this, lmeVar, null), 3);
                }
            }
        }
    }

    public final void f() {
        synchronized (this) {
            c();
            ung.k(this.k, null);
        }
    }

    public final sti g(int i) {
        tpc tpcVarM = sti.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sti stiVar = (sti) tphVar;
        stiVar.c = i - 1;
        stiVar.b |= 1;
        int i2 = this.q;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        sti stiVar2 = (sti) tpcVarM.b;
        stiVar2.b |= 2;
        stiVar2.d = i2;
        int i3 = this.h.a(true).h;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sti stiVar3 = (sti) tpcVarM.b;
        stiVar3.e = a.as(i3);
        stiVar3.b |= 4;
        int i4 = this.E;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        sti stiVar4 = (sti) tphVar2;
        stiVar4.f = i4 - 1;
        stiVar4.b |= 8;
        boolean z = this.B;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        sti stiVar5 = (sti) tpcVarM.b;
        stiVar5.b |= 16;
        stiVar5.g = z;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.p;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sti stiVar6 = (sti) tpcVarM.b;
        stiVar6.b |= 32;
        stiVar6.h = jCurrentTimeMillis;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.C;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sti stiVar7 = (sti) tpcVarM.b;
        stiVar7.b |= 64;
        stiVar7.i = jCurrentTimeMillis2;
        tph tphVarL = tpcVarM.l();
        tphVarL.getClass();
        return (sti) tphVarL;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hui(com.google.android.apps.camera.jni.serengeti.SerengetiNative r1, defpackage.tdi r2, defpackage.iat r3, defpackage.pbn r4, defpackage.hbj r5, defpackage.rwc r6, defpackage.llm r7, defpackage.uhf r8, defpackage.luj r9, defpackage.mdy r10, int r11, defpackage.hux r12, defpackage.huw r13, boolean r14, defpackage.tcd r15, float r16) {
        /*
            r0 = this;
            r0.<init>()
            r0.t = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.w = r5
            r0.z = r6
            r0.A = r7
            r0.e = r8
            r0.u = r9
            r0.x = r10
            r0.f = r11
            r0.g = r12
            r0.h = r13
            r0.B = r14
            r0.i = r15
            r1 = r16
            r0.j = r1
            und r1 = defpackage.ung.j(r8)
            r0.k = r1
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r0.l = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.m = r2
            java.io.File r2 = new java.io.File
            java.lang.Object r3 = r6.f()
            java.io.File r3 = (java.io.File) r3
            java.lang.String r4 = "pano"
            r2.<init>(r3, r4)
            r0.n = r2
            luu r2 = defpackage.luf.M
            java.lang.Object r2 = r9.b(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            r4 = 3551(0xddf, float:4.976E-42)
            r5 = 2
            r6 = 1
            if (r3 == r4) goto L7d
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L71
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 == r4) goto L66
        L64:
            r2 = r6
            goto L86
        L66:
            java.lang.String r3 = "auto"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6f
            goto L64
        L6f:
            r2 = 3
            goto L86
        L71:
            r3 = 0
            java.lang.String r3 = com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ.wZH
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L7b
            goto L64
        L7b:
            r2 = r5
            goto L86
        L7d:
            java.lang.String r3 = "on"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L64
            r2 = 4
        L86:
            r0.E = r2
            htc r2 = new htc
            r3 = 0
            r2.<init>(r0, r3, r5)
            uol r1 = defpackage.ukc.C(r1, r3, r5, r2, r6)
            r0.o = r1
            java.util.EnumMap r1 = new java.util.EnumMap
            java.lang.Class<hue> r2 = defpackage.hue.class
            r1.<init>(r2)
            r0.D = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.r = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hui.<init>(com.google.android.apps.camera.jni.serengeti.SerengetiNative, tdi, iat, pbn, hbj, rwc, llm, uhf, luj, mdy, int, hux, huw, boolean, tcd, float):void");
    }
}
