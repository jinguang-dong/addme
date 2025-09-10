package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kyq extends kyw {
    private static final sgv a = sgv.g("kyq");
    private final kxg b;
    private final klf c;
    private final int d;

    public kyq(kxg kxgVar, kmz kmzVar, Set set, klf klfVar, int i, pbn pbnVar, kwr kwrVar) {
        super(kxgVar, kmzVar, set, pbnVar, kwrVar);
        this.b = kxgVar;
        this.c = klfVar;
        this.d = i;
    }

    @Override // defpackage.kyw
    protected final boolean d(List list, kmy kmyVar, gga ggaVar) {
        try {
            kle kleVarB = this.c.b(ggaVar);
            boolean z = false;
            try {
                if (kleVarB == null) {
                    ((sgt) a.b().M(3757)).s("Cannot acquire image saver session.");
                } else {
                    kmyVar.close();
                    int i = ((sex) list).c;
                    sgk it = ((sbp) list).iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        pdk pdkVar = (pdk) it.next();
                        try {
                            Set<peo> setB = this.b.b.b(Integer.valueOf(this.d));
                            sbk sbkVar = new sbk();
                            if (!setB.isEmpty()) {
                                try {
                                    ojl.by(pdkVar);
                                    for (peo peoVar : setB) {
                                        poj pojVarE = pdkVar.e(peoVar);
                                        if (pojVarE != null) {
                                            peoVar.d();
                                            sbkVar.h(new pog(pojVarE));
                                        }
                                    }
                                } catch (InterruptedException unused) {
                                    ((sgt) kxg.a.b().M(3573)).v("Error retrieving the images from Frame %s", pdkVar.b());
                                }
                            }
                            sbp sbpVarG = sbkVar.g();
                            poe poeVarD = pdkVar.d();
                            if (!sbpVarG.isEmpty() && poeVarD != null) {
                                kleVarB.a((poj) sbpVarG.get(0), ske.M(poeVarD));
                                z2 = true;
                            }
                            pdkVar.close();
                        } catch (Throwable th) {
                            pdkVar.close();
                            throw th;
                        }
                    }
                    if (z2) {
                        kleVarB.close();
                        z = true;
                    } else {
                        ((sgt) a.b().M(3756)).s("No images found.");
                        kleVarB.close();
                    }
                }
                return z;
            } finally {
            }
        } finally {
            kmyVar.close();
            kwp.a(list);
        }
    }
}
