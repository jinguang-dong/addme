package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gkq {
    private static final sgv d = sgv.g(OPuAVreQM.CFlEUMVPQdCwiLm);
    public final our a;
    public final Object b = new Object();
    public ExecutorService c;
    private final fee e;
    private final peq f;
    private final lnt g;
    private final lob h;
    private final nms i;
    private final pjo j;
    private final pfu k;

    public gkq(pfu pfuVar, fee feeVar, peq peqVar, lnt lntVar, lob lobVar, nms nmsVar, our ourVar, pjo pjoVar) {
        this.k = pfuVar;
        this.e = feeVar;
        this.f = peqVar;
        this.g = lntVar;
        this.h = lobVar;
        this.i = nmsVar;
        this.a = ourVar;
        this.j = pjoVar;
    }

    final synchronized paq a() {
        pdn pdnVarC;
        pfu pfuVar = this.k;
        peo peoVarA = pfuVar.a.a(this.f);
        pdnVarC = pfuVar.c(pfuVar.d(peoVarA), 2);
        pdnVarC.l(new fmz(this, peoVarA, 4));
        return new gge(pdnVarC, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [pnx] */
    /* JADX WARN: Type inference failed for: r0v21, types: [pnx] */
    public final synchronized void b(pdk pdkVar, peo peoVar) {
        poe poeVar;
        try {
            poj pojVarE = pdkVar.e(peoVar);
            try {
                poe poeVarD = pdkVar.d();
                if (pojVarE == null) {
                    ((sgt) d.c().M(928)).v("Image from frame %s null", pdkVar);
                } else {
                    if (poeVarD == null) {
                        ((sgt) d.c().M(927)).v("Result from frame %s null", pdkVar);
                    } else {
                        pao paoVarB = this.e.b(this.j);
                        String str = (String) poeVarD.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
                        Rect rect = null;
                        poe poeVar2 = poeVarD;
                        if (str != null) {
                            Map mapG = poeVarD.g();
                            poeVar2 = poeVarD;
                            if (!mapG.isEmpty()) {
                                if (mapG.containsKey(str)) {
                                    poeVar = (pnx) mapG.get(str);
                                } else {
                                    Map.Entry entry = (Map.Entry) mapG.entrySet().iterator().next();
                                    str = (String) entry.getKey();
                                    poeVar = (pnx) entry.getValue();
                                }
                                rect = (Rect) poeVar.a(CaptureResult.SCALER_CROP_REGION);
                                poeVar2 = poeVar;
                            }
                        }
                        String str2 = str;
                        poe poeVar3 = poeVar2;
                        Rect rect2 = (Rect) this.i.b(str2).m(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                        this.h.d(this.g.a(pojVarE, new lnl(poeVar3, paoVarB.e, rect2, str2, rect == null ? rect2 : rect)));
                    }
                    pojVarE.close();
                }
                pdkVar.close();
            } finally {
            }
        } catch (Throwable th) {
            pdkVar.close();
            throw th;
        }
    }
}
