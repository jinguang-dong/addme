package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvh implements Consumer2, cnh {
    private final Context a;
    private final ReentrantLock b;
    private duy c;
    private final Set d;

    public dvh(Context context) {
        context.getClass();
        this.a = context;
        this.b = new ReentrantLock();
        this.d = new LinkedHashSet();
    }

    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            duy duyVarI = coh.i(this.a, windowLayoutInfo);
            this.c = duyVarI;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((cnh) it.next()).accept(duyVarI);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addListener(cnh cnhVar) {
        cnhVar.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            duy duyVar = this.c;
            if (duyVar != null) {
                cnhVar.accept(duyVar);
            }
            this.d.add(cnhVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    public final void removeListener(cnh cnhVar) {
        cnhVar.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d.remove(cnhVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
