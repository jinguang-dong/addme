package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oft {
    final /* synthetic */ BasePendingResult a;

    public oft(BasePendingResult basePendingResult) {
        this.a = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        ThreadLocal threadLocal = BasePendingResult.b;
        BasePendingResult.j(this.a.c);
        super.finalize();
    }
}
