package defpackage;

import com.google.googlex.gcam.FaceInfoVector;
import com.google.googlex.gcam.PixelRect;
import java.util.TreeSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ier implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ ier(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        if (i == 0) {
            return new PixelRect();
        }
        if (i == 1) {
            return new FaceInfoVector();
        }
        if (i == 2) {
            return new TreeSet();
        }
        int i2 = sbp.d;
        return new sbk();
    }
}
