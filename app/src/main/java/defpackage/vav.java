package defpackage;

import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vav {
    public CronetProvider a;
    public vcd b;

    public final boolean equals(Object obj) {
        return (obj instanceof vav) && this.a.equals(((vav) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
