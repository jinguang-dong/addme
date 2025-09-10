package defpackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpu implements jrg {
    private final hws a;

    public jpu(hws hwsVar) {
        this.a = hwsVar;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r10v7, types: [sgt, shi] */
    @Override // defpackage.jrg
    public final float a(lnl lnlVar, lnl lnlVar2) {
        pas pasVar;
        int i;
        hws hwsVar = this.a;
        synchronized (hwsVar.b) {
            pasVar = hwsVar.c;
        }
        int i2 = pasVar.a;
        float fMax = 0.0f;
        if (i2 <= 0 || (i = pasVar.b) <= 0) {
            ((sgt) ((sgt) hws.a.c().g((char) 1, TimeUnit.SECONDS)).M((char) 1652)).s("Motion Distance cannot be estimated with 0x0 frame.");
            return 0.0f;
        }
        qib qibVarA = hwsVar.a(lnlVar, lnlVar2);
        if (qibVarA == null) {
            ((sgt) ((sgt) hws.a.c().g((char) 1, TimeUnit.SECONDS)).M((char) 1653)).s("Motion Distance cannot be estimated due to null transform.");
            return 0.0f;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new float[]{0.0f, 0.0f});
        float f = i2;
        arrayList.add(new float[]{f, 0.0f});
        float f2 = i;
        arrayList.add(new float[]{0.0f, f2});
        arrayList.add(new float[]{f, f2});
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            float[] fArrG = qibVarA.g((float[]) arrayList.get(i3));
            fMax = (float) Math.max(fMax, Math.hypot(fArrG[0] - r1[0], fArrG[1] - r1[1]));
        }
        return fMax;
    }

    public final String toString() {
        return "EisGyroFrameDistanceMetric";
    }
}
