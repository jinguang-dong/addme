package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import defpackage.cnh;
import defpackage.coh;
import defpackage.duy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MulticastConsumer implements cnh {
    public final ReentrantLock a = new ReentrantLock();
    public final Set b = new LinkedHashSet();
    private final Context c;
    private duy d;

    public MulticastConsumer(Context context) {
        this.c = context;
    }

    public final void a(cnh cnhVar) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            duy duyVar = this.d;
            if (duyVar != null) {
                cnhVar.accept(duyVar);
            }
            this.b.add(cnhVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.cnh
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            duy duyVarI = coh.i(this.c, windowLayoutInfo);
            this.d = duyVarI;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((cnh) it.next()).accept(duyVarI);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
