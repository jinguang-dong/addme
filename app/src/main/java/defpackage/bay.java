package defpackage;

import android.content.Context;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bay {
    public static final bgj A() {
        return (bgj) bgr.i.q();
    }

    public static final bgj B(bgj bgjVar) {
        if (bgjVar instanceof bhq) {
            bhq bhqVar = (bhq) bgjVar;
            if (bhqVar.n == byi.ac()) {
                bhqVar.l = null;
                return bgjVar;
            }
        }
        if (bgjVar instanceof bhr) {
            bhr bhrVar = (bhr) bgjVar;
            if (bhrVar.b == byi.ac()) {
                bhrVar.a = null;
                return bgjVar;
            }
        }
        bgj bgjVarA = bgr.a(bgjVar, null, false);
        bgjVarA.w();
        return bgjVarA;
    }

    public static final void C() {
        bgr.b().e();
    }

    public static final Object D(uiq uiqVar, uif uifVar) {
        bgj bhqVar;
        if (uiqVar == null) {
            return uifVar.a();
        }
        bgj bgjVar = (bgj) bgr.i.q();
        if (bgjVar instanceof bhq) {
            bhq bhqVar2 = (bhq) bgjVar;
            if (bhqVar2.n == byi.ac()) {
                uiq uiqVar2 = bhqVar2.l;
                uiq uiqVar3 = bhqVar2.m;
                try {
                    bhqVar2.l = bgr.p(uiqVar, uiqVar2, true);
                    bhqVar2.m = bgr.q(null, uiqVar3);
                    return uifVar.a();
                } finally {
                    bhqVar2.l = uiqVar2;
                    bhqVar2.m = uiqVar3;
                }
            }
        }
        if (bgjVar == null || (bgjVar instanceof bgf)) {
            bhqVar = new bhq(bgjVar instanceof bgf ? (bgf) bgjVar : null, uiqVar, null, true, false);
        } else {
            bhqVar = bgjVar.b(uiqVar);
        }
        try {
            bgj bgjVarW = bhqVar.w();
            try {
                Object objA = uifVar.a();
                bgj.E(bgjVarW);
                return objA;
            } catch (Throwable th) {
                bgj.E(bgjVarW);
                throw th;
            }
        } finally {
            bhqVar.d();
        }
    }

    public static final void E(bgj bgjVar, bgj bgjVar2, uiq uiqVar) {
        if (bgjVar != bgjVar2) {
            bgj.E(bgjVar);
            bgjVar2.d();
        } else if (bgjVar instanceof bhq) {
            ((bhq) bgjVar).l = uiqVar;
        } else if (bgjVar instanceof bhr) {
            ((bhr) bgjVar).a = uiqVar;
        } else {
            Objects.toString(bgjVar);
            throw new IllegalStateException("Non-transparent snapshot was reused: ".concat(String.valueOf(bgjVar)));
        }
    }

    public static final void F() {
        boolean z;
        synchronized (bgr.b) {
            zw zwVar = bgr.h.g;
            z = false;
            if (zwVar != null) {
                if (zwVar.c()) {
                    z = true;
                }
            }
        }
        if (z) {
            bgr.r();
        }
    }

    public static final bgf G(uiq uiqVar, uiq uiqVar2) {
        bgf bgfVarA;
        bgj bgjVarB = bgr.b();
        bgf bgfVar = bgjVarB instanceof bgf ? (bgf) bgjVarB : null;
        if (bgfVar == null || (bgfVarA = bgfVar.a(uiqVar, uiqVar2)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        return bgfVarA;
    }

    public static final bgj H(uiq uiqVar) {
        return bgr.b().b(uiqVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [bbs, java.lang.Object] */
    public static final bfk I(bag[] bagVarArr, bfk bfkVar, bfk bfkVar2) {
        bfj bfjVar = new bfj(bfk.d);
        for (bag bagVar : bagVarArr) {
            ayp aypVar = bagVar.a;
            if (bagVar.f || !bfkVar.containsKey(aypVar)) {
                ?? r4 = bfkVar2.get(aypVar);
                bagVar.getClass();
                bfjVar.put(aypVar, ayp.d(bagVar, r4));
            }
        }
        return bfjVar.a();
    }

    public static final Object J(bfk bfkVar, ayp aypVar) {
        aypVar.getClass();
        Object objA = bfkVar.get(aypVar);
        if (objA == null) {
            objA = aypVar.a();
        }
        return ((bbs) objA).a(bfkVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void K(defpackage.bag r10, defpackage.uiu r11, defpackage.ayc r12, int r13) {
        /*
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            ayc r12 = r12.c(r0)
            r0 = r12
            ayg r0 = (defpackage.ayg) r0
            bfk r1 = r0.ag()
            java.lang.Object r2 = defpackage.ayi.b
            r3 = 201(0xc9, float:2.82E-43)
            r0.ab(r3, r2)
            java.lang.Object r2 = r0.R()
            java.lang.Object r3 = defpackage.ayb.a
            boolean r3 = defpackage.a.ao(r2, r3)
            r4 = 0
            if (r3 == 0) goto L24
            r2 = r4
            goto L29
        L24:
            r2.getClass()
            bbs r2 = (defpackage.bbs) r2
        L29:
            ayp r3 = r10.a
            bbs r5 = defpackage.ayp.d(r10, r2)
            boolean r2 = defpackage.a.ao(r5, r2)
            if (r2 != 0) goto L38
            r0.ac(r5)
        L38:
            boolean r6 = r0.v
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L50
            boolean r2 = r10.f
            if (r2 != 0) goto L48
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L4c
        L48:
            bfk r1 = r1.i(r3, r5)
        L4c:
            r0.r = r8
        L4e:
            r8 = r7
            goto L88
        L50:
            bav r6 = r0.o
            int r9 = r6.f
            java.lang.Object r6 = r6.j(r9)
            r6.getClass()
            bfk r6 = (defpackage.bfk) r6
            boolean r9 = r0.G()
            if (r9 == 0) goto L65
            if (r2 != 0) goto L70
        L65:
            boolean r9 = r10.f
            if (r9 != 0) goto L7e
            boolean r9 = r1.containsKey(r3)
            if (r9 != 0) goto L70
            goto L7e
        L70:
            if (r2 == 0) goto L77
            boolean r2 = r0.i
            if (r2 != 0) goto L77
            goto L7c
        L77:
            boolean r2 = r0.i
            if (r2 == 0) goto L7c
            goto L82
        L7c:
            r1 = r6
            goto L82
        L7e:
            bfk r1 = r1.i(r3, r5)
        L82:
            boolean r2 = r0.j
            if (r2 != 0) goto L88
            if (r6 == r1) goto L4e
        L88:
            if (r8 == 0) goto L91
            boolean r2 = r0.v
            if (r2 != 0) goto L91
            r0.ai(r1)
        L91:
            lwm r2 = r0.A
            boolean r3 = r0.i
            int r3 = defpackage.ayi.a(r3)
            r2.e(r3)
            r0.i = r8
            r0.y = r1
            java.lang.Object r3 = defpackage.ayi.c
            r5 = 202(0xca, float:2.83E-43)
            r0.aa(r5, r3, r7, r1)
            int r1 = r13 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.a(r12, r1)
            r0.Y()
            r0.Y()
            int r1 = r2.c()
            boolean r1 = defpackage.ayi.k(r1)
            r0.i = r1
            r0.y = r4
            bai r12 = r12.I()
            if (r12 == 0) goto Ld2
            aqb r0 = new aqb
            r1 = 5
            r0.<init>(r10, r11, r13, r1)
            r12.d = r0
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bay.K(bag, uiu, ayc, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void L(defpackage.bag[] r8, defpackage.uiu r9, defpackage.ayc r10, int r11) {
        /*
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            ayc r10 = r10.c(r0)
            r0 = r10
            ayg r0 = (defpackage.ayg) r0
            bfk r1 = r0.ag()
            java.lang.Object r2 = defpackage.ayi.b
            r3 = 201(0xc9, float:2.82E-43)
            r0.ab(r3, r2)
            boolean r2 = r0.v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L29
            bfk r2 = defpackage.bfk.d
            bfk r2 = I(r8, r1, r2)
            bfk r1 = r0.ah(r1, r2)
            r0.r = r3
        L27:
            r3 = r4
            goto L67
        L29:
            bav r2 = r0.o
            java.lang.Object r2 = r2.k(r4)
            r2.getClass()
            bfk r2 = (defpackage.bfk) r2
            bav r5 = r0.o
            java.lang.Object r5 = r5.k(r3)
            r5.getClass()
            bfk r5 = (defpackage.bfk) r5
            bfk r6 = I(r8, r1, r5)
            boolean r7 = r0.G()
            if (r7 == 0) goto L59
            boolean r7 = r0.j
            if (r7 != 0) goto L59
            boolean r5 = defpackage.a.ao(r5, r6)
            if (r5 != 0) goto L54
            goto L59
        L54:
            r0.Z()
            r1 = r2
            goto L27
        L59:
            bfk r1 = r0.ah(r1, r6)
            boolean r5 = r0.j
            if (r5 != 0) goto L67
            boolean r2 = defpackage.a.ao(r1, r2)
            if (r2 != 0) goto L27
        L67:
            if (r3 == 0) goto L70
            boolean r2 = r0.v
            if (r2 != 0) goto L70
            r0.ai(r1)
        L70:
            lwm r2 = r0.A
            boolean r5 = r0.i
            int r5 = defpackage.ayi.a(r5)
            r2.e(r5)
            r0.i = r3
            r0.y = r1
            java.lang.Object r3 = defpackage.ayi.c
            r5 = 202(0xca, float:2.83E-43)
            r0.aa(r5, r3, r4, r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.a(r10, r1)
            r0.Y()
            r0.Y()
            int r1 = r2.c()
            boolean r1 = defpackage.ayi.k(r1)
            r0.i = r1
            r1 = 0
            r0.y = r1
            bai r10 = r10.I()
            if (r10 == 0) goto Lb6
            aqb r0 = new aqb
            r4 = 6
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r10.d = r0
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bay.L(bag[], uiu, ayc, int):void");
    }

    public static final int M(ayc aycVar) {
        return aycVar.a();
    }

    public static final long N(ayc aycVar) {
        return aycVar.b();
    }

    public static final avp O(ayc aycVar) {
        return (avp) aycVar.e(avq.a);
    }

    public static final awh P(ayc aycVar) {
        return (awh) aycVar.e(awi.a);
    }

    public static final awo Q(ayc aycVar) {
        return (awo) aycVar.e(awp.a);
    }

    public static final awu R(ayc aycVar) {
        return (awu) aycVar.e(awv.a);
    }

    public static final long S(Context context, int i) {
        return bko.i(context.getResources().getColor(i, context.getTheme()));
    }

    public static final float T(float f, float f2, Set set, uiu uiuVar, float f3, float f4) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (((Number) obj2).floatValue() <= f + 0.001d) {
                arrayList.add(obj2);
            }
        }
        Object obj3 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            float fFloatValue = ((Number) obj).floatValue();
            int iBk = ske.bk(arrayList);
            if (iBk > 0) {
                int i = 1;
                while (true) {
                    Object obj4 = arrayList.get(i);
                    float fFloatValue2 = ((Number) obj4).floatValue();
                    int iCompare = Float.compare(fFloatValue, fFloatValue2);
                    if (iCompare < 0) {
                        fFloatValue = fFloatValue2;
                    }
                    if (iCompare < 0) {
                        obj = obj4;
                    }
                    if (i == iBk) {
                        break;
                    }
                    i++;
                }
            }
        }
        Float f5 = (Float) obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : set) {
            if (((Number) obj5).floatValue() >= f - 0.001d) {
                arrayList2.add(obj5);
            }
        }
        if (!arrayList2.isEmpty()) {
            obj3 = arrayList2.get(0);
            float fFloatValue3 = ((Number) obj3).floatValue();
            int iBk2 = ske.bk(arrayList2);
            if (iBk2 > 0) {
                int i2 = 1;
                while (true) {
                    Object obj6 = arrayList2.get(i2);
                    float fFloatValue4 = ((Number) obj6).floatValue();
                    int iCompare2 = Float.compare(fFloatValue3, fFloatValue4);
                    if (iCompare2 > 0) {
                        fFloatValue3 = fFloatValue4;
                    }
                    if (iCompare2 > 0) {
                        obj3 = obj6;
                    }
                    if (i2 == iBk2) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Float f6 = (Float) obj3;
        List listBj = f5 == null ? ske.bm(f6) : (f6 == null || f5.floatValue() == f6.floatValue()) ? ske.bj(f5) : rnt.ae(new Float[]{f5, f6});
        int size = listBj.size();
        if (size == 0) {
            return f2;
        }
        if (size == 1) {
            return ((Number) listBj.get(0)).floatValue();
        }
        float fFloatValue5 = ((Number) listBj.get(0)).floatValue();
        float fFloatValue6 = ((Number) listBj.get(1)).floatValue();
        return (f2 > f ? f3 > (-f4) && f > ((Number) uiuVar.a(Float.valueOf(fFloatValue6), Float.valueOf(fFloatValue5))).floatValue() : f3 >= f4 || f >= ((Number) uiuVar.a(Float.valueOf(fFloatValue5), Float.valueOf(fFloatValue6))).floatValue()) ? fFloatValue6 : fFloatValue5;
    }

    public static final Float U(Map map, Object obj) {
        Object next;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (a.ao(((Map.Entry) next).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static final int V(boolean z, int i, int i2) {
        if (z || !a.B(i)) {
            return ukc.n(i2, 1);
        }
        return 1;
    }

    public static final long W(long j, boolean z, int i, float f) {
        int iB = Integer.MAX_VALUE;
        if ((z || a.B(i)) && cho.h(j)) {
            iB = cho.b(j);
        }
        if (cho.d(j) != iB) {
            iB = ukc.p(X(f), cho.d(j), iB);
        }
        return chp.m(0, iB, 0, cho.a(j));
    }

    public static final int X(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final void Y(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            akg.b(a.bD(i2, i, "both minLines ", " and maxLines ", " must be greater than zero"));
        }
        if (i <= i2) {
            return;
        }
        akg.b("minLines 1 must be less than or equal to maxLines 0");
    }

    public static final List Z(List list, uif uifVar) {
        int iA;
        int i;
        Object aeiVar;
        if (!((Boolean) uifVar.a()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            bsq bsqVar = (bsq) list.get(i2);
            Object objG = bsqVar.g();
            objG.getClass();
            aqn aqnVar = ((aqr) objG).a;
            cdl cdlVarA = aqnVar.a.a();
            if (cdlVarA == null) {
                aeiVar = new agx(3);
            } else {
                ccl cclVarD = aqp.d(aqnVar.b, cdlVarA);
                if (cclVarD == null) {
                    aeiVar = new agx(4);
                } else {
                    chz chzVarC = chx.c(cdlVarA.k(cclVarD.b, cclVarD.c).b());
                    int i3 = chzVarC.d;
                    int i4 = chzVarC.b;
                    iA = chzVarC.a();
                    i = i3 - i4;
                    aeiVar = new aei(chzVarC, 11);
                    arrayList.add(new uev(bsqVar.r(chp.m(i, i, iA, iA)), aeiVar));
                }
            }
            i = 0;
            iA = 0;
            arrayList.add(new uev(bsqVar.r(chp.m(i, i, iA, iA)), aeiVar));
        }
        return arrayList;
    }

    public static final int a(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0106  */
    @defpackage.ueo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void aa(java.lang.String r24, defpackage.bik r25, defpackage.cdo r26, defpackage.uiq r27, int r28, boolean r29, int r30, int r31, defpackage.bkx r32, defpackage.ayc r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bay.aa(java.lang.String, bik, cdo, uiq, int, boolean, int, int, bkx, ayc, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ab(defpackage.ccm r19, defpackage.bik r20, defpackage.cdo r21, defpackage.uiq r22, int r23, boolean r24, int r25, int r26, java.util.Map r27, defpackage.ayc r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bay.ab(ccm, bik, cdo, uiq, int, boolean, int, int, java.util.Map, ayc, int, int):void");
    }

    public static final void ac(final String str, final bik bikVar, final cdo cdoVar, final uiq uiqVar, final int i, final boolean z, final int i2, final int i3, final bkx bkxVar, ayc aycVar, final int i4) {
        int i5;
        bkx bkxVar2;
        int i6;
        aqw aqwVar;
        bik bikVarCM;
        ayc aycVarC = aycVar.c(-1040751001);
        if ((i4 & 6) == 0) {
            i5 = (true != aycVarC.B(str) ? 2 : 4) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= true != aycVarC.B(bikVar) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i5 |= true != aycVarC.B(cdoVar) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i5 |= true != aycVarC.D(uiqVar) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i5 |= true != aycVarC.z(i) ? 8192 : 16384;
        }
        if ((196608 & i4) == 0) {
            i5 |= true != aycVarC.C(z) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i4) == 0) {
            i5 |= true != aycVarC.z(i2) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if ((12582912 & i4) == 0) {
            i5 |= true != aycVarC.z(i3) ? 4194304 : 8388608;
        }
        if ((100663296 & i4) == 0) {
            bkxVar2 = bkxVar;
            i5 |= true != aycVarC.D(bkxVar2) ? 33554432 : 67108864;
        } else {
            bkxVar2 = bkxVar;
        }
        int i7 = i5 | 805306368;
        if (aycVarC.H((306783379 & i7) != 306783378, i7 & 1)) {
            Y(i3, i2);
            arn arnVar = (arn) aycVarC.e(aro.a);
            if (arnVar != null) {
                aycVarC.u(356433987);
                long j = ((arp) aycVarC.e(arq.b)).a;
                Object[] objArr = {arnVar};
                i6 = i7;
                bgb bgbVarAl = al(arnVar);
                boolean zD = aycVarC.D(arnVar);
                ayg aygVar = (ayg) aycVarC;
                Object objR = aygVar.R();
                if (zD || objR == ayb.a) {
                    objR = new aei(arnVar, 9);
                    aygVar.ac(objR);
                }
                long jLongValue = ((Number) bdq.o(objArr, bgbVarAl, (uif) objR, aycVarC, 0)).longValue();
                boolean zA = aycVarC.A(jLongValue) | aycVarC.B(arnVar) | aycVarC.A(j);
                Object objR2 = aygVar.R();
                if (zA || objR2 == ayb.a) {
                    objR2 = new aqw(jLongValue, arnVar);
                    aygVar.ac(objR2);
                }
                aqwVar = (aqw) objR2;
                aygVar.Y();
            } else {
                i6 = i7;
                aycVarC.u(356925151);
                ((ayg) aycVarC).Y();
                aqwVar = null;
            }
            ayp aypVar = bze.e;
            qqq qqqVar = (qqq) aycVarC.e(aypVar);
            aqi.b(str, cdoVar, qqqVar, aycVarC, (i6 & 14) | ((i6 >> 3) & ScriptIntrinsicBLAS.TRANSPOSE));
            if (aqwVar == null && uiqVar == null) {
                aycVarC.u(357885748);
                ((ayg) aycVarC).Y();
                bikVarCM = bikVar.cM(new TextStringSimpleElement(str, cdoVar, qqqVar, i, z, i2, i3, bkxVar2));
            } else {
                aycVarC.u(357242994);
                bik bikVarAm = am(bikVar, new ccm(str), cdoVar, uiqVar, i, z, i2, i3, (qqq) aycVarC.e(aypVar), null, null, aqwVar, bkxVar, null);
                ((ayg) aycVarC).Y();
                bikVarCM = bikVarAm;
            }
            aqj aqjVar = aqj.a;
            int iR = a.r(N(aycVarC));
            bik bikVarV = v(aycVarC, bikVarCM);
            ayg aygVar2 = (ayg) aycVarC;
            bfk bfkVarAg = aygVar2.ag();
            uif uifVar = bum.a;
            aycVarC.v();
            if (aygVar2.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, aqjVar, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            bbr.a(aycVarC, bikVarV, bum.b);
            uiu uiuVar = bum.e;
            if (aygVar2.v || !a.ao(aygVar2.R(), Integer.valueOf(iR))) {
                Integer numValueOf = Integer.valueOf(iR);
                aygVar2.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar);
            }
            aycVarC.m();
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: aqf
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    bik bikVar2 = bikVar;
                    cdo cdoVar2 = cdoVar;
                    uiq uiqVar2 = uiqVar;
                    int i8 = i;
                    boolean z2 = z;
                    int i9 = i2;
                    int i10 = i3;
                    bay.ac(str2, bikVar2, cdoVar2, uiqVar2, i8, z2, i9, i10, bkxVar, (ayc) obj, bay.j(i4 | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static final apv ad(int i) {
        return new apx(i);
    }

    public static final bik ae(bik bikVar) {
        return cbp.b(bikVar, false, new aks(5));
    }

    public static final void af(uiv uivVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-709502251);
        int i4 = 4;
        int i5 = 2;
        if (i3 == 0) {
            i2 = (true != aycVarC.D(uivVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i6 = 0;
        if (aycVarC.H((i2 & 3) != 2, i2 & 1)) {
            ayp aypVar = bfz.a;
            bfx bfxVar = (bfx) aycVarC.e(aypVar);
            bfs bfsVarM = bdq.m(aycVarC);
            Object[] objArr = {bfxVar};
            bgb bgbVar = new bgb(new ane(i5), new adp(bfxVar, bfsVarM, 7, null));
            boolean zD = aycVarC.D(bfxVar) | aycVarC.D(bfsVarM);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (zD || objR == ayb.a) {
                objR = new sn(bfxVar, bfsVarM, i4);
                aygVar.ac(objR);
            }
            apd apdVar = (apd) bdq.o(objArr, bgbVar, (uif) objR, aycVarC, 0);
            K(aypVar.b(apdVar), bdq.k(-412824043, new apf(uivVar, apdVar, 0), aycVarC), aycVarC, 56);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(uivVar, i, i6);
        }
    }

    public static final int ag(anb anbVar) {
        long jB = anbVar.b(0);
        return anbVar.b ? chy.b(jB) : chy.a(jB);
    }

    public static final float ah(int i, int i2) {
        return i2 + (i * 500);
    }

    public static final void ai(final bik bikVar, final ccm ccmVar, final uiq uiqVar, final boolean z, final Map map, final cdo cdoVar, final int i, final boolean z2, final int i2, final int i3, final qqq qqqVar, final aqw aqwVar, final uiq uiqVar2, ayc aycVar, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        aqp aqpVar;
        uif uifVar;
        List list;
        List list2;
        uiq uiqVar3;
        Object obj;
        uiq uiqVar4;
        Object aqqVar;
        int i10 = i4 & 6;
        ayc aycVarC = aycVar.c(-2118572703);
        if (i10 == 0) {
            i6 = (true != aycVarC.B(bikVar) ? 2 : 4) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= true != aycVarC.B(ccmVar) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i6 |= true != aycVarC.D(uiqVar) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i6 |= true != aycVarC.C(z) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i6 |= true != aycVarC.D(map) ? 8192 : 16384;
        }
        if ((196608 & i4) == 0) {
            i6 |= true != aycVarC.B(cdoVar) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i4) == 0) {
            i6 |= true != aycVarC.z(i) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if ((12582912 & i4) == 0) {
            i6 |= true != aycVarC.C(z2) ? 4194304 : 8388608;
        }
        if ((100663296 & i4) == 0) {
            i7 = i2;
            i6 |= true != aycVarC.z(i7) ? 33554432 : 67108864;
        } else {
            i7 = i2;
        }
        if ((805306368 & i4) == 0) {
            i6 |= true != aycVarC.z(i3) ? 268435456 : 536870912;
        }
        int i11 = i6;
        if ((i5 & 6) == 0) {
            i8 = (true != aycVarC.D(qqqVar) ? 2 : 4) | i5;
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= true != aycVarC.D(aqwVar) ? 16 : 32;
        }
        if ((i5 & 384) == 0) {
            z3 = true;
            i8 |= true != aycVarC.D(null) ? 128 : 256;
        } else {
            z3 = true;
        }
        if ((i5 & 3072) == 0) {
            i8 |= z3 == aycVarC.D(uiqVar2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i8 |= true == ((32768 & i5) == 0 ? aycVarC.B(null) : aycVarC.D(null)) ? 16384 : 8192;
        }
        if (aycVarC.H(((306783379 & i11) == 306783378 && (i8 & 9363) == 9362) ? false : true, i11 & 1)) {
            int i12 = i11 & ScriptIntrinsicBLAS.TRANSPOSE;
            if (amo.d(ccmVar)) {
                aycVarC.u(145660419);
                ayg aygVar = (ayg) aycVarC;
                Object objR = aygVar.R();
                i9 = i8;
                if (i12 == 32 || objR == ayb.a) {
                    objR = new aqp(ccmVar);
                    aygVar.ac(objR);
                }
                aygVar.Y();
                aqpVar = (aqp) objR;
            } else {
                i9 = i8;
                aycVarC.u(145726076);
                ((ayg) aycVarC).Y();
                aqpVar = null;
            }
            if (amo.d(ccmVar)) {
                aycVarC.u(145924291);
                boolean zB = (i12 == 32) | aycVarC.B(aqpVar);
                ayg aygVar2 = (ayg) aycVarC;
                Object objR2 = aygVar2.R();
                if (zB || objR2 == ayb.a) {
                    objR2 = new aet(aqpVar, ccmVar, 3);
                    aygVar2.ac(objR2);
                }
                uifVar = (uif) objR2;
                aygVar2.Y();
            } else {
                aycVarC.u(146021569);
                ayg aygVar3 = (ayg) aycVarC;
                Object objR3 = aygVar3.R();
                if (i12 == 32 || objR3 == ayb.a) {
                    objR3 = new aei(ccmVar, 5);
                    aygVar3.ac(objR3);
                }
                uifVar = (uif) objR3;
                aygVar3.Y();
            }
            uev uevVar = z ? aqd.a : new uev(null, null);
            List list3 = (List) uevVar.a;
            List list4 = (List) uevVar.b;
            if (z) {
                aycVarC.u(146337676);
                ayg aygVar4 = (ayg) aycVarC;
                Object objR4 = aygVar4.R();
                list = list4;
                if (objR4 == ayb.a) {
                    list2 = list3;
                    uiqVar3 = null;
                    Object azzVar = new azz(null, bap.c);
                    aygVar4.ac(azzVar);
                    objR4 = azzVar;
                } else {
                    list2 = list3;
                    uiqVar3 = null;
                }
                obj = (azr) objR4;
                aygVar4.Y();
            } else {
                list = list4;
                list2 = list3;
                uiqVar3 = null;
                aycVarC.u(146425436);
                ((ayg) aycVarC).Y();
                obj = null;
            }
            if (z) {
                aycVarC.u(146518685);
                boolean zB2 = aycVarC.B(obj);
                ayg aygVar5 = (ayg) aycVarC;
                Object objR5 = aygVar5.R();
                if (zB2 || objR5 == ayb.a) {
                    objR5 = new sh(obj, 16);
                    aygVar5.ac(objR5);
                }
                aygVar5.Y();
                uiqVar4 = (uiq) objR5;
            } else {
                aycVarC.u(146590108);
                ((ayg) aycVarC).Y();
                uiqVar4 = uiqVar3;
            }
            int i13 = (i11 >> 3) & 14;
            int i14 = 6;
            int i15 = ((i11 >> 12) & ScriptIntrinsicBLAS.TRANSPOSE) | i13 | ((i9 << 6) & 896);
            Object obj2 = obj;
            uif uifVar2 = uifVar;
            List list5 = list;
            aqi.c(ccmVar, cdoVar, qqqVar, list2, aycVarC, i15);
            ccm ccmVar2 = (ccm) uifVar2.a();
            boolean zD = aycVarC.D(aqpVar) | ((i11 & 896) == 256);
            ayg aygVar6 = (ayg) aycVarC;
            Object objR6 = aygVar6.R();
            if (zD || objR6 == ayb.a) {
                objR6 = new aff(aqpVar, uiqVar, i14);
                aygVar6.ac(objR6);
            }
            bik bikVarAm = am(bikVar, ccmVar2, cdoVar, (uiq) objR6, i, z2, i7, i3, qqqVar, list2, uiqVar4, aqwVar, null, uiqVar2);
            if (z) {
                aycVarC.u(147945522);
                boolean zD2 = aycVarC.D(aqpVar);
                Object objR7 = aygVar6.R();
                if (zD2 || objR7 == ayb.a) {
                    objR7 = new aei(aqpVar, 7);
                    aygVar6.ac(objR7);
                }
                uif uifVar3 = (uif) objR7;
                boolean zB3 = aycVarC.B(obj2);
                Object objR8 = aygVar6.R();
                if (zB3 || objR8 == ayb.a) {
                    objR8 = new aei(obj2, 8);
                    aygVar6.ac(objR8);
                }
                aqqVar = new aqq(uifVar3, (uif) objR8);
                aygVar6.Y();
            } else {
                aycVarC.u(147768791);
                boolean zD3 = aycVarC.D(aqpVar);
                Object objR9 = aygVar6.R();
                if (zD3 || objR9 == ayb.a) {
                    objR9 = new aei(aqpVar, i14);
                    aygVar6.ac(objR9);
                }
                aqqVar = new aql((uif) objR9);
                aygVar6.Y();
            }
            int iR = a.r(N(aycVarC));
            bfk bfkVarAg = aygVar6.ag();
            bik bikVarV = v(aycVarC, bikVarAm);
            uif uifVar4 = bum.a;
            aycVarC.v();
            if (aygVar6.v) {
                aycVarC.j(uifVar4);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, aqqVar, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            uiu uiuVar = bum.e;
            if (aygVar6.v || !a.ao(aygVar6.R(), Integer.valueOf(iR))) {
                Object objValueOf = Integer.valueOf(iR);
                aygVar6.ac(objValueOf);
                aycVarC.h(objValueOf, uiuVar);
            }
            bbr.a(aycVarC, bikVarV, bum.b);
            if (aqpVar == null) {
                aycVarC.u(-433557001);
            } else {
                aycVarC.u(-291080374);
                aqpVar.b(aycVarC, 0);
            }
            aygVar6.Y();
            if (list5 == null) {
                aycVarC.u(-433506223);
            } else {
                aycVarC.u(-433506222);
                aqd.a(ccmVar, list5, aycVarC, i13);
            }
            aygVar6.Y();
            aycVarC.m();
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: aqe
                @Override // defpackage.uiu
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    bik bikVar2 = bikVar;
                    ccm ccmVar3 = ccmVar;
                    uiq uiqVar5 = uiqVar;
                    boolean z4 = z;
                    Map map2 = map;
                    cdo cdoVar2 = cdoVar;
                    int i16 = i;
                    boolean z5 = z2;
                    int i17 = i2;
                    int i18 = i3;
                    qqq qqqVar2 = qqqVar;
                    aqw aqwVar2 = aqwVar;
                    int i19 = i4;
                    bay.ai(bikVar2, ccmVar3, uiqVar5, z4, map2, cdoVar2, i16, z5, i17, i18, qqqVar2, aqwVar2, uiqVar2, (ayc) obj3, bay.j(i19 | 1), bay.j(i5));
                    return ufg.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ defpackage.bik aj(defpackage.bik r11, defpackage.aus r12, java.util.Map r13, defpackage.aii r14, boolean r15, defpackage.ocq r16, defpackage.uiu r17, int r18) {
        /*
            r0 = r18
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto Le
            aud r1 = new aud
            r1.<init>(r2)
            r7 = r1
            goto L10
        Le:
            r7 = r17
        L10:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3f
            java.util.Set r1 = r13.keySet()
            int r5 = r1.size()
            if (r5 > r3) goto L21
            goto L3f
        L21:
            java.lang.Float r5 = defpackage.ske.by(r1)
            r5.getClass()
            float r5 = r5.floatValue()
            java.lang.Float r1 = defpackage.ske.bz(r1)
            r1.getClass()
            float r1 = r1.floatValue()
            float r5 = r5 - r1
            ata r1 = new ata
            r1.<init>(r5)
            r6 = r1
            goto L40
        L3f:
            r6 = r4
        L40:
            r1 = r0 & 8
            r0 = r0 & 32
            if (r1 == 0) goto L47
            goto L48
        L47:
            r2 = r3
        L48:
            r1 = r2 ^ 1
            if (r0 == 0) goto L4e
            r10 = r4
            goto L50
        L4e:
            r10 = r16
        L50:
            r9 = r1 | r15
            auh r3 = new auh
            r5 = r12
            r4 = r13
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            bik r11 = x(r11, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bay.aj(bik, aus, java.util.Map, aii, boolean, ocq, uiu, int):bik");
    }

    public static final rnu ak(uiu uiuVar) {
        bgr.m(bgr.a);
        synchronized (bgr.b) {
            bgr.f = ske.bK(bgr.f, uiuVar);
        }
        return new rnu(uiuVar, null);
    }

    private static final bgb al(arn arnVar) {
        return new bgb(new aqh(arnVar, 0), new add(12));
    }

    private static final bik am(bik bikVar, ccm ccmVar, cdo cdoVar, uiq uiqVar, int i, boolean z, int i2, int i3, qqq qqqVar, List list, uiq uiqVar2, aqw aqwVar, bkx bkxVar, uiq uiqVar3) {
        if (aqwVar == null) {
            return bikVar.cM(bik.c).cM(new TextAnnotatedStringElement(ccmVar, cdoVar, qqqVar, uiqVar, i, z, i2, i3, list, uiqVar2, bkxVar, uiqVar3));
        }
        return bikVar.cM(aqwVar.d).cM(new SelectableTextAnnotatedStringElement(ccmVar, cdoVar, qqqVar, uiqVar, i, z, i2, i3, list, uiqVar2, aqwVar, bkxVar));
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int iD = d(arrayList, i, i2);
        return iD >= 0 ? iD : -(iD + 1);
    }

    public static final int c(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 30);
    }

    public static final int d(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((axq) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iA = ujp.a(i5, i);
            if (iA < 0) {
                i3 = i4 + 1;
            } else {
                if (iA <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int e(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 28);
    }

    public static final axq f(ArrayList arrayList, int i, int i2) {
        int iD = d(arrayList, i, i2);
        if (iD >= 0) {
            return (axq) arrayList.get(iD);
        }
        return null;
    }

    public static final void g() {
        throw new ConcurrentModificationException();
    }

    public static final void h(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 3] = i2;
    }

    public static final void i(int[] iArr, int i, int i2) {
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final int j(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3);
    }

    public static final void k(bay bayVar) {
        utl utlVar;
        bfb bfbVar;
        bfb bfbVar2;
        do {
            utlVar = bao.k;
            bfbVar = (bfb) utlVar.c();
            bem bemVarC = bfbVar.d;
            byz byzVar = (byz) bemVarC.get(bayVar);
            if (byzVar == null) {
                bfbVar2 = bfbVar;
            } else {
                bev bevVar = bemVarC.b;
                bev bevVarJ = bevVar.j(bayVar != null ? bayVar.hashCode() : 0, bayVar, 0);
                if (bevVar != bevVarJ) {
                    bemVarC = bevVarJ == null ? bem.a : new bem(bevVarJ, bemVarC.b() - 1);
                }
                if (byzVar.m()) {
                    Object obj = byzVar.b;
                    Object obj2 = bemVarC.get(obj);
                    obj2.getClass();
                    bemVarC = bemVarC.c(obj, ((byz) obj2).o(byzVar.a));
                }
                if (byzVar.l()) {
                    Object obj3 = byzVar.a;
                    Object obj4 = bemVarC.get(obj3);
                    obj4.getClass();
                    bemVarC = bemVarC.c(obj3, new byz(byzVar.b, ((byz) obj4).a, (byte[]) null));
                }
                bfbVar2 = new bfb(!byzVar.m() ? byzVar.a : bfbVar.b, !byzVar.l() ? byzVar.b : bfbVar.c, bemVarC);
            }
            if (bfbVar == bfbVar2) {
                return;
            }
        } while (!utlVar.f(bfbVar, bfbVar2));
    }

    public static final void l(baz bazVar, List list, baj bajVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = bazVar.a((axq) list.get(i));
            int iN = bazVar.n(bazVar.b, bazVar.h(iA));
            Object obj = iN < bazVar.c(bazVar.b, bazVar.h(iA + 1)) ? bazVar.c[bazVar.d(iN)] : ayb.a;
            bai baiVar = obj instanceof bai ? (bai) obj : null;
            if (baiVar != null) {
                baiVar.b = bajVar;
            }
        }
    }

    public static final azo m(uhf uhfVar) {
        azo azoVar = (azo) uhfVar.get(azo.e);
        if (azoVar != null) {
            return azoVar;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object n(uiq uiqVar, uhb uhbVar) {
        return m(uhbVar.q()).a(new cjb(uiqVar, 1), uhbVar);
    }

    public static final Object o(uiq uiqVar, uhb uhbVar) {
        return m(uhbVar.q()).a(uiqVar, uhbVar);
    }

    public static final boolean p(cbn cbnVar) {
        return zu.e(cbnVar.c, cbm.g);
    }

    public static final boolean q(cbn cbnVar) {
        return zu.e(cbnVar.c, cbu.q);
    }

    public static Object r(bii biiVar, Object obj, uiu uiuVar) {
        return uiuVar.a(obj, biiVar);
    }

    public static boolean s(bii biiVar, uiq uiqVar) {
        return ((Boolean) uiqVar.a(biiVar)).booleanValue();
    }

    public static bik t(bik bikVar, bik bikVar2) {
        return bikVar2 == bik.c ? bikVar : new bif(bikVar, bikVar2);
    }

    public static final bik u(ayc aycVar, bik bikVar) {
        if (bikVar.c(aau.b)) {
            return bikVar;
        }
        aycVar.J();
        bik bikVar2 = (bik) bikVar.cN(bik.c, new bro(aycVar, 1));
        aycVar.o();
        return bikVar2;
    }

    public static final bik v(ayc aycVar, bik bikVar) {
        aycVar.u(439770924);
        bik bikVarU = u(aycVar, bikVar);
        aycVar.n();
        return bikVarU;
    }

    public static final bik x(bik bikVar, uiv uivVar) {
        return bikVar.cM(new big(uivVar));
    }

    public static final boolean y(Object obj, Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final int z(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }
}
