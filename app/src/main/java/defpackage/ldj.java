package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldj {
    private static final sgv a = sgv.g("ldj");

    public static poe a(lau lauVar, boolean z) {
        String str;
        poe poeVarD = lauVar.a.d();
        if (poeVarD == null) {
            ((sgt) a.c().M(3996)).s("Couldn't acquire metadata from the frame.");
            return null;
        }
        if (!lauVar.t()) {
            return poeVarD;
        }
        if (z) {
            str = lauVar.l().d().a;
        } else {
            peo peoVarM = lauVar.m();
            if (peoVarM == null) {
                return null;
            }
            str = peoVarM.d().a;
        }
        return b(poeVarD, str);
    }

    public static poe b(poe poeVar, String str) {
        return (poe) Map.EL.getOrDefault(poeVar.h(), str, poeVar);
    }
}
