package com.google.android.gms.analytics;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import defpackage.lqd;
import defpackage.oar;
import defpackage.obc;
import defpackage.obm;
import defpackage.obt;
import defpackage.obu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AnalyticsJobService extends JobService implements obt {
    private obu a;

    private final obu c() {
        if (this.a == null) {
            this.a = new obu((Context) this);
        }
        return this.a;
    }

    @Override // defpackage.obt
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.obt
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        c().a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        c().e(intent, i2);
        return 2;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        obu obuVarC = c();
        oar oarVarC = oar.c((Context) obuVarC.b);
        obm obmVarD = oarVarC.d();
        String string = jobParameters.getExtras().getString("action");
        obc obcVar = oarVarC.c;
        obmVarD.r("Local AnalyticsJobService called. action", string);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            return true;
        }
        obuVarC.c(new lqd(obuVarC, obmVarD, jobParameters, 15));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
