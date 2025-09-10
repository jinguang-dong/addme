package defpackage;

import android.content.Context;
import android.hardware.SensorManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsl implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public hsl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hvg a() {
        Context contextB = ((imm) this.a).b();
        owq owqVar = (owq) this.b.a();
        hbj hbjVar = (hbj) this.c.a();
        owqVar.getClass();
        hbjVar.getClass();
        Object systemService = contextB.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        gzg gzgVar = gyy.a;
        rnt.x(sensorManager);
        Object objDL = owqVar.dL();
        objDL.getClass();
        return new hvg(sensorManager, ((Number) objDL).intValue());
    }
}
