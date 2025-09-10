package defpackage;

import android.os.SystemClock;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jyi implements kbq {
    final /* synthetic */ long a;
    final /* synthetic */ kbq b;
    final /* synthetic */ jyj c;

    public jyi(jyj jyjVar, long j, kbq kbqVar) {
        this.a = j;
        this.b = kbqVar;
        this.c = jyjVar;
    }

    @Override // defpackage.kbq
    public final void a() {
        jyj jyjVar = this.c;
        jyjVar.a.b("cancelled");
        jyjVar.c.c(SystemClock.elapsedRealtime() - this.a, "cancelled");
        this.b.a();
    }

    @Override // defpackage.kbq
    public final void c(poj pojVar) {
        d(pojVar, false, false);
    }

    @Override // defpackage.kbq
    public final void d(poj pojVar, boolean z, boolean z2) {
        jyj jyjVar = this.c;
        jyjVar.a.b("success");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        jyjVar.c.c(jElapsedRealtime - this.a, "success");
        this.b.d(new jyh(this, pojVar, jElapsedRealtime, pojVar), z, z2);
    }

    @Override // defpackage.kbq
    public final void b(Throwable th) {
        if (th instanceof TimeoutException) {
            jyj jyjVar = this.c;
            jyjVar.a.b("timeout");
            jyjVar.c.c(SystemClock.elapsedRealtime() - this.a, "timeout");
        } else {
            jyj jyjVar2 = this.c;
            String str = JvFFEwFNdCrxf.zZSGiRlzaf;
            jyjVar2.a.b(str);
            jyjVar2.c.c(SystemClock.elapsedRealtime() - this.a, str);
        }
        this.b.b(th);
    }
}
