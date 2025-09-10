package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcm implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;

    public lcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        hbj hbjVar = (hbj) this.a.a();
        nkw nkwVarA = ((kid) this.b).a();
        boolean zBooleanValue = ((Boolean) this.c.a()).booleanValue();
        kgw kgwVarA = ((kiu) this.d).a();
        jwi jwiVar = (jwi) this.e.a();
        owq owqVar = (owq) this.f.a();
        lkk lkkVar = (lkk) this.g.a();
        lbb lbbVar = (lbb) this.h.a();
        owqVar.a(false);
        if (!hbjVar.p(haa.y) || !hbjVar.p(gzo.aV)) {
            return rvk.a;
        }
        if (kgwVarA.l() == pka.FRONT || !lkkVar.equals(lkk.AUTO)) {
            return rvk.a;
        }
        if (nkwVarA != nkw.PHOTO || zBooleanValue) {
            return rvk.a;
        }
        pas pasVar = null;
        CameraCharacteristics.Key key = (CameraCharacteristics.Key) jwiVar.a.orElse(null);
        if (key == null) {
            return rvk.a;
        }
        int[] iArr = (int[]) kgwVarA.m(key);
        if (iArr == null) {
            return rvk.a;
        }
        int i = lbbVar.c(lcz.RAW_WIDE, kgwVarA, false).a;
        List<pas> listY = kgwVarA.y(i);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < iArr.length; i2 += 4) {
            if (iArr[i2] == i && iArr[i2 + 3] == 1) {
                arrayList.add(new pas(iArr[i2 + 1], iArr[i2 + 2]));
            }
        }
        Arrays.toString(iArr);
        sbp sbpVarJ = sbp.j(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (pas pasVar2 : listY) {
            int size = sbpVarJ.size();
            for (int i3 = 0; i3 < size; i3++) {
                pas pasVar3 = (pas) sbpVarJ.get(i3);
                if (pasVar2.equals(pasVar3)) {
                    arrayList2.add(pasVar3);
                }
            }
        }
        sbp sbpVarJ2 = sbp.j(arrayList2);
        if (sbpVarJ2.isEmpty()) {
            ((sgt) lcl.a.c().M(3947)).y("[Reprocessing] Can not find matching size to reprocess format %d in camera %s", i, kgwVarA.j());
            return rvk.a;
        }
        if (sbpVarJ2.isEmpty()) {
            ((sgt) kqs.a.c().M(3383)).s("Input sizes is empty.");
        } else {
            int size2 = sbpVarJ2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                pas pasVar4 = (pas) sbpVarJ2.get(i4);
                if (pasVar == null || pasVar.b() < pasVar4.b()) {
                    pasVar = pasVar4;
                }
            }
            sbpVarJ2 = pasVar == null ? sex.a : sbp.l(pasVar);
        }
        if (sbpVarJ2.isEmpty()) {
            ((sgt) lcl.a.c().M(3946)).y("[Reprocessing] Can not find largest size to reprocess format %d in camera %s", i, kgwVarA.j());
            return rvk.a;
        }
        owqVar.a(true);
        return rwc.j(new ped(i, sbp.j(sbpVarJ2)));
    }
}
