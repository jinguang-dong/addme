package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eci implements Callable {
    final /* synthetic */ dcu a;
    final /* synthetic */ ecr b;

    public eci(ecr ecrVar, dcu dcuVar) {
        this.b = ecrVar;
        this.a = dcuVar;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean call() {
        boolean zValueOf;
        Cursor cursorF = cwy.f(this.b.a, this.a);
        try {
            if (cursorF.moveToFirst()) {
                zValueOf = Boolean.valueOf(cursorF.getInt(0) != 0);
            } else {
                zValueOf = false;
            }
            return zValueOf;
        } finally {
            cursorF.close();
        }
    }

    protected final void finalize() {
        this.a.j();
    }
}
