package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ohf extends ols {
    final /* synthetic */ ohm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohf(ohm ohmVar, Looper looper) {
        super(looper);
        this.a = ohmVar;
    }

    private static final void b(Message message) {
        ohg ohgVar = (ohg) message.obj;
        if (ohgVar != null) {
            ohgVar.e();
        }
    }

    private static final boolean c(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, ofu] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws ClassNotFoundException {
        Object obj;
        ohm ohmVar = this.a;
        if (ohmVar.n.get() != message.arg1) {
            if (c(message)) {
                b(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !ohmVar.l()) {
            b(message);
            return;
        }
        if (message.what == 4) {
            ohmVar.k = new odj(message.arg2);
            if (!ohmVar.l && !TextUtils.isEmpty(ohmVar.c()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(ohmVar.c());
                    ohm ohmVar2 = this.a;
                    if (!ohmVar2.l) {
                        ohmVar2.J(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ohm ohmVar3 = this.a;
            odj odjVar = ohmVar3.k;
            if (odjVar == null) {
                odjVar = new odj(8);
            }
            ohmVar3.f.a(odjVar);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 5) {
            ohm ohmVar4 = this.a;
            odj odjVar2 = ohmVar4.k;
            if (odjVar2 == null) {
                odjVar2 = new odj(8);
            }
            ohmVar4.f.a(odjVar2);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 3) {
            this.a.f.a(new odj(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null));
            System.currentTimeMillis();
            return;
        }
        if (message.what == 6) {
            ohm ohmVar5 = this.a;
            ohmVar5.J(5, null);
            rnu rnuVar = ohmVar5.r;
            if (rnuVar != null) {
                rnuVar.a.a(message.arg2);
            }
            int i = message.arg2;
            ohmVar5.G();
            ohmVar5.A(5, 1, null);
            return;
        }
        if (message.what == 2 && !this.a.k()) {
            b(message);
            return;
        }
        if (!c(message)) {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        ohg ohgVar = (ohg) message.obj;
        synchronized (ohgVar) {
            obj = ohgVar.d;
            if (ohgVar.e) {
                Log.w("GmsClient", a.bx(ohgVar, "Callback proxy ", " being reused. This is not safe."));
            }
        }
        if (obj != null) {
            ohgVar.c();
        }
        synchronized (ohgVar) {
            ohgVar.e = true;
        }
        ohgVar.e();
    }
}
