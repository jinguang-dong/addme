package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.wear.ambient.AmbientLifecycleObserver;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzm implements dxl {
    public static final /* synthetic */ int a = 0;
    private static final String b = dwj.a("SystemJobScheduler");
    private final Context c;
    private final JobScheduler d;
    private final dzl e;
    private final WorkDatabase f;

    public dzm(Context context, WorkDatabase workDatabase) {
        JobScheduler jobSchedulerA = dzk.a(context);
        dzl dzlVar = new dzl(context);
        this.c = context;
        this.d = jobSchedulerA;
        this.e = dzlVar;
        this.f = workDatabase;
    }

    public static ebm a(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new ebm(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static List e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listB = dzk.b(jobScheduler);
        if (listB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listB) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void f(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            dwj.b();
            Log.e(b, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // defpackage.dxl
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.c;
        JobScheduler jobScheduler = this.d;
        List<JobInfo> listE = e(context, jobScheduler);
        if (listE == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : listE) {
                ebm ebmVarA = a(jobInfo);
                if (ebmVarA != null && str.equals(ebmVarA.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f(jobScheduler, ((Integer) it.next()).intValue());
        }
        ebh ebhVarY = this.f.y();
        ebl eblVar = (ebl) ebhVarY;
        dco dcoVar = eblVar.a;
        dcoVar.k();
        dfq dfqVarD = eblVar.c.d();
        dfqVarD.g(1, str);
        try {
            dcoVar.l();
            try {
                dfqVarD.a();
                dcoVar.p();
            } finally {
                ((ebl) ebhVarY).a.n();
            }
        } finally {
            eblVar.c.f(dfqVarD);
        }
    }

    @Override // defpackage.dxl
    public final void c(ebx... ebxVarArr) {
        int iIntValue;
        WorkDatabase workDatabase = this.f;
        ejs ejsVar = new ejs(workDatabase, (byte[]) null);
        for (ebx ebxVar : ebxVarArr) {
            workDatabase.l();
            try {
                eby ebyVarB = workDatabase.B();
                String str = ebxVar.b;
                ebx ebxVarA = ebyVarB.a(str);
                if (ebxVarA == null) {
                    dwj.b();
                    Log.w(b, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                } else if (ebxVarA.x != 1) {
                    dwj.b();
                    Log.w(b, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                } else {
                    ebm ebmVarA = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.A(ebxVar);
                    ebg ebgVarC = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.C(workDatabase.y(), ebmVarA);
                    if (ebgVarC != null) {
                        iIntValue = ebgVarC.c;
                    } else {
                        Object objF = ((dco) ejsVar.a).f(new dyo(ejsVar, 4));
                        objF.getClass();
                        iIntValue = ((Number) objF).intValue();
                    }
                    if (ebgVarC == null) {
                        workDatabase.y().a(AmbientLifecycleObserver.AmbientLifecycleCallback.CC.B(ebmVarA, iIntValue));
                    }
                    g(ebxVar, iIntValue);
                    workDatabase.p();
                }
                workDatabase.n();
            } catch (Throwable th) {
                this.f.n();
                throw th;
            }
        }
    }

    @Override // defpackage.dxl
    public final boolean d() {
        return true;
    }

    public final void g(ebx ebxVar, int i) throws IOException {
        int i2;
        String strCa;
        dvv dvvVar = ebxVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = ebxVar.b;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", ebxVar.r);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", ebxVar.d());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, this.e.a).setRequiresCharging(dvvVar.c);
        boolean z = dvvVar.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        NetworkRequest networkRequestA = dvvVar.a();
        if (networkRequestA != null) {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        } else {
            int i3 = dvvVar.j;
            if (i3 == 6) {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            } else {
                int i4 = i3 - 1;
                if (i4 == 0) {
                    i2 = 0;
                } else if (i4 == 1) {
                    i2 = 1;
                } else if (i4 != 2) {
                    i2 = 3;
                    if (i4 != 3) {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                extras.setRequiredNetworkType(i2);
            }
        }
        if (!z) {
            extras.setBackoffCriteria(ebxVar.l, ebxVar.y == 2 ? 0 : 1);
        }
        long jMax = Math.max(ebxVar.a() - System.currentTimeMillis(), 0L);
        if (jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!ebxVar.p) {
            extras.setImportantWhileForeground(true);
        }
        if (dvvVar.b()) {
            for (dvu dvuVar : dvvVar.i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dvuVar.a, dvuVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(dvvVar.g);
            extras.setTriggerContentMaxDelay(dvvVar.h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(dvvVar.e);
        extras.setRequiresStorageNotLow(dvvVar.f);
        int i5 = ebxVar.k;
        if (ebxVar.p && i5 <= 0 && jMax <= 0) {
            extras.setExpedited(true);
        }
        String str2 = ebxVar.v;
        if (str2 != null) {
            extras.setTraceTag(str2);
        }
        JobInfo jobInfoBuild = extras.build();
        dwj.b();
        try {
            if (this.d.schedule(jobInfoBuild) == 0) {
                dwj.b();
                Log.w(b, "Unable to schedule work ID " + str);
                if (ebxVar.p && ebxVar.z == 1) {
                    ebxVar.p = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", str);
                    dwj.b();
                    g(ebxVar, i);
                }
            }
        } catch (IllegalStateException e) {
            Context context = this.c;
            WorkDatabase workDatabase = this.f;
            int i6 = dzk.a;
            int size = workDatabase.B().c().size();
            JobScheduler jobSchedulerA = dzk.a(context);
            List listB = dzk.b(jobSchedulerA);
            if (listB != null) {
                List listE = e(context, jobSchedulerA);
                int size2 = listE != null ? listB.size() - listE.size() : 0;
                String str3 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                Object systemService = context.getSystemService("jobscheduler");
                systemService.getClass();
                List listE2 = e(context, (JobScheduler) systemService);
                int size3 = listE2 != null ? listE2.size() : 0;
                strCa = ske.ca(rnt.ao(new String[]{listB.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str3, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
            } else {
                strCa = "<faulty JobScheduler failed to getPendingJobs>";
            }
            String str4 = "JobScheduler 150 job limit exceeded.\nIn JobScheduler there are " + strCa + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.";
            dwj.b();
            Log.e(b, str4);
            throw new IllegalStateException(str4, e);
        } catch (Throwable th) {
            dwj.b();
            String str5 = b;
            Objects.toString(ebxVar);
            Log.e(str5, "Unable to schedule ".concat(String.valueOf(ebxVar)), th);
        }
    }
}
