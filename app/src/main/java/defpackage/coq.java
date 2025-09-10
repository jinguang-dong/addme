package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class coq implements uli {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public coq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.uli
    public final Iterator a() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? new ulr(this.a) : this.a : new cop((ViewGroup) this.a) : new coa(new coq(this.a, 1).a(), uvk.b);
    }
}
