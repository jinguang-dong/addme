package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvg {
    private static final gyd d;
    private static final List e;
    private static final List f;
    private static final List g;
    private static final List h;
    private final float A;
    private final boolean B;
    private final String C;
    private final utl D;
    private final utl E;
    private final utl F;
    private final hbj G;
    public final utj a;
    public final utj b;
    public final utj c;
    private final owf i;
    private final owf j;
    private final owf k;
    private final sbv l;
    private final owf m;
    private final owf n;
    private final hyh o;
    private final owq p;
    private final owf q;
    private final owf r;
    private final pnq s;
    private final hfy t;
    private final Resources u;
    private final boolean v;
    private final boolean w;
    private final float x;
    private final boolean y;
    private final boolean z;

    static {
        tpc tpcVarM = gyd.a.m();
        tpcVarM.getClass();
        gsn.t(tpcVarM);
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(5.0f);
        tpcVarM.v(rnt.ae(new Float[]{fValueOf, fValueOf2}));
        d = gsn.q(tpcVarM);
        e = rnt.ae(new Float[]{Float.valueOf(0.5f), Float.valueOf(0.7f), fValueOf});
        f = rnt.ae(new Float[]{fValueOf, Float.valueOf(2.0f), fValueOf2});
        g = rnt.ae(new Float[]{Float.valueOf(4.0f), Float.valueOf(10.0f), Float.valueOf(20.0f), Float.valueOf(30.0f)});
        h = rnt.ae(new Float[]{Float.valueOf(50.0f), Float.valueOf(100.0f)});
    }

    public gvg(Context context, hbj hbjVar, owf owfVar, owf owfVar2, owf owfVar3, sbv sbvVar, owf owfVar4, owf owfVar5, hyh hyhVar, owq owqVar, owf owfVar6, owf owfVar7, jsv jsvVar, pnq pnqVar, hfy hfyVar) {
        hbjVar.getClass();
        owfVar.getClass();
        owfVar2.getClass();
        owfVar3.getClass();
        sbvVar.getClass();
        owfVar4.getClass();
        owfVar5.getClass();
        hyhVar.getClass();
        owqVar.getClass();
        owfVar6.getClass();
        owfVar7.getClass();
        jsvVar.getClass();
        pnqVar.getClass();
        hfyVar.getClass();
        this.G = hbjVar;
        this.i = owfVar;
        this.j = owfVar2;
        this.k = owfVar3;
        this.l = sbvVar;
        this.m = owfVar4;
        this.n = owfVar5;
        this.o = hyhVar;
        this.p = owqVar;
        this.q = owfVar6;
        this.r = owfVar7;
        this.s = pnqVar;
        this.t = hfyVar;
        this.u = context.getResources();
        utl utlVarA = utm.a(null);
        this.D = utlVarA;
        utl utlVarA2 = utm.a(null);
        this.E = utlVarA2;
        utl utlVarA3 = utm.a(null);
        this.F = utlVarA3;
        this.a = new ust(utlVarA);
        this.b = new ust(utlVarA2);
        this.c = new ust(utlVarA3);
        gzi gziVar = hac.a;
        this.v = hbjVar.p(hac.O);
        this.w = hbjVar.p(hba.s);
        this.x = ((Number) ukc.h(hbjVar.e(gym.y), Float.valueOf(1.0f))).floatValue();
        this.y = hbjVar.p(gym.I);
        this.z = hbjVar.p(gym.w);
        this.A = ((Number) ukc.h(hbjVar.e(hal.o), Float.valueOf(4.0f))).floatValue();
        this.B = hbjVar.p(hba.v);
        this.C = hbjVar.f(hba.x);
        gzi gziVar2 = gzp.a;
    }

    private final boolean g(gho ghoVar, gho ghoVar2) {
        return ((goi) this.k.dL()).b() && this.j.dL() == nkw.VIDEO && ghoVar == ghoVar2;
    }

    private final boolean h() {
        Object objDL = this.i.dL();
        objDL.getClass();
        return g((gho) objDL, gho.ACTIVE);
    }

    public final List a() {
        List listBP = g;
        hbj hbjVar = this.G;
        Object obj = (Comparable) ukc.h(hbjVar.e(hal.p), Float.valueOf(5.0f));
        Object obj2 = (Comparable) ukc.h(hbjVar.e(hal.q), Float.valueOf(30.0f));
        if (!listBP.isEmpty()) {
            int iCompareTo = Float.valueOf(((Number) ske.bB(listBP)).floatValue()).compareTo((Float) obj);
            int iCompareTo2 = Float.valueOf(((Number) ske.bF(listBP)).floatValue()).compareTo((Float) obj2);
            Object objBB = ske.bB(listBP);
            Object objBF = ske.bF(listBP);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : listBP) {
                Float fValueOf = Float.valueOf(((Number) obj3).floatValue());
                if (fValueOf.compareTo((Float) obj) >= 0 && fValueOf.compareTo((Float) obj2) <= 0) {
                    arrayList.add(obj3);
                }
            }
            listBP = ske.bP(arrayList);
            if (iCompareTo < 0 && !listBP.isEmpty() && Float.valueOf(((Number) ske.bB(listBP)).floatValue()).compareTo((Float) obj) > 0) {
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) objBB).floatValue();
                listBP.add(0, Float.valueOf(fFloatValue));
            }
            if (iCompareTo2 > 0 && !listBP.isEmpty() && Float.valueOf(((Number) ske.bF(listBP)).floatValue()).compareTo((Float) obj2) < 0) {
                float fFloatValue2 = ((Number) obj2).floatValue();
                ((Number) objBF).floatValue();
                listBP.add(Float.valueOf(fFloatValue2));
            }
        }
        return ske.bL(ske.bI(listBP));
    }

    public final List b() {
        List listBP = e;
        hbj hbjVar = this.G;
        Object obj = (Comparable) ukc.h(hbjVar.e(hal.l), Float.valueOf(0.5f));
        Object obj2 = (Comparable) ukc.h(hbjVar.e(hal.m), Float.valueOf(1.0f));
        if (!listBP.isEmpty()) {
            int iCompareTo = Float.valueOf(((Number) ske.bB(listBP)).floatValue()).compareTo((Float) obj);
            int iCompareTo2 = Float.valueOf(((Number) ske.bF(listBP)).floatValue()).compareTo((Float) obj2);
            Object objBB = ske.bB(listBP);
            Object objBF = ske.bF(listBP);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : listBP) {
                Float fValueOf = Float.valueOf(((Number) obj3).floatValue());
                if (fValueOf.compareTo((Float) obj) >= 0 && fValueOf.compareTo((Float) obj2) <= 0) {
                    arrayList.add(obj3);
                }
            }
            listBP = ske.bP(arrayList);
            if (iCompareTo < 0 && !listBP.isEmpty() && Float.valueOf(((Number) ske.bB(listBP)).floatValue()).compareTo((Float) obj) > 0) {
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) objBB).floatValue();
                listBP.add(0, Float.valueOf(fFloatValue));
            }
            if (iCompareTo2 > 0 && !listBP.isEmpty() && Float.valueOf(((Number) ske.bF(listBP)).floatValue()).compareTo((Float) obj2) < 0) {
                float fFloatValue2 = ((Number) obj2).floatValue();
                ((Number) objBF).floatValue();
                listBP.add(Float.valueOf(fFloatValue2));
            }
        }
        return ske.bL(ske.bI(listBP));
    }

    public final List c() {
        List listBP = f;
        hbj hbjVar = this.G;
        Object obj = (Comparable) ukc.h(hbjVar.e(hal.n), Float.valueOf(1.0f));
        Object obj2 = (Comparable) ukc.h(hbjVar.e(hal.o), Float.valueOf(5.0f));
        if (!listBP.isEmpty()) {
            int iCompareTo = Float.valueOf(((Number) ske.bB(listBP)).floatValue()).compareTo((Float) obj);
            int iCompareTo2 = Float.valueOf(((Number) ske.bF(listBP)).floatValue()).compareTo((Float) obj2);
            Object objBB = ske.bB(listBP);
            Object objBF = ske.bF(listBP);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : listBP) {
                Float fValueOf = Float.valueOf(((Number) obj3).floatValue());
                if (fValueOf.compareTo((Float) obj) >= 0 && fValueOf.compareTo((Float) obj2) <= 0) {
                    arrayList.add(obj3);
                }
            }
            listBP = ske.bP(arrayList);
            if (iCompareTo < 0 && !listBP.isEmpty() && Float.valueOf(((Number) ske.bB(listBP)).floatValue()).compareTo((Float) obj) > 0) {
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) objBB).floatValue();
                listBP.add(0, Float.valueOf(fFloatValue));
            }
            if (iCompareTo2 > 0 && !listBP.isEmpty() && Float.valueOf(((Number) ske.bF(listBP)).floatValue()).compareTo((Float) obj2) < 0) {
                float fFloatValue2 = ((Number) obj2).floatValue();
                ((Number) objBF).floatValue();
                listBP.add(Float.valueOf(fFloatValue2));
            }
        }
        return ske.bL(ske.bI(listBP));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(float r4) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvg.d(float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r6 = this;
            owq r0 = r6.p
            java.lang.Object r1 = r0.dL()
            rwc r1 = (defpackage.rwc) r1
            boolean r1 = r1.h()
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            if (r1 == 0) goto L5a
            java.lang.Object r0 = r0.dL()
            rwc r0 = (defpackage.rwc) r0
            java.lang.Object r0 = r0.c()
            gnr r0 = (defpackage.gnr) r0
            owf r1 = r6.j
            java.lang.Object r4 = r1.dL()
            nkw r5 = defpackage.nkw.VIDEO_NIGHT_SIGHT
            if (r4 != r5) goto L2b
            goto L5a
        L2b:
            java.lang.Object r1 = r1.dL()
            nkw r1 = (defpackage.nkw) r1
            boolean r1 = r1.c()
            if (r1 == 0) goto L5a
            gax r1 = r0.c
            boolean r4 = r1.a
            if (r4 == 0) goto L41
            boolean r0 = r1.c
            goto Lb9
        L41:
            oxj r1 = r0.b
            boolean r1 = r1.e()
            if (r1 == 0) goto L5a
            oxh r0 = r0.a
            int r0 = r0.m
            r1 = 60
            if (r0 != r1) goto L5a
            boolean r0 = r6.y
            if (r0 != 0) goto L5a
            boolean r0 = r6.z
            if (r0 == 0) goto L5a
            goto Lb9
        L5a:
            boolean r0 = r6.B
            r1 = 0
            if (r0 != 0) goto L8f
            owf r0 = r6.n
            java.lang.Object r0 = r0.dL()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8f
            sbv r0 = r6.l
            owf r4 = r6.m
            java.lang.Object r5 = r4.dL()
            boolean r5 = r0.containsKey(r5)
            if (r5 == 0) goto L8f
            java.lang.Object r2 = r4.dL()
            java.lang.Object r0 = r0.get(r2)
            android.util.Range r0 = (android.util.Range) r0
            if (r0 == 0) goto Lb8
            java.lang.Comparable r0 = r0.getLower()
            r3 = r0
            java.lang.Float r3 = (java.lang.Float) r3
            goto Lb9
        L8f:
            hyh r0 = r6.o
            owf r0 = r0.e()
            java.lang.Object r0 = r0.dL()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb8
            boolean r0 = r6.v
            if (r0 != 0) goto Lb8
            owf r0 = r6.q
            java.lang.Object r0 = r0.dL()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = java.lang.Float.compare(r0, r2)
            if (r0 < 0) goto Lb8
            goto Lb9
        Lb8:
            r3 = r1
        Lb9:
            utl r6 = r6.D
            r6.e(r3)
            r6.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvg.e():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x036c A[LOOP:0: B:84:0x0366->B:86:0x036c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.gyd r19) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2043
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvg.f(gyd):void");
    }
}
