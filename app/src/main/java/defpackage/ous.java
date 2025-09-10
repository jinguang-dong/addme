package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ous extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return Boolean.valueOf(Looper.getMainLooper().isCurrentThread());
    }
}
