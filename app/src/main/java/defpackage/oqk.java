package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oqk extends ols {
    final /* synthetic */ oqm a;
    private boolean b;
    private final oqj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqk(oqm oqmVar, Looper looper) {
        super(looper);
        this.a = oqmVar;
        this.c = new oqj(0);
    }

    private final synchronized void c() {
        if (this.b) {
            return;
        }
        oqm oqmVar = this.a;
        oqmVar.bindService(oqmVar.b, this.c, 1);
        this.b = true;
    }

    @Override // defpackage.ols
    protected final void a(Message message) {
        c();
        try {
            super.a(message);
            if (hasMessages(0)) {
                return;
            }
            b();
        } catch (Throwable th) {
            if (!hasMessages(0)) {
                b();
            }
            throw th;
        }
    }

    public final synchronized void b() {
        if (this.b) {
            try {
                this.a.unbindService(this.c);
            } catch (RuntimeException e) {
                Log.e("WearableLS", "Exception when unbinding from local service", e);
            }
            this.b = false;
        }
    }
}
