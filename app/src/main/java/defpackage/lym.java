package defpackage;

import android.graphics.PointF;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lym extends nqg {
    final /* synthetic */ syu a;

    public lym(syu syuVar) {
        this.a = syuVar;
    }

    @Override // defpackage.nqh
    public final boolean a(PointF pointF) {
        lyq lyqVar = (lyq) ojl.ci(this.a);
        if (lyqVar == null) {
            return false;
        }
        out.a();
        float[] fArr = {pointF.x, pointF.y};
        lyqVar.m.mapPoints(fArr);
        lyqVar.h(new lyd(fArr, 1));
        lyqVar.w = Math.max(lyqVar.w, SystemClock.elapsedRealtime() + 1000);
        return false;
    }
}
