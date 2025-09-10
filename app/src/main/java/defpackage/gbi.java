package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gbi extends ContentObserver {
    final /* synthetic */ gbk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbi(gbk gbkVar, Handler handler) {
        super(handler);
        this.a = gbkVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        gbk gbkVar = this.a;
        if (gbkVar.e) {
            gbkVar.a.d(1, false);
        } else {
            if (gbkVar.d) {
                return;
            }
            gbkVar.d = true;
            gbkVar.a.b();
        }
    }
}
