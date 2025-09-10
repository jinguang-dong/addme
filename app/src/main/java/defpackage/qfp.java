package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfp extends qfm implements List, qfo {
    public qfp(List list) {
        super(list);
    }

    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RuntimeException runtimeException = null;
        for (qfo qfoVar : this.a) {
            if (qfoVar != null) {
                try {
                    qfoVar.close();
                } catch (RuntimeException e) {
                    if (runtimeException != null) {
                        runtimeException.addSuppressed(e);
                    } else {
                        runtimeException = e;
                    }
                }
            }
        }
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.qfm, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return new qfp(super.subList(i, i2));
    }
}
