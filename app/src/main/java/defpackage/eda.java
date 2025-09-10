package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eda {
    static {
        dwj.a("ProcessUtils");
    }

    public static final boolean a(Context context, dvs dvsVar) {
        context.getClass();
        dvsVar.getClass();
        String processName = Application.getProcessName();
        processName.getClass();
        return a.ao(processName, context.getApplicationInfo().processName);
    }
}
