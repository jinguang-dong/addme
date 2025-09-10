package defpackage;

import android.os.CountDownTimer;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kda extends CountDownTimer {
    int a;
    long b;
    public final /* synthetic */ kdb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kda(kdb kdbVar) {
        super(2147483647L, 12000L);
        this.c = kdbVar;
        this.a = 0;
        this.b = -1L;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        kdb kdbVar = this.c;
        kdbVar.b.remove(kdbVar.d);
        fel felVar = (fel) ojl.ci(kdbVar.i);
        if (felVar != null) {
            felVar.c();
        }
    }

    @Override // android.os.CountDownTimer
    public final synchronized void onTick(long j) {
        if (this.b == -1) {
            this.b = j;
            return;
        }
        kdb kdbVar = this.c;
        List list = kdbVar.b;
        if (!list.contains(kdbVar.d) && this.b - j >= TimeUnit.SECONDS.toMillis(30L)) {
            list.add(kdbVar.d);
            this.a = list.size() - 1;
        }
        nan nanVar = (nan) list.get(this.a);
        int i = this.a + 1;
        this.a = i;
        this.a = i % list.size();
        kdbVar.a.execute(new kee(this, nanVar, 1));
    }
}
