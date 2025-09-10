package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class dia {
    public final DataSetObservable a = new DataSetObservable();
    private DataSetObserver b;

    public abstract int a();

    public final void b() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.a.notifyChanged();
    }

    public final void c(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public void d(Object obj) {
        throw null;
    }
}
