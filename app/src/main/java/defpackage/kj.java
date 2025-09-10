package defpackage;

import android.database.Observable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kj extends Observable {
    public final void a() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((byi) this.mObservers.get(size)).cF();
            }
        }
    }

    public final void b(int i, int i2) {
        c(i, i2, null);
    }

    public final void c(int i, int i2, Object obj) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((byi) this.mObservers.get(size)).cG(i, i2, obj);
            }
        }
    }

    public final void d(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((byi) this.mObservers.get(size)).cH(i, i2);
            }
        }
    }

    public final void e(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((byi) this.mObservers.get(size)).cI(i, i2);
            }
        }
    }

    public final boolean f() {
        return !this.mObservers.isEmpty();
    }
}
