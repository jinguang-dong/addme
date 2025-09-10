package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import defpackage.obt;
import defpackage.obu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AnalyticsService extends Service implements obt {
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
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        c();
        return null;
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
}
