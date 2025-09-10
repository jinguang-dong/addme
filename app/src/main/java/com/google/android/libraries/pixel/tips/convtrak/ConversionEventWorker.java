package com.google.android.libraries.pixel.tips.convtrak;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.rau;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversionEventWorker extends CoroutineWorker {
    private final Context e;
    private final rau f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversionEventWorker(Context context, WorkerParameters workerParameters, rau rauVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        rauVar.getClass();
        this.e = context;
        this.f = rauVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r6.b(r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.uhb r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.rav
            if (r0 == 0) goto L13
            r0 = r7
            rav r0 = (defpackage.rav) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rav r0 = new rav
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.rnt.aN(r7)
            goto Lab
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.rnt.aN(r7)
            goto L44
        L37:
            defpackage.rnt.aN(r7)
            rau r7 = r6.f
            r0.c = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto Lb1
        L44:
            java.util.List r7 = (java.util.List) r7
            r7.size()
            java.util.Iterator r2 = r7.iterator()
        L4d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r2.next()
            raz r4 = (defpackage.raz) r4
            goto L4d
        L5a:
            rba r2 = defpackage.rba.a
            tpc r2 = r2.m()
            tph r4 = r2.b
            boolean r4 = r4.C()
            if (r4 != 0) goto L6b
            r2.o()
        L6b:
            tph r4 = r2.b
            rba r4 = (defpackage.rba) r4
            r4.b()
            tpw r4 = r4.b
            defpackage.tnq.e(r7, r4)
            tph r7 = r2.l()
            r7.getClass()
            rba r7 = (defpackage.rba) r7
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r4 = 0
            java.lang.String r4 = com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy.pxau
            r2.setAction(r4)
            java.lang.String r4 = "com.google.android.apps.tips"
            java.lang.String r5 = "com.google.android.apps.tips.conversiontracking.ConversionTrackingReceiver"
            r2.setClassName(r4, r5)
            byte[] r7 = r7.h()
            java.lang.String r4 = "ConversionEventCache"
            r2.putExtra(r4, r7)
            android.content.Context r7 = r6.e
            r7.sendBroadcast(r2)
            rau r6 = r6.f
            r0.c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto Lab
            goto Lb1
        Lab:
            dwh r6 = new dwh
            r6.<init>()
            return r6
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.pixel.tips.convtrak.ConversionEventWorker.b(uhb):java.lang.Object");
    }
}
