package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrb implements qqs {
    public final syx a;
    public final tzj b;

    public qrb(qqq qqqVar, Context context, syx syxVar, tzj tzjVar, uem uemVar, uem uemVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        qqqVar.a(syxVar, tzjVar, uemVar);
        this.a = syxVar;
        this.b = tzjVar;
        rnt.y(new pxk(this, context, 2));
        rnt.y(new nxi(uemVar2, 12));
    }

    public final synchronized void a() {
    }

    @Override // defpackage.qqs
    public final void cA() {
        ske.P(new qly(this, 3), this.a);
    }
}
