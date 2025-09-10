package com.google.android.apps.camera.sideline;

import android.app.job.JobParameters;
import android.app.job.JobService;
import defpackage.ink;
import defpackage.lwi;
import defpackage.lwk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SidelineJobService extends JobService {
    public lwk a;

    @Override // android.app.Service
    public final void onCreate() {
        ((lwi) ((ink) getApplicationContext()).d(lwi.class)).v(this);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (!this.a.b()) {
            return false;
        }
        this.a.a();
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
