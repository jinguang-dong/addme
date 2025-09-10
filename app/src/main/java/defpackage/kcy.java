package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kcy implements kcx {
    private static final sgv a = sgv.g("kcy");
    private final gnt b;
    private final owf c;
    private final pjo d;
    private final gtm e;

    public kcy(gnt gntVar, owf owfVar, pjo pjoVar, gtm gtmVar) {
        this.b = gntVar;
        this.c = owfVar;
        this.d = pjoVar;
        this.e = gtmVar;
    }

    @Override // defpackage.kcx
    public final pas a(oxj oxjVar) {
        pas pasVarC;
        if (((Boolean) this.c.dL()).booleanValue()) {
            pasVarC = pae.i(oxjVar.c()).l(pae.c) ? oxj.RES_720P_3X4.c() : oxj.RES_720P.c();
        } else {
            oxj oxjVar2 = oxj.RES_UNKNOWN;
            int iOrdinal = oxjVar.ordinal();
            pasVarC = iOrdinal != 6 ? iOrdinal != 7 ? iOrdinal != 9 ? iOrdinal != 11 ? oxj.RES_1080P.c() : oxj.RES_2160P_3X4.c() : oxj.RES_1080P_3X4.c() : oxj.RES_720P_3X4.c() : oxj.RES_720P.c();
        }
        List listZ = ((pjo) this.b.d().c()).z();
        rnt.I(listZ.contains(pasVarC), "Unable to find suitable viewfinder size %s from supported list: %s", pasVarC, listZ);
        return pasVarC;
    }

    @Override // defpackage.kcx
    public final peq b(oxj oxjVar, pjr pjrVar) {
        pas pasVarA = a(oxjVar);
        if (!((Boolean) this.c.dL()).booleanValue()) {
            return prh.L(pjrVar, pasVarA);
        }
        pep pepVarA = peq.a();
        pepVarA.r(pet.IMAGE_READER);
        pepVarA.b(pjrVar);
        pepVarA.n(pasVarA);
        pepVarA.i(34);
        pepVarA.c(7);
        pepVarA.s(256L);
        return pepVarA.a();
    }

    @Override // defpackage.kcx
    public final Map c(oxj oxjVar, pjr pjrVar, boolean z) {
        if (z) {
            ((sgt) a.c().M(3243)).s("Raw streams aren't supported. Ignore the flag.");
        }
        EnumMap enumMap = new EnumMap(lcz.class);
        pep pepVarA = peq.a();
        pepVarA.n(oxjVar.c());
        pepVarA.b(pjrVar);
        pepVarA.i(34);
        pepVarA.c(26);
        pepVarA.r(pet.IMAGE_READER);
        this.e.k();
        pepVarA.s(65536L);
        pepVarA.f(true);
        long[] jArr = (long[]) this.d.m(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null) {
            for (long j : jArr) {
                if (j == 3) {
                    pepVarA.t(3L);
                }
            }
        }
        enumMap.put((EnumMap) lcz.PRIVATE_RECORDING, (lcz) pepVarA.a());
        return enumMap;
    }
}
