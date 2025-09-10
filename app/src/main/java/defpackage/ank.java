package defpackage;

import android.os.Trace;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ank implements ajd {
    public static final bgb n = bdq.q(new ane(0), new aks(4));
    public boolean a;
    public ana b;
    public boolean c;
    public final azr d;
    public float e;
    public final bti f;
    public final anq g;
    public final aoe h;
    public final aov i;
    public final aos j;
    public final azr k;
    public final azr l;
    public final amp m;
    public bvm o;
    public final khb p;
    public final cwi q;
    public final ocq r;
    public final ocq s;
    private final ajd t;
    private int u;
    private boolean v;
    private final azr w;
    private final azr x;
    private final rnu y;

    public ank() {
        this(0, 0, new amp(null));
    }

    @Override // defpackage.ajd
    public final float a(float f) {
        return this.t.a(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r5.b(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ajd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.afs r6, defpackage.uiu r7, defpackage.uhb r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ani
            if (r0 == 0) goto L13
            r0 = r8
            ani r0 = (defpackage.ani) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ani r0 = new ani
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.rnt.aN(r8)
            goto L5b
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r7 = r0.a
            afs r6 = r0.e
            defpackage.rnt.aN(r8)
            goto L4b
        L3a:
            defpackage.rnt.aN(r8)
            anq r8 = r5.g
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.d(r0)
            if (r8 == r1) goto L5e
        L4b:
            ajd r5 = r5.t
            r8 = 0
            r0.e = r8
            r0.a = r8
            r0.d = r3
            java.lang.Object r5 = r5.b(r6, r7, r0)
            if (r5 != r1) goto L5b
            goto L5e
        L5b:
            ufg r5 = defpackage.ufg.a
            return r5
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ank.b(afs, uiu, uhb):java.lang.Object");
    }

    @Override // defpackage.ajd
    public final boolean c() {
        return ((Boolean) this.x.a()).booleanValue();
    }

    @Override // defpackage.ajd
    public final boolean d() {
        return ((Boolean) this.w.a()).booleanValue();
    }

    @Override // defpackage.ajd
    public final boolean e() {
        return this.t.e();
    }

    public final int f() {
        return this.p.f();
    }

    public final int g() {
        return this.p.g();
    }

    public final Object h(int i, int i2, uhb uhbVar) {
        Object objB = b(afs.a, new anj(this, i, i2, null), uhbVar);
        return objB == uhi.a ? objB : ufg.a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, uol] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, uol] */
    public final void i(ana anaVar, boolean z, boolean z2) {
        bgj bgjVarA;
        uiq uiqVarI;
        bgj bgjVarB;
        anb anbVar;
        aov aovVar = this.i;
        List list = anaVar.i;
        aovVar.d = list.size();
        if (!z && this.a) {
            this.b = anaVar;
            bgjVarA = bay.A();
            uiqVarI = bgjVarA != null ? bgjVarA.i() : null;
            bgjVarB = bay.B(bgjVarA);
            try {
                cwi cwiVar = this.q;
                if (((Number) ((abz) cwiVar.a).a()).floatValue() != 0.0f && (anbVar = anaVar.a) != null) {
                    int i = anbVar.a;
                    khb khbVar = this.p;
                    if (i == khbVar.f() && anaVar.b == khbVar.g()) {
                        ?? r0 = cwiVar.b;
                        if (r0 != 0) {
                            r0.s(null);
                        }
                        cwiVar.a = new abz(adu.a, Float.valueOf(0.0f), null, 60);
                    }
                }
                return;
            } finally {
            }
        }
        if (z) {
            this.a = true;
        }
        anb anbVar2 = anaVar.a;
        this.x.b(Boolean.valueOf(((anbVar2 == null || anbVar2.a == 0) && anaVar.b == 0) ? false : true));
        this.w.b(Boolean.valueOf(anaVar.c));
        this.e -= anaVar.d;
        this.d.b(anaVar);
        if (z2) {
            khb khbVar2 = this.p;
            int i2 = anaVar.b;
            if (i2 < 0.0f) {
                akg.c("scrollOffset should be non-negative");
            }
            khbVar2.i(i2);
        } else {
            anb anbVar3 = (anb) ske.bD(list);
            anb anbVar4 = (anb) ske.bG(list);
            Trace.setCounter("firstVisibleItem:index", anbVar3 != null ? anbVar3.a : -1L);
            Trace.setCounter("lastVisibleItem:index", anbVar4 != null ? anbVar4.a : -1L);
            khb khbVar3 = this.p;
            khbVar3.e = anbVar2 != null ? anbVar2.d : null;
            if (khbVar3.b || anaVar.l > 0) {
                khbVar3.b = true;
                int i3 = anaVar.b;
                if (i3 < 0.0f) {
                    akg.c("scrollOffset should be non-negative");
                }
                khbVar3.j(anbVar2 != null ? anbVar2.a : 0, i3);
            }
            if (this.v) {
                amp ampVar = this.m;
                if (ampVar.a != -1 && !list.isEmpty()) {
                    if (ampVar.a != (ampVar.c ? ((anb) ske.bF(list)).a + 1 : ((anb) ske.bB(list)).a - 1)) {
                        ampVar.a = -1;
                        aou aouVar = ampVar.b;
                        if (aouVar != null) {
                            aouVar.a();
                        }
                        ampVar.b = null;
                    }
                }
            }
        }
        if (z) {
            cwi cwiVar2 = this.q;
            float f = anaVar.e;
            chq chqVar = anaVar.g;
            und undVar = anaVar.f;
            if (f > chqVar.dk(1.0f)) {
                bgjVarA = bay.A();
                uiqVarI = bgjVarA != null ? bgjVarA.i() : null;
                bgjVarB = bay.B(bgjVarA);
                try {
                    float fFloatValue = ((Number) ((abz) cwiVar2.a).a()).floatValue();
                    ?? r12 = cwiVar2.b;
                    if (r12 != 0) {
                        r12.s(null);
                    }
                    Object obj = cwiVar2.a;
                    if (((abz) obj).d) {
                        cwiVar2.a = byi.be((abz) obj, fFloatValue - f);
                    } else {
                        cwiVar2.a = new abz(adu.a, Float.valueOf(-f), null, 60);
                    }
                    cwiVar2.b = ukc.C(undVar, null, 0, new vf(cwiVar2, (uhb) null, 18), 3);
                } finally {
                }
            }
        }
        this.u++;
    }

    public final ana j() {
        return (ana) this.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [apm, java.lang.Object] */
    public final void k(float f, ana anaVar) {
        aou aouVar;
        aou aouVar2;
        ans ansVar;
        aou aouVar3;
        if (this.v) {
            amp ampVar = this.m;
            rnu rnuVar = this.y;
            List list = anaVar.i;
            if (list.isEmpty()) {
                return;
            }
            boolean z = f < 0.0f;
            int i = z ? ((anb) ske.bF(list)).a + 1 : ((anb) ske.bB(list)).a - 1;
            if (i < 0 || i >= anaVar.l) {
                return;
            }
            if (i != ampVar.a) {
                if (ampVar.c != z && (aouVar3 = ampVar.b) != null) {
                    aouVar3.a();
                }
                ampVar.c = z;
                ampVar.a = i;
                Object obj = rnuVar.a;
                bgj bgjVarA = bay.A();
                uiq uiqVarI = bgjVarA != null ? bgjVarA.i() : null;
                bgj bgjVarB = bay.B(bgjVarA);
                try {
                    ana anaVar2 = (ana) ((ank) obj).d.a();
                    bay.E(bgjVarA, bgjVarB, uiqVarI);
                    Object obj2 = rnuVar.a;
                    long j = anaVar2.h;
                    ank ankVar = (ank) obj2;
                    boolean z2 = ankVar.c;
                    add addVar = new add(11);
                    aov aovVar = ankVar.i;
                    owd owdVar = aovVar.f;
                    if (owdVar != null) {
                        apl aplVar = aovVar.b;
                        ?? r0 = owdVar.d;
                        ann annVar = null;
                        boolean z3 = r0 instanceof ann;
                        if (z3) {
                            annVar = (ann) r0;
                        }
                        apk apkVar = new apk(owdVar, i, j, aplVar, annVar, addVar);
                        if (!z3) {
                            r0.c(apkVar);
                        } else if (z2) {
                            ((ann) r0).c(apkVar);
                        } else {
                            ann annVar2 = (ann) r0;
                            annVar2.b.add(new qev(0, apkVar));
                            annVar2.a();
                        }
                        Trace.setCounter("compose:lazy:schedule_prefetch:index", i);
                        ansVar = apkVar;
                    } else {
                        ansVar = ans.a;
                    }
                    ampVar.b = ansVar;
                } catch (Throwable th) {
                    bay.E(bgjVarA, bgjVarB, uiqVarI);
                    throw th;
                }
            }
            if (!z) {
                if (anaVar.j - ((anb) ske.bB(list)).g >= f || (aouVar = ampVar.b) == null) {
                    return;
                }
                aouVar.b();
                return;
            }
            anb anbVar = (anb) ske.bF(list);
            if (((anbVar.g + anbVar.h) + anaVar.o) - anaVar.k >= (-f) || (aouVar2 = ampVar.b) == null) {
                return;
            }
            aouVar2.b();
        }
    }

    public final void l(int i, int i2) {
        khb khbVar = this.p;
        if (khbVar.f() != i || khbVar.g() != i2) {
            this.h.c();
        }
        khbVar.j(i, i2);
        khbVar.e = null;
        bvm bvmVar = this.o;
        if (bvmVar != null) {
            bvmVar.B();
        }
    }

    public ank(int i, int i2) {
        this(i, i2, new amp(null));
    }

    public ank(final int i, int i2, amp ampVar) {
        this.m = ampVar;
        this.p = new khb(i, i2);
        ana anaVar = anm.a;
        bap bapVar = bap.b;
        this.d = new azz(anaVar, bapVar);
        this.s = new ocq((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        this.t = new ags(new np(this, 12));
        this.v = true;
        this.f = new anh(this);
        this.g = new anq();
        this.h = new aoe();
        this.r = new ocq((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        this.i = new aov(new uiq() { // from class: anf
            @Override // defpackage.uiq
            public final Object a(Object obj) {
                aot aotVar = (aot) obj;
                bgj bgjVarA = bay.A();
                bay.E(bgjVarA, bay.B(bgjVarA), bgjVarA != null ? bgjVarA.i() : null);
                int i3 = aotVar.a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = i;
                    aov aovVar = aotVar.c;
                    owd owdVar = aovVar.f;
                    if (owdVar != null) {
                        List list = aotVar.b;
                        apl aplVar = aovVar.b;
                        Object obj2 = owdVar.d;
                        list.add(new apk(owdVar, i5 + i4, aplVar, obj2 instanceof ann ? (ann) obj2 : null, null));
                    }
                }
                return ufg.a;
            }
        });
        this.y = new rnu(this);
        this.j = new aos();
        ufg ufgVar = ufg.a;
        this.k = new azz(ufgVar, bapVar);
        bap bapVar2 = bap.c;
        this.w = new azz(false, bapVar2);
        this.x = new azz(false, bapVar2);
        this.l = new azz(ufgVar, bapVar);
        this.q = new cwi(null);
    }
}
