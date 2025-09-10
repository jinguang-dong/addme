package defpackage;

import android.content.res.Resources;
import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iiy extends ojl {
    final /* synthetic */ pdk a;
    final /* synthetic */ pau b;
    public final /* synthetic */ ija c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iiy(ija ijaVar, pdk pdkVar, pau pauVar) {
        super((short[]) null);
        this.a = pdkVar;
        this.b = pauVar;
        this.c = ijaVar;
    }

    @Override // defpackage.ojl
    public final void dY() throws Resources.NotFoundException {
        Long l;
        pdk pdkVar = this.a;
        poe poeVarD = pdkVar.d();
        if (poeVarD != null) {
            ija ijaVar = this.c;
            ijaVar.g.a(poeVarD);
            ijo ijoVar = ijaVar.o;
            if (ijoVar != null && (l = (Long) poeVarD.a(CaptureResult.SENSOR_EXPOSURE_TIME)) != null) {
                float fLongValue = l.longValue();
                ijj ijjVar = ijoVar.d;
                float f = fLongValue / 1000000.0f;
                synchronized (ijjVar.q) {
                    ijjVar.r = f;
                }
            }
        }
        pdkVar.close();
        ija ijaVar2 = this.c;
        if (ijaVar2.l.compareAndSet(false, true)) {
            ijaVar2.e.execute(new hdk(this, this.b, 20));
        }
    }
}
