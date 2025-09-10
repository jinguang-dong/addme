package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obf extends oao {
    public boolean a;
    public boolean c;
    private final AlarmManager d;
    private Integer e;

    protected obf(oar oarVar) {
        super(oarVar);
        this.d = (AlarmManager) d().getSystemService("alarm");
    }

    @Override // defpackage.oao
    protected final void a() throws PackageManager.NameNotFoundException {
        try {
            c();
            if (obc.b() > 0) {
                Context contextD = d();
                ActivityInfo receiverInfo = contextD.getPackageManager().getReceiverInfo(new ComponentName(contextD, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo == null || !receiverInfo.enabled) {
                    return;
                }
                q("Receiver registered for local dispatch.");
                this.a = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final int b() {
        if (this.e == null) {
            this.e = Integer.valueOf("analytics".concat(String.valueOf(d().getPackageName())).hashCode());
        }
        return this.e.intValue();
    }

    public final void c() {
        this.c = false;
        try {
            AlarmManager alarmManager = this.d;
            Context contextD = d();
            alarmManager.cancel(PendingIntent.getBroadcast(contextD, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(contextD, "com.google.android.gms.analytics.AnalyticsReceiver")), 33554432));
        } catch (NullPointerException unused) {
        }
        JobScheduler jobScheduler = (JobScheduler) d().getSystemService("jobscheduler");
        int iB = b();
        r("Cancelling job. JobID", Integer.valueOf(iB));
        jobScheduler.cancel(iB);
    }
}
