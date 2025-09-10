package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class dzb extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    static {
        dwj.a("ConstraintProxy");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dwj.b();
        Objects.toString(intent);
        context.startService(dza.b(context));
    }
}
