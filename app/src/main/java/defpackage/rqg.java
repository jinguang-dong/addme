package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.io.File;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rqg extends rqk {
    final /* synthetic */ rqh a;

    public rqg(rqh rqhVar, pfl pflVar) {
        this.a = rqhVar;
        new rtl("OnRequestInstallCallback");
        super(rqhVar, pflVar);
    }

    @Override // defpackage.rqk
    public final void c(Bundle bundle) {
        super.c(bundle);
        if (rqh.a(bundle) != 0) {
            this.c.e(new rqm(rqh.a(bundle)));
            return;
        }
        pfl pflVar = this.c;
        rqh rqhVar = this.a;
        int i = bundle.getInt("version.code", -1);
        int i2 = bundle.getInt("update.availability");
        int i3 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        bundle.getInt("in.app.update.priority", 0);
        bundle.getLong("bytes.downloaded");
        bundle.getLong("total.bytes.to.download");
        bundle.getLong("additional.size.required");
        rtl.g(new File(((Context) rqhVar.e.a).getFilesDir(), "assetpacks"));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        HashMap map = new HashMap();
        map.put("blocking.destructive.intent", rqh.d(bundle.getIntegerArrayList(qsy.k("blocking.destructive.intent"))));
        map.put("nonblocking.destructive.intent", rqh.d(bundle.getIntegerArrayList(qsy.k("nonblocking.destructive.intent"))));
        map.put("blocking.intent", rqh.d(bundle.getIntegerArrayList(qsy.k("blocking.intent"))));
        map.put("nonblocking.intent", rqh.d(bundle.getIntegerArrayList(qsy.k("nonblocking.intent"))));
        pflVar.f(new rqc(i, i2, i3, numValueOf, pendingIntent));
    }
}
