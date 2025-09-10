package defpackage;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfg implements lfc {
    private final Map a;
    private final rwc b;
    private final pbn c;
    private final pfu d;

    public lfg(pfu pfuVar, Map map, rwc rwcVar, pbn pbnVar) {
        this.d = pfuVar;
        this.a = map;
        this.b = rwcVar;
        this.c = pbnVar;
    }

    @Override // defpackage.lfc
    public final pdv a(pdv pdvVar) {
        Set<peo> setD = pdvVar.d();
        if (setD.size() == 1) {
            return pdvVar;
        }
        EnumMap enumMap = new EnumMap(lcz.class);
        rwc rwcVar = this.b;
        peo peoVar = (peo) (rwcVar.h() ? rwcVar.c() : this.a.get(lcz.RAW_WIDE));
        for (peo peoVar2 : setD) {
            if (kzz.i(peoVar2)) {
                pjr pjrVarD = peoVar2.d();
                peoVar.getClass();
                if (pjrVarD.equals(peoVar.d())) {
                    enumMap.put((EnumMap) lcz.a, (lcz) peoVar2);
                } else {
                    lcz lczVar = lcz.a;
                    if (!enumMap.containsKey(lczVar)) {
                        enumMap.put((EnumMap) lczVar, (lcz) peoVar2);
                    }
                }
            } else if (kzz.h(peoVar2)) {
                enumMap.put((EnumMap) lcz.PD, (lcz) peoVar2);
            } else {
                long jA = peoVar2.a();
                if (jA == 35 || jA == 39 || jA == 40) {
                    enumMap.put((EnumMap) lcz.YUV_ANALYSIS, (lcz) peoVar2);
                }
            }
        }
        return this.d.g(new HashSet(enumMap.values()), pdvVar.c());
    }

    @Override // defpackage.lfc
    public final scn b(lau lauVar) {
        pjr pjrVarD;
        pbn pbnVar = this.c;
        pbnVar.f("SKYA#DustyScroll");
        if (lauVar.m() != null) {
            peo peoVarM = lauVar.m();
            peoVarM.getClass();
            pjrVarD = peoVarM.d();
        } else {
            pjrVarD = null;
        }
        scl sclVar = new scl();
        for (peo peoVar : lauVar.a.c().d()) {
            if ((kzz.i(peoVar) && !peoVar.d().equals(pjrVarD)) || kzz.h(peoVar) || peoVar.a() == 256) {
                sclVar.d(peoVar);
            }
        }
        pbnVar.g();
        return sclVar.g();
    }
}
