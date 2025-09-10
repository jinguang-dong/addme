package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.Log;
import defpackage.a;
import defpackage.cpo;
import defpackage.dwj;
import defpackage.dwy;
import defpackage.dxj;
import defpackage.dxo;
import defpackage.dyj;
import defpackage.ebm;
import defpackage.ebn;
import defpackage.ejs;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SystemJobService extends JobService implements dwy {
    private static final String a = dwj.a("SystemJobService");
    private dyj b;
    private final Map c = new HashMap();
    private final dxo d = cpo.n(false);
    private ebn e;

    private static ebm b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new ebm(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private static void c(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a.bw(str, "Cannot invoke ", " on a background thread"));
        }
    }

    @Override // defpackage.dwy
    public final void a(ebm ebmVar, boolean z) {
        c("onExecuted");
        dwj.b();
        JobParameters jobParameters = (JobParameters) this.c.remove(ebmVar);
        this.d.c(ebmVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            dyj dyjVarA = dyj.a(getApplicationContext());
            this.b = dyjVarA;
            dxj dxjVar = dyjVarA.f;
            this.e = new ebn(dxjVar, dyjVarA.k);
            dxjVar.a(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            dwj.b();
            Log.w(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        dyj dyjVar = this.b;
        if (dyjVar != null) {
            dyjVar.f.b(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        c("onStartJob");
        if (this.b == null) {
            dwj.b();
            jobFinished(jobParameters, true);
            return false;
        }
        ebm ebmVarB = b(jobParameters);
        if (ebmVarB == null) {
            dwj.b();
            Log.e(a, "WorkSpec id not found!");
            return false;
        }
        Map map = this.c;
        if (map.containsKey(ebmVarB)) {
            dwj.b();
            Objects.toString(ebmVarB);
            ebmVarB.toString();
            return false;
        }
        dwj.b();
        Objects.toString(ebmVarB);
        ebmVarB.toString();
        map.put(ebmVarB, jobParameters);
        cpo cpoVar = new cpo(null, null);
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        jobParameters.getNetwork();
        this.e.h(this.d.d(ebmVarB), cpoVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        c("onStopJob");
        if (this.b == null) {
            dwj.b();
            return true;
        }
        ebm ebmVarB = b(jobParameters);
        if (ebmVarB == null) {
            dwj.b();
            Log.e(a, "WorkSpec id not found!");
            return false;
        }
        dwj.b();
        Objects.toString(ebmVarB);
        ebmVarB.toString();
        this.c.remove(ebmVarB);
        ejs ejsVarC = this.d.c(ebmVarB);
        if (ejsVarC != null) {
            int stopReason = jobParameters.getStopReason();
            switch (stopReason) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                case 15:
                    break;
                default:
                    stopReason = -512;
                    break;
            }
            this.e.c(ejsVarC, stopReason);
        }
        dxj dxjVar = this.b.f;
        String str = ebmVarB.a;
        synchronized (dxjVar.f) {
            zContains = dxjVar.d.contains(str);
        }
        return !zContains;
    }
}
