package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.a;
import defpackage.qab;
import defpackage.qcj;
import defpackage.qxf;
import defpackage.qzs;
import defpackage.qzu;
import defpackage.rnt;
import defpackage.ske;
import defpackage.swz;
import defpackage.syn;
import defpackage.tag;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        qzs qzsVar;
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                Log.w("PhenotypeBackgroundRecv", a.bw(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
                return;
            }
            qxf qxfVarA = qxf.a(context);
            if (qxfVarA == null) {
                qxf.d();
                rnt.L(false);
                return;
            }
            Map mapA = qzs.a(context);
            if (mapA.isEmpty() || (qzsVar = (qzs) mapA.get(stringExtra)) == null || !qzsVar.b.equals(tag.FILE)) {
                return;
            }
            final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            final syn synVar = (syn) ske.T(swz.j(syn.v(swz.i(syn.v(qzu.b(qxfVarA).a()), new qcj(stringExtra, 8), qxfVarA.b())), new qab(qzsVar, stringExtra, qxfVarA, 4), qxfVarA.b()), 25L, TimeUnit.SECONDS, qxfVarA.b());
            synVar.c(new Runnable() { // from class: qzy
                @Override // java.lang.Runnable
                public final void run() {
                    syn synVar2 = synVar;
                    String str = stringExtra;
                    BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                    try {
                        try {
                            ske.U(synVar2);
                        } catch (ExecutionException e) {
                            Log.w("PhenotypeBackgroundRecv", mn.g(str, "Failed to update local snapshot for "), e);
                        }
                    } finally {
                        pendingResult.finish();
                    }
                }
            }, qxfVarA.b());
        }
    }
}
