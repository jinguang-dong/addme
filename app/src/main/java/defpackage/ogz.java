package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ogz implements oha {
    protected final DataHolder a;

    protected ogz(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.oha
    public int b() {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fi();
    }

    @Override // defpackage.ofa
    public final void fi() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ohb(this);
    }
}
