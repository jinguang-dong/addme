package com.google.android.libraries.mdi.download.workmanager.workers;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;
import defpackage.dvx;
import defpackage.dwf;
import defpackage.dwi;
import defpackage.pvu;
import defpackage.pzw;
import defpackage.qcp;
import defpackage.qsz;
import defpackage.ske;
import defpackage.syu;
import defpackage.syw;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PeriodicWorker extends dwi {
    public final pvu e;
    private final Executor f;

    public PeriodicWorker(Context context, WorkerParameters workerParameters, pvu pvuVar, syw sywVar) {
        super(context, workerParameters);
        this.e = pvuVar;
        this.f = sywVar;
    }

    @Override // defpackage.dwi
    public final syu a() {
        dvx dvxVarC = c();
        String strB = dvxVarC.b("MDD_TASK_TAG_KEY");
        if (strB == null) {
            Log.e("MddPeriodicWorker", "can't find MDD task tag");
            return ske.M(new dwf());
        }
        qcp qcpVar = new qcp(this, strB, dvxVarC, 2);
        Executor executor = this.f;
        return qsz.m(qsz.l(qcpVar, executor), new pzw(17), executor);
    }
}
