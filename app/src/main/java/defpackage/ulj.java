package defpackage;

import com.google.android.apps.camera.backup.cNHl.ibINv;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ulj extends ulk implements Iterator, uhb, ukd {
    public uhb a;
    private int b;
    private Object c;
    private Iterator d;

    @Override // defpackage.ulk
    public final Object a(Object obj, uhb uhbVar) {
        this.c = obj;
        this.b = 3;
        this.a = uhbVar;
        return uhi.a;
    }

    @Override // defpackage.ulk
    public final Object b(Iterator it, uhb uhbVar) {
        if (!it.hasNext()) {
            return ufg.a;
        }
        this.d = it;
        this.b = 2;
        this.a = uhbVar;
        return uhi.a;
    }

    @Override // defpackage.uhb
    public final void fW(Object obj) {
        rnt.aN(obj);
        this.b = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.d;
                it.getClass();
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            uhb uhbVar = this.a;
            uhbVar.getClass();
            this.a = null;
            uhbVar.fW(ufg.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() throws Throwable {
        int i = this.b;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.b = 1;
            Iterator it = this.d;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.b = 0;
        Object obj = this.c;
        this.c = null;
        return obj;
    }

    @Override // defpackage.uhb
    public final uhf q() {
        return uhg.a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }

    private final Throwable c() {
        int i = this.b;
        return i != 4 ? i != 5 ? new IllegalStateException(a.bv(i, "Unexpected state of the iterator: ")) : new IllegalStateException(ibINv.LUPqghT) : new NoSuchElementException();
    }
}
