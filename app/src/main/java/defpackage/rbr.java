package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rbr extends rbv {
    @Override // defpackage.rbv
    protected final int a(Context context, qas qasVar, boolean z) {
        return (((Uri) qasVar.a).getAuthority().lastIndexOf(64) < 0 || clc.B(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
