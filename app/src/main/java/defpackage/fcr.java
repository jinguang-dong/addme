package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import com.google.ar.core.ImageMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fcr extends ojl {
    private static final sgv a = sgv.g("fcr");
    private final Boolean b;
    private final float c;
    private final owf d;
    private final pka e;
    private final boolean f;
    private final nkw g;
    private final pjr h;
    private int i;
    private final List j;
    private poe k;
    private int l;
    private int m;
    private int n;
    private final mdy o;

    public fcr(mdy mdyVar, Boolean bool, pjo pjoVar, owf owfVar, pjr pjrVar, nkw nkwVar) {
        super((short[]) null);
        this.j = new ArrayList();
        this.k = null;
        boolean z = false;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = mdyVar;
        this.b = bool;
        this.d = owfVar;
        Rect rectI = pjoVar.i();
        this.c = rectI.width() * rectI.height();
        this.e = pjoVar.l();
        this.h = pjrVar;
        if (pjoVar.M() && pjoVar.D()) {
            z = true;
        }
        this.f = z;
        this.g = nkwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x03dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.fcq cm(defpackage.poe r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcr.cm(poe):fcq");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [sgt, shi] */
    private static rwc cn(poe poeVar, boolean z, boolean z2, boolean z3) {
        MeteringRectangle[] meteringRectangleArr;
        MeteringRectangle[] meteringRectangleArr2;
        MeteringRectangle[] meteringRectangleArr3;
        ArrayList arrayList = new ArrayList();
        Float fValueOf = null;
        if (z) {
            try {
                meteringRectangleArr = (MeteringRectangle[]) poeVar.a(CaptureResult.CONTROL_AF_REGIONS);
            } catch (IllegalArgumentException e) {
                ((sgt) ((sgt) a.c().i(e)).M((char) 23)).s("Error retrieving CONTROL_AF_REGIONS.");
                meteringRectangleArr = null;
            }
            if (meteringRectangleArr != null) {
                Collections.addAll(arrayList, meteringRectangleArr);
            }
        }
        if (z2 && (meteringRectangleArr3 = (MeteringRectangle[]) poeVar.a(CaptureResult.CONTROL_AE_REGIONS)) != null) {
            Collections.addAll(arrayList, meteringRectangleArr3);
        }
        if (z3 && (meteringRectangleArr2 = (MeteringRectangle[]) poeVar.a(CaptureResult.CONTROL_AWB_REGIONS)) != null) {
            Collections.addAll(arrayList, meteringRectangleArr2);
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            float width = 0.0f;
            for (int i = 0; i < size; i++) {
                MeteringRectangle meteringRectangle = (MeteringRectangle) arrayList.get(i);
                width += meteringRectangle.getWidth() * meteringRectangle.getHeight();
            }
            fValueOf = Float.valueOf(width);
        }
        return rwc.i(fValueOf);
    }

    private final synchronized void co(List list, int i, int i2) {
        List list2;
        List listB;
        int iC;
        int iD;
        if (list.isEmpty()) {
            return;
        }
        int i3 = i2;
        if (i3 != 3) {
            i3 = 2;
        }
        List arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i3 == 2) {
            list2 = list;
            fcq fcqVar = (fcq) list2.get(0);
            List listA = fcqVar.a();
            listB = fcqVar.b();
            iD = fcqVar.d();
            iC = fcqVar.c();
            arrayList = listA;
        } else {
            list2 = list;
            listB = arrayList2;
            iC = 0;
            iD = 0;
        }
        if (i3 == 3) {
            int size = list2.size();
            for (int i4 = 0; i4 < 41; i4++) {
                Iterator it = list2.iterator();
                float fFloatValue = 0.0f;
                boolean z = false;
                while (it.hasNext()) {
                    rwc rwcVar = (rwc) ((fcq) it.next()).a().get(i4);
                    if (rwcVar.h()) {
                        fFloatValue += ((Float) rwcVar.c()).floatValue();
                        z = true;
                    }
                }
                arrayList.add(z ? rwc.j(Float.valueOf(fFloatValue / size)) : rvk.a);
            }
            fcq fcqVar2 = (fcq) ujp.aQ(list2);
            listB = fcqVar2.b();
            iD = fcqVar2.d();
            iC = fcqVar2.c();
        }
        rwc rwcVar2 = (rwc) arrayList.get(0);
        rwc rwcVar3 = (rwc) arrayList.get(1);
        rwc rwcVar4 = (rwc) arrayList.get(2);
        rwc rwcVar5 = (rwc) arrayList.get(3);
        rwc rwcVar6 = (rwc) arrayList.get(4);
        rwc rwcVar7 = (rwc) arrayList.get(5);
        rwc rwcVar8 = (rwc) arrayList.get(6);
        rwc rwcVar9 = (rwc) arrayList.get(7);
        rwc rwcVar10 = (rwc) arrayList.get(8);
        rwc rwcVar11 = (rwc) arrayList.get(9);
        rwc rwcVar12 = (rwc) arrayList.get(10);
        rwc rwcVar13 = (rwc) arrayList.get(11);
        rwc rwcVar14 = (rwc) arrayList.get(12);
        rwc rwcVar15 = (rwc) arrayList.get(13);
        rwc rwcVar16 = (rwc) arrayList.get(14);
        rwc rwcVar17 = (rwc) arrayList.get(15);
        rwc rwcVar18 = (rwc) arrayList.get(16);
        rwc rwcVar19 = (rwc) arrayList.get(17);
        rwc rwcVar20 = (rwc) arrayList.get(18);
        rwc rwcVar21 = (rwc) arrayList.get(19);
        rwc rwcVar22 = (rwc) arrayList.get(20);
        rwc rwcVar23 = (rwc) arrayList.get(21);
        rwc rwcVar24 = (rwc) arrayList.get(22);
        rwc rwcVar25 = (rwc) arrayList.get(23);
        rwc rwcVar26 = (rwc) arrayList.get(24);
        rwc rwcVar27 = (rwc) arrayList.get(25);
        rwc rwcVar28 = (rwc) arrayList.get(26);
        rwc rwcVar29 = (rwc) arrayList.get(27);
        rwc rwcVar30 = (rwc) arrayList.get(28);
        rwc rwcVar31 = (rwc) arrayList.get(29);
        rwc rwcVar32 = (rwc) arrayList.get(30);
        rwc rwcVar33 = (rwc) arrayList.get(31);
        rwc rwcVar34 = (rwc) arrayList.get(32);
        rwc rwcVar35 = (rwc) arrayList.get(33);
        rwc rwcVar36 = (rwc) arrayList.get(34);
        rwc rwcVar37 = (rwc) arrayList.get(35);
        rwc rwcVar38 = (rwc) arrayList.get(36);
        rwc rwcVar39 = (rwc) arrayList.get(37);
        rwc rwcVar40 = (rwc) arrayList.get(38);
        rwc rwcVar41 = (rwc) arrayList.get(39);
        rwc rwcVar42 = (rwc) arrayList.get(40);
        rwc rwcVar43 = (rwc) listB.get(0);
        rwc rwcVar44 = (rwc) listB.get(1);
        rwc rwcVar45 = (rwc) listB.get(2);
        rwc rwcVar46 = (rwc) listB.get(3);
        rwc rwcVar47 = (rwc) listB.get(4);
        rwc rwcVar48 = (rwc) listB.get(5);
        rwc rwcVar49 = (rwc) listB.get(6);
        rwc rwcVar50 = (rwc) listB.get(7);
        rwc rwcVar51 = (rwc) listB.get(8);
        rwc rwcVar52 = (rwc) listB.get(9);
        rwc rwcVar53 = (rwc) listB.get(10);
        rwc rwcVar54 = (rwc) listB.get(11);
        rwc rwcVar55 = (rwc) listB.get(12);
        rwc rwcVar56 = (rwc) listB.get(13);
        rwc rwcVar57 = (rwc) listB.get(14);
        rwc rwcVar58 = (rwc) listB.get(15);
        rwc rwcVar59 = (rwc) listB.get(16);
        tpc tpcVarM = stq.a.m();
        int size2 = list2.size();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        stq stqVar = (stq) tpcVarM.b;
        stqVar.b |= 1;
        stqVar.e = size2;
        if (rwcVar2.h()) {
            float fFloatValue2 = ((Float) rwcVar2.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar2 = (stq) tpcVarM.b;
            stqVar2.b |= 2;
            stqVar2.f = fFloatValue2;
        }
        if (rwcVar3.h()) {
            float fFloatValue3 = ((Float) rwcVar3.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar3 = (stq) tpcVarM.b;
            stqVar3.b |= 8;
            stqVar3.g = fFloatValue3;
        }
        if (rwcVar4.h()) {
            float fFloatValue4 = ((Float) rwcVar4.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar4 = (stq) tpcVarM.b;
            stqVar4.b |= 16;
            stqVar4.h = fFloatValue4;
        }
        if (rwcVar5.h()) {
            float fFloatValue5 = ((Float) rwcVar5.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar5 = (stq) tpcVarM.b;
            stqVar5.b |= 32;
            stqVar5.i = fFloatValue5;
        }
        if (rwcVar6.h()) {
            float fFloatValue6 = ((Float) rwcVar6.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar6 = (stq) tpcVarM.b;
            stqVar6.b |= 64;
            stqVar6.j = fFloatValue6;
        }
        if (rwcVar7.h()) {
            float fFloatValue7 = ((Float) rwcVar7.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar7 = (stq) tpcVarM.b;
            stqVar7.b |= 128;
            stqVar7.k = fFloatValue7;
        }
        if (rwcVar8.h()) {
            float fFloatValue8 = ((Float) rwcVar8.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar8 = (stq) tpcVarM.b;
            stqVar8.b |= 256;
            stqVar8.l = fFloatValue8;
        }
        if (rwcVar9.h()) {
            float fFloatValue9 = ((Float) rwcVar9.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar9 = (stq) tpcVarM.b;
            stqVar9.b |= 512;
            stqVar9.m = fFloatValue9;
        }
        if (rwcVar10.h()) {
            float fFloatValue10 = ((Float) rwcVar10.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar10 = (stq) tpcVarM.b;
            stqVar10.b |= 1024;
            stqVar10.n = fFloatValue10;
        }
        if (rwcVar11.h()) {
            float fFloatValue11 = ((Float) rwcVar11.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar11 = (stq) tpcVarM.b;
            stqVar11.b |= 2048;
            stqVar11.o = fFloatValue11;
        }
        if (rwcVar12.h()) {
            float fFloatValue12 = ((Float) rwcVar12.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar12 = (stq) tpcVarM.b;
            stqVar12.b |= 4096;
            stqVar12.p = fFloatValue12;
        }
        if (rwcVar13.h()) {
            float fFloatValue13 = ((Float) rwcVar13.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar13 = (stq) tpcVarM.b;
            stqVar13.b |= 8192;
            stqVar13.q = fFloatValue13;
        }
        if (rwcVar14.h()) {
            float fFloatValue14 = ((Float) rwcVar14.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar14 = (stq) tpcVarM.b;
            stqVar14.b |= 16384;
            stqVar14.r = fFloatValue14;
        }
        if (rwcVar15.h()) {
            float fFloatValue15 = ((Float) rwcVar15.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar15 = (stq) tpcVarM.b;
            stqVar15.b |= 32768;
            stqVar15.s = fFloatValue15;
        }
        if (rwcVar16.h()) {
            float fFloatValue16 = ((Float) rwcVar16.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar16 = (stq) tpcVarM.b;
            stqVar16.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            stqVar16.t = fFloatValue16;
        }
        if (rwcVar17.h()) {
            float fFloatValue17 = ((Float) rwcVar17.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar17 = (stq) tpcVarM.b;
            stqVar17.b |= 131072;
            stqVar17.u = fFloatValue17;
        }
        if (rwcVar18.h()) {
            float fFloatValue18 = ((Float) rwcVar18.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar18 = (stq) tpcVarM.b;
            stqVar18.b |= 262144;
            stqVar18.v = fFloatValue18;
        }
        if (rwcVar19.h()) {
            float fFloatValue19 = ((Float) rwcVar19.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar19 = (stq) tpcVarM.b;
            stqVar19.b |= ImageMetadata.LENS_APERTURE;
            stqVar19.w = fFloatValue19;
        }
        if (rwcVar20.h()) {
            float fFloatValue20 = ((Float) rwcVar20.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar20 = (stq) tpcVarM.b;
            stqVar20.b |= ImageMetadata.SHADING_MODE;
            stqVar20.x = fFloatValue20;
        }
        if (rwcVar21.h()) {
            float fFloatValue21 = ((Float) rwcVar21.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar21 = (stq) tpcVarM.b;
            stqVar21.b |= 2097152;
            stqVar21.y = fFloatValue21;
        }
        if (rwcVar22.h()) {
            float fFloatValue22 = ((Float) rwcVar22.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar22 = (stq) tpcVarM.b;
            stqVar22.b |= 4194304;
            stqVar22.z = fFloatValue22;
        }
        if (rwcVar23.h()) {
            float fFloatValue23 = ((Float) rwcVar23.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar23 = (stq) tpcVarM.b;
            stqVar23.b |= 8388608;
            stqVar23.A = fFloatValue23;
        }
        if (rwcVar24.h()) {
            float fFloatValue24 = ((Float) rwcVar24.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar24 = (stq) tpcVarM.b;
            stqVar24.b |= 16777216;
            stqVar24.B = fFloatValue24;
        }
        if (rwcVar25.h()) {
            float fFloatValue25 = ((Float) rwcVar25.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar25 = (stq) tpcVarM.b;
            stqVar25.b |= 33554432;
            stqVar25.C = fFloatValue25;
        }
        if (rwcVar26.h()) {
            float fFloatValue26 = ((Float) rwcVar26.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar26 = (stq) tpcVarM.b;
            stqVar26.b |= 67108864;
            stqVar26.D = fFloatValue26;
        }
        if (rwcVar27.h()) {
            float fFloatValue27 = ((Float) rwcVar27.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar27 = (stq) tpcVarM.b;
            stqVar27.b |= 134217728;
            stqVar27.E = fFloatValue27;
        }
        if (rwcVar28.h()) {
            float fFloatValue28 = ((Float) rwcVar28.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar28 = (stq) tpcVarM.b;
            stqVar28.b |= 268435456;
            stqVar28.F = fFloatValue28;
        }
        if (rwcVar43.h()) {
            int iIntValue = ((Integer) rwcVar43.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar29 = (stq) tpcVarM.b;
            stqVar29.b |= 536870912;
            stqVar29.G = iIntValue;
        }
        if (rwcVar29.h()) {
            float fFloatValue29 = ((Float) rwcVar29.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar30 = (stq) tpcVarM.b;
            stqVar30.b |= 1073741824;
            stqVar30.H = fFloatValue29;
        }
        if (rwcVar30.h()) {
            float fFloatValue30 = ((Float) rwcVar30.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar31 = (stq) tpcVarM.b;
            stqVar31.b |= Integer.MIN_VALUE;
            stqVar31.I = fFloatValue30;
        }
        if (rwcVar44.h()) {
            int iIntValue2 = ((Integer) rwcVar44.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar32 = (stq) tpcVarM.b;
            stqVar32.c |= 1;
            stqVar32.J = iIntValue2;
        }
        if (rwcVar31.h()) {
            float fFloatValue31 = ((Float) rwcVar31.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar33 = (stq) tpcVarM.b;
            stqVar33.c |= 2;
            stqVar33.K = fFloatValue31;
        }
        if (rwcVar32.h()) {
            float fFloatValue32 = ((Float) rwcVar32.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar34 = (stq) tpcVarM.b;
            stqVar34.c |= 4;
            stqVar34.L = fFloatValue32;
        }
        if (rwcVar33.h()) {
            float fFloatValue33 = ((Float) rwcVar33.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar35 = (stq) tpcVarM.b;
            stqVar35.c |= 8;
            stqVar35.M = fFloatValue33;
        }
        if (rwcVar34.h()) {
            float fFloatValue34 = ((Float) rwcVar34.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar36 = (stq) tpcVarM.b;
            stqVar36.c |= 16;
            stqVar36.N = fFloatValue34;
        }
        if (rwcVar45.h()) {
            int iIntValue3 = ((Integer) rwcVar45.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar37 = (stq) tpcVarM.b;
            stqVar37.c |= 32;
            stqVar37.O = iIntValue3;
        }
        if (rwcVar35.h()) {
            float fFloatValue35 = ((Float) rwcVar35.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar38 = (stq) tpcVarM.b;
            stqVar38.c |= 64;
            stqVar38.P = fFloatValue35;
        }
        if (rwcVar36.h()) {
            float fFloatValue36 = ((Float) rwcVar36.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar39 = (stq) tpcVarM.b;
            stqVar39.c |= 128;
            stqVar39.Q = fFloatValue36;
        }
        if (rwcVar37.h()) {
            float fFloatValue37 = ((Float) rwcVar37.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar40 = (stq) tpcVarM.b;
            stqVar40.c |= 256;
            stqVar40.R = fFloatValue37;
        }
        if (rwcVar38.h()) {
            float fFloatValue38 = ((Float) rwcVar38.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar41 = (stq) tpcVarM.b;
            stqVar41.c |= 512;
            stqVar41.S = fFloatValue38;
        }
        if (rwcVar39.h()) {
            float fFloatValue39 = ((Float) rwcVar39.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar42 = (stq) tpcVarM.b;
            stqVar42.c |= 1024;
            stqVar42.T = fFloatValue39;
        }
        if (rwcVar46.h()) {
            int iIntValue4 = ((Integer) rwcVar46.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar43 = (stq) tpcVarM.b;
            stqVar43.c |= 4096;
            stqVar43.V = iIntValue4;
        }
        if (rwcVar47.h()) {
            int iIntValue5 = ((Integer) rwcVar47.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar44 = (stq) tpcVarM.b;
            stqVar44.c |= 8192;
            stqVar44.W = iIntValue5;
        }
        if (rwcVar40.h()) {
            float fFloatValue40 = ((Float) rwcVar40.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar45 = (stq) tpcVarM.b;
            stqVar45.c |= 32768;
            stqVar45.X = fFloatValue40;
        }
        if (rwcVar41.h()) {
            float fFloatValue41 = ((Float) rwcVar41.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar46 = (stq) tpcVarM.b;
            stqVar46.c |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            stqVar46.Y = fFloatValue41;
        }
        if (rwcVar48.h()) {
            int iIntValue6 = ((Integer) rwcVar48.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar47 = (stq) tpcVarM.b;
            stqVar47.c |= 131072;
            stqVar47.Z = iIntValue6;
        }
        if (rwcVar49.h()) {
            int iIntValue7 = ((Integer) rwcVar49.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar48 = (stq) tpcVarM.b;
            stqVar48.c |= 262144;
            stqVar48.aa = iIntValue7;
        }
        if (rwcVar42.h()) {
            float fFloatValue42 = ((Float) rwcVar42.c()).floatValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar49 = (stq) tpcVarM.b;
            stqVar49.c |= 4194304;
            stqVar49.ac = fFloatValue42;
        }
        if (rwcVar50.h()) {
            int iIntValue8 = ((Integer) rwcVar50.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar50 = (stq) tpcVarM.b;
            stqVar50.c |= 8388608;
            stqVar50.ad = iIntValue8;
        }
        if (rwcVar51.h()) {
            int iIntValue9 = ((Integer) rwcVar51.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar51 = (stq) tpcVarM.b;
            stqVar51.c |= 16777216;
            stqVar51.ae = iIntValue9;
        }
        if (rwcVar52.h()) {
            int iIntValue10 = ((Integer) rwcVar52.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar52 = (stq) tpcVarM.b;
            stqVar52.c |= 33554432;
            stqVar52.af = iIntValue10;
        }
        if (rwcVar53.h()) {
            int iIntValue11 = ((Integer) rwcVar53.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar53 = (stq) tpcVarM.b;
            stqVar53.c |= 67108864;
            stqVar53.ag = iIntValue11;
        }
        if (rwcVar54.h()) {
            int iIntValue12 = ((Integer) rwcVar54.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar54 = (stq) tpcVarM.b;
            stqVar54.c |= 134217728;
            stqVar54.ah = iIntValue12;
        }
        if (rwcVar55.h()) {
            int iIntValue13 = ((Integer) rwcVar55.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar55 = (stq) tpcVarM.b;
            stqVar55.c |= 268435456;
            stqVar55.ai = iIntValue13;
        }
        if (rwcVar56.h()) {
            int iIntValue14 = ((Integer) rwcVar56.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar56 = (stq) tpcVarM.b;
            stqVar56.c |= 536870912;
            stqVar56.aj = iIntValue14;
        }
        if (rwcVar57.h()) {
            int iIntValue15 = ((Integer) rwcVar57.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar57 = (stq) tpcVarM.b;
            stqVar57.c |= 1073741824;
            stqVar57.ak = iIntValue15;
        }
        if (rwcVar58.h()) {
            int iIntValue16 = ((Integer) rwcVar58.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar58 = (stq) tpcVarM.b;
            stqVar58.c |= Integer.MIN_VALUE;
            stqVar58.al = iIntValue16;
        }
        if (rwcVar59.h()) {
            int iIntValue17 = ((Integer) rwcVar59.c()).intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq stqVar59 = (stq) tpcVarM.b;
            stqVar59.d |= 1;
            stqVar59.am = iIntValue17;
        }
        if (i == 2) {
            int i5 = this.l;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar = tpcVarM.b;
            stq stqVar60 = (stq) tphVar;
            stqVar60.c |= ImageMetadata.LENS_APERTURE;
            stqVar60.ab = i5;
            int i6 = this.m;
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            stq.b((stq) tpcVarM.b, i6);
            int i7 = this.n;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stq.c((stq) tpcVarM.b, i7);
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        stq stqVar61 = (stq) tphVar2;
        stqVar61.U = ske.i(iD);
        stqVar61.c |= 2048;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        stq.d((stq) tpcVarM.b, iC);
        stq stqVar62 = (stq) tpcVarM.l();
        mdy mdyVar = this.o;
        tpc tpcVarM2 = sts.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sts.c((sts) tpcVarM2.b, i);
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sts.d((sts) tpcVarM2.b, i3);
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sts.b((sts) tpcVarM2.b, stqVar62);
        mdyVar.p((sts) tpcVarM2.l());
    }

    @Override // defpackage.ojl
    public final synchronized void a(poe poeVar) {
        if (this.b.booleanValue()) {
            this.k = poeVar;
            int i = this.i + 1;
            this.i = i;
            if (i <= 60) {
                Integer num = (Integer) poeVar.a(CaptureResult.CONTROL_AE_STATE);
                if (num != null && (num.intValue() == 1 || num.intValue() == 5)) {
                    this.l++;
                }
                Integer num2 = (Integer) poeVar.a(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && (num2.intValue() == 3 || num2.intValue() == 1)) {
                    this.m++;
                }
                Integer num3 = (Integer) poeVar.a(CaptureResult.CONTROL_AWB_STATE);
                if (num3 != null && num3.intValue() == 1) {
                    this.n++;
                }
                try {
                    this.j.add(cm(poeVar));
                } catch (IOException | IllegalArgumentException unused) {
                }
                if (this.i == 60) {
                    co(this.j, 2, 3);
                }
            }
        }
    }

    public final synchronized void b(int i) {
        poe poeVar;
        if (this.b.booleanValue() && (poeVar = this.k) != null) {
            try {
                co(sbp.l(cm(poeVar)), i, 2);
            } catch (IOException | IllegalArgumentException e) {
                e.getMessage();
            }
        }
    }
}
