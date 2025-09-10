package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class odm extends ols {
    final /* synthetic */ odn a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odm(odn odnVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.a = odnVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        if (message.what != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
            return;
        }
        odn odnVar = this.a;
        Context context = this.b;
        int iE = odnVar.e(context);
        int i = oef.c;
        if (iE == 1 || iE == 2 || iE == 3 || iE == 9) {
            odnVar.d(context, iE, odnVar.h(context, iE, "n"));
        }
    }
}
