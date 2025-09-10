package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.qly;
import defpackage.qwa;
import defpackage.qwb;
import defpackage.ske;
import defpackage.sxo;
import defpackage.syu;
import defpackage.tow;
import defpackage.tph;
import defpackage.tpz;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LifeboatReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.hasExtra("MetricSnapshot") && intent.hasExtra("Transmitters")) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("MetricSnapshot");
            byteArrayExtra.getClass();
            try {
                tph tphVarQ = tph.q(qwa.a, byteArrayExtra, 0, byteArrayExtra.length, tow.a());
                tph.D(tphVarQ);
                qwa qwaVar = (qwa) tphVarQ;
                BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                String[] stringArrayExtra = intent.getStringArrayExtra("Transmitters");
                stringArrayExtra.getClass();
                ArrayList arrayList = new ArrayList(stringArrayExtra.length);
                for (String str : stringArrayExtra) {
                    try {
                        Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        arrayList.add(((qwb) declaredConstructor.newInstance(null)).a(context, qwaVar));
                    } catch (Throwable th) {
                        Log.e("PrimesLifeboatReceiver", String.format("Unable to transmit the crash using %s.", str), th);
                    }
                }
                syu syuVarS = ske.S(arrayList);
                pendingResultGoAsync.getClass();
                syuVarS.c(new qly(pendingResultGoAsync, 6), sxo.a);
            } catch (tpz e) {
                Log.e("PrimesLifeboatReceiver", "Unable to parse the payload of MetricSnapshot.", e);
            }
        }
    }
}
