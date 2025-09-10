package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmj implements hlc {
    public final plc a;
    public final Object b = new Object();
    public plb c;
    public final hms d;

    public hmj(plc plcVar, hms hmsVar) {
        this.a = plcVar;
        this.d = hmsVar;
    }

    @Override // defpackage.hlc
    public final void a(pdk pdkVar, peo peoVar) {
        pdo pdoVarB;
        synchronized (this.b) {
            plb plbVar = this.c;
            if (plbVar != null && (pdoVarB = pdkVar.b()) != null) {
                final long j = pdoVarB.b;
                plbVar.b((-3000000) + j, 3000000 + j, new pla() { // from class: hmi
                    @Override // defpackage.pla
                    public final void a(List list) {
                        long j2;
                        pld pldVar;
                        if (list.size() > 10) {
                            ((sgt) hwn.a.c().M(1642)).s("Warning: Samples used for vector determination is larger than 10 elements. This code is O(n) and expects small list sizes!");
                        }
                        Iterator it = list.iterator();
                        float[] fArr = null;
                        pld pldVar2 = null;
                        while (true) {
                            j2 = j;
                            if (!it.hasNext()) {
                                pldVar = null;
                                break;
                            }
                            pldVar = (pld) it.next();
                            rnt.B(pldVar2 == null || pldVar.e > pldVar2.e, "samples must be sorted ascending in time");
                            if (pldVar.e > j2) {
                                break;
                            } else {
                                pldVar2 = pldVar;
                            }
                        }
                        if (pldVar2 == null) {
                            if (pldVar != null) {
                                fArr = new float[]{pldVar.f, pldVar.g, pldVar.h};
                            }
                        } else if (pldVar == null) {
                            fArr = new float[]{pldVar2.f, pldVar2.g, pldVar2.h};
                        } else {
                            long j3 = pldVar2.e;
                            double d = (j2 - j3) / (pldVar.e - j3);
                            fArr = new float[]{hwn.a(pldVar2.f, pldVar.f, d), hwn.a(pldVar2.g, pldVar.g, d), hwn.a(pldVar2.h, pldVar.h, d)};
                        }
                        if (fArr != null) {
                            this.a.d.f(j2, fArr);
                        }
                    }
                });
            }
        }
    }
}
