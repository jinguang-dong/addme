package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bad {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [uiq] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [bij] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [bij] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void A(buo buoVar, Object obj, uiq uiqVar) {
        bwe bweVar;
        if (!buoVar.B().w) {
            bqs.c("visitAncestors called on an unattached node");
        }
        bij bijVar = buoVar.B().p;
        bvm bvmVarB = bko.B(buoVar);
        while (bvmVarB != null) {
            if ((bvmVarB.s.f.o & 262144) != 0) {
                while (bijVar != null) {
                    if ((bijVar.n & 262144) != 0) {
                        bup bupVarY = bijVar;
                        ?? bdpVar = 0;
                        while (bupVarY != 0) {
                            if (bupVarY instanceof bxd) {
                                bxd bxdVar = (bxd) bupVarY;
                                if (a.ao(obj, bxdVar.dc()) && !((Boolean) uiqVar.a(bxdVar)).booleanValue()) {
                                    return;
                                }
                            } else if ((bupVarY.n & 262144) != 0 && (bupVarY instanceof bup)) {
                                bij bijVar2 = bupVarY.y;
                                int i = 0;
                                bupVarY = bupVarY;
                                bdpVar = bdpVar;
                                while (bijVar2 != null) {
                                    if ((bijVar2.n & 262144) != 0) {
                                        i++;
                                        bdpVar = bdpVar;
                                        if (i == 1) {
                                            bupVarY = bijVar2;
                                        } else {
                                            if (bdpVar == 0) {
                                                bdpVar = new bdp(new bij[16]);
                                            }
                                            if (bupVarY != 0) {
                                                bdpVar.n(bupVarY);
                                            }
                                            bdpVar.n(bijVar2);
                                            bupVarY = 0;
                                        }
                                    }
                                    bijVar2 = bijVar2.q;
                                    bupVarY = bupVarY;
                                    bdpVar = bdpVar;
                                }
                                if (i != 1) {
                                }
                            }
                            bupVarY = bko.y(bdpVar);
                        }
                    }
                    bijVar = bijVar.p;
                }
            }
            bvmVarB = bvmVarB.j();
            bijVar = (bvmVarB == null || (bweVar = bvmVarB.s) == null) ? null : bweVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [uiq] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [bij] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [bij] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void B(bxd bxdVar, uiq uiqVar) {
        if (!bxdVar.B().w) {
            bqs.c("visitSubtreeIf called on an unattached node");
        }
        bdp bdpVar = new bdp(new bij[16]);
        bij bijVar = bxdVar.B().q;
        if (bijVar == null) {
            bko.G(bdpVar, bxdVar.B());
        } else {
            bdpVar.n(bijVar);
        }
        while (true) {
            int i = bdpVar.b;
            if (i == 0) {
                return;
            }
            bij bijVar2 = (bij) bdpVar.c(i - 1);
            if ((bijVar2.o & 262144) != 0) {
                for (bij bijVar3 = bijVar2; bijVar3 != null; bijVar3 = bijVar3.q) {
                    if ((bijVar3.n & 262144) != 0) {
                        bup bupVarY = bijVar3;
                        ?? bdpVar2 = 0;
                        while (bupVarY != 0) {
                            if (bupVarY instanceof bxd) {
                                bxd bxdVar2 = (bxd) bupVarY;
                                bxc bxcVar = (a.ao(bxdVar.dc(), bxdVar2.dc()) && bay.y(bxdVar, bxdVar2)) ? (bxc) uiqVar.a(bxdVar2) : bxc.a;
                                if (bxcVar == bxc.c) {
                                    return;
                                }
                                if (bxcVar == bxc.b) {
                                    break;
                                }
                            } else if ((bupVarY.n & 262144) != 0 && (bupVarY instanceof bup)) {
                                bij bijVar4 = bupVarY.y;
                                int i2 = 0;
                                bupVarY = bupVarY;
                                bdpVar2 = bdpVar2;
                                while (bijVar4 != null) {
                                    if ((bijVar4.n & 262144) != 0) {
                                        i2++;
                                        bdpVar2 = bdpVar2;
                                        if (i2 == 1) {
                                            bupVarY = bijVar4;
                                        } else {
                                            if (bdpVar2 == 0) {
                                                bdpVar2 = new bdp(new bij[16]);
                                            }
                                            if (bupVarY != 0) {
                                                bdpVar2.n(bupVarY);
                                            }
                                            bdpVar2.n(bijVar4);
                                            bupVarY = 0;
                                        }
                                    }
                                    bijVar4 = bijVar4.q;
                                    bupVarY = bupVarY;
                                    bdpVar2 = bdpVar2;
                                }
                                if (i2 != 1) {
                                }
                            }
                            bupVarY = bko.y(bdpVar2);
                        }
                    }
                }
            }
            bko.G(bdpVar, bijVar2);
        }
    }

    public static final int C(int i) {
        return ((int) ((-9223372036854775808) >> (i * 15))) & 32767;
    }

    public static final void D(bwx bwxVar) {
        bko.B(bwxVar).H();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.View E(android.view.View r4, android.view.View r5, defpackage.uiq r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            android.view.View r1 = F(r5, r6, r1)
            if (r1 != 0) goto L1d
            if (r5 != r4) goto Lb
            goto L1d
        Lb:
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L1c
            boolean r2 = r1 instanceof android.view.View
            if (r2 != 0) goto L16
            goto L1c
        L16:
            android.view.View r1 = (android.view.View) r1
            r3 = r1
            r1 = r5
            r5 = r3
            goto L2
        L1c:
            return r0
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bad.E(android.view.View, android.view.View, uiq):android.view.View");
    }

    private static final View F(View view, uiq uiqVar, View view2) {
        View viewF;
        if (((Boolean) uiqVar.a(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (viewF = F(childAt, uiqVar, view2)) != null) {
                return viewF;
            }
        }
        return null;
    }

    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final void c(baz bazVar, axr axrVar, int i) {
        while (true) {
            int i2 = bazVar.q;
            if (i > i2 && i < bazVar.p) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            bazVar.J();
            if (bazVar.S(bazVar.q)) {
                axrVar.h();
            }
            bazVar.W();
        }
    }

    public static final void d(yo yoVar, int i, int i2) {
        int iA = yoVar.a(i);
        yoVar.g(i, yoVar.a(i2));
        yoVar.g(i2, iA);
    }

    public static final bix e(String str) {
        return new bir(ske.aV(str));
    }

    public static final String[] f(bix bixVar) {
        bixVar.getClass();
        return (String[]) ((bir) bixVar).a.toArray(new String[0]);
    }

    public static final void g(ViewStructure viewStructure) {
        viewStructure.setCheckable(true);
    }

    public static final void h(ViewStructure viewStructure, int i, String str) {
        viewStructure.setId(i, str, null, null);
    }

    public static final void i(Throwable th, uif uifVar) {
        Collection collectionAe;
        Object objInvoke;
        th.getClass();
        bhx bhxVar = null;
        if (uhz.cb()) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            collectionAe = rnt.ae(suppressed);
        } else {
            Method method = uhx.b;
            collectionAe = (method == null || (objInvoke = method.invoke(th, null)) == null) ? ufw.a : rnt.ae((Throwable[]) objInvoke);
        }
        if (!collectionAe.isEmpty()) {
            Iterator it = collectionAe.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof bhx) {
                    return;
                }
            }
        }
        try {
            List list = (List) uifVar.a();
            if (!list.isEmpty()) {
                bhxVar = new bhx(list);
            }
        } catch (Throwable th2) {
            bhxVar = th2;
        }
        if (bhxVar != null) {
            ujk.f(th, bhxVar);
        }
    }

    public static final Integer j(bav bavVar, ayk aykVar, int i, int i2) {
        Integer numJ;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int iC = bavVar.c(i) + i;
            if (bavVar.y(i) && bavVar.b(i) == 206 && a.ao(bavVar.m(i), ayi.e)) {
                Object objL = bavVar.l(i, 0);
                aye ayeVar = objL instanceof aye ? (aye) objL : null;
                if (ayeVar != null && a.ao(ayeVar.a, aykVar)) {
                    return Integer.valueOf(i);
                }
            }
            if (bavVar.w(i) && (numJ = j(bavVar, aykVar, i + 1, iC)) != null) {
                return Integer.valueOf(numJ.intValue());
            }
            i = iC;
        }
    }

    public static final List k(bav bavVar, int i, Object obj) {
        ArrayList arrayList = new ArrayList();
        int iE = bavVar.e(i);
        axq axqVarG = bavVar.g(i);
        while (i >= 0) {
            n(bavVar.a.h(i), obj);
            if (iE >= 0) {
                axq axqVar = axqVarG;
                axqVarG = bavVar.g(iE);
                i = iE;
                iE = bavVar.e(iE);
                obj = axqVar;
            } else {
                i = iE;
                obj = axqVarG;
            }
        }
        return arrayList;
    }

    public static final List m(baz bazVar, int i, Integer num) {
        int iL;
        zo zoVar;
        if (bazVar.r || bazVar.f() == 0) {
            return ufw.a;
        }
        ArrayList arrayList = new ArrayList();
        if (num != null) {
            iL = num.intValue();
        } else {
            iL = bazVar.q;
            if (iL < 0) {
                iL = bazVar.l(i);
            }
        }
        int iQ = bazVar.h - bazVar.q(i);
        yq yqVar = bazVar.t;
        int i2 = 0;
        if (yqVar != null && (zoVar = (zo) yqVar.a(i)) != null) {
            i2 = zoVar.b;
        }
        Object objValueOf = Integer.valueOf(iQ + i2);
        while (i >= 0) {
            n(bazVar.aa(i), objValueOf);
            objValueOf = bazVar.r(i);
            if (iL >= 0) {
                int i3 = iL;
                iL = bazVar.l(iL);
                i = i3;
            } else {
                i = iL;
            }
        }
        return arrayList;
    }

    public static final void n(bay bayVar, Object obj) {
        if (bayVar == null) {
            return;
        }
        obj.getClass();
        throw null;
    }

    public static final View o(View view, View view2, int i) {
        int nextFocusForwardId;
        if (i == 1) {
            if (view.getId() != -1) {
                return E(view2, view, new bzm(view2, view, 0));
            }
            return null;
        }
        if (i == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return p(view2, view, nextFocusForwardId);
        }
        return null;
    }

    public static final View p(View view, View view2, int i) {
        return E(view, view2, new bzn(i, 0));
    }

    public static final bzl q() {
        Object obj = bzl.a.get();
        obj.getClass();
        return (bzl) obj;
    }

    public static final bvm r(bvm bvmVar, uiq uiqVar) {
        for (bvm bvmVarJ = bvmVar.j(); bvmVarJ != null; bvmVarJ = bvmVarJ.j()) {
            if (((Boolean) uiqVar.a(bvmVarJ)).booleanValue()) {
                return bvmVarJ;
            }
        }
        return null;
    }

    public static final ccm s(cbr cbrVar) {
        cbn cbnVar = cbrVar.c;
        ccm ccmVar = (ccm) clc.ad(cbnVar, cbu.C);
        List list = (List) clc.ad(cbnVar, cbu.y);
        return ccmVar == null ? list != null ? (ccm) ske.bD(list) : null : ccmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String t(defpackage.cbr r7, android.content.res.Resources r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bad.t(cbr, android.content.res.Resources):java.lang.String");
    }

    public static final boolean u(cbr cbrVar) {
        return !cbrVar.f().f(cbu.i);
    }

    public static final boolean v(cbr cbrVar) {
        cbn cbnVar = cbrVar.c;
        ccg ccgVar = (ccg) clc.ad(cbnVar, cbu.F);
        cbk cbkVar = (cbk) clc.ad(cbnVar, cbu.v);
        Boolean bool = (Boolean) clc.ad(cbnVar, cbu.E);
        boolean z = ccgVar != null;
        if (bool != null) {
            bool.booleanValue();
            if (cbkVar == null || !a.p(cbkVar.a, 4)) {
                return true;
            }
        }
        return z;
    }

    public static final boolean w(cbr cbrVar) {
        return cbrVar.b.p == cib.b;
    }

    public static final boolean x(cbr cbrVar, Resources resources) {
        cbn cbnVar = cbrVar.c;
        List list = (List) clc.ad(cbnVar, cbu.a);
        boolean z = ((list != null ? (String) ske.bD(list) : null) == null && s(cbrVar) == null && t(cbrVar, resources) == null && !v(cbrVar)) ? false : true;
        if (cbs.a(cbrVar)) {
            return false;
        }
        if (cbnVar.a) {
            return true;
        }
        return cbrVar.k() && z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [bij] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [bij] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final bxd y(bxd bxdVar) {
        bwe bweVar;
        if (!bxdVar.B().w) {
            bqs.c("visitAncestors called on an unattached node");
        }
        bij bijVar = bxdVar.B().p;
        bvm bvmVarB = bko.B(bxdVar);
        while (bvmVarB != null) {
            if ((bvmVarB.s.f.o & 262144) != 0) {
                while (bijVar != null) {
                    if ((bijVar.n & 262144) != 0) {
                        bup bupVarY = bijVar;
                        ?? bdpVar = 0;
                        while (bupVarY != 0) {
                            if (bupVarY instanceof bxd) {
                                bxd bxdVar2 = (bxd) bupVarY;
                                if (a.ao(bxdVar.dc(), bxdVar2.dc()) && bay.y(bxdVar, bxdVar2)) {
                                    return bxdVar2;
                                }
                            } else if ((bupVarY.n & 262144) != 0 && (bupVarY instanceof bup)) {
                                bij bijVar2 = bupVarY.y;
                                int i = 0;
                                bupVarY = bupVarY;
                                bdpVar = bdpVar;
                                while (bijVar2 != null) {
                                    if ((bijVar2.n & 262144) != 0) {
                                        i++;
                                        bdpVar = bdpVar;
                                        if (i == 1) {
                                            bupVarY = bijVar2;
                                        } else {
                                            if (bdpVar == 0) {
                                                bdpVar = new bdp(new bij[16]);
                                            }
                                            if (bupVarY != 0) {
                                                bdpVar.n(bupVarY);
                                            }
                                            bdpVar.n(bijVar2);
                                            bupVarY = 0;
                                        }
                                    }
                                    bijVar2 = bijVar2.q;
                                    bupVarY = bupVarY;
                                    bdpVar = bdpVar;
                                }
                                if (i != 1) {
                                }
                            }
                            bupVarY = bko.y(bdpVar);
                        }
                    }
                    bijVar = bijVar.p;
                }
            }
            bvmVarB = bvmVarB.j();
            bijVar = (bvmVarB == null || (bweVar = bvmVarB.s) == null) ? null : bweVar.e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [uiq] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [bij] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void z(bxd bxdVar, uiq uiqVar) {
        bwe bweVar;
        if (!bxdVar.B().w) {
            bqs.c("visitAncestors called on an unattached node");
        }
        bij bijVar = bxdVar.B().p;
        bvm bvmVarB = bko.B(bxdVar);
        while (bvmVarB != null) {
            if ((bvmVarB.s.f.o & 262144) != 0) {
                while (bijVar != null) {
                    if ((bijVar.n & 262144) != 0) {
                        bup bupVarY = bijVar;
                        ?? bdpVar = 0;
                        while (bupVarY != 0) {
                            if (bupVarY instanceof bxd) {
                                bxd bxdVar2 = (bxd) bupVarY;
                                if (a.ao(bxdVar.dc(), bxdVar2.dc()) && bay.y(bxdVar, bxdVar2) && !((Boolean) uiqVar.a(bxdVar2)).booleanValue()) {
                                    return;
                                }
                            } else if ((bupVarY.n & 262144) != 0 && (bupVarY instanceof bup)) {
                                bij bijVar2 = bupVarY.y;
                                int i = 0;
                                bupVarY = bupVarY;
                                bdpVar = bdpVar;
                                while (bijVar2 != null) {
                                    if ((bijVar2.n & 262144) != 0) {
                                        i++;
                                        bdpVar = bdpVar;
                                        if (i == 1) {
                                            bupVarY = bijVar2;
                                        } else {
                                            if (bdpVar == 0) {
                                                bdpVar = new bdp(new bij[16]);
                                            }
                                            if (bupVarY != 0) {
                                                bdpVar.n(bupVarY);
                                            }
                                            bdpVar.n(bijVar2);
                                            bupVarY = 0;
                                        }
                                    }
                                    bijVar2 = bijVar2.q;
                                    bupVarY = bupVarY;
                                    bdpVar = bdpVar;
                                }
                                if (i != 1) {
                                }
                            }
                            bupVarY = bko.y(bdpVar);
                        }
                    }
                    bijVar = bijVar.p;
                }
            }
            bvmVarB = bvmVarB.j();
            bijVar = (bvmVarB == null || (bweVar = bvmVarB.s) == null) ? null : bweVar.e;
        }
    }
}
