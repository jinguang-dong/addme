package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import j$.lang.Iterable$EL;
import j$.util.Map;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcn implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final tzx i;
    private final tzx j;
    private final tzx k;

    public lcn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
        this.i = tzxVar9;
        this.j = tzxVar10;
        this.k = tzxVar11;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        nkw nkwVar = (nkw) this.a.a();
        kgw kgwVar = (kgw) this.d.a();
        hbj hbjVar = (hbj) this.e.a();
        owf owfVarB = ((ims) this.f).b();
        lkk lkkVar = (lkk) this.g.a();
        rwc rwcVar = (rwc) this.h.a();
        owf owfVar = (owf) this.i.a();
        boolean zBooleanValue = ((koh) this.j).b().booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.k.a()).booleanValue();
        EnumMap enumMap = new EnumMap(lcz.class);
        nkw nkwVar2 = nkw.UNINITIALIZED;
        int iOrdinal = nkwVar.ordinal();
        tzx tzxVar = this.c;
        tzx tzxVar2 = this.b;
        if (iOrdinal == 6) {
            if (kgwVar.M() && kgwVar.D() && hbjVar.p(gzo.aU)) {
                gzg gzgVar = hak.w;
                if ((hbjVar.p(gzgVar) || hbjVar.o(hak.ak)) && kgwVar.l() == pka.BACK) {
                    lcz lczVar = lcz.RAW_WIDE;
                    uem uemVar = (uem) ((Map) tzxVar.a()).get(lczVar);
                    uemVar.getClass();
                    enumMap.put((EnumMap) lczVar, (lcz) uemVar.a());
                    if (!((Boolean) ((ovx) owfVarB).d).booleanValue() && hbjVar.p(gzgVar)) {
                        Map map = (Map) tzxVar.a();
                        lcz lczVar2 = lcz.RAW_ULTRAWIDE;
                        if (map.containsKey(lczVar2)) {
                            enumMap.put((EnumMap) lcz.RAW_TELE, (lcz) ((uem) ((Map) tzxVar.a()).get(lczVar2)).a());
                        } else {
                            lcz lczVar3 = lcz.RAW_TELE;
                            uem uemVar2 = (uem) ((Map) tzxVar.a()).get(lczVar3);
                            uemVar2.getClass();
                            enumMap.put((EnumMap) lczVar3, (lcz) uemVar2.a());
                        }
                    }
                    if (zBooleanValue) {
                        Map map2 = (Map) tzxVar.a();
                        lcz lczVar4 = lcz.RAW_WIDE_RM;
                        if (map2.containsKey(lczVar4)) {
                            enumMap.put((EnumMap) lczVar4, (lcz) ((uem) ((Map) tzxVar.a()).get(lczVar4)).a());
                        }
                    }
                }
            }
            if (kgwVar.l() == pka.FRONT && kgwVar.M() && kgwVar.D() && hbjVar.p(gza.a)) {
                Map.EL.forEach((java.util.Map) tzxVar.a(), new fvk(enumMap, 4));
                return enumMap;
            }
            enumMap.put((EnumMap) lcz.a, (lcz) tzxVar2.a());
            return enumMap;
        }
        if (iOrdinal != 7) {
            boolean zBooleanValue3 = ((Boolean) owfVar.dL()).booleanValue();
            boolean zEquals = lkkVar.equals(lkk.AUTO);
            boolean z = hbjVar.p(gzo.aU) && zEquals;
            kgwVar.j();
            kgwVar.M();
            kgwVar.D();
            kgwVar.n(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, new int[0]);
            kgwVar.C();
            if (((kgwVar.l() == pka.BACK && z) || (kgwVar.l() == pka.FRONT && kzz.m(hbjVar, nkwVar, zBooleanValue3))) && kgwVar.M() && kgwVar.D()) {
                Map.EL.forEach((java.util.Map) tzxVar.a(), new glv(enumMap, 5));
                return enumMap;
            }
            Object objC = ((peq) tzxVar2.a()).b.c();
            enumMap.put((EnumMap) lcz.a, (lcz) tzxVar2.a());
            if (!zEquals && rwcVar.h() && zBooleanValue2 && hbjVar.p(han.l)) {
                Iterable$EL.forEach(scn.I(lcz.RAW_WIDE, lcz.RAW_TELE, lcz.RAW_ULTRAWIDE), new ksy(tzxVar, ((pjo) ((uem) rwcVar.c()).a()).j(), (pjr) objC, enumMap, 2));
                return enumMap;
            }
        }
        return enumMap;
    }
}
