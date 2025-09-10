package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.a;
import defpackage.ozi;
import defpackage.pev;
import defpackage.pzn;
import defpackage.qcj;
import defpackage.qpl;
import defpackage.qxf;
import defpackage.qzu;
import defpackage.ske;
import defpackage.swf;
import defpackage.swz;
import defpackage.sxo;
import defpackage.syn;
import defpackage.syq;
import defpackage.syu;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction()) && (stringExtra = intent.getStringExtra("accountType")) != null) {
            if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                Bundle extras = intent.getExtras();
                String string = extras != null ? extras.getString("authAccount") : null;
                if (string != null && (string.contains("../") || string.contains("/.."))) {
                    Log.w("AccountRemovedRecv", a.bw(string, "Got an invalid account name for P/H that includes '..':", ". Exiting."));
                    return;
                }
                qxf.d();
                qxf qxfVarA = qxf.a(context);
                if (qxfVarA == null) {
                    Log.w("AccountRemovedRecv", "Did not set PhenotypeContext before Account Removed Broadcast. Exiting.");
                    return;
                }
                BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                syu[] syuVarArr = new syu[2];
                syu syuVarJ = string != null ? swz.j(syn.v(qzu.b(qxfVarA).b(new qcj(string, 7), qxfVarA.b())), new pzn(qxfVarA, string, 19), qxfVarA.b()) : syq.a;
                qpl qplVar = new qpl(9);
                sxo sxoVar = sxo.a;
                syuVarArr[0] = swf.i(syuVarJ, IOException.class, qplVar, sxoVar);
                syuVarArr[1] = string != null ? qxfVarA.b().submit(new pev(context, string, 16)) : syq.a;
                ske.F(syuVarArr).a(new ozi(pendingResultGoAsync, 10), sxoVar);
            }
        }
    }
}
