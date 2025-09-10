package defpackage;

import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rwp implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ rwr b;

    public rwp(rwr rwrVar, CharSequence charSequence) {
        this.a = charSequence;
        this.b = rwrVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.e(this.a);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        rnt.ab(sb, this, mNLbzhCxd.Vqd);
        sb.append(']');
        return sb.toString();
    }
}
