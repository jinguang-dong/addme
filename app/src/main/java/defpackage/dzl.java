package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dzl {
    public final ComponentName a;

    static {
        dwj.a("SystemJobInfoConverter");
    }

    public dzl(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
