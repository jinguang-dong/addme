package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orj extends ohc {
    private final int d;

    public orj(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    public final String toString() {
        return "DataEventRef{ type=" + (b() == 1 ? "changed" : b() == 2 ? "deleted" : "unknown") + ", dataitem=" + new orl(this.a, this.b, this.d).toString() + " }";
    }
}
