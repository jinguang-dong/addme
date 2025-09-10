package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzk {
    public static final /* synthetic */ int a = 0;
    private static final String b = dwj.a("SystemJobScheduler");

    public static final JobScheduler a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobSchedulerForNamespace = ((JobScheduler) systemService).forNamespace("androidx.work.systemjobscheduler");
        jobSchedulerForNamespace.getClass();
        return jobSchedulerForNamespace;
    }

    public static final List b(JobScheduler jobScheduler) {
        jobScheduler.getClass();
        try {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
            return allPendingJobs;
        } catch (Throwable th) {
            String str = b;
            dwj.b();
            Log.e(str, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }
}
