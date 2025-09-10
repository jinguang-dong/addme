package defpackage;

import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.apps.camera.keepalive.ProcessGcService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isn implements mcw {
    private final Application a;
    private final JobScheduler b;
    private final int c;
    private final pqn d;

    public isn(Application application, JobScheduler jobScheduler, hbj hbjVar, pqn pqnVar) {
        this.a = application;
        this.b = jobScheduler;
        this.c = ((Integer) hbjVar.a(gzo.i).get()).intValue();
        this.d = pqnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JobInfo.Builder requiresDeviceIdle = new JobInfo.Builder(900990555, new ComponentName(this.a, (Class<?>) ProcessGcService.class)).setEstimatedNetworkBytes(0L, 0L).setRequiresDeviceIdle(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putLong("keepalive_sig", this.d.a);
        JobInfo jobInfoBuild = requiresDeviceIdle.setExtras(persistableBundle).setMinimumLatency(TimeUnit.SECONDS.toMillis(this.c)).build();
        JobScheduler jobScheduler = this.b;
        jobScheduler.cancel(900990555);
        jobScheduler.schedule(jobInfoBuild);
    }
}
