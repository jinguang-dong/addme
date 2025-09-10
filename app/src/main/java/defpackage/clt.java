package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class clt implements Iterable {
    public final ArrayList a = new ArrayList();
    public final Context b;

    public clt(Context context) {
        this.b = context;
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
