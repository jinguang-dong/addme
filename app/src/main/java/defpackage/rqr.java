package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rqr extends BroadcastReceiver {
    final /* synthetic */ rqs a;

    public rqr(rqs rqsVar) {
        this.a = rqsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            intent.getStringExtra("package.name");
            return;
        }
        Iterator<String> it = intent.getExtras().keySet().iterator();
        while (it.hasNext()) {
            intent.getExtras().get(it.next());
        }
        rqs rqsVar = this.a;
        intent.getIntExtra("install.status", 0);
        intent.getIntExtra("error.code", 0);
        rqsVar.a(new rql(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name")));
    }
}
