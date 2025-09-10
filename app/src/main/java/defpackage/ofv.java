package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ofv implements oey {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ mwq b;

    public ofv(mwq mwqVar, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        this.b = mwqVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.oey
    public final void a(Status status) {
        this.b.b.remove(this.a);
    }
}
