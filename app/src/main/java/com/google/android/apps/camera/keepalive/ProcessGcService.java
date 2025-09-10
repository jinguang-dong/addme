package com.google.android.apps.camera.keepalive;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import defpackage.imf;
import defpackage.ink;
import defpackage.ist;
import defpackage.iua;
import defpackage.mdy;
import defpackage.pqn;
import defpackage.sgv;
import defpackage.soc;
import defpackage.sod;
import defpackage.std;
import defpackage.tpc;
import defpackage.tph;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ProcessGcService extends JobService {
    public static final sgv a = sgv.g("com.google.android.apps.camera.keepalive.ProcessGcService");
    public Handler b;
    public mdy c;
    public iua d;
    public pqn e;
    private boolean f = false;

    public final void a(int i) {
        mdy mdyVar = this.c;
        tpc tpcVarM = std.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        std stdVar = (std) tpcVarM.b;
        stdVar.c = i - 1;
        stdVar.b |= 1;
        long jUptimeMillis = SystemClock.uptimeMillis() - Process.getStartUptimeMillis();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        std stdVar2 = (std) tpcVarM.b;
        stdVar2.b |= 2;
        stdVar2.d = jUptimeMillis;
        std stdVar3 = (std) tpcVarM.l();
        tpc tpcVarM2 = sod.a.m();
        soc socVar = soc.PROCESS_GC_EVENT;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        sod sodVar = (sod) tphVar;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        sod sodVar2 = (sod) tpcVarM2.b;
        stdVar3.getClass();
        sodVar2.al = stdVar3;
        sodVar2.d |= 2048;
        mdyVar.I(tpcVarM2);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (!this.f) {
            ((ist) ((ink) getApplication()).d(ist.class)).f(this);
            this.f = true;
        }
        int i = 4;
        if (jobParameters.getExtras().getLong(CGlJpiVWrCQOq.TtfEayJ, -1L) != this.e.a) {
            a(4);
            return false;
        }
        this.b.post(new imf(this, jobParameters, i, (char[]) null));
        return true;
    }
}
