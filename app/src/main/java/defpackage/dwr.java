package defpackage;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwr extends dwt {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwr(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        timeUnit.getClass();
        ebx ebxVar = this.b;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            dwj.b();
            Log.w(ebx.a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long jQ = ukc.q(millis, 900000L);
        long jQ2 = ukc.q(millis, 900000L);
        if (jQ < 900000) {
            dwj.b();
            Log.w(ebx.a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        ebxVar.h = ukc.q(jQ, 900000L);
        if (jQ2 < 300000) {
            dwj.b();
            Log.w(ebx.a, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (jQ2 > ebxVar.h) {
            dwj.b();
            Log.w(ebx.a, mn.h(jQ, "Flex duration greater than interval duration; Changed to "));
        }
        ebxVar.i = ukc.s(jQ2, 300000L, ebxVar.h);
    }

    @Override // defpackage.dwt
    public final /* bridge */ /* synthetic */ tdy a() {
        ebx ebxVar = this.b;
        if (ebxVar.p) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new tdy(this.a, ebxVar, this.c);
    }
}
