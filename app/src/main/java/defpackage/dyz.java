package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.wear.ambient.AmbientLifecycleObserver;
import androidx.work.impl.WorkDatabase;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dyz {
    public static final /* synthetic */ int a = 0;

    static {
        dwj.a("Alarms");
    }

    public static void a(Context context, ebm ebmVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, dza.c(context, ebmVar), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        dwj.b();
        Objects.toString(ebmVar);
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, ebm ebmVar, long j) {
        ebh ebhVarY = workDatabase.y();
        ebg ebgVarC = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.C(ebhVarY, ebmVar);
        if (ebgVarC != null) {
            int i = ebgVarC.c;
            a(context, ebmVar, i);
            c(context, ebmVar, i, j);
            return;
        }
        ejs ejsVar = new ejs(workDatabase, (byte[]) null);
        Object objF = ((dco) ejsVar.a).f(new dyo(ejsVar, 3));
        objF.getClass();
        int iIntValue = ((Number) objF).intValue();
        ebhVarY.a(AmbientLifecycleObserver.AmbientLifecycleCallback.CC.B(ebmVar, iIntValue));
        c(context, ebmVar, iIntValue, j);
    }

    private static void c(Context context, ebm ebmVar, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, dza.c(context, ebmVar), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
