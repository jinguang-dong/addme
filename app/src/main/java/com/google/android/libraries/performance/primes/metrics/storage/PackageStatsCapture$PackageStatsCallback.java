package com.google.android.libraries.performance.primes.metrics.storage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import defpackage.qnj;
import defpackage.sgt;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class PackageStatsCapture$PackageStatsCallback extends IPackageStatsObserver.Stub {
    private final Semaphore a = new Semaphore(1);
    private volatile PackageStats b;

    private PackageStatsCapture$PackageStatsCallback() {
    }

    public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
        if (z) {
            this.b = packageStats;
        } else {
            ((sgt) qnj.a.c().M(5770)).s("Failure getting PackageStats");
        }
        this.a.release();
    }
}
