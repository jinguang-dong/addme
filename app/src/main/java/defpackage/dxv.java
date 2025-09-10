package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxv extends cpn {
    private static final String f = dwj.a("WorkContinuationImpl");
    public final dyj a;
    public final String b;
    public final List c;
    public final List d;
    public boolean e;
    private final List g;

    public dxv(dyj dyjVar, String str, List list) {
        this(dyjVar, str, list, null);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void z() {
        if (!this.e) {
            dyj dyjVar = this.a;
            cpn.y(dyjVar.c.h, "EnqueueRunnable_KEEP", dyjVar.k.b, new dlc(this, 14));
            return;
        }
        dwj.b();
        Log.w(f, "Already enqueued work ids (" + TextUtils.join(", ", this.d) + ")");
    }

    public dxv(dyj dyjVar, String str, List list, byte[] bArr) {
        super(null);
        this.a = dyjVar;
        this.b = str;
        this.c = list;
        this.d = new ArrayList(list.size());
        this.g = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String strE = ((tdy) list.get(i)).e();
            this.d.add(strE);
            this.g.add(strE);
        }
    }
}
