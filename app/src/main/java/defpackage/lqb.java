package defpackage;

import android.app.KeyguardManager;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lqb extends KeyguardManager.KeyguardDismissCallback {
    final /* synthetic */ boolean a;
    final /* synthetic */ Intent b;
    final /* synthetic */ lqc c;

    public lqb(lqc lqcVar, boolean z, Intent intent) {
        this.a = z;
        this.b = intent;
        this.c = lqcVar;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        lqc lqcVar = this.c;
        Context context = lqcVar.a;
        TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(context);
        if (this.a) {
            Intent intent = new Intent(context, (Class<?>) lqcVar.c);
            intent.setFlags(intent.getFlags() | 67108864).setAction("android.intent.action.MAIN");
            taskStackBuilderCreate.addNextIntent(intent);
        }
        taskStackBuilderCreate.addNextIntent(this.b).startActivities();
    }
}
